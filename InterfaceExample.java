package javaprojets;
interface printable{
	void print();
}
class Message implements printable{
	public void print() {
		System.out.println("Hello From INTERFACE");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		Message msg=new Message();
		msg.print();

	}

}