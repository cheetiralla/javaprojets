package heiio;

import java.util.LinkedList;
import java.util.Queue;

public class IceQueue {

	public static void main(String[] args) {
		Queue<String>ice=new LinkedList <String>();
		ice.add("maya");
		ice.add("leo");
		ice.add("nina");
		System.out.println(ice);
		String firstOut=ice.poll();
		System.out.println("firstOut");
		System.out.println(ice);
		String secondOut=ice.poll();
		System.out.println("secondOut");		
		System.out.println(ice);
		System.out.println("Serving"+ice.poll());
		

		
	}

}
