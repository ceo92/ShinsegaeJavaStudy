package _0701_inheritance_assignment.prob02;

public class TestShape {

  public static void main(String[] args) {
    Shape[] shape = new Shape[2];
    shape[0] = new Circle("원" , 10);
    shape[1] = new Rectangular("직사각형",10,20);
    shape[0].calculationArea();
    shape[1].calculationArea();

  }

}
