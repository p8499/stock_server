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
import p8499.stock.mask.MessageMask;
import p8499.stock.bean.Message;

@Component("messageMapper")
public interface MessageMapper {
  @Select("SELECT COUNT(*)>0 FROM VS13 WHERE MSID=#{msid}")
  boolean exists(@Param("msid") Integer msid);

  @Select(
      "<script><choose><when test='mask!=null'><if test='mask.msid or mask.msstid or mask.msyear or mask.msperiod or mask.msseq or mask.mspublish or mask.mssubject or mask.mscontent'><trim prefix='SELECT' suffixOverrides=','><if test='mask.msid'>MSID, </if><if test='mask.msstid'>MSSTID, </if><if test='mask.msyear'>MSYEAR, </if><if test='mask.msperiod'>MSPERIOD, </if><if test='mask.msseq'>MSSEQ, </if><if test='mask.mspublish'>MSPUBLISH, </if><if test='mask.mssubject'>MSSUBJECT, </if><if test='mask.mscontent'>MSCONTENT, </if></trim>FROM VS13 WHERE MSID=#{msid}</if></when><otherwise>SELECTMSID,MSSTID,MSYEAR,MSPERIOD,MSSEQ,MSPUBLISH,MSSUBJECT,MSCONTENT FROM VS13 WHERE MSID=#{msid}</otherwise></choose></script>")
  Message get(@Param("msid") Integer msid, @Param("mask") MessageMask mask);

  @org.apache.ibatis.annotations.SelectKey(
    statement = "SELECT nextval('FS13_MSID') AS msid",
    before = true,
    resultType = Integer.class,
    keyColumn = "msid",
    keyProperty = "bean.msid"
  )
  @Insert(
      "INSERT INTO FS13 (MSID,MSSTID,MSYEAR,MSPERIOD,MSSEQ,MSPUBLISH,MSSUBJECT,MSCONTENT) VALUES (#{bean.msid,jdbcType=INTEGER},#{bean.msstid,jdbcType=VARCHAR},#{bean.msyear,jdbcType=SMALLINT},#{bean.msperiod,jdbcType=SMALLINT},#{bean.msseq,jdbcType=SMALLINT},#{bean.mspublish,jdbcType=TIMESTAMP},#{bean.mssubject,jdbcType=VARCHAR},#{bean.mscontent,jdbcType=VARCHAR})")
  void add(@Param("bean") Message bean);

  @Update(
      "<script><choose><when test='mask!=null'><if test='mask.msstid or mask.msyear or mask.msperiod or mask.msseq or mask.mspublish or mask.mssubject or mask.mscontent'>UPDATE FS13 <set><if test='mask.msstid'>MSSTID=#{bean.msstid,jdbcType=VARCHAR}, </if><if test='mask.msyear'>MSYEAR=#{bean.msyear,jdbcType=SMALLINT}, </if><if test='mask.msperiod'>MSPERIOD=#{bean.msperiod,jdbcType=SMALLINT}, </if><if test='mask.msseq'>MSSEQ=#{bean.msseq,jdbcType=SMALLINT}, </if><if test='mask.mspublish'>MSPUBLISH=#{bean.mspublish,jdbcType=TIMESTAMP}, </if><if test='mask.mssubject'>MSSUBJECT=#{bean.mssubject,jdbcType=VARCHAR}, </if><if test='mask.mscontent'>MSCONTENT=#{bean.mscontent,jdbcType=VARCHAR}, </if></set>WHERE MSID=#{bean.msid,jdbcType=INTEGER}</if></when><otherwise>UPDATE FS13 SET MSSTID=#{bean.msstid,jdbcType=VARCHAR}, MSYEAR=#{bean.msyear,jdbcType=SMALLINT}, MSPERIOD=#{bean.msperiod,jdbcType=SMALLINT}, MSSEQ=#{bean.msseq,jdbcType=SMALLINT}, MSPUBLISH=#{bean.mspublish,jdbcType=TIMESTAMP}, MSSUBJECT=#{bean.mssubject,jdbcType=VARCHAR}, MSCONTENT=#{bean.mscontent,jdbcType=VARCHAR} WHERE MSID=#{bean.msid,jdbcType=INTEGER}</otherwise></choose></script>")
  void update(@Param("bean") Message bean, @Param("mask") MessageMask mask);

  @Delete("DELETE FROM FS13 WHERE MSID=#{msid}")
  boolean delete(Integer msid);

  @Delete(
      "<script>DELETE FROM FS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  void deleteWhere(@Param("filter") FilterExpr filter);

  @Select(
      "<script><choose><when test='mask!=null'><trim prefix='SELECT' suffixOverrides=','><if test='mask.msid'>msid,</if><if test='mask.msstid'>msstid,</if><if test='mask.msyear'>msyear,</if><if test='mask.msperiod'>msperiod,</if><if test='mask.msseq'>msseq,</if><if test='mask.mspublish'>mspublish,</if><if test='mask.mssubject'>mssubject,</if><if test='mask.mscontent'>mscontent,</if></trim></when><otherwise>SELECT msid, msstid, msyear, msperiod, msseq, mspublish, mssubject, mscontent</otherwise></choose> FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if><if test='order!=null'> ORDER BY ${order.toString()}</if> LIMIT #{count} OFFSET #{start}</script>")
  List<Message> query(
      @Param("filter") FilterExpr filter,
      @Param("order") OrderByListExpr order,
      @Param("start") long start,
      @Param("count") long count,
      @Param("mask") MessageMask mask);

  @Select(
      "<script>SELECT COUNT(*) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  long count(@Param("filter") FilterExpr filter);

  @Select(
      "<script>SELECT COALESCE(MIN(MSID),${defaultValue}) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minMsid(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(MSID),${defaultValue}) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxMsid(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(MSYEAR),${defaultValue}) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minMsyear(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(MSYEAR),${defaultValue}) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxMsyear(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(MSPERIOD),${defaultValue}) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minMsperiod(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(MSPERIOD),${defaultValue}) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxMsperiod(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(MSSEQ),${defaultValue}) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minMsseq(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(MSSEQ),${defaultValue}) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxMsseq(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(MSPUBLISH),${defaultValue}) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date minMspublish(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(MSPUBLISH),${defaultValue}) FROM VS13<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date maxMspublish(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);
}
