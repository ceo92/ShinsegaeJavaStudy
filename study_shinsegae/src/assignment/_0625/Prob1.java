package _0625;

import java.util.Arrays;
import java.util.Random;

public class Prob1 {

	public static void main(String[] args) {
		//문제 1.
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		System.out.println("(  배열 ia  )");
		System.out.println("홀수의 합 : "+Arrays.stream(ia).filter(a -> a % 2 != 0).reduce(Integer::sum).orElseThrow());
		System.out.println("짝수의 합 : "+Arrays.stream(ia).filter(a -> a % 2 == 0).reduce(Integer::sum).orElseThrow());

		System.out.println("(  배열 ib  )");
		System.out.println("홀수의 합 : "+Arrays.stream(ib).filter(a -> a % 2 != 0).reduce(Integer::sum).orElseThrow());
		System.out.println("짝수의 합 : "+Arrays.stream(ib).filter(a -> a % 2 == 0).reduce(Integer::sum).orElseThrow());


		//문제 2.
		int[] array = new int[5];
		for (int i=0 ; i<array.length;i++) {
			int v = (int) (1 + Math.random() * 100);
			array[i] = v;
		}
		for (int i : array) {
			System.out.print(i+" ");
		}

	}
}
