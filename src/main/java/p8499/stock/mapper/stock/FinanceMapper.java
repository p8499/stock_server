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
import p8499.stock.mask.FinanceMask;
import p8499.stock.bean.Finance;

@Component("financeMapper")
public interface FinanceMapper {
  @Select("SELECT COUNT(*)>0 FROM VS12 WHERE FIID=#{fiid}")
  boolean exists(@Param("fiid") Integer fiid);

  @Select(
      "<script><choose><when test='mask!=null'><if test='mask.fiid or mask.fistid or mask.fiyear or mask.fiperiod or mask.fistatus or mask.fipublish or mask.fina or mask.fioi or mask.finpe or mask.fiocn or mask.fioiy or mask.finpey or mask.fiocny'><trim prefix='SELECT' suffixOverrides=','><if test='mask.fiid'>FIID, </if><if test='mask.fistid'>FISTID, </if><if test='mask.fiyear'>FIYEAR, </if><if test='mask.fiperiod'>FIPERIOD, </if><if test='mask.fistatus'>FISTATUS, </if><if test='mask.fipublish'>FIPUBLISH, </if><if test='mask.fina'>FINA, </if><if test='mask.fioi'>FIOI, </if><if test='mask.finpe'>FINPE, </if><if test='mask.fiocn'>FIOCN, </if><if test='mask.fioiy'>FIOIY, </if><if test='mask.finpey'>FINPEY, </if><if test='mask.fiocny'>FIOCNY, </if></trim>FROM VS12 WHERE FIID=#{fiid}</if></when><otherwise>SELECTFIID,FISTID,FIYEAR,FIPERIOD,FISTATUS,FIPUBLISH,FINA,FIOI,FINPE,FIOCN,FIOIY,FINPEY,FIOCNY FROM VS12 WHERE FIID=#{fiid}</otherwise></choose></script>")
  Finance get(@Param("fiid") Integer fiid, @Param("mask") FinanceMask mask);

  @org.apache.ibatis.annotations.SelectKey(
    statement = "SELECT nextval('FS12_FIID') AS fiid",
    before = true,
    resultType = Integer.class,
    keyColumn = "fiid",
    keyProperty = "bean.fiid"
  )
  @Insert(
      "INSERT INTO FS12 (FIID,FISTID,FIYEAR,FIPERIOD,FISTATUS,FIPUBLISH,FINA,FIOI,FINPE,FIOCN,FIOIY,FINPEY,FIOCNY) VALUES (#{bean.fiid,jdbcType=INTEGER},#{bean.fistid,jdbcType=VARCHAR},#{bean.fiyear,jdbcType=SMALLINT},#{bean.fiperiod,jdbcType=SMALLINT},#{bean.fistatus,jdbcType=VARCHAR},#{bean.fipublish,jdbcType=TIMESTAMP},#{bean.fina,jdbcType=DOUBLE},#{bean.fioi,jdbcType=DOUBLE},#{bean.finpe,jdbcType=DOUBLE},#{bean.fiocn,jdbcType=DOUBLE},#{bean.fioiy,jdbcType=DOUBLE},#{bean.finpey,jdbcType=DOUBLE},#{bean.fiocny,jdbcType=DOUBLE})")
  void add(@Param("bean") Finance bean);

  @Update(
      "<script><choose><when test='mask!=null'><if test='mask.fistid or mask.fiyear or mask.fiperiod or mask.fistatus or mask.fipublish or mask.fina or mask.fioi or mask.finpe or mask.fiocn or mask.fioiy or mask.finpey or mask.fiocny'>UPDATE FS12 <set><if test='mask.fistid'>FISTID=#{bean.fistid,jdbcType=VARCHAR}, </if><if test='mask.fiyear'>FIYEAR=#{bean.fiyear,jdbcType=SMALLINT}, </if><if test='mask.fiperiod'>FIPERIOD=#{bean.fiperiod,jdbcType=SMALLINT}, </if><if test='mask.fistatus'>FISTATUS=#{bean.fistatus,jdbcType=VARCHAR}, </if><if test='mask.fipublish'>FIPUBLISH=#{bean.fipublish,jdbcType=TIMESTAMP}, </if><if test='mask.fina'>FINA=#{bean.fina,jdbcType=DOUBLE}, </if><if test='mask.fioi'>FIOI=#{bean.fioi,jdbcType=DOUBLE}, </if><if test='mask.finpe'>FINPE=#{bean.finpe,jdbcType=DOUBLE}, </if><if test='mask.fiocn'>FIOCN=#{bean.fiocn,jdbcType=DOUBLE}, </if><if test='mask.fioiy'>FIOIY=#{bean.fioiy,jdbcType=DOUBLE}, </if><if test='mask.finpey'>FINPEY=#{bean.finpey,jdbcType=DOUBLE}, </if><if test='mask.fiocny'>FIOCNY=#{bean.fiocny,jdbcType=DOUBLE}, </if></set>WHERE FIID=#{bean.fiid,jdbcType=INTEGER}</if></when><otherwise>UPDATE FS12 SET FISTID=#{bean.fistid,jdbcType=VARCHAR}, FIYEAR=#{bean.fiyear,jdbcType=SMALLINT}, FIPERIOD=#{bean.fiperiod,jdbcType=SMALLINT}, FISTATUS=#{bean.fistatus,jdbcType=VARCHAR}, FIPUBLISH=#{bean.fipublish,jdbcType=TIMESTAMP}, FINA=#{bean.fina,jdbcType=DOUBLE}, FIOI=#{bean.fioi,jdbcType=DOUBLE}, FINPE=#{bean.finpe,jdbcType=DOUBLE}, FIOCN=#{bean.fiocn,jdbcType=DOUBLE}, FIOIY=#{bean.fioiy,jdbcType=DOUBLE}, FINPEY=#{bean.finpey,jdbcType=DOUBLE}, FIOCNY=#{bean.fiocny,jdbcType=DOUBLE} WHERE FIID=#{bean.fiid,jdbcType=INTEGER}</otherwise></choose></script>")
  void update(@Param("bean") Finance bean, @Param("mask") FinanceMask mask);

  @Delete("DELETE FROM FS12 WHERE FIID=#{fiid}")
  boolean delete(Integer fiid);

  @Delete(
      "<script>DELETE FROM FS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  void deleteWhere(@Param("filter") FilterExpr filter);

  @Select(
      "<script><choose><when test='mask!=null'><trim prefix='SELECT' suffixOverrides=','><if test='mask.fiid'>fiid,</if><if test='mask.fistid'>fistid,</if><if test='mask.fiyear'>fiyear,</if><if test='mask.fiperiod'>fiperiod,</if><if test='mask.fistatus'>fistatus,</if><if test='mask.fipublish'>fipublish,</if><if test='mask.fina'>fina,</if><if test='mask.fioi'>fioi,</if><if test='mask.finpe'>finpe,</if><if test='mask.fiocn'>fiocn,</if><if test='mask.fioiy'>fioiy,</if><if test='mask.finpey'>finpey,</if><if test='mask.fiocny'>fiocny,</if></trim></when><otherwise>SELECT fiid, fistid, fiyear, fiperiod, fistatus, fipublish, fina, fioi, finpe, fiocn, fioiy, finpey, fiocny</otherwise></choose> FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if><if test='order!=null'> ORDER BY ${order.toString()}</if> LIMIT #{count} OFFSET #{start}</script>")
  List<Finance> query(
      @Param("filter") FilterExpr filter,
      @Param("order") OrderByListExpr order,
      @Param("start") long start,
      @Param("count") long count,
      @Param("mask") FinanceMask mask);

  @Select(
      "<script>SELECT COUNT(*) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  long count(@Param("filter") FilterExpr filter);

  @Select(
      "<script>SELECT COALESCE(MIN(FIID),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minFiid(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FIID),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxFiid(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(FIYEAR),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minFiyear(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FIYEAR),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxFiyear(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(FIPERIOD),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minFiperiod(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FIPERIOD),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxFiperiod(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(FIPUBLISH),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date minFipublish(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FIPUBLISH),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date maxFipublish(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(FINA),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minFina(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FINA),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxFina(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(FIOI),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minFioi(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FIOI),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxFioi(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(FINPE),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minFinpe(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FINPE),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxFinpe(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(FIOCN),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minFiocn(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FIOCN),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxFiocn(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(FIOIY),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minFioiy(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FIOIY),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxFioiy(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(FINPEY),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minFinpey(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FINPEY),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxFinpey(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(FIOCNY),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minFiocny(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(FIOCNY),${defaultValue}) FROM VS12<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxFiocny(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);
}
