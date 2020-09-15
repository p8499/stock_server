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
import p8499.stock.mask.ObjectUpdateMask;
import p8499.stock.bean.ObjectUpdate;

@Component("objectUpdateMapper")
public interface ObjectUpdateMapper {
  @Select("SELECT COUNT(*)>0 FROM VS90 WHERE OBID=#{obid}")
  boolean exists(@Param("obid") Integer obid);

  @Select(
      "<script><choose><when test='mask!=null'><if test='mask.obid or mask.obname or mask.obstart or mask.obend'><trim prefix='SELECT' suffixOverrides=','><if test='mask.obid'>OBID, </if><if test='mask.obname'>OBNAME, </if><if test='mask.obstart'>OBSTART, </if><if test='mask.obend'>OBEND, </if></trim>FROM VS90 WHERE OBID=#{obid}</if></when><otherwise>SELECTOBID,OBNAME,OBSTART,OBEND FROM VS90 WHERE OBID=#{obid}</otherwise></choose></script>")
  ObjectUpdate get(@Param("obid") Integer obid, @Param("mask") ObjectUpdateMask mask);

  @org.apache.ibatis.annotations.SelectKey(
    statement = "SELECT nextval('FS90_OBID') AS obid",
    before = true,
    resultType = Integer.class,
    keyColumn = "obid",
    keyProperty = "bean.obid"
  )
  @Insert(
      "INSERT INTO FS90 (OBID,OBNAME,OBSTART,OBEND) VALUES (#{bean.obid,jdbcType=INTEGER},#{bean.obname,jdbcType=VARCHAR},#{bean.obstart,jdbcType=TIMESTAMP},#{bean.obend,jdbcType=TIMESTAMP})")
  void add(@Param("bean") ObjectUpdate bean);

  @Update(
      "<script><choose><when test='mask!=null'><if test='mask.obname or mask.obstart or mask.obend'>UPDATE FS90 <set><if test='mask.obname'>OBNAME=#{bean.obname,jdbcType=VARCHAR}, </if><if test='mask.obstart'>OBSTART=#{bean.obstart,jdbcType=TIMESTAMP}, </if><if test='mask.obend'>OBEND=#{bean.obend,jdbcType=TIMESTAMP}, </if></set>WHERE OBID=#{bean.obid,jdbcType=INTEGER}</if></when><otherwise>UPDATE FS90 SET OBNAME=#{bean.obname,jdbcType=VARCHAR}, OBSTART=#{bean.obstart,jdbcType=TIMESTAMP}, OBEND=#{bean.obend,jdbcType=TIMESTAMP} WHERE OBID=#{bean.obid,jdbcType=INTEGER}</otherwise></choose></script>")
  void update(@Param("bean") ObjectUpdate bean, @Param("mask") ObjectUpdateMask mask);

  @Delete("DELETE FROM FS90 WHERE OBID=#{obid}")
  boolean delete(Integer obid);

  @Delete(
      "<script>DELETE FROM FS90<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  void deleteWhere(@Param("filter") FilterExpr filter);

  @Select(
      "<script><choose><when test='mask!=null'><trim prefix='SELECT' suffixOverrides=','><if test='mask.obid'>obid,</if><if test='mask.obname'>obname,</if><if test='mask.obstart'>obstart,</if><if test='mask.obend'>obend,</if></trim></when><otherwise>SELECT obid, obname, obstart, obend</otherwise></choose> FROM VS90<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if><if test='order!=null'> ORDER BY ${order.toString()}</if> LIMIT #{count} OFFSET #{start}</script>")
  List<ObjectUpdate> query(
      @Param("filter") FilterExpr filter,
      @Param("order") OrderByListExpr order,
      @Param("start") long start,
      @Param("count") long count,
      @Param("mask") ObjectUpdateMask mask);

  @Select(
      "<script>SELECT COUNT(*) FROM VS90<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  long count(@Param("filter") FilterExpr filter);

  @Select(
      "<script>SELECT COALESCE(MIN(OBID),${defaultValue}) FROM VS90<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minObid(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(OBID),${defaultValue}) FROM VS90<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxObid(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(OBSTART),${defaultValue}) FROM VS90<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date minObstart(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(OBSTART),${defaultValue}) FROM VS90<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date maxObstart(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(OBEND),${defaultValue}) FROM VS90<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date minObend(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(OBEND),${defaultValue}) FROM VS90<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date maxObend(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);
}
