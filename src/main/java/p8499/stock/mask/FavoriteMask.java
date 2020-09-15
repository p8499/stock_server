package p8499.stock.mask;

public class FavoriteMask {
  protected long value = 0b0L;

  public boolean getFastid() {
    return (value >> 0 & 1) == 1;
  }

  public FavoriteMask setFastid(boolean fastid) {
    if (fastid) value |= 0b1L;
    else value &= 0b0L;
    return this;
  }

  public FavoriteMask(boolean fastid) {
    setFastid(fastid);
  }

  public FavoriteMask(long v) {
    value = v;
  }

  public FavoriteMask() {}

  public FavoriteMask all(boolean b) {
    setFastid(b);
    return this;
  }

  public FavoriteMask keys(boolean b) {
    setFastid(b);
    return this;
  }

  public FavoriteMask attributes(boolean b) {
    return this;
  }

  public FavoriteMask physicals(boolean b) {
    setFastid(b);
    return this;
  }

  public FavoriteMask virtuals(boolean b) {
    return this;
  }

  public boolean get(String p) {
    switch (p) {
      case "fastid":
        return getFastid();
    }
    return false;
  }

  public FavoriteMask set(String p, boolean b) {
    switch (p) {
      case "fastid":
        setFastid(b);
        break;
    }
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
