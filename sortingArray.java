import java.util.Arrays;
import java.util.Scanner;

public class sortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of arr");
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		for (int i = 0; i < len; i++) 
		{
			System.out.println("Enter a number");
			arr[i] = sc.nextInt();	
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
