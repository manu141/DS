package ds;

import java.io.*;
import java.util.Scanner;

public class Reverstinglettersstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Entered String is :" + str);

		// Sol1: not working 
		int l = str.length();
		String reverse = "";
		for (int i = l - 1; i >= 0; i--)
		reverse = reverse + str.charAt(i);
		if(str.equals(reverse)){
			System.out.println("Reverse String is:" + reverse);
		}
		else 
			System.out.println("String is not reversed");
	}
}