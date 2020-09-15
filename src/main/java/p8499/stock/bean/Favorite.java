package p8499.stock.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Favorite {
  public static final String TABLE = "FS91";
  public static final String VIEW = "VS91";
  public static final String NAME = "FAVO";

  //region fastid 证券ID
  public static final String FIELD_FASTID = "FASTID";
  protected String fastid = null;
  public static final int CONSTRAINT_FASTID_LENGTH_STRING = 16;

  @javax.validation.constraints.NotNull(groups = {Insert.class, Update.class})
  @javax.validation.constraints.Size(max = CONSTRAINT_FASTID_LENGTH_STRING)
  public String getFastid() {
    return fastid;
  }

  public Favorite setFastid(String fastid) {
    this.fastid = fastid;
    return this;
  }
  //endregion

  public Favorite(String fastid) {
    if (fastid != null) this.fastid = fastid;
  }

  public Favorite() {
    this(null);
  }

  public Favorite clone() {
    return new Favorite(fastid);
  }
}
