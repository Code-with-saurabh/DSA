package smallest;
public class smallest{
    //Code
	private int[] arr;
	 
	public smallest(int[] arr){
		 this.arr = arr;
	}
	// 11,12,31,14,12
	public int findsmallest(){
		int smallestNum = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smallestNum){
				smallestNum=arr[i];
			}
		}
		return smallestNum;
	}
	
	
}