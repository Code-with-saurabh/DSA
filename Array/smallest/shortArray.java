package smallest;
public class shortArray{
    //Code
	private int[] arr;
	public shortArray(int[] arr){
		 this.arr = arr;
	}
	// 23,56,45,35 ;i=0
	// 23,45,56,35 ;i=1
	// 23,45,35,56 ;i=2
	
	// 1,2,3,4,2 ;j=0, i=0
	// 1,2,3,4,2 ;j=1, i=0
	// 1,2,3,4,2 ;j=2, i=0
	// 1,2,3,2,4 ;j=3, i=0
	
	// 1,2,3,2,4 ;j=0, i=1
	// 1,2,3,2,4 ;j=1, i=1
	// 1,2,2,3,4 ;j=2, i=1
 
	
	 
	public int[] shortTheArray(){
		 for(int i=0;i<arr.length-1;i++){
		 for(int j=0;j<arr.length-i-1;j++){
			 if(arr[j]>arr[j+1]){
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			 }
		 }
	}
		 return arr;
	}

}