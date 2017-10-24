package amazon.sofa.practice;

import java.util.*;

public class IteratorDemo {
	
	
	 public static void main(String[] args) {  
		 ArrayList<Character> arr = new ArrayList<Character>();
		 arr.add('A');
		 arr.add('B');
		 arr.add('C');
		 arr.add('D');
	     arr.add('E');
	     System.out.print(arr);
	     System.out.println();
	     for (int i = 0; i < arr.size(); i++) {
	    	 arr.set(i, Character.toLowerCase(arr.get(i)));
	     }
	    
	     System.out.print(arr);
	 }
}
