import java.util.Scanner;
public class index{
    public static void main(String[] args){
        // System.out.println("Let's Go!!");
		//linear Search
		int[] array = {12,13,14,15,16};
		for(int i : array){
		System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value which you want to find : ");
		
		int target = sc.nextInt();
		for(int i=0;i<array.length;i++){
		 if(target==array[i]){
			 System.out.println(target+" is at index "+i);
		 } 
		}
    }
} 