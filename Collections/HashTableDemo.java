import java.util.*;
class HashTableDemo {
    public static void main(String[] args) {
        //create a hash map
        Hashtable<String,Double> balance = new Hashtable<String,Double>();
        Enumeration names;
        String str;
        double val;
        balance.put("Arun", new Double(34.34));
        balance.put("Radha", new Double(123.4));
        balance.put("Ramesh", new Double(334.4));
        //show all balances in hash table
        names = balance.keys();
        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " +balancce.get(str));
        }
         System.out.println();   
    }
}
