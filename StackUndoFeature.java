package javaprojets;

import java.util.Stack;
public class StackUndoFeature {

	public static void main(String[] args) {
		Stack<String> suf = new Stack<String>();
		suf.push("write");
		suf.push("Delete");
		suf.push("Insert");
		System.out.println(suf);
		System.out.println(suf.peek());
		System.out.println(suf.pop());
		System.out.println(suf.pop());
		System.out.println(suf);
		
		

	}

}