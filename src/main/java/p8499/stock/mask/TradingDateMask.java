package p8499.stock.mask;

public class TradingDateMask {
  protected long value = 0b000L;

  public boolean getTrid() {
    return (value >> 2 & 1) == 1;
  }

  public TradingDateMask setTrid(boolean trid) {
    if (trid) value |= 0b100L;
    else value &= 0b011L;
    return this;
  }

  public boolean getTrexid() {
    return (value >> 1 & 1) == 1;
  }

  public TradingDateMask setTrexid(boolean trexid) {
    if (trexid) value |= 0b010L;
    else value &= 0b101L;
    return this;
  }

  public boolean getTrdate() {
    return (value >> 0 & 1) == 1;
  }

  public TradingDateMask setTrdate(boolean trdate) {
    if (trdate) value |= 0b001L;
    else value &= 0b110L;
    return this;
  }

  public TradingDateMask(boolean trid, boolean trexid, boolean trdate) {
    setTrid(trid);
    setTrexid(trexid);
    setTrdate(trdate);
  }

  public TradingDateMask(long v) {
    value = v;
  }

  public TradingDateMask() {}

  public TradingDateMask all(boolean b) {
    setTrid(b);
    setTrexid(b);
    setTrdate(b);
    return this;
  }

  public TradingDateMask keys(boolean b) {
    setTrid(b);
    return this;
  }

  public TradingDateMask attributes(boolean b) {
    setTrexid(b);
    setTrdate(b);
    return this;
  }

  public TradingDateMask physicals(boolean b) {
    setTrid(b);
    setTrexid(b);
    setTrdate(b);
    return this;
  }

  public TradingDateMask virtuals(boolean b) {
    return this;
  }

  public boolean get(String p) {
    switch (p) {
      case "trid":
        return getTrid();
      case "trexid":
        return getTrexid();
      case "trdate":
        return getTrdate();
    }
    return false;
  }

  public TradingDateMask set(String p, boolean b) {
    switch (p) {
      case "trid":
        setTrid(b);
        break;
      case "trexid":
        setTrexid(b);
        break;
      case "trdate":
        setTrdate(b);
        break;
    }
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
