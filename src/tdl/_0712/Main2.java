package tdl._0712;

import java.io.IOException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Main2 {

  public static void main(String[] args) throws IOException {
    @FunctionalInterface
    interface MathOperation{
      int operation(int a , int b);
    }

    @FunctionalInterface
    interface StringOperation{
      int getStringLength(String a);
    }

    @FunctionalInterface
    interface ArrayOperation{
      int getOddSum(int[] array);
    }

    //1. 두 정수를 받아서 그 합을 반환하는 람다식 작성하기
    MathOperation addition = Integer::sum;

    int sum = addition.operation(5, 3);
    System.out.println("sum = " + sum);

    StringOperation length = String::length;

    int stringLength = length.getStringLength("나는 이경민입니다.!");
    System.out.println("stringLength = " + stringLength);

    int[] array = new int[10];
    for (int i=0 ; i<array.length ; i++){
      array[i] = i+1;
    }
    ArrayOperation xx = numbers -> {
        int sumA= 0 ;
      for (int number : numbers) {
        if (number % 2 ==0) sumA +=number;
      }
      return sumA;
    };

    int result = xx.getOddSum(array);
    System.out.println("result = " + result);


  }



}

@AllArgsConstructor
@Getter @Setter
@ToString
class Person implements Comparable<Person> {
  private String name;
  private int age;

  @Override
  public int compareTo(Person o) {
    return this.age - o.age;
  }


}

