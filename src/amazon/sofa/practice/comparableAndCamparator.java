package amazon.sofa.practice;

import java.util.*;


 class Country implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			int i, j, k;
			i = s1.lastIndexOf(' ');
			j = s2.lastIndexOf(' ');
			k = s1.substring(i).compareTo(s2.substring(j));
			if (k == 0)
				return s1.compareTo(s2);
			else
				return k;
		}


 }
public class comparableAndCamparator {
	public static void main(String[] args) {
		
      TreeMap<String, Double> tm = new TreeMap<String, Double>(new Country());
      
      StringBuffer s = new StringBuffer("x");
      s.append("y");
      System.out.println(s);
      
    }
}