package ds;

import java.util.*;

public class SumofPairs {

	public static void printPairs(int[] a) {
		Set<Integer> set1 = new HashSet<Integer>();
		for (Integer i : a) {
			set1.add(i);
		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int sum = a[i] + a[j];
				if (set1.contains(sum)) {
					System.out.println("{" + a[i] + ", " + a[j] + "} ");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 10, 1, 3, 5, 9, 25, 11 };
		printPairs(input);
	}
}