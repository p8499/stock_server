package p8499.stock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilterLogicExpr implements FilterExpr {
  public static final String OP_AND = "and";
  public static final String OP_OR = "or";
  public static final String OP_NOT = "not";

  public String op = null;
  public List<FilterExpr> data = null;

  public FilterLogicExpr() {
    op = OP_AND;
    data = new ArrayList<FilterExpr>();
  }

  public FilterLogicExpr(FilterExpr... data) {
    this(OP_AND, data);
  }

  public FilterLogicExpr(String op, FilterExpr... data) {
    this.op = op;
    this.data = new ArrayList<FilterExpr>();
    for (FilterExpr datum : data) if (datum != null) this.data.add(datum);
  }

  public FilterLogicExpr not() {
    return new FilterLogicExpr(FilterLogicExpr.OP_NOT, this);
  }

  public FilterLogicExpr append(FilterExpr e) {
    data.add(e);
    return this;
  }

  public FilterLogicExpr equalsString(String field, String value) {
    append(FilterConditionExpr.equalsString(field, value));
    return this;
  }

  public FilterLogicExpr containsString(String field, String value) {
    append(FilterConditionExpr.containsString(field, value));
    return this;
  }

  public FilterLogicExpr startString(String field, String value) {
    append(FilterConditionExpr.startString(field, value));
    return this;
  }

  public FilterLogicExpr endString(String field, String value) {
    append(FilterConditionExpr.endString(field, value));
    return this;
  }

  public FilterLogicExpr equalsDate(String field, Date value) {
    append(FilterConditionExpr.equalsDate(field, value));
    return this;
  }

  public FilterLogicExpr gtDate(String field, Date value) {
    append(FilterConditionExpr.gtDate(field, value));
    return this;
  }

  public FilterLogicExpr geDate(String field, Date value) {
    append(FilterConditionExpr.geDate(field, value));
    return this;
  }

  public FilterLogicExpr ltDate(String field, Date value) {
    append(FilterConditionExpr.ltDate(field, value));
    return this;
  }

  public FilterLogicExpr leDate(String field, Date value) {
    append(FilterConditionExpr.leDate(field, value));
    return this;
  }

  public FilterLogicExpr equalsDateTime(String field, Date value) {
    append(FilterConditionExpr.equalsDateTime(field, value));
    return this;
  }

  public FilterLogicExpr gtDateTime(String field, Date value) {
    append(FilterConditionExpr.gtDateTime(field, value));
    return this;
  }

  public FilterLogicExpr geDateTime(String field, Date value) {
    append(FilterConditionExpr.geDateTime(field, value));
    return this;
  }

  public FilterLogicExpr ltDateTime(String field, Date value) {
    append(FilterConditionExpr.ltDateTime(field, value));
    return this;
  }

  public FilterLogicExpr leDateTime(String field, Date value) {
    append(FilterConditionExpr.leDateTime(field, value));
    return this;
  }

  public FilterLogicExpr equalsNumber(String field, Integer value) {
    append(FilterConditionExpr.equalsNumber(field, value));
    return this;
  }

  public FilterLogicExpr gtNumber(String field, Integer value) {
    append(FilterConditionExpr.gtNumber(field, value));
    return this;
  }

  public FilterLogicExpr geNumber(String field, Integer value) {
    append(FilterConditionExpr.geNumber(field, value));
    return this;
  }

  public FilterLogicExpr ltNumber(String field, Integer value) {
    append(FilterConditionExpr.ltNumber(field, value));
    return this;
  }

  public FilterLogicExpr leNumber(String field, Integer value) {
    append(FilterConditionExpr.leNumber(field, value));
    return this;
  }

  public FilterLogicExpr isEmpty(String field) {
    append(FilterConditionExpr.isEmpty(field));
    return this;
  }

  public FilterLogicExpr equalsField(String field1, String field2) {
    append(FilterConditionExpr.equalsField(field1, field2));
    return this;
  }

  public FilterLogicExpr existsObject(String obj, FilterLogicExpr expr) {
    append(FilterConditionExpr.existsObject(obj, expr));
    return this;
  }

  public String toStringPostgresql() {
    if (op == null) {
      return null;
    } else {
      StringBuilder sb = new StringBuilder();
      switch (op) {
        case OP_AND:
          {
            for (int i = 0; i < data.size(); i++) {
              sb.append("(");
              sb.append(data.get(i).toStringPostgresql());
              sb.append(")");
              if (i < data.size() - 1) {
                sb.append(" AND ");
              }
            }
            break;
          }
        case OP_OR:
          {
            for (int i = 0; i < data.size(); i++) {
              sb.append("(");
              sb.append(data.get(i).toStringPostgresql());
              sb.append(")");
              if (i < data.size() - 1) {
                sb.append(" OR ");
              }
            }
            break;
          }
        case OP_NOT:
          {
            sb.append("NOT ");
            sb.append("(");
            sb.append(data.get(0).toStringPostgresql());
            sb.append(")");
            break;
          }
      }
      return sb.toString();
    }
  }

  public String toStringOracle() {
    if (op == null) {
      return null;
    } else {
      StringBuilder sb = new StringBuilder();
      switch (op) {
        case OP_AND:
          {
            for (int i = 0; i < data.size(); i++) {
              sb.append("(");
              sb.append(data.get(i).toStringOracle());
              sb.append(")");
              if (i < data.size() - 1) {
                sb.append(" AND ");
              }
            }
            break;
          }
        case OP_OR:
          {
            for (int i = 0; i < data.size(); i++) {
              sb.append("(");
              sb.append(data.get(i).toStringOracle());
              sb.append(")");
              if (i < data.size() - 1) {
                sb.append(" OR ");
              }
            }
            break;
          }
        case OP_NOT:
          {
            sb.append("NOT ");
            sb.append("(");
            sb.append(data.get(0).toStringOracle());
            sb.append(")");
            break;
          }
      }
      return sb.toString();
    }
  }
}
