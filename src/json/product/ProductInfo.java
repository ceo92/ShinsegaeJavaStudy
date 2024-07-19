package json.product;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductInfo {

  private String color;
  private int size;


}
