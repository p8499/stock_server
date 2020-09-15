package p8499.stock.mask;

public class CategoryStockMask {
  protected long value = 0b0000L;

  public boolean getCsid() {
    return (value >> 3 & 1) == 1;
  }

  public CategoryStockMask setCsid(boolean csid) {
    if (csid) value |= 0b1000L;
    else value &= 0b0111L;
    return this;
  }

  public boolean getCscaid() {
    return (value >> 2 & 1) == 1;
  }

  public CategoryStockMask setCscaid(boolean cscaid) {
    if (cscaid) value |= 0b0100L;
    else value &= 0b1011L;
    return this;
  }

  public boolean getCsstid() {
    return (value >> 1 & 1) == 1;
  }

  public CategoryStockMask setCsstid(boolean csstid) {
    if (csstid) value |= 0b0010L;
    else value &= 0b1101L;
    return this;
  }

  public boolean getCsweight() {
    return (value >> 0 & 1) == 1;
  }

  public CategoryStockMask setCsweight(boolean csweight) {
    if (csweight) value |= 0b0001L;
    else value &= 0b1110L;
    return this;
  }

  public CategoryStockMask(boolean csid, boolean cscaid, boolean csstid, boolean csweight) {
    setCsid(csid);
    setCscaid(cscaid);
    setCsstid(csstid);
    setCsweight(csweight);
  }

  public CategoryStockMask(long v) {
    value = v;
  }

  public CategoryStockMask() {}

  public CategoryStockMask all(boolean b) {
    setCsid(b);
    setCscaid(b);
    setCsstid(b);
    setCsweight(b);
    return this;
  }

  public CategoryStockMask keys(boolean b) {
    setCsid(b);
    return this;
  }

  public CategoryStockMask attributes(boolean b) {
    setCscaid(b);
    setCsstid(b);
    setCsweight(b);
    return this;
  }

  public CategoryStockMask physicals(boolean b) {
    setCsid(b);
    setCscaid(b);
    setCsstid(b);
    setCsweight(b);
    return this;
  }

  public CategoryStockMask virtuals(boolean b) {
    return this;
  }

  public boolean get(String p) {
    switch (p) {
      case "csid":
        return getCsid();
      case "cscaid":
        return getCscaid();
      case "csstid":
        return getCsstid();
      case "csweight":
        return getCsweight();
    }
    return false;
  }

  public CategoryStockMask set(String p, boolean b) {
    switch (p) {
      case "csid":
        setCsid(b);
        break;
      case "cscaid":
        setCscaid(b);
        break;
      case "csstid":
        setCsstid(b);
        break;
      case "csweight":
        setCsweight(b);
        break;
    }
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
