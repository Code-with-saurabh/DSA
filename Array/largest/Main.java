package largest;
public class Main{
    public static void main(String[] args){
        System.out.println("Let's Go!!");
		
		int arr[] = {1,2,3,4,2};
		 largest s = new largest(arr);
		int largetsNumber = s.findLargest();
		System.out.println("The Largest Number is : "+largetsNumber);
		
		secondLargets sl = new secondLargets(arr);
		int secondLargetsNumber = sl.findLargest();
		System.out.println("The Second Largest Number is : "+secondLargetsNumber);
		 
		shortArray sa = new shortArray(arr);
		
		int[] newshortedArray = sa.shortTheArray();
		for(int i=0;i<newshortedArray.length;i++){
			System.out.println(newshortedArray[i]);
		}
		
    }
} 