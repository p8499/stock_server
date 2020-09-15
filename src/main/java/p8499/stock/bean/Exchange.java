package p8499.stock.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Exchange {
  public static final String TABLE = "FS01";
  public static final String VIEW = "VS01";
  public static final String NAME = "EXCH";

  //region exid ID
  public static final String FIELD_EXID = "EXID";
  protected String exid = null;
  public static final int CONSTRAINT_EXID_LENGTH_STRING = 4;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_EXID_LENGTH_STRING)
  public String getExid() {
    return exid;
  }

  public Exchange setExid(String exid) {
    this.exid = exid;
    return this;
  }
  //endregion

  //region exname 名称
  public static final String FIELD_EXNAME = "EXNAME";
  protected String exname = null;
  public static final int CONSTRAINT_EXNAME_LENGTH_STRING = 8;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_EXNAME_LENGTH_STRING)
  public String getExname() {
    return exname;
  }

  public Exchange setExname(String exname) {
    this.exname = exname;
    return this;
  }
  //endregion

  public Exchange(String exid, String exname) {
    if (exid != null) this.exid = exid;
    if (exname != null) this.exname = exname;
  }

  public Exchange() {
    this(null, null);
  }

  public Exchange clone() {
    return new Exchange(exid, exname);
  }
}
