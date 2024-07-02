package _0702_interface.prob01;

public abstract class Animal {
  int speed;
  double distance;

  public Animal(int speed) {
    this.speed = speed;
  }


  abstract void run(int hours);

  public double getDistance(){
    return distance;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }
}
