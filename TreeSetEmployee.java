package heiio;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetEmployee {

	public static void main(String[] args) {
		TreeSet<String> names=new TreeSet<>(Collections.reverseOrder());//tree set store the employee names in reversealphabetical order
		names.add("sumit");
		names.add("karan");
		names.add("anjali");
		names.add("mohan");
		names.add("zoya");
		for(String name:names) {
			System.out.println(name);
		}
	}

}
