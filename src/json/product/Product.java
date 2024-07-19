package json.product;


import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
public class Product {

  private int productNo;
  private String productName;
  private ProductInfo extraProductInfo;
  private List<String> itemList;




}
