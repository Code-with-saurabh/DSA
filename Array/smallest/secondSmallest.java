package smallest;
import largest.largest;
public class secondSmallest{
    //Code
	//Code
	private int[] arr;
	private int maxnum;
	private int secondSmallestNum=Integer.MAX_VALUE;
	
	public secondSmallest(int[] arr){
	this.arr = arr;
	largest l = new largest(arr);
	maxnum=l.findLargest();
	System.out.println("Max Num is :"+maxnum);
	}
	
	
	public int findsmallest(){
		int smallestNum = arr[0];
		
	//11,12,31,14,12
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smallestNum){
				secondSmallestNum=smallestNum;
				smallestNum=arr[i];
			}else if(smallestNum<arr[i] && secondSmallestNum>arr[i]){
				secondSmallestNum= arr[i];
			}
		}
		return  secondSmallestNum;
	}
}