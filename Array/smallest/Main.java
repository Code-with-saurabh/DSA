package smallest;

public class Main{
    public static void main(String[] args){
        System.out.println("Let's Go!!");
		
		int arr[] = {11,12,31,14,12};
		smallest s = new smallest(arr);
		int smallestNumber = s.findsmallest();
		System.out.println("The smallest Number is : "+smallestNumber);
		
		secondSmallest sl = new secondSmallest(arr);
		int secondSmallestNumber = sl.findsmallest();
		System.out.println("The Second smallest Number is : "+secondSmallestNumber);
		 
		shortArray sa = new shortArray(arr);
		
		int[] newshortedArray = sa.shortTheArray();
		for(int i=0;i<newshortedArray.length;i++){
			System.out.println(newshortedArray[i]);
		}
		
    }
} 