package p8499.stock.mask;

public class CategoryMask {
  protected long value = 0b0000L;

  public boolean getCaid() {
    return (value >> 3 & 1) == 1;
  }

  public CategoryMask setCaid(boolean caid) {
    if (caid) value |= 0b1000L;
    else value &= 0b0111L;
    return this;
  }

  public boolean getCaname() {
    return (value >> 2 & 1) == 1;
  }

  public CategoryMask setCaname(boolean caname) {
    if (caname) value |= 0b0100L;
    else value &= 0b1011L;
    return this;
  }

  public boolean getCatype() {
    return (value >> 1 & 1) == 1;
  }

  public CategoryMask setCatype(boolean catype) {
    if (catype) value |= 0b0010L;
    else value &= 0b1101L;
    return this;
  }

  public boolean getCaweight() {
    return (value >> 0 & 1) == 1;
  }

  public CategoryMask setCaweight(boolean caweight) {
    if (caweight) value |= 0b0001L;
    else value &= 0b1110L;
    return this;
  }

  public CategoryMask(boolean caid, boolean caname, boolean catype, boolean caweight) {
    setCaid(caid);
    setCaname(caname);
    setCatype(catype);
    setCaweight(caweight);
  }

  public CategoryMask(long v) {
    value = v;
  }

  public CategoryMask() {}

  public CategoryMask all(boolean b) {
    setCaid(b);
    setCaname(b);
    setCatype(b);
    setCaweight(b);
    return this;
  }

  public CategoryMask keys(boolean b) {
    setCaid(b);
    return this;
  }

  public CategoryMask attributes(boolean b) {
    setCaname(b);
    setCatype(b);
    return this;
  }

  public CategoryMask physicals(boolean b) {
    setCaid(b);
    setCaname(b);
    setCatype(b);
    return this;
  }

  public CategoryMask virtuals(boolean b) {
    setCaweight(b);
    return this;
  }

  public boolean get(String p) {
    switch (p) {
      case "caid":
        return getCaid();
      case "caname":
        return getCaname();
      case "catype":
        return getCatype();
      case "caweight":
        return getCaweight();
    }
    return false;
  }

  public CategoryMask set(String p, boolean b) {
    switch (p) {
      case "caid":
        setCaid(b);
        break;
      case "caname":
        setCaname(b);
        break;
      case "catype":
        setCatype(b);
        break;
      case "caweight":
        setCaweight(b);
        break;
    }
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
