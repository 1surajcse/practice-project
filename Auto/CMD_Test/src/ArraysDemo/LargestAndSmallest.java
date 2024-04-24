package ArraysDemo;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={12,10,3,51,-9};
		largestAndSmallest(arr);
	}
	public static void largestAndSmallest(int[] numbers) { 
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE; 
		for (int number : numbers) {
			if (number > largest) {
			largest = number; 
			}
		else if (number < smallest) { 
			smallest = number; 
			}
		}
		System.out.println("largest::"+largest);
		System.out.println("Smallest::"+smallest);
		}
	


}
