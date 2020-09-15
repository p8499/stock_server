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
import p8499.stock.mask.CategoryStockMask;
import p8499.stock.bean.CategoryStock;

@Component("categoryStockMapper")
public interface CategoryStockMapper {
  @Select("SELECT COUNT(*)>0 FROM VS22 WHERE CSID=#{csid}")
  boolean exists(@Param("csid") Integer csid);

  @Select(
      "<script><choose><when test='mask!=null'><if test='mask.csid or mask.cscaid or mask.csstid or mask.csweight'><trim prefix='SELECT' suffixOverrides=','><if test='mask.csid'>CSID, </if><if test='mask.cscaid'>CSCAID, </if><if test='mask.csstid'>CSSTID, </if><if test='mask.csweight'>CSWEIGHT, </if></trim>FROM VS22 WHERE CSID=#{csid}</if></when><otherwise>SELECTCSID,CSCAID,CSSTID,CSWEIGHT FROM VS22 WHERE CSID=#{csid}</otherwise></choose></script>")
  CategoryStock get(@Param("csid") Integer csid, @Param("mask") CategoryStockMask mask);

  @org.apache.ibatis.annotations.SelectKey(
    statement = "SELECT nextval('FS22_CSID') AS csid",
    before = true,
    resultType = Integer.class,
    keyColumn = "csid",
    keyProperty = "bean.csid"
  )
  @Insert(
      "INSERT INTO FS22 (CSID,CSCAID,CSSTID,CSWEIGHT) VALUES (#{bean.csid,jdbcType=INTEGER},#{bean.cscaid,jdbcType=VARCHAR},#{bean.csstid,jdbcType=VARCHAR},#{bean.csweight,jdbcType=DOUBLE})")
  void add(@Param("bean") CategoryStock bean);

  @Update(
      "<script><choose><when test='mask!=null'><if test='mask.cscaid or mask.csstid or mask.csweight'>UPDATE FS22 <set><if test='mask.cscaid'>CSCAID=#{bean.cscaid,jdbcType=VARCHAR}, </if><if test='mask.csstid'>CSSTID=#{bean.csstid,jdbcType=VARCHAR}, </if><if test='mask.csweight'>CSWEIGHT=#{bean.csweight,jdbcType=DOUBLE}, </if></set>WHERE CSID=#{bean.csid,jdbcType=INTEGER}</if></when><otherwise>UPDATE FS22 SET CSCAID=#{bean.cscaid,jdbcType=VARCHAR}, CSSTID=#{bean.csstid,jdbcType=VARCHAR}, CSWEIGHT=#{bean.csweight,jdbcType=DOUBLE} WHERE CSID=#{bean.csid,jdbcType=INTEGER}</otherwise></choose></script>")
  void update(@Param("bean") CategoryStock bean, @Param("mask") CategoryStockMask mask);

  @Delete("DELETE FROM FS22 WHERE CSID=#{csid}")
  boolean delete(Integer csid);

  @Delete(
      "<script>DELETE FROM FS22<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  void deleteWhere(@Param("filter") FilterExpr filter);

  @Select(
      "<script><choose><when test='mask!=null'><trim prefix='SELECT' suffixOverrides=','><if test='mask.csid'>csid,</if><if test='mask.cscaid'>cscaid,</if><if test='mask.csstid'>csstid,</if><if test='mask.csweight'>csweight,</if></trim></when><otherwise>SELECT csid, cscaid, csstid, csweight</otherwise></choose> FROM VS22<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if><if test='order!=null'> ORDER BY ${order.toString()}</if> LIMIT #{count} OFFSET #{start}</script>")
  List<CategoryStock> query(
      @Param("filter") FilterExpr filter,
      @Param("order") OrderByListExpr order,
      @Param("start") long start,
      @Param("count") long count,
      @Param("mask") CategoryStockMask mask);

  @Select(
      "<script>SELECT COUNT(*) FROM VS22<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  long count(@Param("filter") FilterExpr filter);

  @Select(
      "<script>SELECT COALESCE(MIN(CSID),${defaultValue}) FROM VS22<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minCsid(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(CSID),${defaultValue}) FROM VS22<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxCsid(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(CSWEIGHT),${defaultValue}) FROM VS22<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minCsweight(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(CSWEIGHT),${defaultValue}) FROM VS22<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxCsweight(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);
}
