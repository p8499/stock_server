package p8499.stock.mask;

public class ObjectUpdateMask {
  protected long value = 0b0000L;

  public boolean getObid() {
    return (value >> 3 & 1) == 1;
  }

  public ObjectUpdateMask setObid(boolean obid) {
    if (obid) value |= 0b1000L;
    else value &= 0b0111L;
    return this;
  }

  public boolean getObname() {
    return (value >> 2 & 1) == 1;
  }

  public ObjectUpdateMask setObname(boolean obname) {
    if (obname) value |= 0b0100L;
    else value &= 0b1011L;
    return this;
  }

  public boolean getObstart() {
    return (value >> 1 & 1) == 1;
  }

  public ObjectUpdateMask setObstart(boolean obstart) {
    if (obstart) value |= 0b0010L;
    else value &= 0b1101L;
    return this;
  }

  public boolean getObend() {
    return (value >> 0 & 1) == 1;
  }

  public ObjectUpdateMask setObend(boolean obend) {
    if (obend) value |= 0b0001L;
    else value &= 0b1110L;
    return this;
  }

  public ObjectUpdateMask(boolean obid, boolean obname, boolean obstart, boolean obend) {
    setObid(obid);
    setObname(obname);
    setObstart(obstart);
    setObend(obend);
  }

  public ObjectUpdateMask(long v) {
    value = v;
  }

  public ObjectUpdateMask() {}

  public ObjectUpdateMask all(boolean b) {
    setObid(b);
    setObname(b);
    setObstart(b);
    setObend(b);
    return this;
  }

  public ObjectUpdateMask keys(boolean b) {
    setObid(b);
    return this;
  }

  public ObjectUpdateMask attributes(boolean b) {
    setObname(b);
    setObstart(b);
    setObend(b);
    return this;
  }

  public ObjectUpdateMask physicals(boolean b) {
    setObid(b);
    setObname(b);
    setObstart(b);
    setObend(b);
    return this;
  }

  public ObjectUpdateMask virtuals(boolean b) {
    return this;
  }

  public boolean get(String p) {
    switch (p) {
      case "obid":
        return getObid();
      case "obname":
        return getObname();
      case "obstart":
        return getObstart();
      case "obend":
        return getObend();
    }
    return false;
  }

  public ObjectUpdateMask set(String p, boolean b) {
    switch (p) {
      case "obid":
        setObid(b);
        break;
      case "obname":
        setObname(b);
        break;
      case "obstart":
        setObstart(b);
        break;
      case "obend":
        setObend(b);
        break;
    }
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
