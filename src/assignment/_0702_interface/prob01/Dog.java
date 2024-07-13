package assignment._0702_interface.prob01;

public class Dog extends Animal{

  public Dog(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    this.distance = (hours * speed*0.5);
    System.out.println("개의 이동거리 = "+getDistance());

  }

}
