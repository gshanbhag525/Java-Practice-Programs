import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		//create a hash map
		HashMap<String, Double> hm = 
				new HashMap<String, Double>();
		
		//put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));

		//get a set of entries
		Set set = hm.entrySet();
		
		//get an iterator
		Iterator i = set.iterator();
		
		//display elements
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+": "+ me.getValue());
		}
		//deposit 1000 into John Doe's Account
		double balance = ((Double) hm.get("John Doe")).doubleValue();
		hm.put("John Doe", new Double(balance + 1000));

		System.out.println("John Doe's new balance:" 
		+hm.get("John Doe"));
				
		
	}

}
