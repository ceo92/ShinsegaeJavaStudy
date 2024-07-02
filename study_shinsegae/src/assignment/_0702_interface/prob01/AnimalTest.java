package _0702_interface.prob01;

public class AnimalTest {

  public static void main(String[] args) {
    Animal dog = new Dog(8);
    Animal chicken = new Chicken(3);
    Chicken cheatableChicken = new Chicken(5);

    for (int i=1 ; i<4 ; i++){
      System.out.println(i+"시간 후");
      dog.run(i);
      chicken.run(i);
      if (cheatableChicken instanceof Cheatable){
        cheatableChicken.fly();
        cheatableChicken.setDistance(10* i);
        System.out.println("날으는 닭의 이동거리="+cheatableChicken.getDistance());

      }


      System.out.println();
    }


  }
}
