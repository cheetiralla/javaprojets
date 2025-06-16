package javaprojets;
import java.util.HashMap;
import java.util.Map;
public class StudentMap {

	public static void main(String[] args) {
    HashMap<Integer,String> studentMap=new HashMap();
    studentMap.put(100,"sos");
    studentMap.put(101,"veera");
    studentMap.put(102, "Bob");
    studentMap.remove(100);
    for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
        System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
    }
    
    
	}

}
