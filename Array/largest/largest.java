package largest;
public class largest{
    //Code
	private int[] arr;
	 
	public largest(int[] arr){
		 this.arr = arr;
	}
	// 1,2,3,4,5
	public int findLargest(){
		int largestNum = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largestNum){
				largestNum=arr[i];
			}
		}
		return largestNum;
	}
	
	
}