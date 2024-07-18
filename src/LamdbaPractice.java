import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LamdbaPractice {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i=0 ; i<30 ; i++){
      list.add(i+1);
    }
    int sum = list.stream().filter(a -> (a % 2) != 0).mapToInt(a -> a * a).sum();
    System.out.println("sum = " + sum);

  }

}
