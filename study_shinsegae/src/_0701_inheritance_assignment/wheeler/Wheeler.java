package _0701_inheritance_assignment.wheeler;

public abstract class Wheeler {

  protected int velocity;
  protected String carName;
  protected int wheelNumber;

  abstract void speedUp(int speed);

  abstract void speedDown(int speed);

  public void stop(){
    velocity = 0;
    System.out.println("정지상태로 속도를"+velocity+"으로 초기화합니다.");
  }



}
class Truck extends Wheeler{

  public Truck(String carName , int velocity , int wheelNumber) {
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
    System.out.println("트럭 : 바퀴 "+wheelNumber+"개입니다.");
  }

  @Override
  void speedUp(int speed) {
    velocity += speed*5;
    if (velocity > 100){
      velocity=100;
    }
    System.out.println("트럭의 현재 속도는 "+velocity+" 입니다");
  }

  @Override
  void speedDown(int speed) {
      velocity -= speed*5;
      if (velocity<50){
        velocity=50;
        System.out.println("트럭의 최저속도위반으로 속도를"+velocity+"으로 올립니다.");
      }
    System.out.println("트럭의 현재 속도는 "+velocity+" 입니다.");
  }
}

class Bike extends Wheeler{

  public Bike(String carName , int velocity , int wheelNumber) {
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
    System.out.println("자전거 : 바퀴 "+wheelNumber+"개입니다.");
  }

  @Override
  void speedUp(int speed) {
    velocity += speed;
    if (velocity > 40){
      velocity=40;
    }
    System.out.println("자전거의 현재 속도는 "+velocity+" 입니다.");
  }

  @Override
  void speedDown(int speed) {
    velocity -= speed;
    if (velocity < 10){
      velocity=10;
      System.out.println("자전거의 최저속도위반으로 속도를"+velocity+"으로 올립니다.");
    }
    System.out.println("자전거의 현재 속도는 "+velocity+" 입니다.");
  }
}

