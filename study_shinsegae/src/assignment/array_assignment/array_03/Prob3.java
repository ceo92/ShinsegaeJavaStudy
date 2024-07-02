package array_assignment.array_03;

import java.util.Arrays;

public class Prob3 {
	public static void main(String[] args) {
		int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
		System.out.println("<< 중복되지 않은 숫자 >>");
		printUniqueNumber(array);
	}

	private static void printUniqueNumber(int[] array) {
		Arrays.stream(array).distinct().forEach(a->System.out.print(a+", "));
		// 구현하세요.
	}
}
