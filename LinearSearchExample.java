
package heiio;

public class LinearSearchExample {

	public static void main(String[] args) {
		int[] numbers = {1, 4, 6, 7, 9, 5}; // basic array
		int target = 0;
		boolean found = false;

		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==target) {
			System.out.println("Found" + "" + target + " at index " + i);
			found = true;
			break;
		}
	}
		if(!found) {
			System.out.println("Number"+target+"not found");
		}
  }
}
//10 box of toys u can search one by one ,u find ur toys