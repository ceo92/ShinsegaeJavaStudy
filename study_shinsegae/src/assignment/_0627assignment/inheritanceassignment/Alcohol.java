package _0627assignment.inheritanceassignment;

public class Alcohol extends Drink{

  private double alcper;
  public Alcohol(String name, int price, int count , double alcper) {
    super(name, price, count);
    this.alcper = alcper;
  }

  public double getAlcper() {
    return alcper;
  }

  public void setAlcper(double alcper) {
    this.alcper = alcper;
  }

  @Override
  public void printData() {
    System.out.println(getName()+"("+getAlcper()+")"+"\t\t"+getPrice()+"\t"+getCount()+"\t"+getTotalPrice());

  }

  public static void printTitle() {
    System.out.println("상품명(도수[%])\t단가\t수량\t금액");
  }

}
