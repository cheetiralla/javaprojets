package heiio;
import java.util.TreeMap;
public class CountryCap {
	public static void main(String[] args) {
		TreeMap<String, String> countriesCap= new TreeMap<String, String>();
		countriesCap.put("India", "New Delhi");
		countriesCap.put("USA", "Washington");
		countriesCap.put("Germany", "Berlin");
		countriesCap.put("Japan", "Tokyo");
		countriesCap.put("India", "Delhi");
		System.out.println("Country-Capital Map" +countriesCap);
		System.out.println("First Key(alphabetically):"+countriesCap.firstKey());
		System.out.println("Last Key(alphabetically):"+countriesCap.lastKey());
		String exampleKey="Germany";
		System.out.println("Key higher than'"+exampleKey+"':"+countriesCap.higherKey(exampleKey));
		System.out.println("Key lower than'"+exampleKey+"':"+countriesCap.lowerKey(exampleKey));
		

	}

}