package heiio;

public class PriorityProgram {

	public static void main(String[] args) {
		Thread lowrpriorityThread=new Thread(()->{
		for(int i=1;i<=5;i++) {
			System.out.println("Low Priority Thread"+i);
		}
	});
		Thread highpriorityThread=new Thread(()->{
		for(int i=1;i<=5;i++) {
			System.out.println("High Priority Thread"+i);
		}
		
	});
		lowrpriorityThread.setPriority(Thread.MIN_PRIORITY);
		highpriorityThread.setPriority(Thread.MAX_PRIORITY);
		
		lowrpriorityThread.start();
		highpriorityThread.start();
		
	
}
}