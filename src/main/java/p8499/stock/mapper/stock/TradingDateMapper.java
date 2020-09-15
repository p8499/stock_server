package p8499.stock.mapper.stock;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import p8499.stock.FilterExpr;
import p8499.stock.OrderByListExpr;
import p8499.stock.mask.TradingDateMask;
import p8499.stock.bean.TradingDate;

@Component("tradingDateMapper")
public interface TradingDateMapper {
  @Select("SELECT COUNT(*)>0 FROM VS02 WHERE TRID=#{trid}")
  boolean exists(@Param("trid") Integer trid);

  @Select(
      "<script><choose><when test='mask!=null'><if test='mask.trid or mask.trexid or mask.trdate'><trim prefix='SELECT' suffixOverrides=','><if test='mask.trid'>TRID, </if><if test='mask.trexid'>TREXID, </if><if test='mask.trdate'>TRDATE, </if></trim>FROM VS02 WHERE TRID=#{trid}</if></when><otherwise>SELECTTRID,TREXID,TRDATE FROM VS02 WHERE TRID=#{trid}</otherwise></choose></script>")
  TradingDate get(@Param("trid") Integer trid, @Param("mask") TradingDateMask mask);

  @org.apache.ibatis.annotations.SelectKey(
    statement = "SELECT nextval('FS02_TRID') AS trid",
    before = true,
    resultType = Integer.class,
    keyColumn = "trid",
    keyProperty = "bean.trid"
  )
  @Insert(
      "INSERT INTO FS02 (TRID,TREXID,TRDATE) VALUES (#{bean.trid,jdbcType=INTEGER},#{bean.trexid,jdbcType=VARCHAR},#{bean.trdate,jdbcType=TIMESTAMP})")
  void add(@Param("bean") TradingDate bean);

  @Update(
      "<script><choose><when test='mask!=null'><if test='mask.trexid or mask.trdate'>UPDATE FS02 <set><if test='mask.trexid'>TREXID=#{bean.trexid,jdbcType=VARCHAR}, </if><if test='mask.trdate'>TRDATE=#{bean.trdate,jdbcType=TIMESTAMP}, </if></set>WHERE TRID=#{bean.trid,jdbcType=INTEGER}</if></when><otherwise>UPDATE FS02 SET TREXID=#{bean.trexid,jdbcType=VARCHAR}, TRDATE=#{bean.trdate,jdbcType=TIMESTAMP} WHERE TRID=#{bean.trid,jdbcType=INTEGER}</otherwise></choose></script>")
  void update(@Param("bean") TradingDate bean, @Param("mask") TradingDateMask mask);

  @Delete("DELETE FROM FS02 WHERE TRID=#{trid}")
  boolean delete(Integer trid);

  @Delete(
      "<script>DELETE FROM FS02<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  void deleteWhere(@Param("filter") FilterExpr filter);

  @Select(
      "<script><choose><when test='mask!=null'><trim prefix='SELECT' suffixOverrides=','><if test='mask.trid'>trid,</if><if test='mask.trexid'>trexid,</if><if test='mask.trdate'>trdate,</if></trim></when><otherwise>SELECT trid, trexid, trdate</otherwise></choose> FROM VS02<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if><if test='order!=null'> ORDER BY ${order.toString()}</if> LIMIT #{count} OFFSET #{start}</script>")
  List<TradingDate> query(
      @Param("filter") FilterExpr filter,
      @Param("order") OrderByListExpr order,
      @Param("start") long start,
      @Param("count") long count,
      @Param("mask") TradingDateMask mask);

  @Select(
      "<script>SELECT COUNT(*) FROM VS02<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  long count(@Param("filter") FilterExpr filter);

  @Select(
      "<script>SELECT COALESCE(MIN(TRID),${defaultValue}) FROM VS02<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minTrid(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(TRID),${defaultValue}) FROM VS02<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxTrid(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(TRDATE),${defaultValue}) FROM VS02<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date minTrdate(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(TRDATE),${defaultValue}) FROM VS02<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date maxTrdate(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);
}
