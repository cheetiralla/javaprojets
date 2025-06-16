package javaprojets;

class Car1 implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Bmw car is Moving"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
		}
	}
		}
	
}
class Bike implements Runnable{
	public void run() {
		for(int i=1;i>=3;i++) {
			System.out.println(" nnja Bike is Moving"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
		}
	}
}
}

public class Simple {

	public static void main(String[] args) {
		Thread caThread=new Thread(new Car1());
		Thread baThread=new Thread(new Bike());
		System.out.println("Gooo");
		caThread.start();
		baThread.start();
				

	}

}
