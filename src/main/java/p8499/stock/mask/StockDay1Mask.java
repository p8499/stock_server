package p8499.stock.mask;

public class StockDay1Mask {
  protected long value = 0b000000000000000000000000000000000000000000000000000L;

  public boolean getD1id() {
    return (value >> 50 & 1) == 1;
  }

  public StockDay1Mask setD1id(boolean d1id) {
    if (d1id) value |= 0b100000000000000000000000000000000000000000000000000L;
    else value &= 0b011111111111111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1stid() {
    return (value >> 49 & 1) == 1;
  }

  public StockDay1Mask setD1stid(boolean d1stid) {
    if (d1stid) value |= 0b010000000000000000000000000000000000000000000000000L;
    else value &= 0b101111111111111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1date() {
    return (value >> 48 & 1) == 1;
  }

  public StockDay1Mask setD1date(boolean d1date) {
    if (d1date) value |= 0b001000000000000000000000000000000000000000000000000L;
    else value &= 0b110111111111111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1open() {
    return (value >> 47 & 1) == 1;
  }

  public StockDay1Mask setD1open(boolean d1open) {
    if (d1open) value |= 0b000100000000000000000000000000000000000000000000000L;
    else value &= 0b111011111111111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1close() {
    return (value >> 46 & 1) == 1;
  }

  public StockDay1Mask setD1close(boolean d1close) {
    if (d1close) value |= 0b000010000000000000000000000000000000000000000000000L;
    else value &= 0b111101111111111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1high() {
    return (value >> 45 & 1) == 1;
  }

  public StockDay1Mask setD1high(boolean d1high) {
    if (d1high) value |= 0b000001000000000000000000000000000000000000000000000L;
    else value &= 0b111110111111111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1low() {
    return (value >> 44 & 1) == 1;
  }

  public StockDay1Mask setD1low(boolean d1low) {
    if (d1low) value |= 0b000000100000000000000000000000000000000000000000000L;
    else value &= 0b111111011111111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1volume() {
    return (value >> 43 & 1) == 1;
  }

  public StockDay1Mask setD1volume(boolean d1volume) {
    if (d1volume) value |= 0b000000010000000000000000000000000000000000000000000L;
    else value &= 0b111111101111111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1amount() {
    return (value >> 42 & 1) == 1;
  }

  public StockDay1Mask setD1amount(boolean d1amount) {
    if (d1amount) value |= 0b000000001000000000000000000000000000000000000000000L;
    else value &= 0b111111110111111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1totalshare() {
    return (value >> 41 & 1) == 1;
  }

  public StockDay1Mask setD1totalshare(boolean d1totalshare) {
    if (d1totalshare) value |= 0b000000000100000000000000000000000000000000000000000L;
    else value &= 0b111111111011111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1flowshare() {
    return (value >> 40 & 1) == 1;
  }

  public StockDay1Mask setD1flowshare(boolean d1flowshare) {
    if (d1flowshare) value |= 0b000000000010000000000000000000000000000000000000000L;
    else value &= 0b111111111101111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1factor() {
    return (value >> 39 & 1) == 1;
  }

  public StockDay1Mask setD1factor(boolean d1factor) {
    if (d1factor) value |= 0b000000000001000000000000000000000000000000000000000L;
    else value &= 0b111111111110111111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1buy1() {
    return (value >> 38 & 1) == 1;
  }

  public StockDay1Mask setD1buy1(boolean d1buy1) {
    if (d1buy1) value |= 0b000000000000100000000000000000000000000000000000000L;
    else value &= 0b111111111111011111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1sell1() {
    return (value >> 37 & 1) == 1;
  }

  public StockDay1Mask setD1sell1(boolean d1sell1) {
    if (d1sell1) value |= 0b000000000000010000000000000000000000000000000000000L;
    else value &= 0b111111111111101111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1buy2() {
    return (value >> 36 & 1) == 1;
  }

  public StockDay1Mask setD1buy2(boolean d1buy2) {
    if (d1buy2) value |= 0b000000000000001000000000000000000000000000000000000L;
    else value &= 0b111111111111110111111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1sell2() {
    return (value >> 35 & 1) == 1;
  }

  public StockDay1Mask setD1sell2(boolean d1sell2) {
    if (d1sell2) value |= 0b000000000000000100000000000000000000000000000000000L;
    else value &= 0b111111111111111011111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1buy3() {
    return (value >> 34 & 1) == 1;
  }

  public StockDay1Mask setD1buy3(boolean d1buy3) {
    if (d1buy3) value |= 0b000000000000000010000000000000000000000000000000000L;
    else value &= 0b111111111111111101111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1sell3() {
    return (value >> 33 & 1) == 1;
  }

  public StockDay1Mask setD1sell3(boolean d1sell3) {
    if (d1sell3) value |= 0b000000000000000001000000000000000000000000000000000L;
    else value &= 0b111111111111111110111111111111111111111111111111111L;
    return this;
  }

  public boolean getD1buy4() {
    return (value >> 32 & 1) == 1;
  }

  public StockDay1Mask setD1buy4(boolean d1buy4) {
    if (d1buy4) value |= 0b000000000000000000100000000000000000000000000000000L;
    else value &= 0b111111111111111111011111111111111111111111111111111L;
    return this;
  }

  public boolean getD1sell4() {
    return (value >> 31 & 1) == 1;
  }

  public StockDay1Mask setD1sell4(boolean d1sell4) {
    if (d1sell4) value |= 0b000000000000000000010000000000000000000000000000000L;
    else value &= 0b111111111111111111101111111111111111111111111111111L;
    return this;
  }

  public boolean getD1openpre() {
    return (value >> 30 & 1) == 1;
  }

  public StockDay1Mask setD1openpre(boolean d1openpre) {
    if (d1openpre) value |= 0b000000000000000000001000000000000000000000000000000L;
    else value &= 0b111111111111111111110111111111111111111111111111111L;
    return this;
  }

  public boolean getD1closepre() {
    return (value >> 29 & 1) == 1;
  }

  public StockDay1Mask setD1closepre(boolean d1closepre) {
    if (d1closepre) value |= 0b000000000000000000000100000000000000000000000000000L;
    else value &= 0b111111111111111111111011111111111111111111111111111L;
    return this;
  }

  public boolean getD1highpre() {
    return (value >> 28 & 1) == 1;
  }

  public StockDay1Mask setD1highpre(boolean d1highpre) {
    if (d1highpre) value |= 0b000000000000000000000010000000000000000000000000000L;
    else value &= 0b111111111111111111111101111111111111111111111111111L;
    return this;
  }

  public boolean getD1lowpre() {
    return (value >> 27 & 1) == 1;
  }

  public StockDay1Mask setD1lowpre(boolean d1lowpre) {
    if (d1lowpre) value |= 0b000000000000000000000001000000000000000000000000000L;
    else value &= 0b111111111111111111111110111111111111111111111111111L;
    return this;
  }

  public boolean getD1volumepre() {
    return (value >> 26 & 1) == 1;
  }

  public StockDay1Mask setD1volumepre(boolean d1volumepre) {
    if (d1volumepre) value |= 0b000000000000000000000000100000000000000000000000000L;
    else value &= 0b111111111111111111111111011111111111111111111111111L;
    return this;
  }

  public boolean getD1openpost() {
    return (value >> 25 & 1) == 1;
  }

  public StockDay1Mask setD1openpost(boolean d1openpost) {
    if (d1openpost) value |= 0b000000000000000000000000010000000000000000000000000L;
    else value &= 0b111111111111111111111111101111111111111111111111111L;
    return this;
  }

  public boolean getD1closepost() {
    return (value >> 24 & 1) == 1;
  }

  public StockDay1Mask setD1closepost(boolean d1closepost) {
    if (d1closepost) value |= 0b000000000000000000000000001000000000000000000000000L;
    else value &= 0b111111111111111111111111110111111111111111111111111L;
    return this;
  }

  public boolean getD1highpost() {
    return (value >> 23 & 1) == 1;
  }

  public StockDay1Mask setD1highpost(boolean d1highpost) {
    if (d1highpost) value |= 0b000000000000000000000000000100000000000000000000000L;
    else value &= 0b111111111111111111111111111011111111111111111111111L;
    return this;
  }

  public boolean getD1lowpost() {
    return (value >> 22 & 1) == 1;
  }

  public StockDay1Mask setD1lowpost(boolean d1lowpost) {
    if (d1lowpost) value |= 0b000000000000000000000000000010000000000000000000000L;
    else value &= 0b111111111111111111111111111101111111111111111111111L;
    return this;
  }

  public boolean getD1volumepost() {
    return (value >> 21 & 1) == 1;
  }

  public StockDay1Mask setD1volumepost(boolean d1volumepost) {
    if (d1volumepost) value |= 0b000000000000000000000000000001000000000000000000000L;
    else value &= 0b111111111111111111111111111110111111111111111111111L;
    return this;
  }

  public boolean getD1turnover() {
    return (value >> 20 & 1) == 1;
  }

  public StockDay1Mask setD1turnover(boolean d1turnover) {
    if (d1turnover) value |= 0b000000000000000000000000000000100000000000000000000L;
    else value &= 0b111111111111111111111111111111011111111111111111111L;
    return this;
  }

  public boolean getD1netpercent2() {
    return (value >> 19 & 1) == 1;
  }

  public StockDay1Mask setD1netpercent2(boolean d1netpercent2) {
    if (d1netpercent2) value |= 0b000000000000000000000000000000010000000000000000000L;
    else value &= 0b111111111111111111111111111111101111111111111111111L;
    return this;
  }

  public boolean getD1netpercent3() {
    return (value >> 18 & 1) == 1;
  }

  public StockDay1Mask setD1netpercent3(boolean d1netpercent3) {
    if (d1netpercent3) value |= 0b000000000000000000000000000000001000000000000000000L;
    else value &= 0b111111111111111111111111111111110111111111111111111L;
    return this;
  }

  public boolean getD1netpercent4() {
    return (value >> 17 & 1) == 1;
  }

  public StockDay1Mask setD1netpercent4(boolean d1netpercent4) {
    if (d1netpercent4) value |= 0b000000000000000000000000000000000100000000000000000L;
    else value &= 0b111111111111111111111111111111111011111111111111111L;
    return this;
  }

  public boolean getD1netforce2() {
    return (value >> 16 & 1) == 1;
  }

  public StockDay1Mask setD1netforce2(boolean d1netforce2) {
    if (d1netforce2) value |= 0b000000000000000000000000000000000010000000000000000L;
    else value &= 0b111111111111111111111111111111111101111111111111111L;
    return this;
  }

  public boolean getD1netforce3() {
    return (value >> 15 & 1) == 1;
  }

  public StockDay1Mask setD1netforce3(boolean d1netforce3) {
    if (d1netforce3) value |= 0b000000000000000000000000000000000001000000000000000L;
    else value &= 0b111111111111111111111111111111111110111111111111111L;
    return this;
  }

  public boolean getD1netforce4() {
    return (value >> 14 & 1) == 1;
  }

  public StockDay1Mask setD1netforce4(boolean d1netforce4) {
    if (d1netforce4) value |= 0b000000000000000000000000000000000000100000000000000L;
    else value &= 0b111111111111111111111111111111111111011111111111111L;
    return this;
  }

  public boolean getD1exid() {
    return (value >> 13 & 1) == 1;
  }

  public StockDay1Mask setD1exid(boolean d1exid) {
    if (d1exid) value |= 0b000000000000000000000000000000000000010000000000000L;
    else value &= 0b111111111111111111111111111111111111101111111111111L;
    return this;
  }

  public boolean getD1exname() {
    return (value >> 12 & 1) == 1;
  }

  public StockDay1Mask setD1exname(boolean d1exname) {
    if (d1exname) value |= 0b000000000000000000000000000000000000001000000000000L;
    else value &= 0b111111111111111111111111111111111111110111111111111L;
    return this;
  }

  public boolean getD1fina() {
    return (value >> 11 & 1) == 1;
  }

  public StockDay1Mask setD1fina(boolean d1fina) {
    if (d1fina) value |= 0b000000000000000000000000000000000000000100000000000L;
    else value &= 0b111111111111111111111111111111111111111011111111111L;
    return this;
  }

  public boolean getD1fioiy() {
    return (value >> 10 & 1) == 1;
  }

  public StockDay1Mask setD1fioiy(boolean d1fioiy) {
    if (d1fioiy) value |= 0b000000000000000000000000000000000000000010000000000L;
    else value &= 0b111111111111111111111111111111111111111101111111111L;
    return this;
  }

  public boolean getD1finpey() {
    return (value >> 9 & 1) == 1;
  }

  public StockDay1Mask setD1finpey(boolean d1finpey) {
    if (d1finpey) value |= 0b000000000000000000000000000000000000000001000000000L;
    else value &= 0b111111111111111111111111111111111111111110111111111L;
    return this;
  }

  public boolean getD1fiocny() {
    return (value >> 8 & 1) == 1;
  }

  public StockDay1Mask setD1fiocny(boolean d1fiocny) {
    if (d1fiocny) value |= 0b000000000000000000000000000000000000000000100000000L;
    else value &= 0b111111111111111111111111111111111111111111011111111L;
    return this;
  }

  public boolean getD1finaps() {
    return (value >> 7 & 1) == 1;
  }

  public StockDay1Mask setD1finaps(boolean d1finaps) {
    if (d1finaps) value |= 0b000000000000000000000000000000000000000000010000000L;
    else value &= 0b111111111111111111111111111111111111111111101111111L;
    return this;
  }

  public boolean getD1fioiyps() {
    return (value >> 6 & 1) == 1;
  }

  public StockDay1Mask setD1fioiyps(boolean d1fioiyps) {
    if (d1fioiyps) value |= 0b000000000000000000000000000000000000000000001000000L;
    else value &= 0b111111111111111111111111111111111111111111110111111L;
    return this;
  }

  public boolean getD1finpeyps() {
    return (value >> 5 & 1) == 1;
  }

  public StockDay1Mask setD1finpeyps(boolean d1finpeyps) {
    if (d1finpeyps) value |= 0b000000000000000000000000000000000000000000000100000L;
    else value &= 0b111111111111111111111111111111111111111111111011111L;
    return this;
  }

  public boolean getD1fiocnyps() {
    return (value >> 4 & 1) == 1;
  }

  public StockDay1Mask setD1fiocnyps(boolean d1fiocnyps) {
    if (d1fiocnyps) value |= 0b000000000000000000000000000000000000000000000010000L;
    else value &= 0b111111111111111111111111111111111111111111111101111L;
    return this;
  }

  public boolean getD1pb() {
    return (value >> 3 & 1) == 1;
  }

  public StockDay1Mask setD1pb(boolean d1pb) {
    if (d1pb) value |= 0b000000000000000000000000000000000000000000000001000L;
    else value &= 0b111111111111111111111111111111111111111111111110111L;
    return this;
  }

  public boolean getD1ps() {
    return (value >> 2 & 1) == 1;
  }

  public StockDay1Mask setD1ps(boolean d1ps) {
    if (d1ps) value |= 0b000000000000000000000000000000000000000000000000100L;
    else value &= 0b111111111111111111111111111111111111111111111111011L;
    return this;
  }

  public boolean getD1pe() {
    return (value >> 1 & 1) == 1;
  }

  public StockDay1Mask setD1pe(boolean d1pe) {
    if (d1pe) value |= 0b000000000000000000000000000000000000000000000000010L;
    else value &= 0b111111111111111111111111111111111111111111111111101L;
    return this;
  }

  public boolean getD1pcf() {
    return (value >> 0 & 1) == 1;
  }

  public StockDay1Mask setD1pcf(boolean d1pcf) {
    if (d1pcf) value |= 0b000000000000000000000000000000000000000000000000001L;
    else value &= 0b111111111111111111111111111111111111111111111111110L;
    return this;
  }

  public StockDay1Mask(
      boolean d1id,
      boolean d1stid,
      boolean d1date,
      boolean d1open,
      boolean d1close,
      boolean d1high,
      boolean d1low,
      boolean d1volume,
      boolean d1amount,
      boolean d1totalshare,
      boolean d1flowshare,
      boolean d1factor,
      boolean d1buy1,
      boolean d1sell1,
      boolean d1buy2,
      boolean d1sell2,
      boolean d1buy3,
      boolean d1sell3,
      boolean d1buy4,
      boolean d1sell4,
      boolean d1openpre,
      boolean d1closepre,
      boolean d1highpre,
      boolean d1lowpre,
      boolean d1volumepre,
      boolean d1openpost,
      boolean d1closepost,
      boolean d1highpost,
      boolean d1lowpost,
      boolean d1volumepost,
      boolean d1turnover,
      boolean d1netpercent2,
      boolean d1netpercent3,
      boolean d1netpercent4,
      boolean d1netforce2,
      boolean d1netforce3,
      boolean d1netforce4,
      boolean d1exid,
      boolean d1exname,
      boolean d1fina,
      boolean d1fioiy,
      boolean d1finpey,
      boolean d1fiocny,
      boolean d1finaps,
      boolean d1fioiyps,
      boolean d1finpeyps,
      boolean d1fiocnyps,
      boolean d1pb,
      boolean d1ps,
      boolean d1pe,
      boolean d1pcf) {
    setD1id(d1id);
    setD1stid(d1stid);
    setD1date(d1date);
    setD1open(d1open);
    setD1close(d1close);
    setD1high(d1high);
    setD1low(d1low);
    setD1volume(d1volume);
    setD1amount(d1amount);
    setD1totalshare(d1totalshare);
    setD1flowshare(d1flowshare);
    setD1factor(d1factor);
    setD1buy1(d1buy1);
    setD1sell1(d1sell1);
    setD1buy2(d1buy2);
    setD1sell2(d1sell2);
    setD1buy3(d1buy3);
    setD1sell3(d1sell3);
    setD1buy4(d1buy4);
    setD1sell4(d1sell4);
    setD1openpre(d1openpre);
    setD1closepre(d1closepre);
    setD1highpre(d1highpre);
    setD1lowpre(d1lowpre);
    setD1volumepre(d1volumepre);
    setD1openpost(d1openpost);
    setD1closepost(d1closepost);
    setD1highpost(d1highpost);
    setD1lowpost(d1lowpost);
    setD1volumepost(d1volumepost);
    setD1turnover(d1turnover);
    setD1netpercent2(d1netpercent2);
    setD1netpercent3(d1netpercent3);
    setD1netpercent4(d1netpercent4);
    setD1netforce2(d1netforce2);
    setD1netforce3(d1netforce3);
    setD1netforce4(d1netforce4);
    setD1exid(d1exid);
    setD1exname(d1exname);
    setD1fina(d1fina);
    setD1fioiy(d1fioiy);
    setD1finpey(d1finpey);
    setD1fiocny(d1fiocny);
    setD1finaps(d1finaps);
    setD1fioiyps(d1fioiyps);
    setD1finpeyps(d1finpeyps);
    setD1fiocnyps(d1fiocnyps);
    setD1pb(d1pb);
    setD1ps(d1ps);
    setD1pe(d1pe);
    setD1pcf(d1pcf);
  }

  public StockDay1Mask(long v) {
    value = v;
  }

  public StockDay1Mask() {}

  public StockDay1Mask all(boolean b) {
    setD1id(b);
    setD1stid(b);
    setD1date(b);
    setD1open(b);
    setD1close(b);
    setD1high(b);
    setD1low(b);
    setD1volume(b);
    setD1amount(b);
    setD1totalshare(b);
    setD1flowshare(b);
    setD1factor(b);
    setD1buy1(b);
    setD1sell1(b);
    setD1buy2(b);
    setD1sell2(b);
    setD1buy3(b);
    setD1sell3(b);
    setD1buy4(b);
    setD1sell4(b);
    setD1openpre(b);
    setD1closepre(b);
    setD1highpre(b);
    setD1lowpre(b);
    setD1volumepre(b);
    setD1openpost(b);
    setD1closepost(b);
    setD1highpost(b);
    setD1lowpost(b);
    setD1volumepost(b);
    setD1turnover(b);
    setD1netpercent2(b);
    setD1netpercent3(b);
    setD1netpercent4(b);
    setD1netforce2(b);
    setD1netforce3(b);
    setD1netforce4(b);
    setD1exid(b);
    setD1exname(b);
    setD1fina(b);
    setD1fioiy(b);
    setD1finpey(b);
    setD1fiocny(b);
    setD1finaps(b);
    setD1fioiyps(b);
    setD1finpeyps(b);
    setD1fiocnyps(b);
    setD1pb(b);
    setD1ps(b);
    setD1pe(b);
    setD1pcf(b);
    return this;
  }

  public StockDay1Mask keys(boolean b) {
    setD1id(b);
    return this;
  }

  public StockDay1Mask attributes(boolean b) {
    setD1stid(b);
    setD1date(b);
    setD1open(b);
    setD1close(b);
    setD1high(b);
    setD1low(b);
    setD1volume(b);
    setD1amount(b);
    setD1totalshare(b);
    setD1flowshare(b);
    setD1factor(b);
    setD1buy1(b);
    setD1sell1(b);
    setD1buy2(b);
    setD1sell2(b);
    setD1buy3(b);
    setD1sell3(b);
    setD1buy4(b);
    setD1sell4(b);
    setD1fina(b);
    setD1fioiy(b);
    setD1finpey(b);
    setD1fiocny(b);
    setD1finaps(b);
    setD1fioiyps(b);
    setD1finpeyps(b);
    setD1fiocnyps(b);
    setD1pb(b);
    setD1ps(b);
    setD1pe(b);
    setD1pcf(b);
    return this;
  }

  public StockDay1Mask physicals(boolean b) {
    setD1id(b);
    setD1stid(b);
    setD1date(b);
    setD1open(b);
    setD1close(b);
    setD1high(b);
    setD1low(b);
    setD1volume(b);
    setD1amount(b);
    setD1totalshare(b);
    setD1flowshare(b);
    setD1factor(b);
    setD1buy1(b);
    setD1sell1(b);
    setD1buy2(b);
    setD1sell2(b);
    setD1buy3(b);
    setD1sell3(b);
    setD1buy4(b);
    setD1sell4(b);
    setD1fina(b);
    setD1fioiy(b);
    setD1finpey(b);
    setD1fiocny(b);
    setD1finaps(b);
    setD1fioiyps(b);
    setD1finpeyps(b);
    setD1fiocnyps(b);
    setD1pb(b);
    setD1ps(b);
    setD1pe(b);
    setD1pcf(b);
    return this;
  }

  public StockDay1Mask virtuals(boolean b) {
    setD1openpre(b);
    setD1closepre(b);
    setD1highpre(b);
    setD1lowpre(b);
    setD1volumepre(b);
    setD1openpost(b);
    setD1closepost(b);
    setD1highpost(b);
    setD1lowpost(b);
    setD1volumepost(b);
    setD1turnover(b);
    setD1netpercent2(b);
    setD1netpercent3(b);
    setD1netpercent4(b);
    setD1netforce2(b);
    setD1netforce3(b);
    setD1netforce4(b);
    setD1exid(b);
    setD1exname(b);
    return this;
  }

  public boolean get(String p) {
    switch (p) {
      case "d1id":
        return getD1id();
      case "d1stid":
        return getD1stid();
      case "d1date":
        return getD1date();
      case "d1open":
        return getD1open();
      case "d1close":
        return getD1close();
      case "d1high":
        return getD1high();
      case "d1low":
        return getD1low();
      case "d1volume":
        return getD1volume();
      case "d1amount":
        return getD1amount();
      case "d1totalshare":
        return getD1totalshare();
      case "d1flowshare":
        return getD1flowshare();
      case "d1factor":
        return getD1factor();
      case "d1buy1":
        return getD1buy1();
      case "d1sell1":
        return getD1sell1();
      case "d1buy2":
        return getD1buy2();
      case "d1sell2":
        return getD1sell2();
      case "d1buy3":
        return getD1buy3();
      case "d1sell3":
        return getD1sell3();
      case "d1buy4":
        return getD1buy4();
      case "d1sell4":
        return getD1sell4();
      case "d1openpre":
        return getD1openpre();
      case "d1closepre":
        return getD1closepre();
      case "d1highpre":
        return getD1highpre();
      case "d1lowpre":
        return getD1lowpre();
      case "d1volumepre":
        return getD1volumepre();
      case "d1openpost":
        return getD1openpost();
      case "d1closepost":
        return getD1closepost();
      case "d1highpost":
        return getD1highpost();
      case "d1lowpost":
        return getD1lowpost();
      case "d1volumepost":
        return getD1volumepost();
      case "d1turnover":
        return getD1turnover();
      case "d1netpercent2":
        return getD1netpercent2();
      case "d1netpercent3":
        return getD1netpercent3();
      case "d1netpercent4":
        return getD1netpercent4();
      case "d1netforce2":
        return getD1netforce2();
      case "d1netforce3":
        return getD1netforce3();
      case "d1netforce4":
        return getD1netforce4();
      case "d1exid":
        return getD1exid();
      case "d1exname":
        return getD1exname();
      case "d1fina":
        return getD1fina();
      case "d1fioiy":
        return getD1fioiy();
      case "d1finpey":
        return getD1finpey();
      case "d1fiocny":
        return getD1fiocny();
      case "d1finaps":
        return getD1finaps();
      case "d1fioiyps":
        return getD1fioiyps();
      case "d1finpeyps":
        return getD1finpeyps();
      case "d1fiocnyps":
        return getD1fiocnyps();
      case "d1pb":
        return getD1pb();
      case "d1ps":
        return getD1ps();
      case "d1pe":
        return getD1pe();
      case "d1pcf":
        return getD1pcf();
    }
    return false;
  }

  public StockDay1Mask set(String p, boolean b) {
    switch (p) {
      case "d1id":
        setD1id(b);
        break;
      case "d1stid":
        setD1stid(b);
        break;
      case "d1date":
        setD1date(b);
        break;
      case "d1open":
        setD1open(b);
        break;
      case "d1close":
        setD1close(b);
        break;
      case "d1high":
        setD1high(b);
        break;
      case "d1low":
        setD1low(b);
        break;
      case "d1volume":
        setD1volume(b);
        break;
      case "d1amount":
        setD1amount(b);
        break;
      case "d1totalshare":
        setD1totalshare(b);
        break;
      case "d1flowshare":
        setD1flowshare(b);
        break;
      case "d1factor":
        setD1factor(b);
        break;
      case "d1buy1":
        setD1buy1(b);
        break;
      case "d1sell1":
        setD1sell1(b);
        break;
      case "d1buy2":
        setD1buy2(b);
        break;
      case "d1sell2":
        setD1sell2(b);
        break;
      case "d1buy3":
        setD1buy3(b);
        break;
      case "d1sell3":
        setD1sell3(b);
        break;
      case "d1buy4":
        setD1buy4(b);
        break;
      case "d1sell4":
        setD1sell4(b);
        break;
      case "d1openpre":
        setD1openpre(b);
        break;
      case "d1closepre":
        setD1closepre(b);
        break;
      case "d1highpre":
        setD1highpre(b);
        break;
      case "d1lowpre":
        setD1lowpre(b);
        break;
      case "d1volumepre":
        setD1volumepre(b);
        break;
      case "d1openpost":
        setD1openpost(b);
        break;
      case "d1closepost":
        setD1closepost(b);
        break;
      case "d1highpost":
        setD1highpost(b);
        break;
      case "d1lowpost":
        setD1lowpost(b);
        break;
      case "d1volumepost":
        setD1volumepost(b);
        break;
      case "d1turnover":
        setD1turnover(b);
        break;
      case "d1netpercent2":
        setD1netpercent2(b);
        break;
      case "d1netpercent3":
        setD1netpercent3(b);
        break;
      case "d1netpercent4":
        setD1netpercent4(b);
        break;
      case "d1netforce2":
        setD1netforce2(b);
        break;
      case "d1netforce3":
        setD1netforce3(b);
        break;
      case "d1netforce4":
        setD1netforce4(b);
        break;
      case "d1exid":
        setD1exid(b);
        break;
      case "d1exname":
        setD1exname(b);
        break;
      case "d1fina":
        setD1fina(b);
        break;
      case "d1fioiy":
        setD1fioiy(b);
        break;
      case "d1finpey":
        setD1finpey(b);
        break;
      case "d1fiocny":
        setD1fiocny(b);
        break;
      case "d1finaps":
        setD1finaps(b);
        break;
      case "d1fioiyps":
        setD1fioiyps(b);
        break;
      case "d1finpeyps":
        setD1finpeyps(b);
        break;
      case "d1fiocnyps":
        setD1fiocnyps(b);
        break;
      case "d1pb":
        setD1pb(b);
        break;
      case "d1ps":
        setD1ps(b);
        break;
      case "d1pe":
        setD1pe(b);
        break;
      case "d1pcf":
        setD1pcf(b);
        break;
    }
    return this;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
