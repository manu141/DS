package ds;

import java.util.TreeMap;

public class PrimeNumbers {

	public boolean isPrime(int n) {
		if (n < 0)
			;
		n = 0 - n;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}

		return true;

	}

	public int findprimes(int[] numbers) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (isPrime(numbers[i]))
				map.put(numbers[i], numbers[i]);
		}
		return map.firstKey().intValue() - map.lastKey().intValue();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 100, -113, 1, 45, 78, -2, -3, 7 };
		System.out.println(new PrimeNumbers().findprimes(numbers));
	}
}