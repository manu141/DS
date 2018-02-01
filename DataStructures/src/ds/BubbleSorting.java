package ds;
//this is bubble sorting 
public class BubbleSorting {

	private static void Bsort(int[] a){
		int size = a.length;
		for (int i= 0;i<size;i++){
			for(int j=0;j<size-1;j++){
				if(a[j]>a[j+1]){
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
	}
}	
	public static void main(String[] args){	
	int [] array = {5,3,-1,2,4};
	Bsort(array);
	for(int i=0; i<array.length;i++)
		System.out.println(array[i]);
	}
}