package largest;
public class secondLargets{
    //Code
	//Code
	private int[] arr;
	private int secondLargetsNum=-1;
	 
	public secondLargets(int[] arr){
		 this.arr = arr;
	}
	
	public int findLargest(){
		int largestNum = arr[0];
		
	// 23,56,45,35
		for(int i=1;i<arr.length;i++){
			if(arr[i]>largestNum){
				secondLargetsNum=largestNum;
				largestNum=arr[i];
			}else if(largestNum>arr[i] && secondLargetsNum<arr[i]){
				secondLargetsNum= arr[i];
			}
		}
		return secondLargetsNum;
	}
}