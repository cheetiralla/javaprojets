package heiio;

import java.util.Stack;

public class ToyStack {

	public static void main(String[] args) {
    Stack<String> toy=new Stack<String>();
    toy.push("Ball");
    toy.push("Blocks");
    toy.push("Puzzle");
    System.out.println("out"+toy.pop());
    System.out.println("played toy is"+toy.peek());
    System.out.println(toy);
	}

}
