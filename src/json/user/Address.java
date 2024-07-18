package json.user;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * VO
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter(AccessLevel.PRIVATE)
@ToString
public class Address {


  private String jibun;
  private String roadAddress;
  private String zipcode;

}
