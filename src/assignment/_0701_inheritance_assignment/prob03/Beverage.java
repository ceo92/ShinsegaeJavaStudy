package assignment._0701_inheritance_assignment.prob03;

public abstract class Beverage {
    private String name;
    protected int price;


  public Beverage(String name) {
    this.name = name;
  }

  abstract void calcPrice();
  void print(){

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}


class Coffee extends Beverage{
  static int amount;

  public Coffee(String name) {
    super(name);
    amount++;
    calcPrice();
  }

  @Override
  public String toString() {
    return amount+"번째 판매 음료는 "+getName()+"이며, 가격은 "+price;

  }

  @Override
  void calcPrice() {
    if (getName().equals("Americano")){
      price = 1500;
    }
    else if (getName().equals("CafeLatte")){
      price=2500;
    }
    else if(getName().equals("Cappuccino")){
      price=3000;
    }
  }
}

class Tea extends Beverage{
  static int amount;

  public Tea(String name) {
    super(name);
    amount++;
    calcPrice();
  }
  @Override
  public String toString() {
    return amount+"번째 판매 음료는 "+getName()+"이며, 가격은 "+price;

  }

  @Override
  void calcPrice() {
    if (getName().equals("lemonTea")){
      price = 1500;
    }
    else if (getName().equals("ginsengTea")){
      price=2000;
    }
    else if(getName().equals("redginsengTea")){
      price=2500;
    }

  }
}
