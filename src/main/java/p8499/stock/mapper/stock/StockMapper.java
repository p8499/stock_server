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
import p8499.stock.mask.StockMask;
import p8499.stock.bean.Stock;

@Component("stockMapper")
public interface StockMapper {
  @Select("SELECT COUNT(*)>0 FROM VS11 WHERE STID=#{stid}")
  boolean exists(@Param("stid") String stid);

  @Select(
      "<script><choose><when test='mask!=null'><if test='mask.stid or mask.stexid or mask.stcode or mask.stname or mask.stlisted or mask.stdelisted or mask.stexname or mask.stdays or mask.stpbrate or mask.stpbrank or mask.stpsrate or mask.stpsrank or mask.stperate or mask.stperank or mask.stpcfrate or mask.stpcfrank or mask.stnpel or mask.stpublish or mask.stpublishdays or mask.styear or mask.stperiod or mask.stmessage or mask.stfavorite'><trim prefix='SELECT' suffixOverrides=','><if test='mask.stid'>STID, </if><if test='mask.stexid'>STEXID, </if><if test='mask.stcode'>STCODE, </if><if test='mask.stname'>STNAME, </if><if test='mask.stlisted'>STLISTED, </if><if test='mask.stdelisted'>STDELISTED, </if><if test='mask.stexname'>STEXNAME, </if><if test='mask.stdays'>STDAYS, </if><if test='mask.stpbrate'>STPBRATE, </if><if test='mask.stpbrank'>STPBRANK, </if><if test='mask.stpsrate'>STPSRATE, </if><if test='mask.stpsrank'>STPSRANK, </if><if test='mask.stperate'>STPERATE, </if><if test='mask.stperank'>STPERANK, </if><if test='mask.stpcfrate'>STPCFRATE, </if><if test='mask.stpcfrank'>STPCFRANK, </if><if test='mask.stnpel'>STNPEL, </if><if test='mask.stpublish'>STPUBLISH, </if><if test='mask.stpublishdays'>STPUBLISHDAYS, </if><if test='mask.styear'>STYEAR, </if><if test='mask.stperiod'>STPERIOD, </if><if test='mask.stmessage'>STMESSAGE, </if><if test='mask.stfavorite'>STFAVORITE, </if></trim>FROM VS11 WHERE STID=#{stid}</if></when><otherwise>SELECTSTID,STEXID,STCODE,STNAME,STLISTED,STDELISTED,STEXNAME,STDAYS,STPBRATE,STPBRANK,STPSRATE,STPSRANK,STPERATE,STPERANK,STPCFRATE,STPCFRANK,STNPEL,STPUBLISH,STPUBLISHDAYS,STYEAR,STPERIOD,STMESSAGE,STFAVORITE FROM VS11 WHERE STID=#{stid}</otherwise></choose></script>")
  Stock get(@Param("stid") String stid, @Param("mask") StockMask mask);

  @Insert(
      "INSERT INTO FS11 (STID,STEXID,STCODE,STNAME,STLISTED,STDELISTED,STPBRATE,STPBRANK,STPSRATE,STPSRANK,STPERATE,STPERANK,STPCFRATE,STPCFRANK) VALUES (#{bean.stid,jdbcType=VARCHAR},#{bean.stexid,jdbcType=VARCHAR},#{bean.stcode,jdbcType=VARCHAR},#{bean.stname,jdbcType=VARCHAR},#{bean.stlisted,jdbcType=TIMESTAMP},#{bean.stdelisted,jdbcType=TIMESTAMP},#{bean.stpbrate,jdbcType=DOUBLE},#{bean.stpbrank,jdbcType=DOUBLE},#{bean.stpsrate,jdbcType=DOUBLE},#{bean.stpsrank,jdbcType=DOUBLE},#{bean.stperate,jdbcType=DOUBLE},#{bean.stperank,jdbcType=DOUBLE},#{bean.stpcfrate,jdbcType=DOUBLE},#{bean.stpcfrank,jdbcType=DOUBLE})")
  void add(@Param("bean") Stock bean);

  @Update(
      "<script><choose><when test='mask!=null'><if test='mask.stexid or mask.stcode or mask.stname or mask.stlisted or mask.stdelisted or mask.stpbrate or mask.stpbrank or mask.stpsrate or mask.stpsrank or mask.stperate or mask.stperank or mask.stpcfrate or mask.stpcfrank'>UPDATE FS11 <set><if test='mask.stexid'>STEXID=#{bean.stexid,jdbcType=VARCHAR}, </if><if test='mask.stcode'>STCODE=#{bean.stcode,jdbcType=VARCHAR}, </if><if test='mask.stname'>STNAME=#{bean.stname,jdbcType=VARCHAR}, </if><if test='mask.stlisted'>STLISTED=#{bean.stlisted,jdbcType=TIMESTAMP}, </if><if test='mask.stdelisted'>STDELISTED=#{bean.stdelisted,jdbcType=TIMESTAMP}, </if><if test='mask.stpbrate'>STPBRATE=#{bean.stpbrate,jdbcType=DOUBLE}, </if><if test='mask.stpbrank'>STPBRANK=#{bean.stpbrank,jdbcType=DOUBLE}, </if><if test='mask.stpsrate'>STPSRATE=#{bean.stpsrate,jdbcType=DOUBLE}, </if><if test='mask.stpsrank'>STPSRANK=#{bean.stpsrank,jdbcType=DOUBLE}, </if><if test='mask.stperate'>STPERATE=#{bean.stperate,jdbcType=DOUBLE}, </if><if test='mask.stperank'>STPERANK=#{bean.stperank,jdbcType=DOUBLE}, </if><if test='mask.stpcfrate'>STPCFRATE=#{bean.stpcfrate,jdbcType=DOUBLE}, </if><if test='mask.stpcfrank'>STPCFRANK=#{bean.stpcfrank,jdbcType=DOUBLE}, </if></set>WHERE STID=#{bean.stid,jdbcType=VARCHAR}</if></when><otherwise>UPDATE FS11 SET STEXID=#{bean.stexid,jdbcType=VARCHAR}, STCODE=#{bean.stcode,jdbcType=VARCHAR}, STNAME=#{bean.stname,jdbcType=VARCHAR}, STLISTED=#{bean.stlisted,jdbcType=TIMESTAMP}, STDELISTED=#{bean.stdelisted,jdbcType=TIMESTAMP}, STPBRATE=#{bean.stpbrate,jdbcType=DOUBLE}, STPBRANK=#{bean.stpbrank,jdbcType=DOUBLE}, STPSRATE=#{bean.stpsrate,jdbcType=DOUBLE}, STPSRANK=#{bean.stpsrank,jdbcType=DOUBLE}, STPERATE=#{bean.stperate,jdbcType=DOUBLE}, STPERANK=#{bean.stperank,jdbcType=DOUBLE}, STPCFRATE=#{bean.stpcfrate,jdbcType=DOUBLE}, STPCFRANK=#{bean.stpcfrank,jdbcType=DOUBLE} WHERE STID=#{bean.stid,jdbcType=VARCHAR}</otherwise></choose></script>")
  void update(@Param("bean") Stock bean, @Param("mask") StockMask mask);

  @Delete("DELETE FROM FS11 WHERE STID=#{stid}")
  boolean delete(String stid);

  @Delete(
      "<script>DELETE FROM FS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  void deleteWhere(@Param("filter") FilterExpr filter);

  @Select(
      "<script><choose><when test='mask!=null'><trim prefix='SELECT' suffixOverrides=','><if test='mask.stid'>stid,</if><if test='mask.stexid'>stexid,</if><if test='mask.stcode'>stcode,</if><if test='mask.stname'>stname,</if><if test='mask.stlisted'>stlisted,</if><if test='mask.stdelisted'>stdelisted,</if><if test='mask.stexname'>stexname,</if><if test='mask.stdays'>stdays,</if><if test='mask.stpbrate'>stpbrate,</if><if test='mask.stpbrank'>stpbrank,</if><if test='mask.stpsrate'>stpsrate,</if><if test='mask.stpsrank'>stpsrank,</if><if test='mask.stperate'>stperate,</if><if test='mask.stperank'>stperank,</if><if test='mask.stpcfrate'>stpcfrate,</if><if test='mask.stpcfrank'>stpcfrank,</if><if test='mask.stnpel'>stnpel,</if><if test='mask.stpublish'>stpublish,</if><if test='mask.stpublishdays'>stpublishdays,</if><if test='mask.styear'>styear,</if><if test='mask.stperiod'>stperiod,</if><if test='mask.stmessage'>stmessage,</if><if test='mask.stfavorite'>stfavorite,</if></trim></when><otherwise>SELECT stid, stexid, stcode, stname, stlisted, stdelisted, stexname, stdays, stpbrate, stpbrank, stpsrate, stpsrank, stperate, stperank, stpcfrate, stpcfrank, stnpel, stpublish, stpublishdays, styear, stperiod, stmessage, stfavorite</otherwise></choose> FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if><if test='order!=null'> ORDER BY ${order.toString()}</if> LIMIT #{count} OFFSET #{start}</script>")
  List<Stock> query(
      @Param("filter") FilterExpr filter,
      @Param("order") OrderByListExpr order,
      @Param("start") long start,
      @Param("count") long count,
      @Param("mask") StockMask mask);

  @Select(
      "<script>SELECT COUNT(*) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  long count(@Param("filter") FilterExpr filter);

  @Select(
      "<script>SELECT COALESCE(MIN(STLISTED),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date minStlisted(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STLISTED),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date maxStlisted(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STDELISTED),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date minStdelisted(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STDELISTED),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date maxStdelisted(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STDAYS),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minStdays(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STDAYS),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxStdays(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPBRATE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minStpbrate(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPBRATE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxStpbrate(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPBRANK),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minStpbrank(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPBRANK),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxStpbrank(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPSRATE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minStpsrate(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPSRATE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxStpsrate(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPSRANK),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minStpsrank(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPSRANK),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxStpsrank(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPERATE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minStperate(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPERATE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxStperate(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPERANK),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minStperank(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPERANK),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxStperank(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPCFRATE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minStpcfrate(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPCFRATE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxStpcfrate(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPCFRANK),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minStpcfrank(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPCFRANK),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxStpcfrank(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STNPEL),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minStnpel(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STNPEL),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxStnpel(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPUBLISH),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date minStpublish(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPUBLISH),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date maxStpublish(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPUBLISHDAYS),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minStpublishdays(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPUBLISHDAYS),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxStpublishdays(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STYEAR),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minStyear(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STYEAR),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxStyear(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STPERIOD),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minStperiod(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STPERIOD),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxStperiod(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STMESSAGE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minStmessage(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STMESSAGE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxStmessage(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(STFAVORITE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minStfavorite(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(STFAVORITE),${defaultValue}) FROM VS11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxStfavorite(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);
}
