package assignment._0709_exception.prob0;

import java.util.Objects;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Vehicle {
  private Owner owner;
  private int price;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(getOwner(), vehicle.getOwner());
  }


  @Override
  public int hashCode() {
    return Objects.hash(getOwner(), getPrice());
  }

  @Override
  public String toString() {
    return "소유주정보 : 이름은 "+owner.getName()+"이고, 핸드폰 번호는" +owner.getCellPhone()+"입니다.\n차량정보 : 가격은 "+getPrice()+"입니다.";

  }


}
