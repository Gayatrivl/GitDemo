package Fibonaccitest;

public class DuplicateArr {

	public static void main(String[] args) {
		int[] list1 = {0,1,2,3,4} ;
		int[] listDup = new int [list1.length];
		for (int i =0; i< list1.length; i++)
		{
			listDup[i] = list1[i]; 
		}
		
		System.out.println("Duplicate Array");
		for (int i=0; i< listDup.length; i++)
		{
			System.out.print(listDup[i]+" ");
		}
	}

}
