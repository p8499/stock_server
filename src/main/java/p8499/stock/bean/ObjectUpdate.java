package p8499.stock.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjectUpdate {
  public static final String TABLE = "FS90";
  public static final String VIEW = "VS90";
  public static final String NAME = "OBUP";

  //region obid ID
  public static final String FIELD_OBID = "OBID";
  protected Integer obid = null;
  public static final int CONSTRAINT_OBID_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_OBID_MIN = -99999999;
  public static final int CONSTRAINT_OBID_MAX = 99999999;

  @javax.validation.constraints.Null(groups = {Insert.class})
  @javax.validation.constraints.NotNull(groups = {Update.class})
  public Integer getObid() {
    return obid;
  }

  public ObjectUpdate setObid(Integer obid) {
    this.obid = obid;
    return this;
  }
  //endregion

  //region obname 对象ID
  public static final String FIELD_OBNAME = "OBNAME";
  protected String obname = null;
  public static final int CONSTRAINT_OBNAME_LENGTH_STRING = 16;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_OBNAME_LENGTH_STRING)
  public String getObname() {
    return obname;
  }

  public ObjectUpdate setObname(String obname) {
    this.obname = obname;
    return this;
  }
  //endregion

  //region obstart 任务开始
  public static final String FIELD_OBSTART = "OBSTART";

  @com.fasterxml.jackson.annotation.JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
  protected java.util.Date obstart = null;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  public java.util.Date getObstart() {
    return obstart;
  }

  public ObjectUpdate setObstart(java.util.Date obstart) {
    this.obstart = obstart;
    return this;
  }
  //endregion

  //region obend 任务结束
  public static final String FIELD_OBEND = "OBEND";

  @com.fasterxml.jackson.annotation.JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
  protected java.util.Date obend = null;

  public java.util.Date getObend() {
    return obend;
  }

  public ObjectUpdate setObend(java.util.Date obend) {
    this.obend = obend;
    return this;
  }
  //endregion

  public ObjectUpdate(Integer obid, String obname, java.util.Date obstart, java.util.Date obend) {
    if (obid != null) this.obid = obid;
    if (obname != null) this.obname = obname;
    if (obstart != null) this.obstart = obstart;
    if (obend != null) this.obend = obend;
  }

  public ObjectUpdate() {
    this(null, null, null, null);
  }

  public ObjectUpdate clone() {
    return new ObjectUpdate(obid, obname, obstart, obend);
  }
}
