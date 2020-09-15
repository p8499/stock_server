package p8499.stock.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Finance {
  public static final String TABLE = "FS12";
  public static final String VIEW = "VS12";
  public static final String NAME = "FINA";

  //region fiid ID
  public static final String FIELD_FIID = "FIID";
  protected Integer fiid = null;
  public static final int CONSTRAINT_FIID_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_FIID_MIN = -99999999;
  public static final int CONSTRAINT_FIID_MAX = 99999999;

  @javax.validation.constraints.Null(groups = {Insert.class})
  @javax.validation.constraints.NotNull(groups = {Update.class})
  public Integer getFiid() {
    return fiid;
  }

  public Finance setFiid(Integer fiid) {
    this.fiid = fiid;
    return this;
  }
  //endregion

  //region fistid 证券ID
  public static final String FIELD_FISTID = "FISTID";
  protected String fistid = null;
  public static final int CONSTRAINT_FISTID_LENGTH_STRING = 16;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_FISTID_LENGTH_STRING)
  public String getFistid() {
    return fistid;
  }

  public Finance setFistid(String fistid) {
    this.fistid = fistid;
    return this;
  }
  //endregion

  //region fiyear 年份
  public static final String FIELD_FIYEAR = "FIYEAR";
  protected Integer fiyear = null;
  public static final int CONSTRAINT_FIYEAR_LENGTH_INTEGER = 4;
  public static final int CONSTRAINT_FIYEAR_MIN = -9999;
  public static final int CONSTRAINT_FIYEAR_MAX = 9999;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Min(value = CONSTRAINT_FIYEAR_MIN)
  @javax.validation.constraints.Max(value = CONSTRAINT_FIYEAR_MAX)
  public Integer getFiyear() {
    return fiyear;
  }

  public Finance setFiyear(Integer fiyear) {
    this.fiyear = fiyear;
    return this;
  }
  //endregion

  //region fiperiod 期间（自1）
  public static final String FIELD_FIPERIOD = "FIPERIOD";
  protected Integer fiperiod = null;
  public static final int CONSTRAINT_FIPERIOD_LENGTH_INTEGER = 1;
  public static final int CONSTRAINT_FIPERIOD_MIN = -9;
  public static final int CONSTRAINT_FIPERIOD_MAX = 9;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Min(value = CONSTRAINT_FIPERIOD_MIN)
  @javax.validation.constraints.Max(value = CONSTRAINT_FIPERIOD_MAX)
  public Integer getFiperiod() {
    return fiperiod;
  }

  public Finance setFiperiod(Integer fiperiod) {
    this.fiperiod = fiperiod;
    return this;
  }
  //endregion

  //region fistatus 状态
  public static final String FIELD_FISTATUS = "FISTATUS";
  public static final String FISTATUS_Forecast = "F";
  public static final String FISTATUS_Actual = "A";
  public static final String DEFAULT_FISTATUS = "A";
  protected String fistatus = DEFAULT_FISTATUS;
  public static final int CONSTRAINT_FISTATUS_LENGTH_STRING = 1;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_FISTATUS_LENGTH_STRING)
  public String getFistatus() {
    return fistatus;
  }

  public Finance setFistatus(String fistatus) {
    this.fistatus = fistatus;
    return this;
  }
  //endregion

  //region fipublish 发布日期
  public static final String FIELD_FIPUBLISH = "FIPUBLISH";

  @com.fasterxml.jackson.annotation.JsonFormat(timezone = "GMT+8", pattern = "yyyyMMdd")
  protected java.util.Date fipublish = null;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  public java.util.Date getFipublish() {
    return fipublish;
  }

  public Finance setFipublish(java.util.Date fipublish) {
    this.fipublish = fipublish;
    return this;
  }
  //endregion

  //region fina 股东权益合计(不含少数股东权益)
  public static final String FIELD_FINA = "FINA";
  protected Double fina = null;
  public static final int CONSTRAINT_FINA_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_FINA_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_FINA_LENGTH_FRACTION,
    fraction = CONSTRAINT_FINA_LENGTH_FRACTION
  )
  public Double getFina() {
    return fina;
  }

  public Finance setFina(Double fina) {
    this.fina = fina;
    return this;
  }
  //endregion

  //region fioi 营业收入
  public static final String FIELD_FIOI = "FIOI";
  protected Double fioi = null;
  public static final int CONSTRAINT_FIOI_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_FIOI_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_FIOI_LENGTH_FRACTION,
    fraction = CONSTRAINT_FIOI_LENGTH_FRACTION
  )
  public Double getFioi() {
    return fioi;
  }

  public Finance setFioi(Double fioi) {
    this.fioi = fioi;
    return this;
  }
  //endregion

  //region finpe 净利润(不含少数股东损益)
  public static final String FIELD_FINPE = "FINPE";
  protected Double finpe = null;
  public static final int CONSTRAINT_FINPE_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_FINPE_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_FINPE_LENGTH_FRACTION,
    fraction = CONSTRAINT_FINPE_LENGTH_FRACTION
  )
  public Double getFinpe() {
    return finpe;
  }

  public Finance setFinpe(Double finpe) {
    this.finpe = finpe;
    return this;
  }
  //endregion

  //region fiocn 经营活动产生的现金流量净额
  public static final String FIELD_FIOCN = "FIOCN";
  protected Double fiocn = null;
  public static final int CONSTRAINT_FIOCN_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_FIOCN_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_FIOCN_LENGTH_FRACTION,
    fraction = CONSTRAINT_FIOCN_LENGTH_FRACTION
  )
  public Double getFiocn() {
    return fiocn;
  }

  public Finance setFiocn(Double fiocn) {
    this.fiocn = fiocn;
    return this;
  }
  //endregion

  //region fioiy 年化营业收入-自动
  public static final String FIELD_FIOIY = "FIOIY";
  protected Double fioiy = null;
  public static final int CONSTRAINT_FIOIY_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_FIOIY_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_FIOIY_LENGTH_FRACTION,
    fraction = CONSTRAINT_FIOIY_LENGTH_FRACTION
  )
  public Double getFioiy() {
    return fioiy;
  }

  public Finance setFioiy(Double fioiy) {
    this.fioiy = fioiy;
    return this;
  }
  //endregion

  //region finpey 年化净利润(不含少数股东损益)-自动
  public static final String FIELD_FINPEY = "FINPEY";
  protected Double finpey = null;
  public static final int CONSTRAINT_FINPEY_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_FINPEY_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_FINPEY_LENGTH_FRACTION,
    fraction = CONSTRAINT_FINPEY_LENGTH_FRACTION
  )
  public Double getFinpey() {
    return finpey;
  }

  public Finance setFinpey(Double finpey) {
    this.finpey = finpey;
    return this;
  }
  //endregion

  //region fiocny 年化经营活动产生的现金流量净额-自动
  public static final String FIELD_FIOCNY = "FIOCNY";
  protected Double fiocny = null;
  public static final int CONSTRAINT_FIOCNY_LENGTH_INTEGER = 24;
  public static final int CONSTRAINT_FIOCNY_LENGTH_FRACTION = 2;

  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_FIOCNY_LENGTH_FRACTION,
    fraction = CONSTRAINT_FIOCNY_LENGTH_FRACTION
  )
  public Double getFiocny() {
    return fiocny;
  }

  public Finance setFiocny(Double fiocny) {
    this.fiocny = fiocny;
    return this;
  }
  //endregion

  public Finance(
      Integer fiid,
      String fistid,
      Integer fiyear,
      Integer fiperiod,
      String fistatus,
      java.util.Date fipublish,
      Double fina,
      Double fioi,
      Double finpe,
      Double fiocn,
      Double fioiy,
      Double finpey,
      Double fiocny) {
    if (fiid != null) this.fiid = fiid;
    if (fistid != null) this.fistid = fistid;
    if (fiyear != null) this.fiyear = fiyear;
    if (fiperiod != null) this.fiperiod = fiperiod;
    if (fistatus != null) this.fistatus = fistatus;
    if (fipublish != null) this.fipublish = fipublish;
    if (fina != null) this.fina = fina;
    if (fioi != null) this.fioi = fioi;
    if (finpe != null) this.finpe = finpe;
    if (fiocn != null) this.fiocn = fiocn;
    if (fioiy != null) this.fioiy = fioiy;
    if (finpey != null) this.finpey = finpey;
    if (fiocny != null) this.fiocny = fiocny;
  }

  public Finance() {
    this(null, null, null, null, null, null, null, null, null, null, null, null, null);
  }

  public Finance clone() {
    return new Finance(
        fiid, fistid, fiyear, fiperiod, fistatus, fipublish, fina, fioi, finpe, fiocn, fioiy,
        finpey, fiocny);
  }
}
