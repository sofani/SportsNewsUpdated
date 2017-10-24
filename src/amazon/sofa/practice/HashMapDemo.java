package amazon.sofa.practice;

import java.util.*;
import java.util.Set;



public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("sofani", 10000.00);
		hm.put("sofani1", 20000.00);
		hm.put("sofani2", 30000.00);
		hm.put("sofani3", 40000.00);
		hm.put("sofani4", 50000.00);
		
     Set<Map.Entry<String, Double>> set = hm.entrySet();
       for (Map.Entry<String, Double> me: set) {
    	   System.out.print(me.getKey() + ": ");
           System.out.println(me.getValue() + ": ");
       }
       
	}

}
