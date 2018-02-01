package ds;

import java.util.*;

//adding two values to get the sum of the value in an array
public class PairvaluesInArray {
	// Condition
	public static void numberPairforSum(int[] array, int sum) {
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		for (int num : array) {
			set1.add(num);
			if (set1.contains(sum - num)) {
				String s = num + "+" + (sum - num) + " add up to: " + sum;
				System.out.println("\t" + s);
			}
		}
	}
	// Main
	public static void main(String[] args) {
		int[] array = { 1, 9, 3, 8, 5, 6 };
		numberPairforSum(array, 11);// array and sum value
	}
}