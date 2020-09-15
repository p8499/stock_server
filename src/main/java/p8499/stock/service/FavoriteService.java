package p8499.stock.service;

import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.FavoriteMask;
import p8499.stock.bean.Favorite;
import p8499.stock.mapper.stock.FavoriteMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import javax.validation.ConstraintViolation;
import java.util.List;
import java.util.Set;

@Service("favoriteService")
public class FavoriteService {
  @Transactional(value = "stock_transaction", readOnly = true)
  public Favorite get(String fastid, FavoriteMask mask) {
    return favoriteMapper.get(fastid, mask);
  }

  @Transactional(value = "stock_transaction")
  public Favorite add(Favorite bean) {
    if (!validatorFactory.getValidator().validate(bean, Insert.class).isEmpty()) {
      return null;
    }
    favoriteMapper.add(bean);
    return bean;
  }

  @Transactional(value = "stock_transaction")
  public Favorite update(Favorite bean, FavoriteMask mask) {
    Set<ConstraintViolation<Favorite>> violationSet =
        validatorFactory.getValidator().validate(bean, Update.class);
    for (ConstraintViolation<Favorite> violation : violationSet)
      if (mask.get(violation.getPropertyPath().toString())) return null;
    favoriteMapper.update(bean, mask);
    return bean;
  }

  public boolean delete(String fastid) {
    return favoriteMapper.delete(fastid);
  }

  @Transactional(value = "stock_transaction")
  public void delete(FilterExpr filter) {
    favoriteMapper.deleteWhere(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public long count(FilterExpr filter) {
    return favoriteMapper.count(filter);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public List<Favorite> query(
      FilterExpr filter, OrderByListExpr orderByList, long start, long count, FavoriteMask mask) {
    return favoriteMapper.query(filter, orderByList, start, count, mask);
  }

  @Transactional(value = "stock_transaction", readOnly = true)
  public boolean exists(String fastid) {
    return favoriteMapper.exists(fastid);
  }

  @Value(value = "#{favoriteMapper}")
  protected FavoriteMapper favoriteMapper;

  @Value(value = "#{validatorFactory}")
  protected LocalValidatorFactoryBean validatorFactory;
}
