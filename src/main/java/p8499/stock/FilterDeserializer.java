package p8499.stock;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.Arrays;

public class FilterDeserializer extends JsonDeserializer<FilterExpr> {
  @Override
  public FilterExpr deserialize(JsonParser parser, DeserializationContext context)
      throws IOException, JsonProcessingException {
    JsonNode node = parser.getCodec().readTree(parser);
    return recursiveDeserialize(node);
  }

  protected FilterExpr recursiveDeserialize(JsonNode node) {
    JsonNode opNode = node.get("o");
    JsonNode dataNode = node.get("d");
    if (Arrays.asList("a", "b", "c").contains(opNode.asText())) {
      FilterLogicExpr expr = new FilterLogicExpr();
      expr.op =
          "a".equals(opNode.asText())
              ? FilterLogicExpr.OP_AND
              : "b".equals(opNode.asText())
                  ? FilterLogicExpr.OP_OR
                  : "c".equals(opNode.asText()) ? FilterLogicExpr.OP_NOT : opNode.asText();
      for (JsonNode datumNode : dataNode) {
        expr.data.add(recursiveDeserialize(datumNode));
      }
      return expr;
    } else if (Arrays.asList("d", "e", "f", "g", "h", "i", "j", "k", "l", "m")
        .contains(opNode.asText())) {
      FilterConditionExpr expr = new FilterConditionExpr();
      expr.op =
          "d".equals(opNode.asText())
              ? FilterConditionExpr.OP_EQUAL
              : "e".equals(opNode.asText())
                  ? FilterConditionExpr.OP_GREATER
                  : "f".equals(opNode.asText())
                      ? FilterConditionExpr.OP_LESS
                      : "g".equals(opNode.asText())
                          ? FilterConditionExpr.OP_GREATEREQUAL
                          : "h".equals(opNode.asText())
                              ? FilterConditionExpr.OP_LESSEQUAL
                              : "i".equals(opNode.asText())
                                  ? FilterConditionExpr.OP_ISEMPTY
                                  : "j".equals(opNode.asText())
                                      ? FilterConditionExpr.OP_CONTAIN
                                      : "k".equals(opNode.asText())
                                          ? FilterConditionExpr.OP_STARTWITH
                                          : "l".equals(opNode.asText())
                                              ? FilterConditionExpr.OP_ENDWITH
                                              : "m".equals(opNode.asText())
                                                  ? FilterConditionExpr.OP_EXISTS
                                                  : opNode.asText();
      for (JsonNode datumNode : dataNode) {
        expr.data.add(recursiveDeserialize(datumNode));
      }
      return expr;
    } else if (Arrays.asList("o", "p", "q", "r", "s", "t", "u", "v").contains(opNode.asText())) {
      FilterOperandExpr expr = new FilterOperandExpr();
      expr.op =
          "o".equals(opNode.asText())
              ? FilterOperandExpr.OP_FIELD
              : "p".equals(opNode.asText())
                  ? FilterOperandExpr.OP_DATEFIELD
                  : "q".equals(opNode.asText())
                      ? FilterOperandExpr.OP_DATETIMEFIELD
                      : "r".equals(opNode.asText())
                          ? FilterOperandExpr.OP_BEAN
                          : "s".equals(opNode.asText())
                              ? FilterOperandExpr.OP_STRING
                              : "t".equals(opNode.asText())
                                  ? FilterOperandExpr.OP_NUMBER
                                  : "u".equals(opNode.asText())
                                      ? FilterOperandExpr.OP_DATE
                                      : "v".equals(opNode.asText())
                                          ? FilterOperandExpr.OP_DATETIME
                                          : opNode.asText();
      expr.data = dataNode.asText();
      return expr;
    } else return null;
  }
}
