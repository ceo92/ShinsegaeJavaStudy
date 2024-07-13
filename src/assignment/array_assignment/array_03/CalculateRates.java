package assignment.array_assignment.array_03;

import java.util.Arrays;

public class CalculateRates {
	public static void main(String[] args) throws Exception {
		CalculateRates calculateRates = new CalculateRates();

		// 비율 결과: 6.0%, 2.0%, 12.0%, 49.0%, 31.0%
		calculateRates.calculate(new int[] { 10, 30, 20, 80, 50 });

		// 비율 결과: 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
		calculateRates.calculate(new int[] { 50, 50, 50, 50, 50 });

		// 비율 결과: 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
		calculateRates.calculate(new int[] { 1, 2, 3, 4, 5 });
	}
	// 10 : 1 2 3 4
	// num % 1 * 100/10 10 20 30 40
	public void calculate(int[] nums) throws Exception {
		int sum = Arrays.stream(nums).sum();
		int j=0;

		for (double num : nums) {
			int x = (int) Math.round((num / sum * 100.0));
			for (int i=0 ; i< x ; i++) {
				System.out.print("*");
			}
			System.out.printf("	%d.0%% \n", x);
		}
		System.out.println();
		System.out.println("=======");
		System.out.println();
	}
}