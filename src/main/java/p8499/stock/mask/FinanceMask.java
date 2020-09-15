package p8499.stock.mask;

public class FinanceMask {
  protected long value = 0b0000000000000L;

  public boolean getFiid() {
    return (value >> 12 & 1) == 1;
  }

  public FinanceMask setFiid(boolean fiid) {
    if (fiid) value |= 0b1000000000000L;
    else value &= 0b0111111111111L;
    return this;
  }

  public boolean getFistid() {
    return (value >> 11 & 1) == 1;
  }

  public FinanceMask setFistid(boolean fistid) {
    if (fistid) value |= 0b0100000000000L;
    else value &= 0b1011111111111L;
    return this;
  }

  public boolean getFiyear() {
    return (value >> 10 & 1) == 1;
  }

  public FinanceMask setFiyear(boolean fiyear) {
    if (fiyear) value |= 0b0010000000000L;
    else value &= 0b1101111111111L;
    return this;
  }

  public boolean getFiperiod() {
    return (value >> 9 & 1) == 1;
  }

  public FinanceMask setFiperiod(boolean fiperiod) {
    if (fiperiod) value |= 0b0001000000000L;
    else value &= 0b1110111111111L;
    return this;
  }

  public boolean getFistatus() {
    return (value >> 8 & 1) == 1;
  }

  public FinanceMask setFistatus(boolean fistatus) {
    if (fistatus) value |= 0b0000100000000L;
    else value &= 0b1111011111111L;
    return this;
  }

  public boolean getFipublish() {
    return (value >> 7 & 1) == 1;
  }

  public FinanceMask setFipublish(boolean fipublish) {
    if (fipublish) value |= 0b0000010000000L;
    else value &= 0b1111101111111L;
    return this;
  }

  public boolean getFina() {
    return (value >> 6 & 1) == 1;
  }

  public FinanceMask setFina(boolean fina) {
    if (fina) value |= 0b0000001000000L;
    else value &= 0b1111110111111L;
    return this;
  }

  public boolean getFioi() {
    return (value >> 5 & 1) == 1;
  }

  public FinanceMask setFioi(boolean fioi) {
    if (fioi) value |= 0b0000000100000L;
    else value &= 0b1111111011111L;
    return this;
  }

  public boolean getFinpe() {
    return (value >> 4 & 1) == 1;
  }

  public FinanceMask setFinpe(boolean finpe) {
    if (finpe) value |= 0b0000000010000L;
    else value &= 0b1111111101111L;
    return this;
  }

  public boolean getFiocn() {
    return (value >> 3 & 1) == 1;
  }

  public FinanceMask setFiocn(boolean fiocn) {
    if (fiocn) value |= 0b0000000001000L;
    else value &= 0b1111111110111L;
    return this;
  }

  public boolean getFioiy() {
    return (value >> 2 & 1) == 1;
  }

  public FinanceMask setFioiy(boolean fioiy) {
    if (fioiy) value |= 0b0000000000100L;
    else value &= 0b1111111111011L;
    return this;
  }

  public boolean getFinpey() {
    return (value >> 1 & 1) == 1;
  }

  public FinanceMask setFinpey(boolean finpey) {
    if (finpey) value |= 0b0000000000010L;
    else value &= 0b1111111111101L;
    return this;
  }

  public boolean getFiocny() {
    return (value >> 0 & 1) == 1;
  }

  public FinanceMask setFiocny(boolean fiocny) {
    if (fiocny) value |= 0b0000000000001L;
    else value &= 0b1111111111110L;
    return this;
  }

  public FinanceMask(
      boolean fiid,
      boolean fistid,
      boolean fiyear,
      boolean fiperiod,
      boolean fistatus,
      boolean fipublish,
      boolean fina,
      boolean fioi,
      boolean finpe,
      boolean fiocn,
      boolean fioiy,
      boolean finpey,
      boolean fiocny) {
    setFiid(fiid);
    setFistid(fistid);
    setFiyear(fiyear);
    setFiperiod(fiperiod);
    setFistatus(fistatus);
    setFipublish(fipublish);
    setFina(fina);
    setFioi(fioi);
    setFinpe(finpe);
    setFiocn(fiocn);
    setFioiy(fioiy);
    setFinpey(finpey);
    setFiocny(fiocny);
  }

  public FinanceMask(long v) {
    value = v;
  }

  public FinanceMask() {}

  public FinanceMask all(boolean b) {
    setFiid(b);
    setFistid(b);
    setFiyear(b);
    setFiperiod(b);
    setFistatus(b);
    setFipublish(b);
    setFina(b);
    setFioi(b);
    setFinpe(b);
    setFiocn(b);
    setFioiy(b);
    setFinpey(b);
    setFiocny(b);
    return this;
  }

  public FinanceMask keys(boolean b) {
    setFiid(b);
    return this;
  }

  public FinanceMask attributes(boolean b) {
    setFistid(b);
    setFiyear(b);
    setFiperiod(b);
    setFistatus(b);
    setFipublish(b);
    setFina(b);
    setFioi(b);
    setFinpe(b);
    setFiocn(b);
    setFioiy(b);
    setFinpey(b);
    setFiocny(b);
    return this;
  }

  public FinanceMask physicals(boolean b) {
    setFiid(b);
    setFistid(b);
    setFiyear(b);
    setFiperiod(b);
    setFistatus(b);
    setFipublish(b);
    setFina(b);
    setFioi(b);
    setFinpe(b);
    setFiocn(b);
    setFioiy(b);
    setFinpey(b);
    setFiocny(b);
    return this;
  }

  public FinanceMask virtuals(boolean b) {
    return this;
  }

  public boolean get(String p) {
    switch (p) {
      case "fiid":
        return getFiid();
      case "fistid":
        return getFistid();
      case "fiyear":
        return getFiyear();
      case "fiperiod":
        return getFiperiod();
      case "fistatus":
        return getFistatus();
      case "fipublish":
        return getFipublish();
      case "fina":
        return getFina();
      case "fioi":
        return getFioi();
      case "finpe":
        return getFinpe();
      case "fiocn":
        return getFiocn();
      case "fioiy":
        return getFioiy();
      case "finpey":
        return getFinpey();
      case "fiocny":
        return getFiocny();
    }
    return false;
  }

  public FinanceMask set(String p, boolean b) {
    switch (p) {
      case "fiid":
        setFiid(b);
        break;
      case "fistid":
        setFistid(b);
        break;
      case "fiyear":
        setFiyear(b);
        break;
      case "fiperiod":
        setFiperiod(b);
        break;
      case "fistatus":
        setFistatus(b);
        break;
      case "fipublish":
        setFipublish(b);
        break;
      case "fina":
        setFina(b);
        break;
      case "fioi":
        setFioi(b);
        break;
      case "finpe":
        setFinpe(b);
        break;
      case "fiocn":
        setFiocn(b);
        break;
      case "fioiy":
        setFioiy(b);
        break;
      case "finpey":
        setFinpey(b);
        break;
      case "fiocny":
        setFiocny(b);
        break;
    }
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
