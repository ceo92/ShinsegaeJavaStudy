package json.user;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * 정의부 : Domain
 */
@AllArgsConstructor
@ToString
public class User {
  private String name;
  private int age;
  private boolean isMarried;
  private List<String> hobbies = new ArrayList<>();
  private Address address;



}
