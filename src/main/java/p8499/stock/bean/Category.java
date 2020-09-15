package p8499.stock.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Category {
  public static final String TABLE = "FS21";
  public static final String VIEW = "VS21";
  public static final String NAME = "CATE";

  //region caid 板块ID
  public static final String FIELD_CAID = "CAID";
  protected String caid = null;
  public static final int CONSTRAINT_CAID_LENGTH_STRING = 32;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_CAID_LENGTH_STRING)
  public String getCaid() {
    return caid;
  }

  public Category setCaid(String caid) {
    this.caid = caid;
    return this;
  }
  //endregion

  //region caname 板块名称
  public static final String FIELD_CANAME = "CANAME";
  protected String caname = null;
  public static final int CONSTRAINT_CANAME_LENGTH_STRING = 64;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_CANAME_LENGTH_STRING)
  public String getCaname() {
    return caname;
  }

  public Category setCaname(String caname) {
    this.caname = caname;
    return this;
  }
  //endregion

  //region catype 类型
  public static final String FIELD_CATYPE = "CATYPE";
  public static final String CATYPE_I = "INDUSTRY";
  public static final String CATYPE_C = "CONCEPT";
  public static final String CATYPE_X = "INDEX";
  protected String catype = null;
  public static final int CONSTRAINT_CATYPE_LENGTH_STRING = 1;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_CATYPE_LENGTH_STRING)
  public String getCatype() {
    return catype;
  }

  public Category setCatype(String catype) {
    this.catype = catype;
    return this;
  }
  //endregion

  //region caweight 总权重
  public static final String FIELD_CAWEIGHT = "CAWEIGHT";
  protected Double caweight = null;
  public static final int CONSTRAINT_CAWEIGHT_LENGTH_INTEGER = 4;
  public static final int CONSTRAINT_CAWEIGHT_LENGTH_FRACTION = 4;

  public Double getCaweight() {
    return caweight;
  }

  public Category setCaweight(Double caweight) {
    this.caweight = caweight;
    return this;
  }
  //endregion

  public Category(String caid, String caname, String catype, Double caweight) {
    if (caid != null) this.caid = caid;
    if (caname != null) this.caname = caname;
    if (catype != null) this.catype = catype;
    if (caweight != null) this.caweight = caweight;
  }

  public Category() {
    this(null, null, null, null);
  }

  public Category clone() {
    return new Category(caid, caname, catype, caweight);
  }
}
