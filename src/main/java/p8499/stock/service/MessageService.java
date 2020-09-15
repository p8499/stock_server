package p8499.stock.service;

import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.MessageMask;
import p8499.stock.bean.Message;
import p8499.stock.mapper.stock.MessageMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

@Service("messageService")
public class MessageService {
  @Transactional(value = "stock_transaction", readOnly = true)
  public Message get(Integer msid, MessageMask mask) {
    return messageMapper.get(msid, mask);
  }

  @Transactional(value = "stock_transaction")
  public Message add(Message bean) {
    if (!validatorFactory.getValidator().validate(bean, Insert.class).isEmpty()) {
      return null;
    }
    messageMapper.add(bean);
    return bean;
  }

  @Transactional(value = "stock_transaction")
  public Message update(Message bean, MessageMask mask) {
    Set<ConstraintViolation<Message>> violationSet =
        validatorFactory.getValidator().validate(bean, Update.class);
    for (ConstraintViolation<Message> violation : violationSet)
      if (mask.get(violation.getPropertyPath().toString())) return null;
    messageMapper.update(bean, mask);
    return bean;
  }

  public boolean delete(Integer msid) {
    return messageMapper.delete(msid);
  }

  @Transactional(value = "stock_transaction")
  public void delete(FilterExpr filter) {
    messageMapper.deleteWhere(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public long count(FilterExpr filter) {
    return messageMapper.count(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public List<Message> query(
      FilterExpr filter, OrderByListExpr orderByList, long start, long count, MessageMask mask) {
    return messageMapper.query(filter, orderByList, start, count, mask);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public boolean exists(Integer msid) {
    return messageMapper.exists(msid);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minMsid(FilterExpr filter, Integer defaultValue) {
    return messageMapper.minMsid(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxMsid(FilterExpr filter, Integer defaultValue) {
    return messageMapper.maxMsid(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minMsyear(FilterExpr filter, Integer defaultValue) {
    return messageMapper.minMsyear(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxMsyear(FilterExpr filter, Integer defaultValue) {
    return messageMapper.maxMsyear(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minMsperiod(FilterExpr filter, Integer defaultValue) {
    return messageMapper.minMsperiod(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxMsperiod(FilterExpr filter, Integer defaultValue) {
    return messageMapper.maxMsperiod(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer minMsseq(FilterExpr filter, Integer defaultValue) {
    return messageMapper.minMsseq(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public Integer maxMsseq(FilterExpr filter, Integer defaultValue) {
    return messageMapper.maxMsseq(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date minMspublish(FilterExpr filter, java.util.Date defaultValue) {
    return messageMapper.minMspublish(filter, defaultValue);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public java.util.Date maxMspublish(FilterExpr filter, java.util.Date defaultValue) {
    return messageMapper.maxMspublish(filter, defaultValue);
  }

  @Value(value = "#{messageMapper}")
  protected MessageMapper messageMapper;

  @Value(value = "#{validatorFactory}")
  protected LocalValidatorFactoryBean validatorFactory;
}
