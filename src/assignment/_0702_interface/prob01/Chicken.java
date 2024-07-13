package assignment._0702_interface.prob01;

public class Chicken extends Animal implements Cheatable{

  public Chicken(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    this.distance = hours*speed;
    System.out.println("닭의 이동거리 = " + getDistance());
  }


  @Override
  public void fly() {
    this.speed = speed * 2;
    setSpeed(speed*2);
    System.out.println(getDistance());

  }

}
