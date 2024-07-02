package array_assignment.array_02;

import array_assignment.array_03.CalculateRates;
import java.util.Arrays;

public class RateTest {

  public static void main(String[] args) throws Exception {
    RateTest rateTest = new RateTest();

    // 비율 결과: 6.0%, 2.0%, 12.0%, 49.0%, 31.0%
    rateTest.calculate(new int[] { 10, 30, 20, 80, 50 });

    // 비율 결과: 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
    rateTest.calculate(new int[] { 50, 50, 50, 50, 50 });

    // 비율 결과: 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
    rateTest.calculate(new int[] { 1, 2, 3, 4, 5 });
  }
  // 10 : 1 2 3 4
  // num % 1 * 100/10 10 20 30 40
  public void calculate(int[] nums) throws Exception {
    int sum = Arrays.stream(nums).sum();


    for (double num : nums) {
      double x =  (num / sum * 100.0);
      for (int i=0 ; i< x ; i++) {
        System.out.print("*");
      }
      System.out.printf("	%.15f%% \n", x);
    }
    System.out.println();
    System.out.println("=======");
    System.out.println();
  }

}
