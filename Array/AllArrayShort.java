public class AllArrayShort{
	public int max(int[] arr){
		int largets = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largets){
				largets=arr[i];
			}
		}
		return largets;
	}
	public int small(int[] arr){
		int smallets = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smallets){
				smallets = arr[i];
			}
		}
		return smallets;
	}
	public int secondLarget(int[] arr){
		int largets = arr[0];
		int secondLarget =-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largets){
				secondLarget=largets;
				largets=arr[i];
			}else if(arr[i]<largets && arr[i]>secondLarget){
				secondLarget=arr[i];
			}
		}
		return secondLarget;
	}
	public int seondSmallest(int[] arr){
		int smallest = arr[0];
		int Secondsmallest =Integer.MAX_VALUE;
		// int Secondsmallest=10;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smallest){
				Secondsmallest = smallest;
				smallest = arr[i];
			}else if(arr[i]>smallest && arr[i]<Secondsmallest){
				Secondsmallest = arr[i];
			}
		}
		return Secondsmallest;
	}
	public int[] shortedArray(int[] arr){
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
	public static void main(String[] arg){
		// System.out.println("Let's Go!!");
		int[] arr = {12,15,12,7,9};
		
		AllArrayShort a = new AllArrayShort();
		
		int ln = Integer.MAX_VALUE;
		int max = a.max(arr);
		int min = a.small(arr);
		int smax = a.secondLarget(arr);
		int smin = a.seondSmallest(arr);
		int[] shortArr = a.shortedArray(arr);
		
		System.out.println("Max Value is : "+max);
		System.out.println("Second Max Value is : "+smax);
		System.out.println("Min Value is : "+min);
		System.out.println("Second Min Value is : "+smin);
		System.out.println("Value is : "+ln);
		
		int[] arr1 = {12,15,12,7,9};
		System.out.println("UnShorted Array : ");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		System.out.println("Shorted Array : ");
		for(int i=0;i<shortArr.length;i++){
			System.out.println(shortArr[i]);
		}
		
	}
}