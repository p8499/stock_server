package p8499.stock.service;

import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.FinanceMask;
import p8499.stock.bean.Finance;
import p8499.stock.mapper.stock.FinanceMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

@Service("financeService")
public class FinanceService {
  @Transactional(value = "stock_transaction", readOnly = true)
  public Finance get(Integer fiid, FinanceMask mask) {
    return financeMapper.get(fiid, mask);
  }

  @Transactional(value = "stock_transaction")
  public Finance add(Finance bean) {
    if (!validatorFactory.getValidator().validate(bean, Insert.class).isEmpty()) {
      return null;
    }
    financeMapper.add(bean);
    return bean;
  }

  @Transactional(value = "stock_transaction")
  public Finance update(Finance bean, FinanceMask mask) {
    Set<ConstraintViolation<Finance>> violationSet =
        validatorFactory.getValidator().validate(bean, Update.class);
    for (ConstraintViolation<Finance> violation : violationSet)
      if (mask.get(violation.getPropertyPath().toString())) return null;
    financeMapper.update(bean, mask);
    return bean;
  }

  public boolean delete(Integer fiid) {
    return financeMapper.delete(fiid);
  }

  @Transactional(value = "stock_transaction")
  public void delete(FilterExpr filter) {
    financeMapper.deleteWhere(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public long count(FilterExpr filter) {
    return financeMapper.count(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public List<Finance> query(
      FilterExpr filter, OrderByListExpr orderByList, long start, long count, FinanceMask mask) {
    return financeMapper.query(filter, orderByList, start, count, mask);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public boolean exists(Integer fiid) {
    return financeMapper.exists(fiid);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minFiid(FilterExpr filter, Integer defaultValue) {
    return financeMapper.minFiid(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxFiid(FilterExpr filter, Integer defaultValue) {
    return financeMapper.maxFiid(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minFiyear(FilterExpr filter, Integer defaultValue) {
    return financeMapper.minFiyear(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxFiyear(FilterExpr filter, Integer defaultValue) {
    return financeMapper.maxFiyear(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minFiperiod(FilterExpr filter, Integer defaultValue) {
    return financeMapper.minFiperiod(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxFiperiod(FilterExpr filter, Integer defaultValue) {
    return financeMapper.maxFiperiod(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date minFipublish(FilterExpr filter, java.util.Date defaultValue) {
    return financeMapper.minFipublish(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date maxFipublish(FilterExpr filter, java.util.Date defaultValue) {
    return financeMapper.maxFipublish(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minFina(FilterExpr filter, Double defaultValue) {
    return financeMapper.minFina(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxFina(FilterExpr filter, Double defaultValue) {
    return financeMapper.maxFina(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minFioi(FilterExpr filter, Double defaultValue) {
    return financeMapper.minFioi(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxFioi(FilterExpr filter, Double defaultValue) {
    return financeMapper.maxFioi(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minFinpe(FilterExpr filter, Double defaultValue) {
    return financeMapper.minFinpe(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxFinpe(FilterExpr filter, Double defaultValue) {
    return financeMapper.maxFinpe(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minFiocn(FilterExpr filter, Double defaultValue) {
    return financeMapper.minFiocn(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxFiocn(FilterExpr filter, Double defaultValue) {
    return financeMapper.maxFiocn(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minFioiy(FilterExpr filter, Double defaultValue) {
    return financeMapper.minFioiy(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxFioiy(FilterExpr filter, Double defaultValue) {
    return financeMapper.maxFioiy(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minFinpey(FilterExpr filter, Double defaultValue) {
    return financeMapper.minFinpey(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxFinpey(FilterExpr filter, Double defaultValue) {
    return financeMapper.maxFinpey(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minFiocny(FilterExpr filter, Double defaultValue) {
    return financeMapper.minFiocny(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxFiocny(FilterExpr filter, Double defaultValue) {
    return financeMapper.maxFiocny(filter, defaultValue);
  }

  @Value(value = "#{financeMapper}")
  protected FinanceMapper financeMapper;

  @Value(value = "#{validatorFactory}")
  protected LocalValidatorFactoryBean validatorFactory;
}
