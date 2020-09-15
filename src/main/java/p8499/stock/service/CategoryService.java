package p8499.stock.service;

import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.CategoryMask;
import p8499.stock.bean.Category;
import p8499.stock.mapper.stock.CategoryMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

@Service("categoryService")
public class CategoryService {
  @Transactional(value = "stock_transaction", readOnly = true)
  public Category get(String caid, CategoryMask mask) {
    return categoryMapper.get(caid, mask);
  }

  @Transactional(value = "stock_transaction")
  public Category add(Category bean) {
    if (!validatorFactory.getValidator().validate(bean, Insert.class).isEmpty()) {
      return null;
    }
    categoryMapper.add(bean);
    return bean;
  }

  @Transactional(value = "stock_transaction")
  public Category update(Category bean, CategoryMask mask) {
    Set<ConstraintViolation<Category>> violationSet =
        validatorFactory.getValidator().validate(bean, Update.class);
    for (ConstraintViolation<Category> violation : violationSet)
      if (mask.get(violation.getPropertyPath().toString())) return null;
    categoryMapper.update(bean, mask);
    return bean;
  }

  public boolean delete(String caid) {
    return categoryMapper.delete(caid);
  }

  @Transactional(value = "stock_transaction")
  public void delete(FilterExpr filter) {
    categoryMapper.deleteWhere(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public long count(FilterExpr filter) {
    return categoryMapper.count(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public List<Category> query(
      FilterExpr filter, OrderByListExpr orderByList, long start, long count, CategoryMask mask) {
    return categoryMapper.query(filter, orderByList, start, count, mask);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public boolean exists(String caid) {
    return categoryMapper.exists(caid);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minCaweight(FilterExpr filter, Double defaultValue) {
    return categoryMapper.minCaweight(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxCaweight(FilterExpr filter, Double defaultValue) {
    return categoryMapper.maxCaweight(filter, defaultValue);
  }

  @Value(value = "#{categoryMapper}")
  protected CategoryMapper categoryMapper;

  @Value(value = "#{validatorFactory}")
  protected LocalValidatorFactoryBean validatorFactory;
}
