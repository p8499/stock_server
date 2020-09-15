package p8499.stock.service;

import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.ExchangeMask;
import p8499.stock.bean.Exchange;
import p8499.stock.mapper.stock.ExchangeMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

@Service("exchangeService")
public class ExchangeService {
  @Transactional(value = "stock_transaction", readOnly = true)
  public Exchange get(String exid, ExchangeMask mask) {
    return exchangeMapper.get(exid, mask);
  }

  @Transactional(value = "stock_transaction")
  public Exchange add(Exchange bean) {
    if (!validatorFactory.getValidator().validate(bean, Insert.class).isEmpty()) {
      return null;
    }
    exchangeMapper.add(bean);
    return bean;
  }

  @Transactional(value = "stock_transaction")
  public Exchange update(Exchange bean, ExchangeMask mask) {
    Set<ConstraintViolation<Exchange>> violationSet =
        validatorFactory.getValidator().validate(bean, Update.class);
    for (ConstraintViolation<Exchange> violation : violationSet)
      if (mask.get(violation.getPropertyPath().toString())) return null;
    exchangeMapper.update(bean, mask);
    return bean;
  }

  public boolean delete(String exid) {
    return exchangeMapper.delete(exid);
  }

  @Transactional(value = "stock_transaction")
  public void delete(FilterExpr filter) {
    exchangeMapper.deleteWhere(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public long count(FilterExpr filter) {
    return exchangeMapper.count(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public List<Exchange> query(
      FilterExpr filter, OrderByListExpr orderByList, long start, long count, ExchangeMask mask) {
    return exchangeMapper.query(filter, orderByList, start, count, mask);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public boolean exists(String exid) {
    return exchangeMapper.exists(exid);
  }

  @Value(value = "#{exchangeMapper}")
  protected ExchangeMapper exchangeMapper;

  @Value(value = "#{validatorFactory}")
  protected LocalValidatorFactoryBean validatorFactory;
}
