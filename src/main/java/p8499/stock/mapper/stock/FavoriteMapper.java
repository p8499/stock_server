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
import p8499.stock.mask.FavoriteMask;
import p8499.stock.bean.Favorite;

@Component("favoriteMapper")
public interface FavoriteMapper {
  @Select("SELECT COUNT(*)>0 FROM VS91 WHERE FASTID=#{fastid}")
  boolean exists(@Param("fastid") String fastid);

  @Select(
      "<script><choose><when test='mask!=null'><if test='mask.fastid'><trim prefix='SELECT' suffixOverrides=','><if test='mask.fastid'>FASTID, </if></trim>FROM VS91 WHERE FASTID=#{fastid}</if></when><otherwise>SELECTFASTID FROM VS91 WHERE FASTID=#{fastid}</otherwise></choose></script>")
  Favorite get(@Param("fastid") String fastid, @Param("mask") FavoriteMask mask);

  @Insert("INSERT INTO FS91 (FASTID) VALUES (#{bean.fastid,jdbcType=VARCHAR})")
  void add(@Param("bean") Favorite bean);

  @Update(
      "<script><choose><when test='mask!=null'><if test=''>UPDATE FS91 <set></set>WHERE FASTID=#{bean.fastid,jdbcType=VARCHAR}</if></when><otherwise>UPDATE FS91 SET WHERE FASTID=#{bean.fastid,jdbcType=VARCHAR}</otherwise></choose></script>")
  void update(@Param("bean") Favorite bean, @Param("mask") FavoriteMask mask);

  @Delete("DELETE FROM FS91 WHERE FASTID=#{fastid}")
  boolean delete(String fastid);

  @Delete(
      "<script>DELETE FROM FS91<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  void deleteWhere(@Param("filter") FilterExpr filter);

  @Select(
      "<script><choose><when test='mask!=null'><trim prefix='SELECT' suffixOverrides=','><if test='mask.fastid'>fastid,</if></trim></when><otherwise>SELECT fastid</otherwise></choose> FROM VS91<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if><if test='order!=null'> ORDER BY ${order.toString()}</if> LIMIT #{count} OFFSET #{start}</script>")
  List<Favorite> query(
      @Param("filter") FilterExpr filter,
      @Param("order") OrderByListExpr order,
      @Param("start") long start,
      @Param("count") long count,
      @Param("mask") FavoriteMask mask);

  @Select(
      "<script>SELECT COUNT(*) FROM VS91<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  long count(@Param("filter") FilterExpr filter);
}
