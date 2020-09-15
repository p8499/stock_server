package p8499.stock;

public class FilterOperandExpr implements FilterExpr {
  public static final String OP_FIELD = "field";
  public static final String OP_DATEFIELD = "datefield";
  public static final String OP_DATETIMEFIELD = "datetimefield";
  public static final String OP_BEAN = "bean";
  public static final String OP_STRING = "string";
  public static final String OP_NUMBER = "number";
  public static final String OP_DATE = "date";
  public static final String OP_DATETIME = "datetime";

  public String op = null;
  public String data = null;

  public FilterOperandExpr() {}

  public FilterOperandExpr(String op, String data) {
    this.op = op;
    this.data = data;
  }

  public String toStringPostgresql() {
    switch (op) {
      case OP_FIELD:
        return data;
      case OP_DATEFIELD:
        return String.format("date_trunc('day',%s)", data);
      case OP_DATETIMEFIELD:
        return String.format("date_trunc('second',%s)", data);
      case OP_BEAN:
        return tableOf(data);
      case OP_STRING:
        return String.format("'%s'", parseEscapedStringPostgresql(data));
      case OP_NUMBER:
        return data;
      case OP_DATE:
        return String.format("to_date('%s','yyyymmdd')", data);
      case OP_DATETIME:
        return String.format("to_timestamp('%s','yyyymmddhh24miss')", data);
      default:
        return data;
    }
  }

  public String toStringOracle() {
    switch (op) {
      case OP_FIELD:
        return data;
      case OP_DATEFIELD:
        return String.format("trunc(%s,'dd')", data);
      case OP_DATETIMEFIELD:
        return data;
      case OP_BEAN:
        return tableOf(data);
      case OP_STRING:
        return String.format("'%s'", parseEscapedStringOracle(data));
      case OP_NUMBER:
        return data;
      case OP_DATE:
        return String.format("to_date('%s','yyyymmdd')", data);
      case OP_DATETIME:
        return String.format("to_date('%s','yyyymmddhh24miss')", data);
      default:
        return data;
    }
  }

  private static String tableOf(String name) {
    switch (OP_BEAN) {
      case "EMPLOYEE":
        return "F0101";
      case "PRODUCT":
        return "F0401";
      case "RECORD":
        return "F4211";
      default:
        return "";
    }
  }

  private static String parseEscapedStringPostgresql(String raw) {
    //String escaped=raw.replaceAll("\0","\\0").replaceAll("\n","\\n").replaceAll("\t","\\t").replaceAll("\r","\\r").replaceAll("\b","\\b").replaceAll("'","\\'").replaceAll("\\","\\\\");
    return raw.replace("'", "\\\\'").replaceAll("\\\\", "\\\\\\\\");
  }

  private static String parseEscapedStringOracle(String raw) {
    //String escaped=raw.replaceAll("\0","\\0").replaceAll("\n","\\n").replaceAll("\t","\\t").replaceAll("\r","\\r").replaceAll("\b","\\b").replaceAll("'","\\'").replaceAll("\\","\\\\");
    return raw.replace("'", "''");
  }

  private static String parseWildEscapedStringPostgresql(String raw) {
    //String escaped=raw.replaceAll("\0","\\0").replaceAll("\n","\\n").replaceAll("\t","\\t").replaceAll("\r","\\r").replaceAll("\b","\\b").replaceAll("'","\\'").replaceAll("\\","\\\\").replaceAll("%","\\%").replaceAll("_","\\_");
    return raw.replace("'", "\\\\'")
        .replaceAll("\\\\", "\\\\\\\\")
        .replaceAll("%", "\\\\%")
        .replaceAll("_", "\\\\_");
  }

  private static String parseWildEscapedStringOracle(String raw) {
    //String escaped=raw.replaceAll("\0","\\0").replaceAll("\n","\\n").replaceAll("\t","\\t").replaceAll("\r","\\r").replaceAll("\b","\\b").replaceAll("'","\\'").replaceAll("\\","\\\\").replaceAll("%","\\%").replaceAll("_","\\_");
    return raw.replace("'", "''")
        .replaceAll("\\\\", "\\\\\\\\")
        .replaceAll("%", "\\\\%")
        .replaceAll("_", "\\\\_");
  }

  private boolean isEscapedOracle() {
    return data.contains("%") || data.contains("\\") || data.contains("_");
  }

  String toEscapedStartWithSqlPostgresql() {
    StringBuilder sb = new StringBuilder();
    if (OP_STRING.equals(op)) {
      sb.append("'");
      sb.append(parseWildEscapedStringPostgresql(data));
      sb.append("%'");
    }
    return sb.toString();
  }

  String toEscapedStartWithSqlOracle() {
    StringBuilder sb = new StringBuilder();
    if (OP_STRING.equals(op)) {
      sb.append("'");
      sb.append(parseWildEscapedStringOracle(data));
      sb.append("%'");
      if (isEscapedOracle()) sb.append(" escape '\\'");
    }
    return sb.toString();
  }

  String toEscapedEndWithSqlPostgresql() {
    StringBuilder sb = new StringBuilder();
    if (OP_STRING.equals(op)) {
      sb.append("'%");
      sb.append(parseWildEscapedStringPostgresql(data));
      sb.append("'");
    }
    return sb.toString();
  }

  String toEscapedEndWithSqlOracle() {
    StringBuilder sb = new StringBuilder();
    if (OP_STRING.equals(op)) {
      sb.append("'%");
      sb.append(parseWildEscapedStringOracle(data));
      sb.append("'");
      if (isEscapedOracle()) sb.append(" escape '\\'");
    }
    return sb.toString();
  }

  String toEscapedContainSqlPostgresql() {
    StringBuilder sb = new StringBuilder();
    if (OP_STRING.equals(op)) {
      sb.append("'%");
      sb.append(parseWildEscapedStringPostgresql(data));
      sb.append("%'");
    }
    return sb.toString();
  }

  String toEscapedContainSqlOracle() {
    StringBuilder sb = new StringBuilder();
    if (OP_STRING.equals(op)) {
      sb.append("'%");
      sb.append(parseWildEscapedStringOracle(data));
      sb.append("%'");
      if (isEscapedOracle()) sb.append(" escape '\\'");
    }
    return sb.toString();
  }
}
