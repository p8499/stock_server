package p8499.stock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DefaultDateFormatter {
  private static SimpleDateFormat _DATE_FORMATTER;
  private static SimpleDateFormat _DATETIME_FORMATTER;

  private static SimpleDateFormat getDateFormatter() {
    if (_DATE_FORMATTER == null) _DATE_FORMATTER = new SimpleDateFormat("yyyyMMdd");
    return _DATE_FORMATTER;
  }

  private static SimpleDateFormat getDateTimeFormatter() {
    if (_DATETIME_FORMATTER == null) _DATETIME_FORMATTER = new SimpleDateFormat("yyyyMMddHHmmss");
    return _DATETIME_FORMATTER;
  }

  public static String formatDate(Date date) {
    return date == null ? null : getDateFormatter().format(date);
  }

  public static String formatDateTime(Date date) {
    return date == null ? null : getDateTimeFormatter().format(date);
  }

  public static Date parseDate(String str) {
    Date date = null;
    try {
      date = str == null ? null : getDateFormatter().parse(str);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return date;
  }

  public static Date parseDateTime(String str) {
    Date date = null;
    try {
      date = str == null ? null : getDateTimeFormatter().parse(str);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return date;
  }
}
