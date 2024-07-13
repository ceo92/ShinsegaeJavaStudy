package assignment._0709_exception.prob0;


import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Owner {
  private String name;
  private String cellPhone;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Owner owner = (Owner) o;
    return Objects.equals(getName(), owner.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getCellPhone());
  }

  @Override
  public String toString() {
    return "소유주정보 : 이름은 "+name+"이고, 핸드폰 번호는" +cellPhone+"입니다.";
  }
}
