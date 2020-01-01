import java.util.*;
class TreeMapDemo{
  public static void main(String args[]){
    TreeMap tm = new TreeMap();
    tm.put("Suresh", new Double(1234.34));
    tm.put("Meenu", new Float(134.34));
    tm.put("Vioren", new Integer(1234));
    tm.put("Avi", new Double(128934.34));
    tm.put("priya", new Integer(123409));
    tm.put("zakir", new Float(7329.34));
    tm.put("nirav", new Double(128934));
    tm.put("jayesh", new Integer(15000));
    tm.put("Poorva", "Zero");
    
    Set salary = tm.entrySet();
    Iterator it = salary.iterator();
    while(it.hasNext()){
      Map.Entry e = (Map.Entry) it.next();
      System.out.println(e.getKey()+":" is "+e.getValue());
    }
  }
}
