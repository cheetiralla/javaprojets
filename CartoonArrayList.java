package heiio;

import java.util.ArrayList;

public class CartoonArrayList {

	public static void main(String[] args) {
		ArrayList<String> carton=new ArrayList<String>();
		carton.add("a");
		carton.add("b");
		carton.add("c");
		carton.add("d");
		carton.add("e");
		System.out.println(carton);
		carton.remove(1);
		System.out.println(carton);
		carton.set(3, "f");
		System.out.println(carton);
		for(String cartoon:carton) {
			System.out.println(carton);
			
		}
		
	}

}
