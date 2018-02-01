package ds;

import java.util.Arrays;

public class MinDiff {
	
	public static int minDiff(int [] A){
		Arrays.sort(A);
		if(A.length>1){
			int d = Math.abs(A[0]-A[1]);
			for(int i= 0; i<=A.length;i++){
				if(i+1<A.length){
					int t = Math.abs(A[i]-A[i+1]);
					if(t<d)
						d=t;
				}
			}
			return d;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,3,4,5};
		minDiff(input);
	}
}