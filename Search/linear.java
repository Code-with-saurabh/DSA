public class linear{
   private int[] arr;
   private int[] arrn=[-1];
   
   public linear(int[] arr){
   System.out.println("Linear Search..");
   this.arr = arr;
   }
   public int[] linearSearch(int target){
	   for(int i=0;i<arr.length;i++){
		   if(arr[i]==target){
			   int[] arrn = {i,arr[i]};
			   return arrn;
		   }
	   }
	   return [];
   }
}