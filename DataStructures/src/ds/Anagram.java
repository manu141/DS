/**
 * 
 */
package ds;

import java.util.Arrays;

/**
 * @author nevim_000
 * this is a code for if two strings are anagram or not.
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "cinema";
		String s2 = "iceman";
		boolean isAnagram = false;
		if(s1.length() == s2.length()){
			char [] s1char = s1.toCharArray();
			char [] s2char = s2.toCharArray();
			Arrays.sort(s1char);
			Arrays.sort(s2char);
			isAnagram = Arrays.equals(s1char, s2char);
			System.out.println(isAnagram);
		}
	}
}