package Fibonaccitest;

public class MergeArr {

	public static void main(String[] args) {
		int[] list1 = {0,1,2,3,4} ;
		int[] list2 = {5,6,7,8,9} ;
		
		//merged array length
		int mLength = list1.length + list2.length ;
		int[] mergeList = new int [mLength];
		
		// Logic 1 for merging
		for (int i=0;i< mLength;i++)
		{
			if (i<list1.length)
				mergeList[i] = list1[i];
			else 
				mergeList[i]=list2[i-list1.length];
			
		}
		
		//Logic 2 for merging arrays
		/* (int i=0; i<list1.length; i++)
			mergeList[i]=list1[i];
		
		for (int i=list1.length;i<mLength; i++)
			mergeList[i]=list2[i-list1.length]; */
		
				
		System.out.println("Merged Array");
		for (int i=0;i<mLength;i++)
		{
			System.out.print(mergeList[i]+" ");
		}
	}
	

}
