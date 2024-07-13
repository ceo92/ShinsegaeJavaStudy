package assignment.array_assignment.array_03;

import java.util.Arrays;

public class SortUtil {
	public static void main(String[] args){
		int[] inputNumbers = {7, 5, 2, 19, 34, 51, 32, 11, 67, 21};
		int[] ascending = ascending(inputNumbers);
		System.out.print("{");
		for (int inputNumber : ascending) {
			System.out.print(inputNumber+", ");
		}
		System.out.print("}");

	}
	public static int[] ascending(int[] inputNumbers) {
		return Arrays.stream(inputNumbers).sorted().toArray();

	}
}
