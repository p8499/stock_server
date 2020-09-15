package p8499.stock.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TradingDate {
  public static final String TABLE = "FS02";
  public static final String VIEW = "VS02";
  public static final String NAME = "TRDT";

  //region trid ID
  public static final String FIELD_TRID = "TRID";
  protected Integer trid = null;
  public static final int CONSTRAINT_TRID_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_TRID_MIN = -99999999;
  public static final int CONSTRAINT_TRID_MAX = 99999999;

  @javax.validation.constraints.Null(groups = {Insert.class})
  @javax.validation.constraints.NotNull(groups = {Update.class})
  public Integer getTrid() {
    return trid;
  }

  public TradingDate setTrid(Integer trid) {
    this.trid = trid;
    return this;
  }
  //endregion

  //region trexid 交易所ID
  public static final String FIELD_TREXID = "TREXID";
  protected String trexid = null;
  public static final int CONSTRAINT_TREXID_LENGTH_STRING = 4;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_TREXID_LENGTH_STRING)
  public String getTrexid() {
    return trexid;
  }

  public TradingDate setTrexid(String trexid) {
    this.trexid = trexid;
    return this;
  }
  //endregion

  //region trdate 交易日
  public static final String FIELD_TRDATE = "TRDATE";

  @com.fasterxml.jackson.annotation.JsonFormat(timezone = "GMT+8", pattern = "yyyyMMdd")
  protected java.util.Date trdate = null;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  public java.util.Date getTrdate() {
    return trdate;
  }

  public TradingDate setTrdate(java.util.Date trdate) {
    this.trdate = trdate;
    return this;
  }
  //endregion

  public TradingDate(Integer trid, String trexid, java.util.Date trdate) {
    if (trid != null) this.trid = trid;
    if (trexid != null) this.trexid = trexid;
    if (trdate != null) this.trdate = trdate;
  }

  public TradingDate() {
    this(null, null, null);
  }

  public TradingDate clone() {
    return new TradingDate(trid, trexid, trdate);
  }
}
