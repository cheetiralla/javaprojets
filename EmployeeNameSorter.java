package heiio;
import java.util.Comparator;
import java.util.TreeSet;
public class EmployeeNameSorter {
	public static void main(String[] args) {
		TreeSet<String> employeename=new TreeSet<String>(Comparator.reverseOrder());
		employeename.add("supriya");
		employeename.add("Kiran");
		employeename.add("suchi");
		employeename.add("bharath");
		employeename.add("susmitha");
		System.out.println("Employee names in reverse alphabetical order:"+employeename);
		
	}

}