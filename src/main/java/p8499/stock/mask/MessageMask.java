package p8499.stock.mask;

public class MessageMask {
  protected long value = 0b00000000L;

  public boolean getMsid() {
    return (value >> 7 & 1) == 1;
  }

  public MessageMask setMsid(boolean msid) {
    if (msid) value |= 0b10000000L;
    else value &= 0b01111111L;
    return this;
  }

  public boolean getMsstid() {
    return (value >> 6 & 1) == 1;
  }

  public MessageMask setMsstid(boolean msstid) {
    if (msstid) value |= 0b01000000L;
    else value &= 0b10111111L;
    return this;
  }

  public boolean getMsyear() {
    return (value >> 5 & 1) == 1;
  }

  public MessageMask setMsyear(boolean msyear) {
    if (msyear) value |= 0b00100000L;
    else value &= 0b11011111L;
    return this;
  }

  public boolean getMsperiod() {
    return (value >> 4 & 1) == 1;
  }

  public MessageMask setMsperiod(boolean msperiod) {
    if (msperiod) value |= 0b00010000L;
    else value &= 0b11101111L;
    return this;
  }

  public boolean getMsseq() {
    return (value >> 3 & 1) == 1;
  }

  public MessageMask setMsseq(boolean msseq) {
    if (msseq) value |= 0b00001000L;
    else value &= 0b11110111L;
    return this;
  }

  public boolean getMspublish() {
    return (value >> 2 & 1) == 1;
  }

  public MessageMask setMspublish(boolean mspublish) {
    if (mspublish) value |= 0b00000100L;
    else value &= 0b11111011L;
    return this;
  }

  public boolean getMssubject() {
    return (value >> 1 & 1) == 1;
  }

  public MessageMask setMssubject(boolean mssubject) {
    if (mssubject) value |= 0b00000010L;
    else value &= 0b11111101L;
    return this;
  }

  public boolean getMscontent() {
    return (value >> 0 & 1) == 1;
  }

  public MessageMask setMscontent(boolean mscontent) {
    if (mscontent) value |= 0b00000001L;
    else value &= 0b11111110L;
    return this;
  }

  public MessageMask(
      boolean msid,
      boolean msstid,
      boolean msyear,
      boolean msperiod,
      boolean msseq,
      boolean mspublish,
      boolean mssubject,
      boolean mscontent) {
    setMsid(msid);
    setMsstid(msstid);
    setMsyear(msyear);
    setMsperiod(msperiod);
    setMsseq(msseq);
    setMspublish(mspublish);
    setMssubject(mssubject);
    setMscontent(mscontent);
  }

  public MessageMask(long v) {
    value = v;
  }

  public MessageMask() {}

  public MessageMask all(boolean b) {
    setMsid(b);
    setMsstid(b);
    setMsyear(b);
    setMsperiod(b);
    setMsseq(b);
    setMspublish(b);
    setMssubject(b);
    setMscontent(b);
    return this;
  }

  public MessageMask keys(boolean b) {
    setMsid(b);
    return this;
  }

  public MessageMask attributes(boolean b) {
    setMsstid(b);
    setMsyear(b);
    setMsperiod(b);
    setMsseq(b);
    setMspublish(b);
    setMssubject(b);
    setMscontent(b);
    return this;
  }

  public MessageMask physicals(boolean b) {
    setMsid(b);
    setMsstid(b);
    setMsyear(b);
    setMsperiod(b);
    setMsseq(b);
    setMspublish(b);
    setMssubject(b);
    setMscontent(b);
    return this;
  }

  public MessageMask virtuals(boolean b) {
    return this;
  }

  public boolean get(String p) {
    switch (p) {
      case "msid":
        return getMsid();
      case "msstid":
        return getMsstid();
      case "msyear":
        return getMsyear();
      case "msperiod":
        return getMsperiod();
      case "msseq":
        return getMsseq();
      case "mspublish":
        return getMspublish();
      case "mssubject":
        return getMssubject();
      case "mscontent":
        return getMscontent();
    }
    return false;
  }

  public MessageMask set(String p, boolean b) {
    switch (p) {
      case "msid":
        setMsid(b);
        break;
      case "msstid":
        setMsstid(b);
        break;
      case "msyear":
        setMsyear(b);
        break;
      case "msperiod":
        setMsperiod(b);
        break;
      case "msseq":
        setMsseq(b);
        break;
      case "mspublish":
        setMspublish(b);
        break;
      case "mssubject":
        setMssubject(b);
        break;
      case "mscontent":
        setMscontent(b);
        break;
    }
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
