package collectionFramework;
import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr); 								//Sorting using quick sort
//		Arrays.fill(arr, 0);							//Filling constant at all places
		Arrays.compare(arr, arr);
		System.out.println(Arrays.toString(arr));		//toString to print value of array
		System.out.println(Arrays.stream(arr));
		
		int search = Arrays.binarySearch(arr, 0);		// Search an element using Arrays class
		System.out.println("Search index : "+search);
		
	}
}