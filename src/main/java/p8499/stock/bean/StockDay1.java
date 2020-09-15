package p8499.stock.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockDay1 {
  public static final String TABLE = "FM11";
  public static final String VIEW = "VM11";
  public static final String NAME = "STD1";

  //region d1id ID
  public static final String FIELD_D1ID = "D1ID";
  protected Integer d1id = null;
  public static final int CONSTRAINT_D1ID_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1ID_MIN = -99999999;
  public static final int CONSTRAINT_D1ID_MAX = 99999999;

  @javax.validation.constraints.Null(groups = {Insert.class})
  @javax.validation.constraints.NotNull(groups = {Update.class})
  public Integer getD1id() {
    return d1id;
  }

  public StockDay1 setD1id(Integer d1id) {
    this.d1id = d1id;
    return this;
  }
  //endregion

  //region d1stid 证券代码
  public static final String FIELD_D1STID = "D1STID";
  protected String d1stid = null;
  public static final int CONSTRAINT_D1STID_LENGTH_STRING = 16;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_D1STID_LENGTH_STRING)
  public String getD1stid() {
    return d1stid;
  }

  public StockDay1 setD1stid(String d1stid) {
    this.d1stid = d1stid;
    return this;
  }
  //endregion

  //region d1date 交易日
  public static final String FIELD_D1DATE = "D1DATE";

  @com.fasterxml.jackson.annotation.JsonFormat(timezone = "GMT+8", pattern = "yyyyMMdd")
  protected java.util.Date d1date = null;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  public java.util.Date getD1date() {
    return d1date;
  }

  public StockDay1 setD1date(java.util.Date d1date) {
    this.d1date = d1date;
    return this;
  }
  //endregion

  //region d1open 开盘价
  public static final String FIELD_D1OPEN = "D1OPEN";
  protected Double d1open = null;
  public static final int CONSTRAINT_D1OPEN_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1OPEN_LENGTH_FRACTION = 2;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1OPEN_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1OPEN_LENGTH_FRACTION
  )
  public Double getD1open() {
    return d1open;
  }

  public StockDay1 setD1open(Double d1open) {
    this.d1open = d1open;
    return this;
  }
  //endregion

  //region d1close 收盘价
  public static final String FIELD_D1CLOSE = "D1CLOSE";
  protected Double d1close = null;
  public static final int CONSTRAINT_D1CLOSE_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1CLOSE_LENGTH_FRACTION = 2;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1CLOSE_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1CLOSE_LENGTH_FRACTION
  )
  public Double getD1close() {
    return d1close;
  }

  public StockDay1 setD1close(Double d1close) {
    this.d1close = d1close;
    return this;
  }
  //endregion

  //region d1high 最高价
  public static final String FIELD_D1HIGH = "D1HIGH";
  protected Double d1high = null;
  public static final int CONSTRAINT_D1HIGH_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1HIGH_LENGTH_FRACTION = 2;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1HIGH_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1HIGH_LENGTH_FRACTION
  )
  public Double getD1high() {
    return d1high;
  }

  public StockDay1 setD1high(Double d1high) {
    this.d1high = d1high;
    return this;
  }
  //endregion

  //region d1low 最低价
  public static final String FIELD_D1LOW = "D1LOW";
  protected Double d1low = null;
  public static final int CONSTRAINT_D1LOW_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1LOW_LENGTH_FRACTION = 2;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1LOW_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1LOW_LENGTH_FRACTION
  )
  public Double getD1low() {
    return d1low;
  }

  public StockDay1 setD1low(Double d1low) {
    this.d1low = d1low;
    return this;
  }
  //endregion

  //region d1volume 成交量
  public static final String FIELD_D1VOLUME = "D1VOLUME";
  protected Double d1volume = null;
  public static final int CONSTRAINT_D1VOLUME_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1VOLUME_LENGTH_FRACTION = 2;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1VOLUME_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1VOLUME_LENGTH_FRACTION
  )
  public Double getD1volume() {
    return d1volume;
  }

  public StockDay1 setD1volume(Double d1volume) {
    this.d1volume = d1volume;
    return this;
  }
  //endregion

  //region d1amount 成交额
  public static final String FIELD_D1AMOUNT = "D1AMOUNT";
  protected Double d1amount = null;
  public static final int CONSTRAINT_D1AMOUNT_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1AMOUNT_LENGTH_FRACTION = 2;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1AMOUNT_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1AMOUNT_LENGTH_FRACTION
  )
  public Double getD1amount() {
    return d1amount;
  }

  public StockDay1 setD1amount(Double d1amount) {
    this.d1amount = d1amount;
    return this;
  }
  //endregion

  //region d1totalshare 总股本
  public static final String FIELD_D1TOTALSHARE = "D1TOTALSHARE";
  protected Double d1totalshare = null;
  public static final int CONSTRAINT_D1TOTALSHARE_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1TOTALSHARE_LENGTH_FRACTION = 2;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1TOTALSHARE_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1TOTALSHARE_LENGTH_FRACTION
  )
  public Double getD1totalshare() {
    return d1totalshare;
  }

  public StockDay1 setD1totalshare(Double d1totalshare) {
    this.d1totalshare = d1totalshare;
    return this;
  }
  //endregion

  //region d1flowshare 流通股本
  public static final String FIELD_D1FLOWSHARE = "D1FLOWSHARE";
  protected Double d1flowshare = null;
  public static final int CONSTRAINT_D1FLOWSHARE_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1FLOWSHARE_LENGTH_FRACTION = 2;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1FLOWSHARE_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1FLOWSHARE_LENGTH_FRACTION
  )
  public Double getD1flowshare() {
    return d1flowshare;
  }

  public StockDay1 setD1flowshare(Double d1flowshare) {
    this.d1flowshare = d1flowshare;
    return this;
  }
  //endregion

  //region d1factor 复权因子
  public static final String FIELD_D1FACTOR = "D1FACTOR";
  public static final Double DEFAULT_D1FACTOR = 1.0;
  protected Double d1factor = DEFAULT_D1FACTOR;
  public static final int CONSTRAINT_D1FACTOR_LENGTH_INTEGER = 12;
  public static final int CONSTRAINT_D1FACTOR_LENGTH_FRACTION = 12;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1FACTOR_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1FACTOR_LENGTH_FRACTION
  )
  public Double getD1factor() {
    return d1factor;
  }

  public StockDay1 setD1factor(Double d1factor) {
    this.d1factor = d1factor;
    return this;
  }
  //endregion

  //region d1buy1 小单买入量
  public static final String FIELD_D1BUY1 = "D1BUY1";
  protected Double d1buy1 = null;
  public static final int CONSTRAINT_D1BUY1_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1BUY1_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1BUY1_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1BUY1_LENGTH_FRACTION
  )
  public Double getD1buy1() {
    return d1buy1;
  }

  public StockDay1 setD1buy1(Double d1buy1) {
    this.d1buy1 = d1buy1;
    return this;
  }
  //endregion

  //region d1sell1 小单卖出量
  public static final String FIELD_D1SELL1 = "D1SELL1";
  protected Double d1sell1 = null;
  public static final int CONSTRAINT_D1SELL1_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1SELL1_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1SELL1_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1SELL1_LENGTH_FRACTION
  )
  public Double getD1sell1() {
    return d1sell1;
  }

  public StockDay1 setD1sell1(Double d1sell1) {
    this.d1sell1 = d1sell1;
    return this;
  }
  //endregion

  //region d1buy2 中单买入量
  public static final String FIELD_D1BUY2 = "D1BUY2";
  protected Double d1buy2 = null;
  public static final int CONSTRAINT_D1BUY2_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1BUY2_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1BUY2_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1BUY2_LENGTH_FRACTION
  )
  public Double getD1buy2() {
    return d1buy2;
  }

  public StockDay1 setD1buy2(Double d1buy2) {
    this.d1buy2 = d1buy2;
    return this;
  }
  //endregion

  //region d1sell2 中单卖出量
  public static final String FIELD_D1SELL2 = "D1SELL2";
  protected Double d1sell2 = null;
  public static final int CONSTRAINT_D1SELL2_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1SELL2_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1SELL2_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1SELL2_LENGTH_FRACTION
  )
  public Double getD1sell2() {
    return d1sell2;
  }

  public StockDay1 setD1sell2(Double d1sell2) {
    this.d1sell2 = d1sell2;
    return this;
  }
  //endregion

  //region d1buy3 大单买入量
  public static final String FIELD_D1BUY3 = "D1BUY3";
  protected Double d1buy3 = null;
  public static final int CONSTRAINT_D1BUY3_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1BUY3_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1BUY3_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1BUY3_LENGTH_FRACTION
  )
  public Double getD1buy3() {
    return d1buy3;
  }

  public StockDay1 setD1buy3(Double d1buy3) {
    this.d1buy3 = d1buy3;
    return this;
  }
  //endregion

  //region d1sell3 大单卖出量
  public static final String FIELD_D1SELL3 = "D1SELL3";
  protected Double d1sell3 = null;
  public static final int CONSTRAINT_D1SELL3_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1SELL3_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1SELL3_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1SELL3_LENGTH_FRACTION
  )
  public Double getD1sell3() {
    return d1sell3;
  }

  public StockDay1 setD1sell3(Double d1sell3) {
    this.d1sell3 = d1sell3;
    return this;
  }
  //endregion

  //region d1buy4 超大单买入量
  public static final String FIELD_D1BUY4 = "D1BUY4";
  protected Double d1buy4 = null;
  public static final int CONSTRAINT_D1BUY4_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1BUY4_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1BUY4_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1BUY4_LENGTH_FRACTION
  )
  public Double getD1buy4() {
    return d1buy4;
  }

  public StockDay1 setD1buy4(Double d1buy4) {
    this.d1buy4 = d1buy4;
    return this;
  }
  //endregion

  //region d1sell4 超大单卖出量
  public static final String FIELD_D1SELL4 = "D1SELL4";
  protected Double d1sell4 = null;
  public static final int CONSTRAINT_D1SELL4_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1SELL4_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1SELL4_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1SELL4_LENGTH_FRACTION
  )
  public Double getD1sell4() {
    return d1sell4;
  }

  public StockDay1 setD1sell4(Double d1sell4) {
    this.d1sell4 = d1sell4;
    return this;
  }
  //endregion

  //region d1openpre 开盘价(前复权)
  public static final String FIELD_D1OPENPRE = "D1OPENPRE";
  protected Double d1openpre = null;
  public static final int CONSTRAINT_D1OPENPRE_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1OPENPRE_LENGTH_FRACTION = 2;

  public Double getD1openpre() {
    return d1openpre;
  }

  public StockDay1 setD1openpre(Double d1openpre) {
    this.d1openpre = d1openpre;
    return this;
  }
  //endregion

  //region d1closepre 收盘价(前复权)
  public static final String FIELD_D1CLOSEPRE = "D1CLOSEPRE";
  protected Double d1closepre = null;
  public static final int CONSTRAINT_D1CLOSEPRE_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1CLOSEPRE_LENGTH_FRACTION = 2;

  public Double getD1closepre() {
    return d1closepre;
  }

  public StockDay1 setD1closepre(Double d1closepre) {
    this.d1closepre = d1closepre;
    return this;
  }
  //endregion

  //region d1highpre 最高价(前复权)
  public static final String FIELD_D1HIGHPRE = "D1HIGHPRE";
  protected Double d1highpre = null;
  public static final int CONSTRAINT_D1HIGHPRE_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1HIGHPRE_LENGTH_FRACTION = 2;

  public Double getD1highpre() {
    return d1highpre;
  }

  public StockDay1 setD1highpre(Double d1highpre) {
    this.d1highpre = d1highpre;
    return this;
  }
  //endregion

  //region d1lowpre 最低价(前复权)
  public static final String FIELD_D1LOWPRE = "D1LOWPRE";
  protected Double d1lowpre = null;
  public static final int CONSTRAINT_D1LOWPRE_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1LOWPRE_LENGTH_FRACTION = 2;

  public Double getD1lowpre() {
    return d1lowpre;
  }

  public StockDay1 setD1lowpre(Double d1lowpre) {
    this.d1lowpre = d1lowpre;
    return this;
  }
  //endregion

  //region d1volumepre 成交量(前复权)
  public static final String FIELD_D1VOLUMEPRE = "D1VOLUMEPRE";
  protected Double d1volumepre = null;
  public static final int CONSTRAINT_D1VOLUMEPRE_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1VOLUMEPRE_LENGTH_FRACTION = 2;

  public Double getD1volumepre() {
    return d1volumepre;
  }

  public StockDay1 setD1volumepre(Double d1volumepre) {
    this.d1volumepre = d1volumepre;
    return this;
  }
  //endregion

  //region d1openpost 开盘价(后复权)
  public static final String FIELD_D1OPENPOST = "D1OPENPOST";
  protected Double d1openpost = null;
  public static final int CONSTRAINT_D1OPENPOST_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1OPENPOST_LENGTH_FRACTION = 2;

  public Double getD1openpost() {
    return d1openpost;
  }

  public StockDay1 setD1openpost(Double d1openpost) {
    this.d1openpost = d1openpost;
    return this;
  }
  //endregion

  //region d1closepost 收盘价(后复权)
  public static final String FIELD_D1CLOSEPOST = "D1CLOSEPOST";
  protected Double d1closepost = null;
  public static final int CONSTRAINT_D1CLOSEPOST_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1CLOSEPOST_LENGTH_FRACTION = 2;

  public Double getD1closepost() {
    return d1closepost;
  }

  public StockDay1 setD1closepost(Double d1closepost) {
    this.d1closepost = d1closepost;
    return this;
  }
  //endregion

  //region d1highpost 最高价(后复权)
  public static final String FIELD_D1HIGHPOST = "D1HIGHPOST";
  protected Double d1highpost = null;
  public static final int CONSTRAINT_D1HIGHPOST_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1HIGHPOST_LENGTH_FRACTION = 2;

  public Double getD1highpost() {
    return d1highpost;
  }

  public StockDay1 setD1highpost(Double d1highpost) {
    this.d1highpost = d1highpost;
    return this;
  }
  //endregion

  //region d1lowpost 最低价(后复权)
  public static final String FIELD_D1LOWPOST = "D1LOWPOST";
  protected Double d1lowpost = null;
  public static final int CONSTRAINT_D1LOWPOST_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_D1LOWPOST_LENGTH_FRACTION = 2;

  public Double getD1lowpost() {
    return d1lowpost;
  }

  public StockDay1 setD1lowpost(Double d1lowpost) {
    this.d1lowpost = d1lowpost;
    return this;
  }
  //endregion

  //region d1volumepost 成交量(后复权)
  public static final String FIELD_D1VOLUMEPOST = "D1VOLUMEPOST";
  protected Double d1volumepost = null;
  public static final int CONSTRAINT_D1VOLUMEPOST_LENGTH_INTEGER = 16;
  public static final int CONSTRAINT_D1VOLUMEPOST_LENGTH_FRACTION = 2;

  public Double getD1volumepost() {
    return d1volumepost;
  }

  public StockDay1 setD1volumepost(Double d1volumepost) {
    this.d1volumepost = d1volumepost;
    return this;
  }
  //endregion

  //region d1turnover 换手
  public static final String FIELD_D1TURNOVER = "D1TURNOVER";
  protected Double d1turnover = null;
  public static final int CONSTRAINT_D1TURNOVER_LENGTH_INTEGER = 0;
  public static final int CONSTRAINT_D1TURNOVER_LENGTH_FRACTION = 4;

  public Double getD1turnover() {
    return d1turnover;
  }

  public StockDay1 setD1turnover(Double d1turnover) {
    this.d1turnover = d1turnover;
    return this;
  }
  //endregion

  //region d1netpercent2 中单起净买占比
  public static final String FIELD_D1NETPERCENT2 = "D1NETPERCENT2";
  protected Double d1netpercent2 = null;
  public static final int CONSTRAINT_D1NETPERCENT2_LENGTH_INTEGER = 0;
  public static final int CONSTRAINT_D1NETPERCENT2_LENGTH_FRACTION = 4;

  public Double getD1netpercent2() {
    return d1netpercent2;
  }

  public StockDay1 setD1netpercent2(Double d1netpercent2) {
    this.d1netpercent2 = d1netpercent2;
    return this;
  }
  //endregion

  //region d1netpercent3 大单起净买占比
  public static final String FIELD_D1NETPERCENT3 = "D1NETPERCENT3";
  protected Double d1netpercent3 = null;
  public static final int CONSTRAINT_D1NETPERCENT3_LENGTH_INTEGER = 0;
  public static final int CONSTRAINT_D1NETPERCENT3_LENGTH_FRACTION = 4;

  public Double getD1netpercent3() {
    return d1netpercent3;
  }

  public StockDay1 setD1netpercent3(Double d1netpercent3) {
    this.d1netpercent3 = d1netpercent3;
    return this;
  }
  //endregion

  //region d1netpercent4 超大单起净买占比
  public static final String FIELD_D1NETPERCENT4 = "D1NETPERCENT4";
  protected Double d1netpercent4 = null;
  public static final int CONSTRAINT_D1NETPERCENT4_LENGTH_INTEGER = 0;
  public static final int CONSTRAINT_D1NETPERCENT4_LENGTH_FRACTION = 4;

  public Double getD1netpercent4() {
    return d1netpercent4;
  }

  public StockDay1 setD1netpercent4(Double d1netpercent4) {
    this.d1netpercent4 = d1netpercent4;
    return this;
  }
  //endregion

  //region d1netforce2 中单起净买力度
  public static final String FIELD_D1NETFORCE2 = "D1NETFORCE2";
  protected Double d1netforce2 = null;
  public static final int CONSTRAINT_D1NETFORCE2_LENGTH_INTEGER = 0;
  public static final int CONSTRAINT_D1NETFORCE2_LENGTH_FRACTION = 4;

  public Double getD1netforce2() {
    return d1netforce2;
  }

  public StockDay1 setD1netforce2(Double d1netforce2) {
    this.d1netforce2 = d1netforce2;
    return this;
  }
  //endregion

  //region d1netforce3 大单起净买力度
  public static final String FIELD_D1NETFORCE3 = "D1NETFORCE3";
  protected Double d1netforce3 = null;
  public static final int CONSTRAINT_D1NETFORCE3_LENGTH_INTEGER = 0;
  public static final int CONSTRAINT_D1NETFORCE3_LENGTH_FRACTION = 4;

  public Double getD1netforce3() {
    return d1netforce3;
  }

  public StockDay1 setD1netforce3(Double d1netforce3) {
    this.d1netforce3 = d1netforce3;
    return this;
  }
  //endregion

  //region d1netforce4 超大单起净买力度
  public static final String FIELD_D1NETFORCE4 = "D1NETFORCE4";
  protected Double d1netforce4 = null;
  public static final int CONSTRAINT_D1NETFORCE4_LENGTH_INTEGER = 0;
  public static final int CONSTRAINT_D1NETFORCE4_LENGTH_FRACTION = 4;

  public Double getD1netforce4() {
    return d1netforce4;
  }

  public StockDay1 setD1netforce4(Double d1netforce4) {
    this.d1netforce4 = d1netforce4;
    return this;
  }
  //endregion

  //region d1exid 交易所ID
  public static final String FIELD_D1EXID = "D1EXID";
  protected String d1exid = null;
  public static final int CONSTRAINT_D1EXID_LENGTH_STRING = 4;

  public String getD1exid() {
    return d1exid;
  }

  public StockDay1 setD1exid(String d1exid) {
    this.d1exid = d1exid;
    return this;
  }
  //endregion

  //region d1exname 交易所名称
  public static final String FIELD_D1EXNAME = "D1EXNAME";
  protected String d1exname = null;
  public static final int CONSTRAINT_D1EXNAME_LENGTH_STRING = 8;

  public String getD1exname() {
    return d1exname;
  }

  public StockDay1 setD1exname(String d1exname) {
    this.d1exname = d1exname;
    return this;
  }
  //endregion

  //region d1fina 股东权益合计（不含少数股东权益）-自动
  public static final String FIELD_D1FINA = "D1FINA";
  protected Double d1fina = null;
  public static final int CONSTRAINT_D1FINA_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1FINA_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1FINA_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1FINA_LENGTH_FRACTION
  )
  public Double getD1fina() {
    return d1fina;
  }

  public StockDay1 setD1fina(Double d1fina) {
    this.d1fina = d1fina;
    return this;
  }
  //endregion

  //region d1fioiy 年化营业收入-自动
  public static final String FIELD_D1FIOIY = "D1FIOIY";
  protected Double d1fioiy = null;
  public static final int CONSTRAINT_D1FIOIY_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1FIOIY_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1FIOIY_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1FIOIY_LENGTH_FRACTION
  )
  public Double getD1fioiy() {
    return d1fioiy;
  }

  public StockDay1 setD1fioiy(Double d1fioiy) {
    this.d1fioiy = d1fioiy;
    return this;
  }
  //endregion

  //region d1finpey 年化净利润-自动
  public static final String FIELD_D1FINPEY = "D1FINPEY";
  protected Double d1finpey = null;
  public static final int CONSTRAINT_D1FINPEY_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1FINPEY_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1FINPEY_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1FINPEY_LENGTH_FRACTION
  )
  public Double getD1finpey() {
    return d1finpey;
  }

  public StockDay1 setD1finpey(Double d1finpey) {
    this.d1finpey = d1finpey;
    return this;
  }
  //endregion

  //region d1fiocny 年化经营活动产生的现金流量净额-自动
  public static final String FIELD_D1FIOCNY = "D1FIOCNY";
  protected Double d1fiocny = null;
  public static final int CONSTRAINT_D1FIOCNY_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1FIOCNY_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1FIOCNY_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1FIOCNY_LENGTH_FRACTION
  )
  public Double getD1fiocny() {
    return d1fiocny;
  }

  public StockDay1 setD1fiocny(Double d1fiocny) {
    this.d1fiocny = d1fiocny;
    return this;
  }
  //endregion

  //region d1finaps 每股净资产-自动
  public static final String FIELD_D1FINAPS = "D1FINAPS";
  protected Double d1finaps = null;
  public static final int CONSTRAINT_D1FINAPS_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1FINAPS_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1FINAPS_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1FINAPS_LENGTH_FRACTION
  )
  public Double getD1finaps() {
    return d1finaps;
  }

  public StockDay1 setD1finaps(Double d1finaps) {
    this.d1finaps = d1finaps;
    return this;
  }
  //endregion

  //region d1fioiyps 每股营业收入-自动
  public static final String FIELD_D1FIOIYPS = "D1FIOIYPS";
  protected Double d1fioiyps = null;
  public static final int CONSTRAINT_D1FIOIYPS_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1FIOIYPS_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1FIOIYPS_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1FIOIYPS_LENGTH_FRACTION
  )
  public Double getD1fioiyps() {
    return d1fioiyps;
  }

  public StockDay1 setD1fioiyps(Double d1fioiyps) {
    this.d1fioiyps = d1fioiyps;
    return this;
  }
  //endregion

  //region d1finpeyps 基本每股收益-自动
  public static final String FIELD_D1FINPEYPS = "D1FINPEYPS";
  protected Double d1finpeyps = null;
  public static final int CONSTRAINT_D1FINPEYPS_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1FINPEYPS_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1FINPEYPS_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1FINPEYPS_LENGTH_FRACTION
  )
  public Double getD1finpeyps() {
    return d1finpeyps;
  }

  public StockDay1 setD1finpeyps(Double d1finpeyps) {
    this.d1finpeyps = d1finpeyps;
    return this;
  }
  //endregion

  //region d1fiocnyps 每股经营活动产生的现金流量净额-自动
  public static final String FIELD_D1FIOCNYPS = "D1FIOCNYPS";
  protected Double d1fiocnyps = null;
  public static final int CONSTRAINT_D1FIOCNYPS_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1FIOCNYPS_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1FIOCNYPS_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1FIOCNYPS_LENGTH_FRACTION
  )
  public Double getD1fiocnyps() {
    return d1fiocnyps;
  }

  public StockDay1 setD1fiocnyps(Double d1fiocnyps) {
    this.d1fiocnyps = d1fiocnyps;
    return this;
  }
  //endregion

  //region d1pb 动态市净率-自动
  public static final String FIELD_D1PB = "D1PB";
  protected Double d1pb = null;
  public static final int CONSTRAINT_D1PB_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1PB_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1PB_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1PB_LENGTH_FRACTION
  )
  public Double getD1pb() {
    return d1pb;
  }

  public StockDay1 setD1pb(Double d1pb) {
    this.d1pb = d1pb;
    return this;
  }
  //endregion

  //region d1ps 动态市销率-自动
  public static final String FIELD_D1PS = "D1PS";
  protected Double d1ps = null;
  public static final int CONSTRAINT_D1PS_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1PS_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1PS_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1PS_LENGTH_FRACTION
  )
  public Double getD1ps() {
    return d1ps;
  }

  public StockDay1 setD1ps(Double d1ps) {
    this.d1ps = d1ps;
    return this;
  }
  //endregion

  //region d1pe 动态市盈率-自动
  public static final String FIELD_D1PE = "D1PE";
  protected Double d1pe = null;
  public static final int CONSTRAINT_D1PE_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1PE_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1PE_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1PE_LENGTH_FRACTION
  )
  public Double getD1pe() {
    return d1pe;
  }

  public StockDay1 setD1pe(Double d1pe) {
    this.d1pe = d1pe;
    return this;
  }
  //endregion

  //region d1pcf 动态市现率-自动
  public static final String FIELD_D1PCF = "D1PCF";
  protected Double d1pcf = null;
  public static final int CONSTRAINT_D1PCF_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_D1PCF_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_D1PCF_LENGTH_FRACTION,
    fraction = CONSTRAINT_D1PCF_LENGTH_FRACTION
  )
  public Double getD1pcf() {
    return d1pcf;
  }

  public StockDay1 setD1pcf(Double d1pcf) {
    this.d1pcf = d1pcf;
    return this;
  }
  //endregion

  public StockDay1(
      Integer d1id,
      String d1stid,
      java.util.Date d1date,
      Double d1open,
      Double d1close,
      Double d1high,
      Double d1low,
      Double d1volume,
      Double d1amount,
      Double d1totalshare,
      Double d1flowshare,
      Double d1factor,
      Double d1buy1,
      Double d1sell1,
      Double d1buy2,
      Double d1sell2,
      Double d1buy3,
      Double d1sell3,
      Double d1buy4,
      Double d1sell4,
      Double d1openpre,
      Double d1closepre,
      Double d1highpre,
      Double d1lowpre,
      Double d1volumepre,
      Double d1openpost,
      Double d1closepost,
      Double d1highpost,
      Double d1lowpost,
      Double d1volumepost,
      Double d1turnover,
      Double d1netpercent2,
      Double d1netpercent3,
      Double d1netpercent4,
      Double d1netforce2,
      Double d1netforce3,
      Double d1netforce4,
      String d1exid,
      String d1exname,
      Double d1fina,
      Double d1fioiy,
      Double d1finpey,
      Double d1fiocny,
      Double d1finaps,
      Double d1fioiyps,
      Double d1finpeyps,
      Double d1fiocnyps,
      Double d1pb,
      Double d1ps,
      Double d1pe,
      Double d1pcf) {
    if (d1id != null) this.d1id = d1id;
    if (d1stid != null) this.d1stid = d1stid;
    if (d1date != null) this.d1date = d1date;
    if (d1open != null) this.d1open = d1open;
    if (d1close != null) this.d1close = d1close;
    if (d1high != null) this.d1high = d1high;
    if (d1low != null) this.d1low = d1low;
    if (d1volume != null) this.d1volume = d1volume;
    if (d1amount != null) this.d1amount = d1amount;
    if (d1totalshare != null) this.d1totalshare = d1totalshare;
    if (d1flowshare != null) this.d1flowshare = d1flowshare;
    if (d1factor != null) this.d1factor = d1factor;
    if (d1buy1 != null) this.d1buy1 = d1buy1;
    if (d1sell1 != null) this.d1sell1 = d1sell1;
    if (d1buy2 != null) this.d1buy2 = d1buy2;
    if (d1sell2 != null) this.d1sell2 = d1sell2;
    if (d1buy3 != null) this.d1buy3 = d1buy3;
    if (d1sell3 != null) this.d1sell3 = d1sell3;
    if (d1buy4 != null) this.d1buy4 = d1buy4;
    if (d1sell4 != null) this.d1sell4 = d1sell4;
    if (d1openpre != null) this.d1openpre = d1openpre;
    if (d1closepre != null) this.d1closepre = d1closepre;
    if (d1highpre != null) this.d1highpre = d1highpre;
    if (d1lowpre != null) this.d1lowpre = d1lowpre;
    if (d1volumepre != null) this.d1volumepre = d1volumepre;
    if (d1openpost != null) this.d1openpost = d1openpost;
    if (d1closepost != null) this.d1closepost = d1closepost;
    if (d1highpost != null) this.d1highpost = d1highpost;
    if (d1lowpost != null) this.d1lowpost = d1lowpost;
    if (d1volumepost != null) this.d1volumepost = d1volumepost;
    if (d1turnover != null) this.d1turnover = d1turnover;
    if (d1netpercent2 != null) this.d1netpercent2 = d1netpercent2;
    if (d1netpercent3 != null) this.d1netpercent3 = d1netpercent3;
    if (d1netpercent4 != null) this.d1netpercent4 = d1netpercent4;
    if (d1netforce2 != null) this.d1netforce2 = d1netforce2;
    if (d1netforce3 != null) this.d1netforce3 = d1netforce3;
    if (d1netforce4 != null) this.d1netforce4 = d1netforce4;
    if (d1exid != null) this.d1exid = d1exid;
    if (d1exname != null) this.d1exname = d1exname;
    if (d1fina != null) this.d1fina = d1fina;
    if (d1fioiy != null) this.d1fioiy = d1fioiy;
    if (d1finpey != null) this.d1finpey = d1finpey;
    if (d1fiocny != null) this.d1fiocny = d1fiocny;
    if (d1finaps != null) this.d1finaps = d1finaps;
    if (d1fioiyps != null) this.d1fioiyps = d1fioiyps;
    if (d1finpeyps != null) this.d1finpeyps = d1finpeyps;
    if (d1fiocnyps != null) this.d1fiocnyps = d1fiocnyps;
    if (d1pb != null) this.d1pb = d1pb;
    if (d1ps != null) this.d1ps = d1ps;
    if (d1pe != null) this.d1pe = d1pe;
    if (d1pcf != null) this.d1pcf = d1pcf;
  }

  public StockDay1() {
    this(
        null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null);
  }

  public StockDay1 clone() {
    return new StockDay1(
        d1id,
        d1stid,
        d1date,
        d1open,
        d1close,
        d1high,
        d1low,
        d1volume,
        d1amount,
        d1totalshare,
        d1flowshare,
        d1factor,
        d1buy1,
        d1sell1,
        d1buy2,
        d1sell2,
        d1buy3,
        d1sell3,
        d1buy4,
        d1sell4,
        d1openpre,
        d1closepre,
        d1highpre,
        d1lowpre,
        d1volumepre,
        d1openpost,
        d1closepost,
        d1highpost,
        d1lowpost,
        d1volumepost,
        d1turnover,
        d1netpercent2,
        d1netpercent3,
        d1netpercent4,
        d1netforce2,
        d1netforce3,
        d1netforce4,
        d1exid,
        d1exname,
        d1fina,
        d1fioiy,
        d1finpey,
        d1fiocny,
        d1finaps,
        d1fioiyps,
        d1finpeyps,
        d1fiocnyps,
        d1pb,
        d1ps,
        d1pe,
        d1pcf);
  }
}
