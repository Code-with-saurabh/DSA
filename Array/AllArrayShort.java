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
	public boolean isShorted(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>=arr[i+1]){
			}else{
				return false;
			}
		}
		return true;
	}
	public int removeDuplicates(int[] arr){
		int i=0;
		for(int j=1;j<arr.length;j++){
			if(arr[j] != arr[i]){
				arr[i+1] = arr[j];
				i++;
			}
		}
		return i+1;
	}
	public int[] leftRotate(int[] arr){
		int temp = arr[0];
		for(int i=0;i<arr.length-1;i++){
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		return arr;
	}
	public int[] leftRotateBs(int[] arr){
		int temp = arr[0];
		for(int i=1;i<arr.length;i++){
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		return arr;
	}
	/*public int[] leftRotateByD(int[] arr,int d){
		 d=d%arr.length;
		 int tempsize = arr.length-d;
		 int[] temp = new int[tempsize];
		 for(int i=0;i<tempsize;i++){
			 arr[i] =arr[d];
			 d++;
		 }
		 
		 /*for(int i=d; i<arr.length;i++){
			 arr[i-d] = arr[d];
			  
		 }
		 for(int i=d;i<arr.length;i++){
			 arr[i] = arr[arr.length-d];
			 d--;
		 } 
		 return temp;
	}*/
	public int[] leftRotateByD(int[] arr,int d){
		// 1,2,3,4,5,6,7
		// 4,5,6,7
		d = d%arr.length; //3
		 int[] temp = new int[d];
 
		 for(int i=0;i<d;i++){
			 temp[i] =arr[i];
			 
		 }
		 // i==4 - (4-4 =0) -|>arr[4]  arr 0-4 , 
		 for(int i=d;i<arr.length;i++){
			 arr[i-d] = arr[i];  
		}
		 
		int j=0;
			 
		for(int k=arr.length-d;k<arr.length;k++){
			arr[k] = temp[j];
			j++;
		}
		return arr;
		
	}
	
	public int[] leftRotateByD1(int[] arr, int d){
		d= d%arr.length;
		// 0,1,2,3,4,5,6,7
		int[] temp = new int[d];
		
		for(int i=0;i<d;i++){
			temp[i] = arr[i];
		}
		  
		for(int i =d;i<arr.length;i++){
			arr[i-d] = arr[i];
		}
		 
		for(int i=arr.length-d;i<arr.length;i++){
			arr[i] = temp[i-(arr.length-d)] ;
		 
		}
		return arr;
		
	}
	
	public static void main(String[] arg){
		// System.out.println("Let's Go!!");
		// int[] arr = {12,15,12,7,9};
		int[] arr = {0,1,2,3,4,5,6,7};
		// int[] arr = {1,1,2,2,2,3,3,4,4,4,5,6};
		
		AllArrayShort a = new AllArrayShort();
		
		/*int ln = Integer.MAX_VALUE;
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
		int[] arr2 = {12,45,67,23};
		System.out.println(a.isShorted(arr2));*/
		// System.out.println("Actual Total Number of Elements int the array are : "+a.removeDuplicates(arr));
		/*int[] LR = a.leftRotate(arr);
		for(int i : LR){
			System.out.println(i);
		}
		int[] arr1 = {1,2,3,4,5};
		System.out.println("\n\n");
		int[] LRBs = a.leftRotateBs(arr1);
		for(int i : LRBs){
			System.out.println(i);
		}
		*/
		/*int[] newarr  = a.leftRotateByD(arr,3);
		for(int i : newarr){
			System.out.println(i);
		}*/
		 int[] newarr  = a.leftRotateByD1(arr,9887665);
		for(int i : newarr){
			System.out.println(i);
		}
		 
	}
}