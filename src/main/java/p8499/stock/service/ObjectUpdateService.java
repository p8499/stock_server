package p8499.stock.service;

import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.ObjectUpdateMask;
import p8499.stock.bean.ObjectUpdate;
import p8499.stock.mapper.stock.ObjectUpdateMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

@Service("objectUpdateService")
public class ObjectUpdateService {
  @Transactional(value = "stock_transaction", readOnly = true)
  public ObjectUpdate get(Integer obid, ObjectUpdateMask mask) {
    return objectUpdateMapper.get(obid, mask);
  }

  @Transactional(value = "stock_transaction")
  public ObjectUpdate add(ObjectUpdate bean) {
    if (!validatorFactory.getValidator().validate(bean, Insert.class).isEmpty()) {
      return null;
    }
    objectUpdateMapper.add(bean);
    return bean;
  }

  @Transactional(value = "stock_transaction")
  public ObjectUpdate update(ObjectUpdate bean, ObjectUpdateMask mask) {
    Set<ConstraintViolation<ObjectUpdate>> violationSet =
        validatorFactory.getValidator().validate(bean, Update.class);
    for (ConstraintViolation<ObjectUpdate> violation : violationSet)
      if (mask.get(violation.getPropertyPath().toString())) return null;
    objectUpdateMapper.update(bean, mask);
    return bean;
  }

  public boolean delete(Integer obid) {
    return objectUpdateMapper.delete(obid);
  }

  @Transactional(value = "stock_transaction")
  public void delete(FilterExpr filter) {
    objectUpdateMapper.deleteWhere(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public long count(FilterExpr filter) {
    return objectUpdateMapper.count(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public List<ObjectUpdate> query(
      FilterExpr filter,
      OrderByListExpr orderByList,
      long start,
      long count,
      ObjectUpdateMask mask) {
    return objectUpdateMapper.query(filter, orderByList, start, count, mask);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public boolean exists(Integer obid) {
    return objectUpdateMapper.exists(obid);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minObid(FilterExpr filter, Integer defaultValue) {
    return objectUpdateMapper.minObid(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxObid(FilterExpr filter, Integer defaultValue) {
    return objectUpdateMapper.maxObid(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date minObstart(FilterExpr filter, java.util.Date defaultValue) {
    return objectUpdateMapper.minObstart(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date maxObstart(FilterExpr filter, java.util.Date defaultValue) {
    return objectUpdateMapper.maxObstart(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date minObend(FilterExpr filter, java.util.Date defaultValue) {
    return objectUpdateMapper.minObend(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date maxObend(FilterExpr filter, java.util.Date defaultValue) {
    return objectUpdateMapper.maxObend(filter, defaultValue);
  }

  @Value(value = "#{objectUpdateMapper}")
  protected ObjectUpdateMapper objectUpdateMapper;

  @Value(value = "#{validatorFactory}")
  protected LocalValidatorFactoryBean validatorFactory;
}
