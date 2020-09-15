package p8499.stock.service;

import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.CategoryStockMask;
import p8499.stock.bean.CategoryStock;
import p8499.stock.mapper.stock.CategoryStockMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

@Service("categoryStockService")
public class CategoryStockService {
  @Transactional(value = "stock_transaction", readOnly = true)
  public CategoryStock get(Integer csid, CategoryStockMask mask) {
    return categoryStockMapper.get(csid, mask);
  }

  @Transactional(value = "stock_transaction")
  public CategoryStock add(CategoryStock bean) {
    if (!validatorFactory.getValidator().validate(bean, Insert.class).isEmpty()) {
      return null;
    }
    categoryStockMapper.add(bean);
    return bean;
  }

  @Transactional(value = "stock_transaction")
  public CategoryStock update(CategoryStock bean, CategoryStockMask mask) {
    Set<ConstraintViolation<CategoryStock>> violationSet =
        validatorFactory.getValidator().validate(bean, Update.class);
    for (ConstraintViolation<CategoryStock> violation : violationSet)
      if (mask.get(violation.getPropertyPath().toString())) return null;
    categoryStockMapper.update(bean, mask);
    return bean;
  }

  public boolean delete(Integer csid) {
    return categoryStockMapper.delete(csid);
  }

  @Transactional(value = "stock_transaction")
  public void delete(FilterExpr filter) {
    categoryStockMapper.deleteWhere(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public long count(FilterExpr filter) {
    return categoryStockMapper.count(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public List<CategoryStock> query(
      FilterExpr filter,
      OrderByListExpr orderByList,
      long start,
      long count,
      CategoryStockMask mask) {
    return categoryStockMapper.query(filter, orderByList, start, count, mask);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public boolean exists(Integer csid) {
    return categoryStockMapper.exists(csid);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minCsid(FilterExpr filter, Integer defaultValue) {
    return categoryStockMapper.minCsid(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxCsid(FilterExpr filter, Integer defaultValue) {
    return categoryStockMapper.maxCsid(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minCsweight(FilterExpr filter, Double defaultValue) {
    return categoryStockMapper.minCsweight(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxCsweight(FilterExpr filter, Double defaultValue) {
    return categoryStockMapper.maxCsweight(filter, defaultValue);
  }

  @Value(value = "#{categoryStockMapper}")
  protected CategoryStockMapper categoryStockMapper;

  @Value(value = "#{validatorFactory}")
  protected LocalValidatorFactoryBean validatorFactory;
}
