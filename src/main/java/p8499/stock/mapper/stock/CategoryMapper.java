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
import p8499.stock.mask.CategoryMask;
import p8499.stock.bean.Category;

@Component("categoryMapper")
public interface CategoryMapper {
  @Select("SELECT COUNT(*)>0 FROM VS21 WHERE CAID=#{caid}")
  boolean exists(@Param("caid") String caid);

  @Select(
      "<script><choose><when test='mask!=null'><if test='mask.caid or mask.caname or mask.catype or mask.caweight'><trim prefix='SELECT' suffixOverrides=','><if test='mask.caid'>CAID, </if><if test='mask.caname'>CANAME, </if><if test='mask.catype'>CATYPE, </if><if test='mask.caweight'>CAWEIGHT, </if></trim>FROM VS21 WHERE CAID=#{caid}</if></when><otherwise>SELECTCAID,CANAME,CATYPE,CAWEIGHT FROM VS21 WHERE CAID=#{caid}</otherwise></choose></script>")
  Category get(@Param("caid") String caid, @Param("mask") CategoryMask mask);

  @Insert(
      "INSERT INTO FS21 (CAID,CANAME,CATYPE) VALUES (#{bean.caid,jdbcType=VARCHAR},#{bean.caname,jdbcType=VARCHAR},#{bean.catype,jdbcType=VARCHAR})")
  void add(@Param("bean") Category bean);

  @Update(
      "<script><choose><when test='mask!=null'><if test='mask.caname or mask.catype'>UPDATE FS21 <set><if test='mask.caname'>CANAME=#{bean.caname,jdbcType=VARCHAR}, </if><if test='mask.catype'>CATYPE=#{bean.catype,jdbcType=VARCHAR}, </if></set>WHERE CAID=#{bean.caid,jdbcType=VARCHAR}</if></when><otherwise>UPDATE FS21 SET CANAME=#{bean.caname,jdbcType=VARCHAR}, CATYPE=#{bean.catype,jdbcType=VARCHAR} WHERE CAID=#{bean.caid,jdbcType=VARCHAR}</otherwise></choose></script>")
  void update(@Param("bean") Category bean, @Param("mask") CategoryMask mask);

  @Delete("DELETE FROM FS21 WHERE CAID=#{caid}")
  boolean delete(String caid);

  @Delete(
      "<script>DELETE FROM FS21<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  void deleteWhere(@Param("filter") FilterExpr filter);

  @Select(
      "<script><choose><when test='mask!=null'><trim prefix='SELECT' suffixOverrides=','><if test='mask.caid'>caid,</if><if test='mask.caname'>caname,</if><if test='mask.catype'>catype,</if><if test='mask.caweight'>caweight,</if></trim></when><otherwise>SELECT caid, caname, catype, caweight</otherwise></choose> FROM VS21<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if><if test='order!=null'> ORDER BY ${order.toString()}</if> LIMIT #{count} OFFSET #{start}</script>")
  List<Category> query(
      @Param("filter") FilterExpr filter,
      @Param("order") OrderByListExpr order,
      @Param("start") long start,
      @Param("count") long count,
      @Param("mask") CategoryMask mask);

  @Select(
      "<script>SELECT COUNT(*) FROM VS21<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  long count(@Param("filter") FilterExpr filter);

  @Select(
      "<script>SELECT COALESCE(MIN(CAWEIGHT),${defaultValue}) FROM VS21<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minCaweight(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(CAWEIGHT),${defaultValue}) FROM VS21<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxCaweight(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);
}
