package assignment._0701_inheritance_assignment.prob02;

public abstract class Shape {

  protected double area;
  private String name;

  public Shape(){}

  public Shape(String name){
    this.name=name;
  }

  abstract void calculationArea();

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  void print(){
    System.out.println(name+"의 면적은 "+area);
  }
}

class Circle extends Shape{
  private double radius;

  public Circle(String name , double radius) {
    super(name);
    this.radius = radius;
  }

  public Circle() {
  }



  void calculationArea() {
    area = radius * radius * Math.PI;
    print();
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}

class Rectangular extends Shape{
  private double width;
  private int height;

  public Rectangular() {
  }

  @Override
  void calculationArea() {
    area =  width * height;
    print();
  }

  public Rectangular(String name , double width, int height) {
    super(name);
    this.width = width;
    this.height = height;

  }
}