package p8499.stock.mask;

public class StockMask {
  protected long value = 0b00000000000000000000000L;

  public boolean getStid() {
    return (value >> 22 & 1) == 1;
  }

  public StockMask setStid(boolean stid) {
    if (stid) value |= 0b10000000000000000000000L;
    else value &= 0b01111111111111111111111L;
    return this;
  }

  public boolean getStexid() {
    return (value >> 21 & 1) == 1;
  }

  public StockMask setStexid(boolean stexid) {
    if (stexid) value |= 0b01000000000000000000000L;
    else value &= 0b10111111111111111111111L;
    return this;
  }

  public boolean getStcode() {
    return (value >> 20 & 1) == 1;
  }

  public StockMask setStcode(boolean stcode) {
    if (stcode) value |= 0b00100000000000000000000L;
    else value &= 0b11011111111111111111111L;
    return this;
  }

  public boolean getStname() {
    return (value >> 19 & 1) == 1;
  }

  public StockMask setStname(boolean stname) {
    if (stname) value |= 0b00010000000000000000000L;
    else value &= 0b11101111111111111111111L;
    return this;
  }

  public boolean getStlisted() {
    return (value >> 18 & 1) == 1;
  }

  public StockMask setStlisted(boolean stlisted) {
    if (stlisted) value |= 0b00001000000000000000000L;
    else value &= 0b11110111111111111111111L;
    return this;
  }

  public boolean getStdelisted() {
    return (value >> 17 & 1) == 1;
  }

  public StockMask setStdelisted(boolean stdelisted) {
    if (stdelisted) value |= 0b00000100000000000000000L;
    else value &= 0b11111011111111111111111L;
    return this;
  }

  public boolean getStexname() {
    return (value >> 16 & 1) == 1;
  }

  public StockMask setStexname(boolean stexname) {
    if (stexname) value |= 0b00000010000000000000000L;
    else value &= 0b11111101111111111111111L;
    return this;
  }

  public boolean getStdays() {
    return (value >> 15 & 1) == 1;
  }

  public StockMask setStdays(boolean stdays) {
    if (stdays) value |= 0b00000001000000000000000L;
    else value &= 0b11111110111111111111111L;
    return this;
  }

  public boolean getStpbrate() {
    return (value >> 14 & 1) == 1;
  }

  public StockMask setStpbrate(boolean stpbrate) {
    if (stpbrate) value |= 0b00000000100000000000000L;
    else value &= 0b11111111011111111111111L;
    return this;
  }

  public boolean getStpbrank() {
    return (value >> 13 & 1) == 1;
  }

  public StockMask setStpbrank(boolean stpbrank) {
    if (stpbrank) value |= 0b00000000010000000000000L;
    else value &= 0b11111111101111111111111L;
    return this;
  }

  public boolean getStpsrate() {
    return (value >> 12 & 1) == 1;
  }

  public StockMask setStpsrate(boolean stpsrate) {
    if (stpsrate) value |= 0b00000000001000000000000L;
    else value &= 0b11111111110111111111111L;
    return this;
  }

  public boolean getStpsrank() {
    return (value >> 11 & 1) == 1;
  }

  public StockMask setStpsrank(boolean stpsrank) {
    if (stpsrank) value |= 0b00000000000100000000000L;
    else value &= 0b11111111111011111111111L;
    return this;
  }

  public boolean getStperate() {
    return (value >> 10 & 1) == 1;
  }

  public StockMask setStperate(boolean stperate) {
    if (stperate) value |= 0b00000000000010000000000L;
    else value &= 0b11111111111101111111111L;
    return this;
  }

  public boolean getStperank() {
    return (value >> 9 & 1) == 1;
  }

  public StockMask setStperank(boolean stperank) {
    if (stperank) value |= 0b00000000000001000000000L;
    else value &= 0b11111111111110111111111L;
    return this;
  }

  public boolean getStpcfrate() {
    return (value >> 8 & 1) == 1;
  }

  public StockMask setStpcfrate(boolean stpcfrate) {
    if (stpcfrate) value |= 0b00000000000000100000000L;
    else value &= 0b11111111111111011111111L;
    return this;
  }

  public boolean getStpcfrank() {
    return (value >> 7 & 1) == 1;
  }

  public StockMask setStpcfrank(boolean stpcfrank) {
    if (stpcfrank) value |= 0b00000000000000010000000L;
    else value &= 0b11111111111111101111111L;
    return this;
  }

  public boolean getStnpel() {
    return (value >> 6 & 1) == 1;
  }

  public StockMask setStnpel(boolean stnpel) {
    if (stnpel) value |= 0b00000000000000001000000L;
    else value &= 0b11111111111111110111111L;
    return this;
  }

  public boolean getStpublish() {
    return (value >> 5 & 1) == 1;
  }

  public StockMask setStpublish(boolean stpublish) {
    if (stpublish) value |= 0b00000000000000000100000L;
    else value &= 0b11111111111111111011111L;
    return this;
  }

  public boolean getStpublishdays() {
    return (value >> 4 & 1) == 1;
  }

  public StockMask setStpublishdays(boolean stpublishdays) {
    if (stpublishdays) value |= 0b00000000000000000010000L;
    else value &= 0b11111111111111111101111L;
    return this;
  }

  public boolean getStyear() {
    return (value >> 3 & 1) == 1;
  }

  public StockMask setStyear(boolean styear) {
    if (styear) value |= 0b00000000000000000001000L;
    else value &= 0b11111111111111111110111L;
    return this;
  }

  public boolean getStperiod() {
    return (value >> 2 & 1) == 1;
  }

  public StockMask setStperiod(boolean stperiod) {
    if (stperiod) value |= 0b00000000000000000000100L;
    else value &= 0b11111111111111111111011L;
    return this;
  }

  public boolean getStmessage() {
    return (value >> 1 & 1) == 1;
  }

  public StockMask setStmessage(boolean stmessage) {
    if (stmessage) value |= 0b00000000000000000000010L;
    else value &= 0b11111111111111111111101L;
    return this;
  }

  public boolean getStfavorite() {
    return (value >> 0 & 1) == 1;
  }

  public StockMask setStfavorite(boolean stfavorite) {
    if (stfavorite) value |= 0b00000000000000000000001L;
    else value &= 0b11111111111111111111110L;
    return this;
  }

  public StockMask(
      boolean stid,
      boolean stexid,
      boolean stcode,
      boolean stname,
      boolean stlisted,
      boolean stdelisted,
      boolean stexname,
      boolean stdays,
      boolean stpbrate,
      boolean stpbrank,
      boolean stpsrate,
      boolean stpsrank,
      boolean stperate,
      boolean stperank,
      boolean stpcfrate,
      boolean stpcfrank,
      boolean stnpel,
      boolean stpublish,
      boolean stpublishdays,
      boolean styear,
      boolean stperiod,
      boolean stmessage,
      boolean stfavorite) {
    setStid(stid);
    setStexid(stexid);
    setStcode(stcode);
    setStname(stname);
    setStlisted(stlisted);
    setStdelisted(stdelisted);
    setStexname(stexname);
    setStdays(stdays);
    setStpbrate(stpbrate);
    setStpbrank(stpbrank);
    setStpsrate(stpsrate);
    setStpsrank(stpsrank);
    setStperate(stperate);
    setStperank(stperank);
    setStpcfrate(stpcfrate);
    setStpcfrank(stpcfrank);
    setStnpel(stnpel);
    setStpublish(stpublish);
    setStpublishdays(stpublishdays);
    setStyear(styear);
    setStperiod(stperiod);
    setStmessage(stmessage);
    setStfavorite(stfavorite);
  }

  public StockMask(long v) {
    value = v;
  }

  public StockMask() {}

  public StockMask all(boolean b) {
    setStid(b);
    setStexid(b);
    setStcode(b);
    setStname(b);
    setStlisted(b);
    setStdelisted(b);
    setStexname(b);
    setStdays(b);
    setStpbrate(b);
    setStpbrank(b);
    setStpsrate(b);
    setStpsrank(b);
    setStperate(b);
    setStperank(b);
    setStpcfrate(b);
    setStpcfrank(b);
    setStnpel(b);
    setStpublish(b);
    setStpublishdays(b);
    setStyear(b);
    setStperiod(b);
    setStmessage(b);
    setStfavorite(b);
    return this;
  }

  public StockMask keys(boolean b) {
    setStid(b);
    return this;
  }

  public StockMask attributes(boolean b) {
    setStexid(b);
    setStcode(b);
    setStname(b);
    setStlisted(b);
    setStdelisted(b);
    setStpbrate(b);
    setStpbrank(b);
    setStpsrate(b);
    setStpsrank(b);
    setStperate(b);
    setStperank(b);
    setStpcfrate(b);
    setStpcfrank(b);
    return this;
  }

  public StockMask physicals(boolean b) {
    setStid(b);
    setStexid(b);
    setStcode(b);
    setStname(b);
    setStlisted(b);
    setStdelisted(b);
    setStpbrate(b);
    setStpbrank(b);
    setStpsrate(b);
    setStpsrank(b);
    setStperate(b);
    setStperank(b);
    setStpcfrate(b);
    setStpcfrank(b);
    return this;
  }

  public StockMask virtuals(boolean b) {
    setStexname(b);
    setStdays(b);
    setStnpel(b);
    setStpublish(b);
    setStpublishdays(b);
    setStyear(b);
    setStperiod(b);
    setStmessage(b);
    setStfavorite(b);
    return this;
  }

  public boolean get(String p) {
    switch (p) {
      case "stid":
        return getStid();
      case "stexid":
        return getStexid();
      case "stcode":
        return getStcode();
      case "stname":
        return getStname();
      case "stlisted":
        return getStlisted();
      case "stdelisted":
        return getStdelisted();
      case "stexname":
        return getStexname();
      case "stdays":
        return getStdays();
      case "stpbrate":
        return getStpbrate();
      case "stpbrank":
        return getStpbrank();
      case "stpsrate":
        return getStpsrate();
      case "stpsrank":
        return getStpsrank();
      case "stperate":
        return getStperate();
      case "stperank":
        return getStperank();
      case "stpcfrate":
        return getStpcfrate();
      case "stpcfrank":
        return getStpcfrank();
      case "stnpel":
        return getStnpel();
      case "stpublish":
        return getStpublish();
      case "stpublishdays":
        return getStpublishdays();
      case "styear":
        return getStyear();
      case "stperiod":
        return getStperiod();
      case "stmessage":
        return getStmessage();
      case "stfavorite":
        return getStfavorite();
    }
    return false;
  }

  public StockMask set(String p, boolean b) {
    switch (p) {
      case "stid":
        setStid(b);
        break;
      case "stexid":
        setStexid(b);
        break;
      case "stcode":
        setStcode(b);
        break;
      case "stname":
        setStname(b);
        break;
      case "stlisted":
        setStlisted(b);
        break;
      case "stdelisted":
        setStdelisted(b);
        break;
      case "stexname":
        setStexname(b);
        break;
      case "stdays":
        setStdays(b);
        break;
      case "stpbrate":
        setStpbrate(b);
        break;
      case "stpbrank":
        setStpbrank(b);
        break;
      case "stpsrate":
        setStpsrate(b);
        break;
      case "stpsrank":
        setStpsrank(b);
        break;
      case "stperate":
        setStperate(b);
        break;
      case "stperank":
        setStperank(b);
        break;
      case "stpcfrate":
        setStpcfrate(b);
        break;
      case "stpcfrank":
        setStpcfrank(b);
        break;
      case "stnpel":
        setStnpel(b);
        break;
      case "stpublish":
        setStpublish(b);
        break;
      case "stpublishdays":
        setStpublishdays(b);
        break;
      case "styear":
        setStyear(b);
        break;
      case "stperiod":
        setStperiod(b);
        break;
      case "stmessage":
        setStmessage(b);
        break;
      case "stfavorite":
        setStfavorite(b);
        break;
    }
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
