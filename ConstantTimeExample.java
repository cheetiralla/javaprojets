package priya;

public class ConstantTimeExample {
	public static void printFirstElement(int[] arr) {
		if(arr.length>0) {
			System.out.println("First Element is:"+arr[0]);
		}else {
			System.out.println("Array is Empty.");
		}
	}
	public static void main(String[] args) {
		int[] numbers= {1,3,5,3,6,7,8,6,5,4,8,9,6,8,4};
		printFirstElement(numbers);
			
		

	}

}
