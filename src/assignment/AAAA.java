package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AAAA {

  public static void main(String[] args) {
    /**
     * ####람다 문제######
     * 1. 람다 규칙에 맞지 않는 람다 표현식은?
     * () → {}
     * () → "Raoul"
     * () → { return "Mario"; }
     * (Integer i) → return "Alan" + i;
     * (String s) → { "Iron Man"; }
     *
     * 답 : (Integer i) → return "Alan" + i;
     *
     * 2. 어디에, 어떻게 람다를 사용할까? 3가지

     * * 		함수형 인터페이스 , Predicate , Consumber , Supplier , Function , Runnable

     *
     * 3. 람다 표현식과 일치하는 메서드 참조를 구현하세요
     * ToIntFunction<String> stringToInt = (String s) -> Integer.parseInt(s); => Integer::parseInt
     * BiPredicate<List<String, String>> contains = (list, element) -> list.contains(element); ==> List::contains
     *Predicate<String> startsWithNumber = (String string) -> this.startsWithNumber(string); ==> this::startsWithNumber
     *

     *
     * 4. Color(int, int, int)처럼 인수가 세 개인 생성자의 생성자 참조를 사용하도록 구조화 하세요
     * Color::new
     */


    //5
    Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(System.out::println);

      //6
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("===6번===");
    Arrays.stream(arr).reduce((a, b) -> Integer.sum(a, b)).ifPresent(System.out::println);

    //7
    System.out.println("===7번===");
    List<Integer> mmlists = Arrays.asList(1,2,3,4,5);
    mmlists.forEach(System.out::println);

    //8
    System.out.println("===8번===");
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    int sum=0;
    for (Integer i : list) {
      if (i % 2 ==1){
        sum+=i;
      }
    }
    System.out.println("sum = " + sum);

    //9
    System.out.println("===9번===");
    list.stream().filter(a -> a % 2 == 1).reduce((a, b) -> Integer.sum(a, b)).ifPresent(System.out::println);

  }

}

class Color{
  private int r;
  private int g;
  private int b;


  public Color(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }
}
