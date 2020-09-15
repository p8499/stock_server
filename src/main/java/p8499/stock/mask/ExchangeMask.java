package p8499.stock.mask;

public class ExchangeMask {
  protected long value = 0b00L;

  public boolean getExid() {
    return (value >> 1 & 1) == 1;
  }

  public ExchangeMask setExid(boolean exid) {
    if (exid) value |= 0b10L;
    else value &= 0b01L;
    return this;
  }

  public boolean getExname() {
    return (value >> 0 & 1) == 1;
  }

  public ExchangeMask setExname(boolean exname) {
    if (exname) value |= 0b01L;
    else value &= 0b10L;
    return this;
  }

  public ExchangeMask(boolean exid, boolean exname) {
    setExid(exid);
    setExname(exname);
  }

  public ExchangeMask(long v) {
    value = v;
  }

  public ExchangeMask() {}

  public ExchangeMask all(boolean b) {
    setExid(b);
    setExname(b);
    return this;
  }

  public ExchangeMask keys(boolean b) {
    setExid(b);
    return this;
  }

  public ExchangeMask attributes(boolean b) {
    setExname(b);
    return this;
  }

  public ExchangeMask physicals(boolean b) {
    setExid(b);
    setExname(b);
    return this;
  }

  public ExchangeMask virtuals(boolean b) {
    return this;
  }

  public boolean get(String p) {
    switch (p) {
      case "exid":
        return getExid();
      case "exname":
        return getExname();
    }
    return false;
  }

  public ExchangeMask set(String p, boolean b) {
    switch (p) {
      case "exid":
        setExid(b);
        break;
      case "exname":
        setExname(b);
        break;
    }
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
