package p8499.stock.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {
  public static final String TABLE = "FS13";
  public static final String VIEW = "VS13";
  public static final String NAME = "MSSG";

  //region msid ID
  public static final String FIELD_MSID = "MSID";
  protected Integer msid = null;
  public static final int CONSTRAINT_MSID_LENGTH_INTEGER = 8;
  public static final int CONSTRAINT_MSID_MIN = -99999999;
  public static final int CONSTRAINT_MSID_MAX = 99999999;

  @javax.validation.constraints.Null(groups = {Insert.class})
  @javax.validation.constraints.NotNull(groups = {Update.class})
  public Integer getMsid() {
    return msid;
  }

  public Message setMsid(Integer msid) {
    this.msid = msid;
    return this;
  }
  //endregion

  //region msstid 证券ID
  public static final String FIELD_MSSTID = "MSSTID";
  protected String msstid = null;
  public static final int CONSTRAINT_MSSTID_LENGTH_STRING = 16;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_MSSTID_LENGTH_STRING)
  public String getMsstid() {
    return msstid;
  }

  public Message setMsstid(String msstid) {
    this.msstid = msstid;
    return this;
  }
  //endregion

  //region msyear 年份
  public static final String FIELD_MSYEAR = "MSYEAR";
  protected Integer msyear = null;
  public static final int CONSTRAINT_MSYEAR_LENGTH_INTEGER = 4;
  public static final int CONSTRAINT_MSYEAR_MIN = -9999;
  public static final int CONSTRAINT_MSYEAR_MAX = 9999;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Min(value = CONSTRAINT_MSYEAR_MIN)
  @javax.validation.constraints.Max(value = CONSTRAINT_MSYEAR_MAX)
  public Integer getMsyear() {
    return msyear;
  }

  public Message setMsyear(Integer msyear) {
    this.msyear = msyear;
    return this;
  }
  //endregion

  //region msperiod 期间（自1）
  public static final String FIELD_MSPERIOD = "MSPERIOD";
  protected Integer msperiod = null;
  public static final int CONSTRAINT_MSPERIOD_LENGTH_INTEGER = 1;
  public static final int CONSTRAINT_MSPERIOD_MIN = -9;
  public static final int CONSTRAINT_MSPERIOD_MAX = 9;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Min(value = CONSTRAINT_MSPERIOD_MIN)
  @javax.validation.constraints.Max(value = CONSTRAINT_MSPERIOD_MAX)
  public Integer getMsperiod() {
    return msperiod;
  }

  public Message setMsperiod(Integer msperiod) {
    this.msperiod = msperiod;
    return this;
  }
  //endregion

  //region msseq 序号
  public static final String FIELD_MSSEQ = "MSSEQ";
  protected Integer msseq = null;
  public static final int CONSTRAINT_MSSEQ_LENGTH_INTEGER = 4;
  public static final int CONSTRAINT_MSSEQ_MIN = -9999;
  public static final int CONSTRAINT_MSSEQ_MAX = 9999;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Min(value = CONSTRAINT_MSSEQ_MIN)
  @javax.validation.constraints.Max(value = CONSTRAINT_MSSEQ_MAX)
  public Integer getMsseq() {
    return msseq;
  }

  public Message setMsseq(Integer msseq) {
    this.msseq = msseq;
    return this;
  }
  //endregion

  //region mspublish 发布日期
  public static final String FIELD_MSPUBLISH = "MSPUBLISH";

  @com.fasterxml.jackson.annotation.JsonFormat(timezone = "GMT+8", pattern = "yyyyMMdd")
  protected java.util.Date mspublish = null;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  public java.util.Date getMspublish() {
    return mspublish;
  }

  public Message setMspublish(java.util.Date mspublish) {
    this.mspublish = mspublish;
    return this;
  }
  //endregion

  //region mssubject 标题
  public static final String FIELD_MSSUBJECT = "MSSUBJECT";
  protected String mssubject = null;
  public static final int CONSTRAINT_MSSUBJECT_LENGTH_STRING = 64;

  @javax.validation.constraints.Size(max = CONSTRAINT_MSSUBJECT_LENGTH_STRING)
  public String getMssubject() {
    return mssubject;
  }

  public Message setMssubject(String mssubject) {
    this.mssubject = mssubject;
    return this;
  }
  //endregion

  //region mscontent 内容
  public static final String FIELD_MSCONTENT = "MSCONTENT";
  protected String mscontent = null;
  public static final int CONSTRAINT_MSCONTENT_LENGTH_STRING = 4096;

  @javax.validation.constraints.Size(max = CONSTRAINT_MSCONTENT_LENGTH_STRING)
  public String getMscontent() {
    return mscontent;
  }

  public Message setMscontent(String mscontent) {
    this.mscontent = mscontent;
    return this;
  }
  //endregion

  public Message(
      Integer msid,
      String msstid,
      Integer msyear,
      Integer msperiod,
      Integer msseq,
      java.util.Date mspublish,
      String mssubject,
      String mscontent) {
    if (msid != null) this.msid = msid;
    if (msstid != null) this.msstid = msstid;
    if (msyear != null) this.msyear = msyear;
    if (msperiod != null) this.msperiod = msperiod;
    if (msseq != null) this.msseq = msseq;
    if (mspublish != null) this.mspublish = mspublish;
    if (mssubject != null) this.mssubject = mssubject;
    if (mscontent != null) this.mscontent = mscontent;
  }

  public Message() {
    this(null, null, null, null, null, null, null, null);
  }

  public Message clone() {
    return new Message(msid, msstid, msyear, msperiod, msseq, mspublish, mssubject, mscontent);
  }
}
