package tdl._0716;


public class Example01 {

  public static double calc(Function function){
    double x = 30;
    double y = 3;
    return function.apply(x,y);
  }

  public static void main(String[] args) {
    double result = calc((x,y)->(x/y));
    System.out.println("result = " + result);

  }

  @FunctionalInterface interface Function<Double>{
    double apply(double a, double b);
  }


}