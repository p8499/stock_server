package p8499.stock;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonDeserialize(using = FilterDeserializer.class)
@JsonSerialize(using = FilterSerializer.class)
public interface FilterExpr {
  String toStringPostgresql();

  String toStringOracle();

  String OP = "op";
  String DATA = "data";
}
