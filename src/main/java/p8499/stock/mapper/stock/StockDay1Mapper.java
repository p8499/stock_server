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
import p8499.stock.mask.StockDay1Mask;
import p8499.stock.bean.StockDay1;

@Component("stockDay1Mapper")
public interface StockDay1Mapper {
  @Select("SELECT COUNT(*)>0 FROM VM11 WHERE D1ID=#{d1id}")
  boolean exists(@Param("d1id") Integer d1id);

  @Select(
      "<script><choose><when test='mask!=null'><if test='mask.d1id or mask.d1stid or mask.d1date or mask.d1open or mask.d1close or mask.d1high or mask.d1low or mask.d1volume or mask.d1amount or mask.d1totalshare or mask.d1flowshare or mask.d1factor or mask.d1buy1 or mask.d1sell1 or mask.d1buy2 or mask.d1sell2 or mask.d1buy3 or mask.d1sell3 or mask.d1buy4 or mask.d1sell4 or mask.d1openpre or mask.d1closepre or mask.d1highpre or mask.d1lowpre or mask.d1volumepre or mask.d1openpost or mask.d1closepost or mask.d1highpost or mask.d1lowpost or mask.d1volumepost or mask.d1turnover or mask.d1netpercent2 or mask.d1netpercent3 or mask.d1netpercent4 or mask.d1netforce2 or mask.d1netforce3 or mask.d1netforce4 or mask.d1exid or mask.d1exname or mask.d1fina or mask.d1fioiy or mask.d1finpey or mask.d1fiocny or mask.d1finaps or mask.d1fioiyps or mask.d1finpeyps or mask.d1fiocnyps or mask.d1pb or mask.d1ps or mask.d1pe or mask.d1pcf'><trim prefix='SELECT' suffixOverrides=','><if test='mask.d1id'>D1ID, </if><if test='mask.d1stid'>D1STID, </if><if test='mask.d1date'>D1DATE, </if><if test='mask.d1open'>D1OPEN, </if><if test='mask.d1close'>D1CLOSE, </if><if test='mask.d1high'>D1HIGH, </if><if test='mask.d1low'>D1LOW, </if><if test='mask.d1volume'>D1VOLUME, </if><if test='mask.d1amount'>D1AMOUNT, </if><if test='mask.d1totalshare'>D1TOTALSHARE, </if><if test='mask.d1flowshare'>D1FLOWSHARE, </if><if test='mask.d1factor'>D1FACTOR, </if><if test='mask.d1buy1'>D1BUY1, </if><if test='mask.d1sell1'>D1SELL1, </if><if test='mask.d1buy2'>D1BUY2, </if><if test='mask.d1sell2'>D1SELL2, </if><if test='mask.d1buy3'>D1BUY3, </if><if test='mask.d1sell3'>D1SELL3, </if><if test='mask.d1buy4'>D1BUY4, </if><if test='mask.d1sell4'>D1SELL4, </if><if test='mask.d1openpre'>D1OPENPRE, </if><if test='mask.d1closepre'>D1CLOSEPRE, </if><if test='mask.d1highpre'>D1HIGHPRE, </if><if test='mask.d1lowpre'>D1LOWPRE, </if><if test='mask.d1volumepre'>D1VOLUMEPRE, </if><if test='mask.d1openpost'>D1OPENPOST, </if><if test='mask.d1closepost'>D1CLOSEPOST, </if><if test='mask.d1highpost'>D1HIGHPOST, </if><if test='mask.d1lowpost'>D1LOWPOST, </if><if test='mask.d1volumepost'>D1VOLUMEPOST, </if><if test='mask.d1turnover'>D1TURNOVER, </if><if test='mask.d1netpercent2'>D1NETPERCENT2, </if><if test='mask.d1netpercent3'>D1NETPERCENT3, </if><if test='mask.d1netpercent4'>D1NETPERCENT4, </if><if test='mask.d1netforce2'>D1NETFORCE2, </if><if test='mask.d1netforce3'>D1NETFORCE3, </if><if test='mask.d1netforce4'>D1NETFORCE4, </if><if test='mask.d1exid'>D1EXID, </if><if test='mask.d1exname'>D1EXNAME, </if><if test='mask.d1fina'>D1FINA, </if><if test='mask.d1fioiy'>D1FIOIY, </if><if test='mask.d1finpey'>D1FINPEY, </if><if test='mask.d1fiocny'>D1FIOCNY, </if><if test='mask.d1finaps'>D1FINAPS, </if><if test='mask.d1fioiyps'>D1FIOIYPS, </if><if test='mask.d1finpeyps'>D1FINPEYPS, </if><if test='mask.d1fiocnyps'>D1FIOCNYPS, </if><if test='mask.d1pb'>D1PB, </if><if test='mask.d1ps'>D1PS, </if><if test='mask.d1pe'>D1PE, </if><if test='mask.d1pcf'>D1PCF, </if></trim>FROM VM11 WHERE D1ID=#{d1id}</if></when><otherwise>SELECTD1ID,D1STID,D1DATE,D1OPEN,D1CLOSE,D1HIGH,D1LOW,D1VOLUME,D1AMOUNT,D1TOTALSHARE,D1FLOWSHARE,D1FACTOR,D1BUY1,D1SELL1,D1BUY2,D1SELL2,D1BUY3,D1SELL3,D1BUY4,D1SELL4,D1OPENPRE,D1CLOSEPRE,D1HIGHPRE,D1LOWPRE,D1VOLUMEPRE,D1OPENPOST,D1CLOSEPOST,D1HIGHPOST,D1LOWPOST,D1VOLUMEPOST,D1TURNOVER,D1NETPERCENT2,D1NETPERCENT3,D1NETPERCENT4,D1NETFORCE2,D1NETFORCE3,D1NETFORCE4,D1EXID,D1EXNAME,D1FINA,D1FIOIY,D1FINPEY,D1FIOCNY,D1FINAPS,D1FIOIYPS,D1FINPEYPS,D1FIOCNYPS,D1PB,D1PS,D1PE,D1PCF FROM VM11 WHERE D1ID=#{d1id}</otherwise></choose></script>")
  StockDay1 get(@Param("d1id") Integer d1id, @Param("mask") StockDay1Mask mask);

  @org.apache.ibatis.annotations.SelectKey(
    statement = "SELECT nextval('FM11_D1ID') AS d1id",
    before = true,
    resultType = Integer.class,
    keyColumn = "d1id",
    keyProperty = "bean.d1id"
  )
  @Insert(
      "INSERT INTO FM11 (D1ID,D1STID,D1DATE,D1OPEN,D1CLOSE,D1HIGH,D1LOW,D1VOLUME,D1AMOUNT,D1TOTALSHARE,D1FLOWSHARE,D1FACTOR,D1BUY1,D1SELL1,D1BUY2,D1SELL2,D1BUY3,D1SELL3,D1BUY4,D1SELL4,D1FINA,D1FIOIY,D1FINPEY,D1FIOCNY,D1FINAPS,D1FIOIYPS,D1FINPEYPS,D1FIOCNYPS,D1PB,D1PS,D1PE,D1PCF) VALUES (#{bean.d1id,jdbcType=INTEGER},#{bean.d1stid,jdbcType=VARCHAR},#{bean.d1date,jdbcType=TIMESTAMP},#{bean.d1open,jdbcType=DOUBLE},#{bean.d1close,jdbcType=DOUBLE},#{bean.d1high,jdbcType=DOUBLE},#{bean.d1low,jdbcType=DOUBLE},#{bean.d1volume,jdbcType=DOUBLE},#{bean.d1amount,jdbcType=DOUBLE},#{bean.d1totalshare,jdbcType=DOUBLE},#{bean.d1flowshare,jdbcType=DOUBLE},#{bean.d1factor,jdbcType=DOUBLE},#{bean.d1buy1,jdbcType=DOUBLE},#{bean.d1sell1,jdbcType=DOUBLE},#{bean.d1buy2,jdbcType=DOUBLE},#{bean.d1sell2,jdbcType=DOUBLE},#{bean.d1buy3,jdbcType=DOUBLE},#{bean.d1sell3,jdbcType=DOUBLE},#{bean.d1buy4,jdbcType=DOUBLE},#{bean.d1sell4,jdbcType=DOUBLE},#{bean.d1fina,jdbcType=DOUBLE},#{bean.d1fioiy,jdbcType=DOUBLE},#{bean.d1finpey,jdbcType=DOUBLE},#{bean.d1fiocny,jdbcType=DOUBLE},#{bean.d1finaps,jdbcType=DOUBLE},#{bean.d1fioiyps,jdbcType=DOUBLE},#{bean.d1finpeyps,jdbcType=DOUBLE},#{bean.d1fiocnyps,jdbcType=DOUBLE},#{bean.d1pb,jdbcType=DOUBLE},#{bean.d1ps,jdbcType=DOUBLE},#{bean.d1pe,jdbcType=DOUBLE},#{bean.d1pcf,jdbcType=DOUBLE})")
  void add(@Param("bean") StockDay1 bean);

  @Update(
      "<script><choose><when test='mask!=null'><if test='mask.d1stid or mask.d1date or mask.d1open or mask.d1close or mask.d1high or mask.d1low or mask.d1volume or mask.d1amount or mask.d1totalshare or mask.d1flowshare or mask.d1factor or mask.d1buy1 or mask.d1sell1 or mask.d1buy2 or mask.d1sell2 or mask.d1buy3 or mask.d1sell3 or mask.d1buy4 or mask.d1sell4 or mask.d1fina or mask.d1fioiy or mask.d1finpey or mask.d1fiocny or mask.d1finaps or mask.d1fioiyps or mask.d1finpeyps or mask.d1fiocnyps or mask.d1pb or mask.d1ps or mask.d1pe or mask.d1pcf'>UPDATE FM11 <set><if test='mask.d1stid'>D1STID=#{bean.d1stid,jdbcType=VARCHAR}, </if><if test='mask.d1date'>D1DATE=#{bean.d1date,jdbcType=TIMESTAMP}, </if><if test='mask.d1open'>D1OPEN=#{bean.d1open,jdbcType=DOUBLE}, </if><if test='mask.d1close'>D1CLOSE=#{bean.d1close,jdbcType=DOUBLE}, </if><if test='mask.d1high'>D1HIGH=#{bean.d1high,jdbcType=DOUBLE}, </if><if test='mask.d1low'>D1LOW=#{bean.d1low,jdbcType=DOUBLE}, </if><if test='mask.d1volume'>D1VOLUME=#{bean.d1volume,jdbcType=DOUBLE}, </if><if test='mask.d1amount'>D1AMOUNT=#{bean.d1amount,jdbcType=DOUBLE}, </if><if test='mask.d1totalshare'>D1TOTALSHARE=#{bean.d1totalshare,jdbcType=DOUBLE}, </if><if test='mask.d1flowshare'>D1FLOWSHARE=#{bean.d1flowshare,jdbcType=DOUBLE}, </if><if test='mask.d1factor'>D1FACTOR=#{bean.d1factor,jdbcType=DOUBLE}, </if><if test='mask.d1buy1'>D1BUY1=#{bean.d1buy1,jdbcType=DOUBLE}, </if><if test='mask.d1sell1'>D1SELL1=#{bean.d1sell1,jdbcType=DOUBLE}, </if><if test='mask.d1buy2'>D1BUY2=#{bean.d1buy2,jdbcType=DOUBLE}, </if><if test='mask.d1sell2'>D1SELL2=#{bean.d1sell2,jdbcType=DOUBLE}, </if><if test='mask.d1buy3'>D1BUY3=#{bean.d1buy3,jdbcType=DOUBLE}, </if><if test='mask.d1sell3'>D1SELL3=#{bean.d1sell3,jdbcType=DOUBLE}, </if><if test='mask.d1buy4'>D1BUY4=#{bean.d1buy4,jdbcType=DOUBLE}, </if><if test='mask.d1sell4'>D1SELL4=#{bean.d1sell4,jdbcType=DOUBLE}, </if><if test='mask.d1fina'>D1FINA=#{bean.d1fina,jdbcType=DOUBLE}, </if><if test='mask.d1fioiy'>D1FIOIY=#{bean.d1fioiy,jdbcType=DOUBLE}, </if><if test='mask.d1finpey'>D1FINPEY=#{bean.d1finpey,jdbcType=DOUBLE}, </if><if test='mask.d1fiocny'>D1FIOCNY=#{bean.d1fiocny,jdbcType=DOUBLE}, </if><if test='mask.d1finaps'>D1FINAPS=#{bean.d1finaps,jdbcType=DOUBLE}, </if><if test='mask.d1fioiyps'>D1FIOIYPS=#{bean.d1fioiyps,jdbcType=DOUBLE}, </if><if test='mask.d1finpeyps'>D1FINPEYPS=#{bean.d1finpeyps,jdbcType=DOUBLE}, </if><if test='mask.d1fiocnyps'>D1FIOCNYPS=#{bean.d1fiocnyps,jdbcType=DOUBLE}, </if><if test='mask.d1pb'>D1PB=#{bean.d1pb,jdbcType=DOUBLE}, </if><if test='mask.d1ps'>D1PS=#{bean.d1ps,jdbcType=DOUBLE}, </if><if test='mask.d1pe'>D1PE=#{bean.d1pe,jdbcType=DOUBLE}, </if><if test='mask.d1pcf'>D1PCF=#{bean.d1pcf,jdbcType=DOUBLE}, </if></set>WHERE D1ID=#{bean.d1id,jdbcType=INTEGER}</if></when><otherwise>UPDATE FM11 SET D1STID=#{bean.d1stid,jdbcType=VARCHAR}, D1DATE=#{bean.d1date,jdbcType=TIMESTAMP}, D1OPEN=#{bean.d1open,jdbcType=DOUBLE}, D1CLOSE=#{bean.d1close,jdbcType=DOUBLE}, D1HIGH=#{bean.d1high,jdbcType=DOUBLE}, D1LOW=#{bean.d1low,jdbcType=DOUBLE}, D1VOLUME=#{bean.d1volume,jdbcType=DOUBLE}, D1AMOUNT=#{bean.d1amount,jdbcType=DOUBLE}, D1TOTALSHARE=#{bean.d1totalshare,jdbcType=DOUBLE}, D1FLOWSHARE=#{bean.d1flowshare,jdbcType=DOUBLE}, D1FACTOR=#{bean.d1factor,jdbcType=DOUBLE}, D1BUY1=#{bean.d1buy1,jdbcType=DOUBLE}, D1SELL1=#{bean.d1sell1,jdbcType=DOUBLE}, D1BUY2=#{bean.d1buy2,jdbcType=DOUBLE}, D1SELL2=#{bean.d1sell2,jdbcType=DOUBLE}, D1BUY3=#{bean.d1buy3,jdbcType=DOUBLE}, D1SELL3=#{bean.d1sell3,jdbcType=DOUBLE}, D1BUY4=#{bean.d1buy4,jdbcType=DOUBLE}, D1SELL4=#{bean.d1sell4,jdbcType=DOUBLE}, D1FINA=#{bean.d1fina,jdbcType=DOUBLE}, D1FIOIY=#{bean.d1fioiy,jdbcType=DOUBLE}, D1FINPEY=#{bean.d1finpey,jdbcType=DOUBLE}, D1FIOCNY=#{bean.d1fiocny,jdbcType=DOUBLE}, D1FINAPS=#{bean.d1finaps,jdbcType=DOUBLE}, D1FIOIYPS=#{bean.d1fioiyps,jdbcType=DOUBLE}, D1FINPEYPS=#{bean.d1finpeyps,jdbcType=DOUBLE}, D1FIOCNYPS=#{bean.d1fiocnyps,jdbcType=DOUBLE}, D1PB=#{bean.d1pb,jdbcType=DOUBLE}, D1PS=#{bean.d1ps,jdbcType=DOUBLE}, D1PE=#{bean.d1pe,jdbcType=DOUBLE}, D1PCF=#{bean.d1pcf,jdbcType=DOUBLE} WHERE D1ID=#{bean.d1id,jdbcType=INTEGER}</otherwise></choose></script>")
  void update(@Param("bean") StockDay1 bean, @Param("mask") StockDay1Mask mask);

  @Delete("DELETE FROM FM11 WHERE D1ID=#{d1id}")
  boolean delete(Integer d1id);

  @Delete(
      "<script>DELETE FROM FM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  void deleteWhere(@Param("filter") FilterExpr filter);

  @Select(
      "<script><choose><when test='mask!=null'><trim prefix='SELECT' suffixOverrides=','><if test='mask.d1id'>d1id,</if><if test='mask.d1stid'>d1stid,</if><if test='mask.d1date'>d1date,</if><if test='mask.d1open'>d1open,</if><if test='mask.d1close'>d1close,</if><if test='mask.d1high'>d1high,</if><if test='mask.d1low'>d1low,</if><if test='mask.d1volume'>d1volume,</if><if test='mask.d1amount'>d1amount,</if><if test='mask.d1totalshare'>d1totalshare,</if><if test='mask.d1flowshare'>d1flowshare,</if><if test='mask.d1factor'>d1factor,</if><if test='mask.d1buy1'>d1buy1,</if><if test='mask.d1sell1'>d1sell1,</if><if test='mask.d1buy2'>d1buy2,</if><if test='mask.d1sell2'>d1sell2,</if><if test='mask.d1buy3'>d1buy3,</if><if test='mask.d1sell3'>d1sell3,</if><if test='mask.d1buy4'>d1buy4,</if><if test='mask.d1sell4'>d1sell4,</if><if test='mask.d1openpre'>d1openpre,</if><if test='mask.d1closepre'>d1closepre,</if><if test='mask.d1highpre'>d1highpre,</if><if test='mask.d1lowpre'>d1lowpre,</if><if test='mask.d1volumepre'>d1volumepre,</if><if test='mask.d1openpost'>d1openpost,</if><if test='mask.d1closepost'>d1closepost,</if><if test='mask.d1highpost'>d1highpost,</if><if test='mask.d1lowpost'>d1lowpost,</if><if test='mask.d1volumepost'>d1volumepost,</if><if test='mask.d1turnover'>d1turnover,</if><if test='mask.d1netpercent2'>d1netpercent2,</if><if test='mask.d1netpercent3'>d1netpercent3,</if><if test='mask.d1netpercent4'>d1netpercent4,</if><if test='mask.d1netforce2'>d1netforce2,</if><if test='mask.d1netforce3'>d1netforce3,</if><if test='mask.d1netforce4'>d1netforce4,</if><if test='mask.d1exid'>d1exid,</if><if test='mask.d1exname'>d1exname,</if><if test='mask.d1fina'>d1fina,</if><if test='mask.d1fioiy'>d1fioiy,</if><if test='mask.d1finpey'>d1finpey,</if><if test='mask.d1fiocny'>d1fiocny,</if><if test='mask.d1finaps'>d1finaps,</if><if test='mask.d1fioiyps'>d1fioiyps,</if><if test='mask.d1finpeyps'>d1finpeyps,</if><if test='mask.d1fiocnyps'>d1fiocnyps,</if><if test='mask.d1pb'>d1pb,</if><if test='mask.d1ps'>d1ps,</if><if test='mask.d1pe'>d1pe,</if><if test='mask.d1pcf'>d1pcf,</if></trim></when><otherwise>SELECT d1id, d1stid, d1date, d1open, d1close, d1high, d1low, d1volume, d1amount, d1totalshare, d1flowshare, d1factor, d1buy1, d1sell1, d1buy2, d1sell2, d1buy3, d1sell3, d1buy4, d1sell4, d1openpre, d1closepre, d1highpre, d1lowpre, d1volumepre, d1openpost, d1closepost, d1highpost, d1lowpost, d1volumepost, d1turnover, d1netpercent2, d1netpercent3, d1netpercent4, d1netforce2, d1netforce3, d1netforce4, d1exid, d1exname, d1fina, d1fioiy, d1finpey, d1fiocny, d1finaps, d1fioiyps, d1finpeyps, d1fiocnyps, d1pb, d1ps, d1pe, d1pcf</otherwise></choose> FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if><if test='order!=null'> ORDER BY ${order.toString()}</if> LIMIT #{count} OFFSET #{start}</script>")
  List<StockDay1> query(
      @Param("filter") FilterExpr filter,
      @Param("order") OrderByListExpr order,
      @Param("start") long start,
      @Param("count") long count,
      @Param("mask") StockDay1Mask mask);

  @Select(
      "<script>SELECT COUNT(*) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  long count(@Param("filter") FilterExpr filter);

  @Select(
      "<script>SELECT COALESCE(MIN(D1ID),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer minD1id(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1ID),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Integer maxD1id(@Param("filter") FilterExpr filter, @Param("defaultValue") Integer defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1DATE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date minD1date(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1DATE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  java.util.Date maxD1date(
      @Param("filter") FilterExpr filter, @Param("defaultValue") java.util.Date defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1OPEN),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1open(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1OPEN),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1open(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1CLOSE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1close(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1CLOSE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1close(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1HIGH),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1high(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1HIGH),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1high(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1LOW),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1low(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1LOW),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1low(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1VOLUME),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1volume(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1VOLUME),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1volume(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1AMOUNT),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1amount(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1AMOUNT),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1amount(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1TOTALSHARE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1totalshare(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1TOTALSHARE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1totalshare(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1FLOWSHARE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1flowshare(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1FLOWSHARE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1flowshare(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1FACTOR),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1factor(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1FACTOR),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1factor(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1BUY1),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1buy1(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1BUY1),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1buy1(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1SELL1),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1sell1(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1SELL1),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1sell1(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1BUY2),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1buy2(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1BUY2),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1buy2(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1SELL2),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1sell2(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1SELL2),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1sell2(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1BUY3),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1buy3(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1BUY3),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1buy3(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1SELL3),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1sell3(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1SELL3),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1sell3(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1BUY4),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1buy4(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1BUY4),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1buy4(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1SELL4),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1sell4(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1SELL4),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1sell4(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1OPENPRE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1openpre(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1OPENPRE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1openpre(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1CLOSEPRE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1closepre(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1CLOSEPRE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1closepre(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1HIGHPRE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1highpre(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1HIGHPRE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1highpre(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1LOWPRE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1lowpre(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1LOWPRE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1lowpre(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1VOLUMEPRE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1volumepre(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1VOLUMEPRE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1volumepre(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1OPENPOST),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1openpost(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1OPENPOST),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1openpost(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1CLOSEPOST),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1closepost(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1CLOSEPOST),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1closepost(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1HIGHPOST),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1highpost(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1HIGHPOST),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1highpost(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1LOWPOST),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1lowpost(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1LOWPOST),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1lowpost(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1VOLUMEPOST),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1volumepost(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1VOLUMEPOST),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1volumepost(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1TURNOVER),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1turnover(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1TURNOVER),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1turnover(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1NETPERCENT2),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1netpercent2(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1NETPERCENT2),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1netpercent2(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1NETPERCENT3),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1netpercent3(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1NETPERCENT3),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1netpercent3(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1NETPERCENT4),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1netpercent4(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1NETPERCENT4),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1netpercent4(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1NETFORCE2),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1netforce2(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1NETFORCE2),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1netforce2(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1NETFORCE3),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1netforce3(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1NETFORCE3),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1netforce3(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1NETFORCE4),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1netforce4(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1NETFORCE4),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1netforce4(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1FINA),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1fina(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1FINA),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1fina(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1FIOIY),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1fioiy(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1FIOIY),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1fioiy(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1FINPEY),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1finpey(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1FINPEY),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1finpey(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1FIOCNY),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1fiocny(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1FIOCNY),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1fiocny(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1FINAPS),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1finaps(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1FINAPS),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1finaps(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1FIOIYPS),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1fioiyps(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1FIOIYPS),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1fioiyps(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1FINPEYPS),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1finpeyps(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1FINPEYPS),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1finpeyps(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1FIOCNYPS),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1fiocnyps(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1FIOCNYPS),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1fiocnyps(
      @Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1PB),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1pb(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1PB),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1pb(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1PS),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1ps(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1PS),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1ps(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1PE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1pe(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1PE),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1pe(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MIN(D1PCF),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double minD1pcf(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);

  @Select(
      "<script>SELECT COALESCE(MAX(D1PCF),${defaultValue}) FROM VM11<if test='filter!=null'> WHERE ${filter.toStringPostgresql()}</if></script>")
  Double maxD1pcf(@Param("filter") FilterExpr filter, @Param("defaultValue") Double defaultValue);
}
