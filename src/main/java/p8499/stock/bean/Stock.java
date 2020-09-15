package p8499.stock.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stock {
  public static final String TABLE = "FS11";
  public static final String VIEW = "VS11";
  public static final String NAME = "STCK";

  //region stid 证券代码
  public static final String FIELD_STID = "STID";
  protected String stid = null;
  public static final int CONSTRAINT_STID_LENGTH_STRING = 16;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_STID_LENGTH_STRING)
  public String getStid() {
    return stid;
  }

  public Stock setStid(String stid) {
    this.stid = stid;
    return this;
  }
  //endregion

  //region stexid 交易所ID
  public static final String FIELD_STEXID = "STEXID";
  protected String stexid = null;
  public static final int CONSTRAINT_STEXID_LENGTH_STRING = 4;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_STEXID_LENGTH_STRING)
  public String getStexid() {
    return stexid;
  }

  public Stock setStexid(String stexid) {
    this.stexid = stexid;
    return this;
  }
  //endregion

  //region stcode 助记代码
  public static final String FIELD_STCODE = "STCODE";
  protected String stcode = null;
  public static final int CONSTRAINT_STCODE_LENGTH_STRING = 6;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_STCODE_LENGTH_STRING)
  public String getStcode() {
    return stcode;
  }

  public Stock setStcode(String stcode) {
    this.stcode = stcode;
    return this;
  }
  //endregion

  //region stname 名称
  public static final String FIELD_STNAME = "STNAME";
  protected String stname = null;
  public static final int CONSTRAINT_STNAME_LENGTH_STRING = 16;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_STNAME_LENGTH_STRING)
  public String getStname() {
    return stname;
  }

  public Stock setStname(String stname) {
    this.stname = stname;
    return this;
  }
  //endregion

  //region stlisted 上市日期
  public static final String FIELD_STLISTED = "STLISTED";

  @com.fasterxml.jackson.annotation.JsonFormat(timezone = "GMT+8", pattern = "yyyyMMdd")
  protected java.util.Date stlisted = null;

  public java.util.Date getStlisted() {
    return stlisted;
  }

  public Stock setStlisted(java.util.Date stlisted) {
    this.stlisted = stlisted;
    return this;
  }
  //endregion

  //region stdelisted 退市日期
  public static final String FIELD_STDELISTED = "STDELISTED";

  @com.fasterxml.jackson.annotation.JsonFormat(timezone = "GMT+8", pattern = "yyyyMMdd")
  protected java.util.Date stdelisted = null;

  public java.util.Date getStdelisted() {
    return stdelisted;
  }

  public Stock setStdelisted(java.util.Date stdelisted) {
    this.stdelisted = stdelisted;
    return this;
  }
  //endregion

  //region stexname 交易所名称
  public static final String FIELD_STEXNAME = "STEXNAME";
  protected String stexname = null;
  public static final int CONSTRAINT_STEXNAME_LENGTH_STRING = 8;

  public String getStexname() {
    return stexname;
  }

  public Stock setStexname(String stexname) {
    this.stexname = stexname;
    return this;
  }
  //endregion

  //region stdays 上市天数
  public static final String FIELD_STDAYS = "STDAYS";
  protected Integer stdays = null;
  public static final int CONSTRAINT_STDAYS_LENGTH_INTEGER = 6;
  public static final int CONSTRAINT_STDAYS_MIN = -999999;
  public static final int CONSTRAINT_STDAYS_MAX = 999999;

  public Integer getStdays() {
    return stdays;
  }

  public Stock setStdays(Integer stdays) {
    this.stdays = stdays;
    return this;
  }
  //endregion

  //region stpbrate 动态市净率比率-手动
  public static final String FIELD_STPBRATE = "STPBRATE";
  protected Double stpbrate = null;
  public static final int CONSTRAINT_STPBRATE_LENGTH_INTEGER = 12;
  public static final int CONSTRAINT_STPBRATE_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_STPBRATE_LENGTH_FRACTION,
    fraction = CONSTRAINT_STPBRATE_LENGTH_FRACTION
  )
  public Double getStpbrate() {
    return stpbrate;
  }

  public Stock setStpbrate(Double stpbrate) {
    this.stpbrate = stpbrate;
    return this;
  }
  //endregion

  //region stpbrank 动态市净率排名-手动
  public static final String FIELD_STPBRANK = "STPBRANK";
  protected Double stpbrank = null;
  public static final int CONSTRAINT_STPBRANK_LENGTH_INTEGER = 12;
  public static final int CONSTRAINT_STPBRANK_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_STPBRANK_LENGTH_FRACTION,
    fraction = CONSTRAINT_STPBRANK_LENGTH_FRACTION
  )
  public Double getStpbrank() {
    return stpbrank;
  }

  public Stock setStpbrank(Double stpbrank) {
    this.stpbrank = stpbrank;
    return this;
  }
  //endregion

  //region stpsrate 动态市销率比率-手动
  public static final String FIELD_STPSRATE = "STPSRATE";
  protected Double stpsrate = null;
  public static final int CONSTRAINT_STPSRATE_LENGTH_INTEGER = 12;
  public static final int CONSTRAINT_STPSRATE_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_STPSRATE_LENGTH_FRACTION,
    fraction = CONSTRAINT_STPSRATE_LENGTH_FRACTION
  )
  public Double getStpsrate() {
    return stpsrate;
  }

  public Stock setStpsrate(Double stpsrate) {
    this.stpsrate = stpsrate;
    return this;
  }
  //endregion

  //region stpsrank 动态市销率排名-手动
  public static final String FIELD_STPSRANK = "STPSRANK";
  protected Double stpsrank = null;
  public static final int CONSTRAINT_STPSRANK_LENGTH_INTEGER = 12;
  public static final int CONSTRAINT_STPSRANK_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_STPSRANK_LENGTH_FRACTION,
    fraction = CONSTRAINT_STPSRANK_LENGTH_FRACTION
  )
  public Double getStpsrank() {
    return stpsrank;
  }

  public Stock setStpsrank(Double stpsrank) {
    this.stpsrank = stpsrank;
    return this;
  }
  //endregion

  //region stperate 动态市盈率比率-手动
  public static final String FIELD_STPERATE = "STPERATE";
  protected Double stperate = null;
  public static final int CONSTRAINT_STPERATE_LENGTH_INTEGER = 12;
  public static final int CONSTRAINT_STPERATE_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_STPERATE_LENGTH_FRACTION,
    fraction = CONSTRAINT_STPERATE_LENGTH_FRACTION
  )
  public Double getStperate() {
    return stperate;
  }

  public Stock setStperate(Double stperate) {
    this.stperate = stperate;
    return this;
  }
  //endregion

  //region stperank 动态市盈率排名-手动
  public static final String FIELD_STPERANK = "STPERANK";
  protected Double stperank = null;
  public static final int CONSTRAINT_STPERANK_LENGTH_INTEGER = 12;
  public static final int CONSTRAINT_STPERANK_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_STPERANK_LENGTH_FRACTION,
    fraction = CONSTRAINT_STPERANK_LENGTH_FRACTION
  )
  public Double getStperank() {
    return stperank;
  }

  public Stock setStperank(Double stperank) {
    this.stperank = stperank;
    return this;
  }
  //endregion

  //region stpcfrate 动态市现率比率-手动
  public static final String FIELD_STPCFRATE = "STPCFRATE";
  protected Double stpcfrate = null;
  public static final int CONSTRAINT_STPCFRATE_LENGTH_INTEGER = 12;
  public static final int CONSTRAINT_STPCFRATE_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_STPCFRATE_LENGTH_FRACTION,
    fraction = CONSTRAINT_STPCFRATE_LENGTH_FRACTION
  )
  public Double getStpcfrate() {
    return stpcfrate;
  }

  public Stock setStpcfrate(Double stpcfrate) {
    this.stpcfrate = stpcfrate;
    return this;
  }
  //endregion

  //region stpcfrank 动态市现率排名-手动
  public static final String FIELD_STPCFRANK = "STPCFRANK";
  protected Double stpcfrank = null;
  public static final int CONSTRAINT_STPCFRANK_LENGTH_INTEGER = 12;
  public static final int CONSTRAINT_STPCFRANK_LENGTH_FRACTION = 12;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_STPCFRANK_LENGTH_FRACTION,
    fraction = CONSTRAINT_STPCFRANK_LENGTH_FRACTION
  )
  public Double getStpcfrank() {
    return stpcfrank;
  }

  public Stock setStpcfrank(Double stpcfrank) {
    this.stpcfrank = stpcfrank;
    return this;
  }
  //endregion

  //region stnpel 连续盈利
  public static final String FIELD_STNPEL = "STNPEL";
  protected Integer stnpel = null;
  public static final int CONSTRAINT_STNPEL_LENGTH_INTEGER = 4;
  public static final int CONSTRAINT_STNPEL_MIN = -9999;
  public static final int CONSTRAINT_STNPEL_MAX = 9999;

  public Integer getStnpel() {
    return stnpel;
  }

  public Stock setStnpel(Integer stnpel) {
    this.stnpel = stnpel;
    return this;
  }
  //endregion

  //region stpublish 最近发布日期
  public static final String FIELD_STPUBLISH = "STPUBLISH";

  @com.fasterxml.jackson.annotation.JsonFormat(timezone = "GMT+8", pattern = "yyyyMMdd")
  protected java.util.Date stpublish = null;

  public java.util.Date getStpublish() {
    return stpublish;
  }

  public Stock setStpublish(java.util.Date stpublish) {
    this.stpublish = stpublish;
    return this;
  }
  //endregion

  //region stpublishdays 最近发布天数
  public static final String FIELD_STPUBLISHDAYS = "STPUBLISHDAYS";
  protected Integer stpublishdays = null;
  public static final int CONSTRAINT_STPUBLISHDAYS_LENGTH_INTEGER = 4;
  public static final int CONSTRAINT_STPUBLISHDAYS_MIN = -9999;
  public static final int CONSTRAINT_STPUBLISHDAYS_MAX = 9999;

  public Integer getStpublishdays() {
    return stpublishdays;
  }

  public Stock setStpublishdays(Integer stpublishdays) {
    this.stpublishdays = stpublishdays;
    return this;
  }
  //endregion

  //region styear 最近年份
  public static final String FIELD_STYEAR = "STYEAR";
  protected Integer styear = null;
  public static final int CONSTRAINT_STYEAR_LENGTH_INTEGER = 4;
  public static final int CONSTRAINT_STYEAR_MIN = -9999;
  public static final int CONSTRAINT_STYEAR_MAX = 9999;

  public Integer getStyear() {
    return styear;
  }

  public Stock setStyear(Integer styear) {
    this.styear = styear;
    return this;
  }
  //endregion

  //region stperiod 最近期间（自1）
  public static final String FIELD_STPERIOD = "STPERIOD";
  protected Integer stperiod = null;
  public static final int CONSTRAINT_STPERIOD_LENGTH_INTEGER = 1;
  public static final int CONSTRAINT_STPERIOD_MIN = -9;
  public static final int CONSTRAINT_STPERIOD_MAX = 9;

  public Integer getStperiod() {
    return stperiod;
  }

  public Stock setStperiod(Integer stperiod) {
    this.stperiod = stperiod;
    return this;
  }
  //endregion

  //region stmessage 消息标记
  public static final String FIELD_STMESSAGE = "STMESSAGE";
  protected Integer stmessage = null;
  public static final int CONSTRAINT_STMESSAGE_LENGTH_INTEGER = 1;
  public static final int CONSTRAINT_STMESSAGE_MIN = -9;
  public static final int CONSTRAINT_STMESSAGE_MAX = 9;

  public Integer getStmessage() {
    return stmessage;
  }

  public Stock setStmessage(Integer stmessage) {
    this.stmessage = stmessage;
    return this;
  }
  //endregion

  //region stfavorite 收藏标记
  public static final String FIELD_STFAVORITE = "STFAVORITE";
  protected Integer stfavorite = null;
  public static final int CONSTRAINT_STFAVORITE_LENGTH_INTEGER = 1;
  public static final int CONSTRAINT_STFAVORITE_MIN = -9;
  public static final int CONSTRAINT_STFAVORITE_MAX = 9;

  public Integer getStfavorite() {
    return stfavorite;
  }

  public Stock setStfavorite(Integer stfavorite) {
    this.stfavorite = stfavorite;
    return this;
  }
  //endregion

  public Stock(
      String stid,
      String stexid,
      String stcode,
      String stname,
      java.util.Date stlisted,
      java.util.Date stdelisted,
      String stexname,
      Integer stdays,
      Double stpbrate,
      Double stpbrank,
      Double stpsrate,
      Double stpsrank,
      Double stperate,
      Double stperank,
      Double stpcfrate,
      Double stpcfrank,
      Integer stnpel,
      java.util.Date stpublish,
      Integer stpublishdays,
      Integer styear,
      Integer stperiod,
      Integer stmessage,
      Integer stfavorite) {
    if (stid != null) this.stid = stid;
    if (stexid != null) this.stexid = stexid;
    if (stcode != null) this.stcode = stcode;
    if (stname != null) this.stname = stname;
    if (stlisted != null) this.stlisted = stlisted;
    if (stdelisted != null) this.stdelisted = stdelisted;
    if (stexname != null) this.stexname = stexname;
    if (stdays != null) this.stdays = stdays;
    if (stpbrate != null) this.stpbrate = stpbrate;
    if (stpbrank != null) this.stpbrank = stpbrank;
    if (stpsrate != null) this.stpsrate = stpsrate;
    if (stpsrank != null) this.stpsrank = stpsrank;
    if (stperate != null) this.stperate = stperate;
    if (stperank != null) this.stperank = stperank;
    if (stpcfrate != null) this.stpcfrate = stpcfrate;
    if (stpcfrank != null) this.stpcfrank = stpcfrank;
    if (stnpel != null) this.stnpel = stnpel;
    if (stpublish != null) this.stpublish = stpublish;
    if (stpublishdays != null) this.stpublishdays = stpublishdays;
    if (styear != null) this.styear = styear;
    if (stperiod != null) this.stperiod = stperiod;
    if (stmessage != null) this.stmessage = stmessage;
    if (stfavorite != null) this.stfavorite = stfavorite;
  }

  public Stock() {
    this(
        null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
        null, null, null, null, null, null, null, null);
  }

  public Stock clone() {
    return new Stock(
        stid,
        stexid,
        stcode,
        stname,
        stlisted,
        stdelisted,
        stexname,
        stdays,
        stpbrate,
        stpbrank,
        stpsrate,
        stpsrank,
        stperate,
        stperank,
        stpcfrate,
        stpcfrank,
        stnpel,
        stpublish,
        stpublishdays,
        styear,
        stperiod,
        stmessage,
        stfavorite);
  }
}
