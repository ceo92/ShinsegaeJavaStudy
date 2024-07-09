package _0709_exception;

public class CellPhone {
  private String model; //핸드폰 모델 번호
  private double battery; //남은 베터리 양
  public CellPhone(String model) {
    this.model = model;
  }

  public void call(int time) {
    double decreaseQuantity = time*0.5;
    if (battery - decreaseQuantity >= 0) {
      if (time < 0) {
        throw new IllegalArgumentException("통화시간입력오류");
      }
      battery = battery - decreaseQuantity;

    }
    else{
      battery = 0;
    }
    System.out.println("통화 시간 : "+time+"분");

  }

  public void charge(int time) {
    double chargeQuantity = time * 3;
    if (battery + chargeQuantity <= 100) {
      if (time < 0) {
        throw new IllegalArgumentException("충전시간입력오류");
      }
      battery = battery + chargeQuantity;

    }
    else{
      battery = 100;
    }
    System.out.println("충전 시간 : "+time+"분");


  }

  public void printBattery() {

    System.out.println("남은 배터리 양 : " + getBattery());

  }


  /**
   * getter , setter
   */

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getBattery() {
    return battery;
  }

  public void setBattery(double battery) {
    this.battery = battery;
  }
}
