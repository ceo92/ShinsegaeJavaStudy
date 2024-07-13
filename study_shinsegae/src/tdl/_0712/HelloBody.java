package tdl._0712;

import java.util.ArrayList;
import java.util.List;

public class HelloBody {
  /*
   *  1. 정수 리스트를 받아 정수를 반환하는 단일 추상 메서드 getMax()를 사용하여 FindMax 인터페이스를 만듭니다.
   *  2. 정수 리스트를 반복하고 최대값을 찾는 람다식을 구현합니다.
   *  3. 최대값은 Integer.MIN_VALUE로 설정한 후 더 높은 숫자가 나타나면 업데이트 합니다.
   *     최대값은 변수 max에 저장합니다.
   *  4. 정수 리스트를 생성합니다.
   *  5. max 객체에서 getMax() 호출하여 최대값을 출력합니다.
   */
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(8);
    list.add(2);
    list.add(7);
    list.add(1);


    FindMax helloIntegerList = a -> {
      int max = Integer.MIN_VALUE;
      for (Integer i : a) {
        if (i >= max){
          max = i;
        }
      }
      return max;

    };
    int result = helloIntegerList.getMax(list);
    System.out.println("max = " + result);


  }
  @FunctionalInterface
  interface FindMax{
    int getMax(ArrayList<Integer> list);
  }
}
