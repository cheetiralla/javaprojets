package heiio;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> numbers=new TreeSet<Integer>();
		numbers.add(50);
		numbers.add(0);
		numbers.add(40);
		numbers.add(10);
		numbers.add(30);
		System.out.println(numbers);
		System.out.println(numbers.first());
		System.out.println(numbers.higher(30));
	}

}

