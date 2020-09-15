package p8499.stock.service;

import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.StockMask;
import p8499.stock.bean.Stock;
import p8499.stock.mapper.stock.StockMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

@Service("stockService")
public class StockService {
  @Transactional(value = "stock_transaction", readOnly = true)
  public Stock get(String stid, StockMask mask) {
    return stockMapper.get(stid, mask);
  }

  @Transactional(value = "stock_transaction")
  public Stock add(Stock bean) {
    if (!validatorFactory.getValidator().validate(bean, Insert.class).isEmpty()) {
      return null;
    }
    stockMapper.add(bean);
    return bean;
  }

  @Transactional(value = "stock_transaction")
  public Stock update(Stock bean, StockMask mask) {
    Set<ConstraintViolation<Stock>> violationSet =
        validatorFactory.getValidator().validate(bean, Update.class);
    for (ConstraintViolation<Stock> violation : violationSet)
      if (mask.get(violation.getPropertyPath().toString())) return null;
    stockMapper.update(bean, mask);
    return bean;
  }

  public boolean delete(String stid) {
    return stockMapper.delete(stid);
  }

  @Transactional(value = "stock_transaction")
  public void delete(FilterExpr filter) {
    stockMapper.deleteWhere(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public long count(FilterExpr filter) {
    return stockMapper.count(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public List<Stock> query(
      FilterExpr filter, OrderByListExpr orderByList, long start, long count, StockMask mask) {
    return stockMapper.query(filter, orderByList, start, count, mask);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public boolean exists(String stid) {
    return stockMapper.exists(stid);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date minStlisted(FilterExpr filter, java.util.Date defaultValue) {
    return stockMapper.minStlisted(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date maxStlisted(FilterExpr filter, java.util.Date defaultValue) {
    return stockMapper.maxStlisted(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date minStdelisted(FilterExpr filter, java.util.Date defaultValue) {
    return stockMapper.minStdelisted(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date maxStdelisted(FilterExpr filter, java.util.Date defaultValue) {
    return stockMapper.maxStdelisted(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minStdays(FilterExpr filter, Integer defaultValue) {
    return stockMapper.minStdays(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxStdays(FilterExpr filter, Integer defaultValue) {
    return stockMapper.maxStdays(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minStpbrate(FilterExpr filter, Double defaultValue) {
    return stockMapper.minStpbrate(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxStpbrate(FilterExpr filter, Double defaultValue) {
    return stockMapper.maxStpbrate(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minStpbrank(FilterExpr filter, Double defaultValue) {
    return stockMapper.minStpbrank(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxStpbrank(FilterExpr filter, Double defaultValue) {
    return stockMapper.maxStpbrank(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minStpsrate(FilterExpr filter, Double defaultValue) {
    return stockMapper.minStpsrate(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxStpsrate(FilterExpr filter, Double defaultValue) {
    return stockMapper.maxStpsrate(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minStpsrank(FilterExpr filter, Double defaultValue) {
    return stockMapper.minStpsrank(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxStpsrank(FilterExpr filter, Double defaultValue) {
    return stockMapper.maxStpsrank(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minStperate(FilterExpr filter, Double defaultValue) {
    return stockMapper.minStperate(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxStperate(FilterExpr filter, Double defaultValue) {
    return stockMapper.maxStperate(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minStperank(FilterExpr filter, Double defaultValue) {
    return stockMapper.minStperank(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxStperank(FilterExpr filter, Double defaultValue) {
    return stockMapper.maxStperank(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minStpcfrate(FilterExpr filter, Double defaultValue) {
    return stockMapper.minStpcfrate(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxStpcfrate(FilterExpr filter, Double defaultValue) {
    return stockMapper.maxStpcfrate(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minStpcfrank(FilterExpr filter, Double defaultValue) {
    return stockMapper.minStpcfrank(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxStpcfrank(FilterExpr filter, Double defaultValue) {
    return stockMapper.maxStpcfrank(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minStnpel(FilterExpr filter, Integer defaultValue) {
    return stockMapper.minStnpel(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxStnpel(FilterExpr filter, Integer defaultValue) {
    return stockMapper.maxStnpel(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date minStpublish(FilterExpr filter, java.util.Date defaultValue) {
    return stockMapper.minStpublish(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date maxStpublish(FilterExpr filter, java.util.Date defaultValue) {
    return stockMapper.maxStpublish(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minStpublishdays(FilterExpr filter, Integer defaultValue) {
    return stockMapper.minStpublishdays(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxStpublishdays(FilterExpr filter, Integer defaultValue) {
    return stockMapper.maxStpublishdays(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minStyear(FilterExpr filter, Integer defaultValue) {
    return stockMapper.minStyear(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxStyear(FilterExpr filter, Integer defaultValue) {
    return stockMapper.maxStyear(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minStperiod(FilterExpr filter, Integer defaultValue) {
    return stockMapper.minStperiod(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxStperiod(FilterExpr filter, Integer defaultValue) {
    return stockMapper.maxStperiod(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minStmessage(FilterExpr filter, Integer defaultValue) {
    return stockMapper.minStmessage(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxStmessage(FilterExpr filter, Integer defaultValue) {
    return stockMapper.maxStmessage(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minStfavorite(FilterExpr filter, Integer defaultValue) {
    return stockMapper.minStfavorite(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxStfavorite(FilterExpr filter, Integer defaultValue) {
    return stockMapper.maxStfavorite(filter, defaultValue);
  }

  @Value(value = "#{stockMapper}")
  protected StockMapper stockMapper;

  @Value(value = "#{validatorFactory}")
  protected LocalValidatorFactoryBean validatorFactory;
}
