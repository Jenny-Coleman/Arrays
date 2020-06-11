import java.util.Scanner;

public class arrayElementIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		System.out.println("What number are you looking for?");
		int num = sc.nextInt();
		boolean found = false;
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
			{
				found = true;
				index = i;
			}
		}
		
		if (found)
			System.out.println("The index of "+num+" is "+index);
		else
			System.out.println(num+" does not appear in the array");
	}

}
