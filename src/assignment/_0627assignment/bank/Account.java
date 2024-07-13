package assignment._0627assignment.bank;

public class Account {

  @Override
  public String toString() {
    return getAccountNum() + "\t\t" + getName() + "\t\t" + getMoney();
  }

  private String accountNum;
  private String name;
  private int money;

  public Account(String accountNum, String name, int money) {
    this.accountNum = accountNum;
    this.name = name;
    this.money = money;
  }

  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public void addMoney(int money){
    this.money += money;
  }

  public void removeMoney(int money){
    int difference = this.money - money;
    if (difference <0){
      throw new IllegalStateException("잔액이 부족합니다");
    }
    this.money = difference;
  }


}
