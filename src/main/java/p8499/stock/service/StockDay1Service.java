package p8499.stock.service;

import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.StockDay1Mask;
import p8499.stock.bean.StockDay1;
import p8499.stock.mapper.stock.StockDay1Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

@Service("stockDay1Service")
public class StockDay1Service {
  @Transactional(value = "stock_transaction", readOnly = true)
  public StockDay1 get(Integer d1id, StockDay1Mask mask) {
    return stockDay1Mapper.get(d1id, mask);
  }

  @Transactional(value = "stock_transaction")
  public StockDay1 add(StockDay1 bean) {
    if (!validatorFactory.getValidator().validate(bean, Insert.class).isEmpty()) {
      return null;
    }
    stockDay1Mapper.add(bean);
    return bean;
  }

  @Transactional(value = "stock_transaction")
  public StockDay1 update(StockDay1 bean, StockDay1Mask mask) {
    Set<ConstraintViolation<StockDay1>> violationSet =
        validatorFactory.getValidator().validate(bean, Update.class);
    for (ConstraintViolation<StockDay1> violation : violationSet)
      if (mask.get(violation.getPropertyPath().toString())) return null;
    stockDay1Mapper.update(bean, mask);
    return bean;
  }

  public boolean delete(Integer d1id) {
    return stockDay1Mapper.delete(d1id);
  }

  @Transactional(value = "stock_transaction")
  public void delete(FilterExpr filter) {
    stockDay1Mapper.deleteWhere(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public long count(FilterExpr filter) {
    return stockDay1Mapper.count(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public List<StockDay1> query(
      FilterExpr filter, OrderByListExpr orderByList, long start, long count, StockDay1Mask mask) {
    return stockDay1Mapper.query(filter, orderByList, start, count, mask);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public boolean exists(Integer d1id) {
    return stockDay1Mapper.exists(d1id);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minD1id(FilterExpr filter, Integer defaultValue) {
    return stockDay1Mapper.minD1id(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxD1id(FilterExpr filter, Integer defaultValue) {
    return stockDay1Mapper.maxD1id(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date minD1date(FilterExpr filter, java.util.Date defaultValue) {
    return stockDay1Mapper.minD1date(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date maxD1date(FilterExpr filter, java.util.Date defaultValue) {
    return stockDay1Mapper.maxD1date(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1open(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1open(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1open(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1open(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1close(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1close(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1close(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1close(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1high(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1high(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1high(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1high(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1low(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1low(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1low(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1low(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1volume(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1volume(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1volume(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1volume(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1amount(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1amount(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1amount(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1amount(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1totalshare(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1totalshare(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1totalshare(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1totalshare(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1flowshare(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1flowshare(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1flowshare(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1flowshare(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1factor(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1factor(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1factor(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1factor(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1buy1(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1buy1(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1buy1(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1buy1(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1sell1(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1sell1(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1sell1(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1sell1(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1buy2(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1buy2(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1buy2(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1buy2(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1sell2(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1sell2(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1sell2(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1sell2(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1buy3(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1buy3(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1buy3(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1buy3(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1sell3(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1sell3(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1sell3(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1sell3(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1buy4(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1buy4(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1buy4(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1buy4(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1sell4(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1sell4(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1sell4(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1sell4(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1openpre(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1openpre(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1openpre(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1openpre(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1closepre(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1closepre(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1closepre(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1closepre(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1highpre(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1highpre(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1highpre(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1highpre(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1lowpre(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1lowpre(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1lowpre(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1lowpre(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1volumepre(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1volumepre(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1volumepre(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1volumepre(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1openpost(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1openpost(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1openpost(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1openpost(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1closepost(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1closepost(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1closepost(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1closepost(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1highpost(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1highpost(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1highpost(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1highpost(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1lowpost(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1lowpost(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1lowpost(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1lowpost(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1volumepost(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1volumepost(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1volumepost(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1volumepost(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1turnover(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1turnover(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1turnover(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1turnover(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1netpercent2(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1netpercent2(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1netpercent2(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1netpercent2(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1netpercent3(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1netpercent3(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1netpercent3(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1netpercent3(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1netpercent4(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1netpercent4(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1netpercent4(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1netpercent4(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1netforce2(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1netforce2(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1netforce2(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1netforce2(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1netforce3(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1netforce3(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1netforce3(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1netforce3(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1netforce4(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1netforce4(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1netforce4(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1netforce4(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1fina(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1fina(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1fina(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1fina(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1fioiy(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1fioiy(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1fioiy(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1fioiy(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1finpey(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1finpey(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1finpey(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1finpey(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1fiocny(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1fiocny(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1fiocny(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1fiocny(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1finaps(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1finaps(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1finaps(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1finaps(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1fioiyps(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1fioiyps(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1fioiyps(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1fioiyps(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1finpeyps(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1finpeyps(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1finpeyps(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1finpeyps(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1fiocnyps(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1fiocnyps(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1fiocnyps(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1fiocnyps(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1pb(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1pb(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1pb(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1pb(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1ps(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1ps(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1ps(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1ps(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1pe(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1pe(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1pe(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1pe(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double minD1pcf(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.minD1pcf(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Double maxD1pcf(FilterExpr filter, Double defaultValue) {
    return stockDay1Mapper.maxD1pcf(filter, defaultValue);
  }

  @Value(value = "#{stockDay1Mapper}")
  protected StockDay1Mapper stockDay1Mapper;

  @Value(value = "#{validatorFactory}")
  protected LocalValidatorFactoryBean validatorFactory;
}
