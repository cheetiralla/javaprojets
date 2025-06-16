package priya;

public class QuadratcTimeExample {

	public static void main(String[] args) {
		int[] numbers= {1,3,5,7,3};
		boolean hasDuplicate=false;

		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					hasDuplicate=true;
					System.out.println("Duplicaate found:"+numbers[i]);
				}
			}
			
		}
		if(!hasDuplicate) {
			System.out.println("No Duplicates found");
		}
	}

}
