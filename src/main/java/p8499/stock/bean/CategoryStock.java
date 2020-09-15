package p8499.stock.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryStock {
  public static final String TABLE = "FS22";
  public static final String VIEW = "VS22";
  public static final String NAME = "CTST";

  //region csid ID
  public static final String FIELD_CSID = "CSID";
  protected Integer csid = null;
  public static final int CONSTRAINT_CSID_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_CSID_MIN = -99999999;
  public static final int CONSTRAINT_CSID_MAX = 99999999;

  @javax.validation.constraints.Null(groups = {Insert.class})
  @javax.validation.constraints.NotNull(groups = {Update.class})
  public Integer getCsid() {
    return csid;
  }

  public CategoryStock setCsid(Integer csid) {
    this.csid = csid;
    return this;
  }
  //endregion

  //region cscaid 板块ID
  public static final String FIELD_CSCAID = "CSCAID";
  protected String cscaid = null;
  public static final int CONSTRAINT_CSCAID_LENGTH_STRING = 16;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_CSCAID_LENGTH_STRING)
  public String getCscaid() {
    return cscaid;
  }

  public CategoryStock setCscaid(String cscaid) {
    this.cscaid = cscaid;
    return this;
  }
  //endregion

  //region csstid 证券ID
  public static final String FIELD_CSSTID = "CSSTID";
  protected String csstid = null;
  public static final int CONSTRAINT_CSSTID_LENGTH_STRING = 16;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_CSSTID_LENGTH_STRING)
  public String getCsstid() {
    return csstid;
  }

  public CategoryStock setCsstid(String csstid) {
    this.csstid = csstid;
    return this;
  }
  //endregion

  //region csweight 权重
  public static final String FIELD_CSWEIGHT = "CSWEIGHT";
  protected Double csweight = null;
  public static final int CONSTRAINT_CSWEIGHT_LENGTH_INTEGER = 4;
  public static final int CONSTRAINT_CSWEIGHT_LENGTH_FRACTION = 4;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Digits(
    integer = CONSTRAINT_CSWEIGHT_LENGTH_FRACTION,
    fraction = CONSTRAINT_CSWEIGHT_LENGTH_FRACTION
  )
  public Double getCsweight() {
    return csweight;
  }

  public CategoryStock setCsweight(Double csweight) {
    this.csweight = csweight;
    return this;
  }
  //endregion

  public CategoryStock(Integer csid, String cscaid, String csstid, Double csweight) {
    if (csid != null) this.csid = csid;
    if (cscaid != null) this.cscaid = cscaid;
    if (csstid != null) this.csstid = csstid;
    if (csweight != null) this.csweight = csweight;
  }

  public CategoryStock() {
    this(null, null, null, null);
  }

  public CategoryStock clone() {
    return new CategoryStock(csid, cscaid, csstid, csweight);
  }
}
