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
import p8499.stock.mask.ExchangeMask;
import p8499.stock.bean.Exchange;

@Component("exchangeMapper")
public interface ExchangeMapper {
  @Select("SELECT COUNT(*)>0 FROM VS01 WHERE EXID=#{exid}")
  boolean exists(@Param("exid") String exid);

  @Select(
      "<script><choose><when test='mask!=null'><if test='mask.exid or mask.exname'><trim prefix='SELECT' suffixOverrides=','><if test='mask.exid'>EXID, </if><if test='mask.exname'>EXNAME, </if></trim>FROM VS01 WHERE EXID=#{exid}</if></when><otherwise>SELECTEXID,EXNAME FROM VS01 WHERE EXID=#{exid}</otherwise></choose></script>")
  Exchange get(@Param("exid") String exid, @Param("mask") ExchangeMask mask);

  @Insert(
      "INSERT INTO FS01 (EXID,EXNAME) VALUES (#{bean.exid,jdbcType=VARCHAR},#{bean.exname,jdbcType=VARCHAR})")
  void add(@Param("bean") Exchange bean);

  @Update(
      "<script><choose><when test='mask!=null'><if test='mask.exname'>UPDATE FS01 <set><if test='mask.exname'>EXNAME=#{bean.exname,jdbcType=VARCHAR}, </if></set>WHERE EXID=#{bean.exid,jdbcType=VARCHAR}</if></when><otherwise>UPDATE FS01 SET EXNAME=#{bean.exname,jdbcType=VARCHAR} WHERE EXID=#{bean.exid,jdbcType=VARCHAR}</otherwise></choose></script>")
  void update(@Param("bean") Exchange bean, @Param("mask") ExchangeMask mask);

  @Delete("DELETE FROM FS01 WHERE EXID=#{exid}")
  boolean delete(String exid);

  @Delete(
      "<script>DELETE FROM FS01<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  void deleteWhere(@Param("filter") FilterExpr filter);

  @Select(
      "<script><choose><when test='mask!=null'><trim prefix='SELECT' suffixOverrides=','><if test='mask.exid'>exid,</if><if test='mask.exname'>exname,</if></trim></when><otherwise>SELECT exid, exname</otherwise></choose> FROM VS01<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if><if test='order!=null'> ORDER BY ${order.toString()}</if> LIMIT #{count} OFFSET #{start}</script>")
  List<Exchange> query(
      @Param("filter") FilterExpr filter,
      @Param("order") OrderByListExpr order,
      @Param("start") long start,
      @Param("count") long count,
      @Param("mask") ExchangeMask mask);

  @Select(
      "<script>SELECT COUNT(*) FROM VS01<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  long count(@Param("filter") FilterExpr filter);
}
