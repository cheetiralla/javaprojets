package heiio;

import java.util.TreeSet;

public class TreeSetStudent {

	public static void main(String[] args) {
		TreeSet<Integer> numbers=new TreeSet<Integer>();
		numbers.add(5002);
		numbers.add(4998);
		numbers.add(5005);
		numbers.add(4999);
		numbers.add(5001);
		   int valueToFind = 5005;
	        if (numbers.contains(valueToFind)) {
	            System.out.println(valueToFind + " is found in the set.");
	        } else {
	            System.out.println(valueToFind + " is NOT found in the set.");
	        }

	}

}//the id gust higher than
//sort employee Names in Reverse

//objective:use a tree set with a custom comparator to sort things in descending order.           
