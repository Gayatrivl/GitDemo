package Fibonaccitest;

public class ReversArr {

	public static void main(String[] args) {
		int[] ilist = {0,1,2,3,4,5,6,7,8,9} ;
		int[] reverse = new int[ilist.length];
		int length = ilist.length;
		for (int i=0, j=length-1; i< length; i++, j--) {
		
			reverse[i] = ilist[j];
			//System.out.println(reverse[i]);
			
		
		}
		System.out.println("Reversed Array");
		for (int i=0; i< ilist.length; i++) {
		
		System.out.print(reverse[i]+" ");
	}
  }
}
