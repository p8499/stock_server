package p8499.stock.service;

import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.TradingDateMask;
import p8499.stock.bean.TradingDate;
import p8499.stock.mapper.stock.TradingDateMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

@Service("tradingDateService")
public class TradingDateService {
  @Transactional(value = "stock_transaction", readOnly = true)
  public TradingDate get(Integer trid, TradingDateMask mask) {
    return tradingDateMapper.get(trid, mask);
  }

  @Transactional(value = "stock_transaction")
  public TradingDate add(TradingDate bean) {
    if (!validatorFactory.getValidator().validate(bean, Insert.class).isEmpty()) {
      return null;
    }
    tradingDateMapper.add(bean);
    return bean;
  }

  @Transactional(value = "stock_transaction")
  public TradingDate update(TradingDate bean, TradingDateMask mask) {
    Set<ConstraintViolation<TradingDate>> violationSet =
        validatorFactory.getValidator().validate(bean, Update.class);
    for (ConstraintViolation<TradingDate> violation : violationSet)
      if (mask.get(violation.getPropertyPath().toString())) return null;
    tradingDateMapper.update(bean, mask);
    return bean;
  }

  public boolean delete(Integer trid) {
    return tradingDateMapper.delete(trid);
  }

  @Transactional(value = "stock_transaction")
  public void delete(FilterExpr filter) {
    tradingDateMapper.deleteWhere(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public long count(FilterExpr filter) {
    return tradingDateMapper.count(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public List<TradingDate> query(
      FilterExpr filter,
      OrderByListExpr orderByList,
      long start,
      long count,
      TradingDateMask mask) {
    return tradingDateMapper.query(filter, orderByList, start, count, mask);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public boolean exists(Integer trid) {
    return tradingDateMapper.exists(trid);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minTrid(FilterExpr filter, Integer defaultValue) {
    return tradingDateMapper.minTrid(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxTrid(FilterExpr filter, Integer defaultValue) {
    return tradingDateMapper.maxTrid(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date minTrdate(FilterExpr filter, java.util.Date defaultValue) {
    return tradingDateMapper.minTrdate(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date maxTrdate(FilterExpr filter, java.util.Date defaultValue) {
    return tradingDateMapper.maxTrdate(filter, defaultValue);
  }

  @Value(value = "#{tradingDateMapper}")
  protected TradingDateMapper tradingDateMapper;

  @Value(value = "#{validatorFactory}")
  protected LocalValidatorFactoryBean validatorFactory;
}
