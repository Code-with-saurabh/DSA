import java.util.Scanner;
public class binary{
    public static void main(String[] args){
        // System.out.println("Let's Go!!");
		//binary Search
		int[] array = {12,13,14,15,16};
		for(int i : array){
		System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value which you want to find : ");
		
		int target = sc.nextInt();
		int low=0;
		int high=(array.length)-1;
		int mid = low + (high-low)/2;
		
		if(array[mid]==target){
			System.out.println("Element funded");
			System.out.println(" \n: "+array[mid]);
		}
		
		if(array[mid]<target){
			low = mid+1;
		}else{
			high=mid-1;
		}
    }
} 