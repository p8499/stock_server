package p8499.stock;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class FilterSerializer extends JsonSerializer<FilterExpr> {
  @Override
  public void serialize(FilterExpr expr, JsonGenerator generator, SerializerProvider provider)
      throws IOException {
    if (expr != null) recursiveSerialize(expr, generator);
  }

  private void recursiveSerialize(FilterExpr expr, JsonGenerator generator) throws IOException {
    generator.writeStartObject();
    if (expr instanceof FilterLogicExpr) {
      FilterLogicExpr logic = (FilterLogicExpr) expr;
      generator.writeFieldName("o");
      String op =
          FilterLogicExpr.OP_AND.equals(logic.op)
              ? "a"
              : FilterLogicExpr.OP_OR.equals(logic.op)
                  ? "b"
                  : FilterLogicExpr.OP_NOT.equals(logic.op) ? "c" : logic.op;
      generator.writeString(op);
      generator.writeFieldName("d");
      generator.writeStartArray();
      for (FilterExpr datum : logic.data) {
        recursiveSerialize(datum, generator);
      }
      generator.writeEndArray();
    } else if (expr instanceof FilterConditionExpr) {
      FilterConditionExpr condition = (FilterConditionExpr) expr;
      generator.writeFieldName("o");
      String op =
          FilterConditionExpr.OP_EQUAL.equals(condition.op)
              ? "d"
              : FilterConditionExpr.OP_GREATER.equals(condition.op)
                  ? "e"
                  : FilterConditionExpr.OP_LESS.equals(condition.op)
                      ? "f"
                      : FilterConditionExpr.OP_GREATEREQUAL.equals(condition.op)
                          ? "g"
                          : FilterConditionExpr.OP_LESSEQUAL.equals(condition.op)
                              ? "h"
                              : FilterConditionExpr.OP_ISEMPTY.equals(condition.op)
                                  ? "i"
                                  : FilterConditionExpr.OP_CONTAIN.equals(condition.op)
                                      ? "j"
                                      : FilterConditionExpr.OP_STARTWITH.equals(condition.op)
                                          ? "k"
                                          : FilterConditionExpr.OP_ENDWITH.equals(condition.op)
                                              ? "l"
                                              : FilterConditionExpr.OP_EXISTS.equals(condition.op)
                                                  ? "m"
                                                  : condition.op;
      generator.writeString(op);
      generator.writeFieldName("d");
      generator.writeStartArray();
      for (FilterExpr datum : condition.data) {
        recursiveSerialize(datum, generator);
      }
      generator.writeEndArray();
    } else if (expr instanceof FilterOperandExpr) {
      FilterOperandExpr operand = (FilterOperandExpr) expr;
      generator.writeFieldName("o");
      String op =
          FilterOperandExpr.OP_FIELD.equals(operand.op)
              ? "o"
              : FilterOperandExpr.OP_DATEFIELD.equals(operand.op)
                  ? "p"
                  : FilterOperandExpr.OP_DATETIMEFIELD.equals(operand.op)
                      ? "q"
                      : FilterOperandExpr.OP_BEAN.equals(operand.op)
                          ? "r"
                          : FilterOperandExpr.OP_STRING.equals(operand.op)
                              ? "s"
                              : FilterOperandExpr.OP_NUMBER.equals(operand.op)
                                  ? "t"
                                  : FilterOperandExpr.OP_DATE.equals(operand.op)
                                      ? "u"
                                      : FilterOperandExpr.OP_DATETIME.equals(operand.op)
                                          ? "v"
                                          : operand.op;
      generator.writeString(op);
      generator.writeFieldName("d");
      generator.writeString(operand.data);
    }
    generator.writeEndObject();
  }
}
