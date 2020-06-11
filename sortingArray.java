import java.util.Arrays;
import java.util.Scanner;

public class sortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of arr");
		int len = sc.nextInt();
		int arr[] = new int[len];
		int sum = 0;
		
		for (int i = 0; i < len; i++) 
		{
			System.out.println("Enter a number");
			arr[i] = sc.nextInt();	
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		System.out.println("The sum of " +Arrays.toString(arr)+ " is " +sum);
	}

}
