package amazon.sofa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Algorthms {
	
	//1
	  public static int max(int x[]) {
		  int largest = Integer.MIN_VALUE;
		  for (int i = 0; i < x.length; i++) {
			  if ( x[i] > largest) {
				  largest = x[i];
			  }
		  }
		  return largest;
	  }
	  //2
	  public static int min(int x[]) {
		  int smallest = Integer.MAX_VALUE;
		  for (int i = 0; i < x.length; i++) {
			  if (x[i] < smallest) {
				  smallest = x[i];
			  }
		  }
		  return smallest;
	  }
	  //3
	   public static String searchReplace(String str, String x, String y) {		  
		   String newString = " ";  
		   if (str.contains(x)) {
				 newString = str.replace(x, y);
				
			}   
		   return newString;
	   }
	   //4
	   public static int[] reverse(int [] input) {
		   Arrays.sort(input);
		   for (int i = 0; i < input.length / 2; i++) {
			   int temp = input[i]; 
			   input[i] = input[input.length - 1 - i]; 
			   input[input.length - 1 - i] = temp; 
		   }
		   return input;
	   }
	   //5
	   public static int[] push(int [] input) {
		   Arrays.sort(input);
		   reverse(input);
		   int [] newInput = new int[input[0]];
		
		   for (int i = input[0], j = 0; i >= input[1]; i--, j++) {
			   newInput[j] = i;
			
		   }
		   return newInput;
	   } 
	   //6
	   public static int gcd(int x, int y) {
		   if (y == 0) {
			   return x;
		   } else
			   
		   return gcd (y ,  x % y);			   
	   } 
	   //7
	   public static int sc(int [] arr) { 
		   Arrays.sort(arr);
		   reverse(arr);
		   int newArr[] = new int[arr[0]];
		   newArr = push(arr);
		   
		   int lcm = newArr[0];
		   for (int i = 1; i < newArr.length; i++) {
			   int  GCD = gcd(lcm, newArr[i]); 
			
			   lcm = (lcm * newArr[i] ) / GCD; 
		   }
		   return lcm;
	   }
	   //8
	   public static int  fibAddSum(int num) {
		   int prev = 0;
		   int curr = 1;
		   int sum = 0;
		   while (curr <= num) {
			   if (curr % 2 != 0 ) {
				   sum += curr;
			   }
			   curr  += prev;
			   prev = curr - prev;
			  
		   }
		  return sum;
		   
	   }
	
	//9
	
	  public static int sumbetween(int x[]) {
		  int sum = 0;
		  for (int i = min(x); i <= max(x); i++) {
			   sum +=  i;
		  }
		
		  return sum;
	  }
	  
	  //10
	  
	  public  static  boolean isprime(int number) {
		  for (int i = 2; i <= number; i++) {
			  if (number % i == 0 && number != i) {
				  return false;
			  }
		  }
		  return true;
	 }
	  
    public static boolean primeNumbers(int num) {
    	
         if (num == 0 || num == 1) {
        	return false;
         } else {
        	 for (int i = 2; i <= num / 2; i++) {
        		 if (num % i == 0) {
        			 System.out.println(num + " is not a prime number");
        			 return false;
        		 }
        	 }
        	return true;
         }
    	}
    //11
    public static int sumPrime(int num) {
    	if (num == 1)
    		return 0;
    	else if (isprime(num) == false ) 
    		return sumPrime(num - 1);
    	
    	else if (isprime(num) == true ) 
    		return num + sumPrime(num - 1);
   
    	else 
    		return 0;
    	
    }
    //12
    public static LinkedHashSet<String> removingDublicates() {
    	ArrayList<String> li = new ArrayList<String>();
    	li.add("sofa");
    	li.add("sofa");
    	li.add("mula");
    	li.add("milli");
        LinkedHashSet<String> listToSet = new LinkedHashSet<String>(li); 
      
       return listToSet;
    }
	public static void stareCase(int num) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <= num; j++) {
				System.out.print(j < num  ? "*": " ");
			}
			System.out.println(" ");
		}
	}
	public static int single(int[] nums) {
		int n = nums.length, lo = 0, hi = n / 2;
        while (lo < hi) {
            int m = (lo + hi) / 2;
            if (nums[2 * m] != nums[2 * m + 1])
            	hi = m;
            else 
            	lo = m + 1;//hi
        }
        return nums[2 * lo];
	}
	
	public static class myComp implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			String i1 =  o1.toString();
			String i2 =  o2.toString();
		
				return -i1.compareTo(i2);
		 		
		}
		
	}
	public static int missingIntegre(int [] A) {
		int counter[] = new int[A.length];
		
	
		// Count the items, only the positive numbers
		for (int i = 0; i < A.length; i++) {
		    if (A[i] > 0 && A[i] <= A.length)  {
		        counter[A[i] - 1]++;
		    }
		}
		
		
		// Return the first number that has count 0
		for (int i = 0; i < counter.length; i++) {
		    if (counter[i] == 0) {
		        return i + 1;
		    }
		}
		// If no number has count 0, then that means all number in the sequence
		// appears so the next number not appearing is in next number after the
		// sequence.
	    return A.length + 1;
	}
	
	public static String toCapCase(String phrase) {
		char characterToBeCapt = Character.toUpperCase(phrase.charAt(0));
		phrase = characterToBeCapt + phrase.substring(1);
		for(int i = 1; i < phrase.length(); i++) {
	        if(phrase.charAt(i) == ' ') {
	        	characterToBeCapt = Character.toUpperCase(phrase.charAt(i + 1));
	            phrase = phrase.substring(0, i) + " " +  characterToBeCapt + phrase.substring(i + 2);
	        }
	    }
		
		return phrase;
	}
   
	
	
	
	
	
	
	
	
	public  void main(String[] args) {
		stareCase(9);
//		int[] nums = {1, 1, 2, 2, 4, 4, 9, 8, 8};
//		//System.out.println();
//       System.out.println(single(nums));
		//primeNumbers(17);
//		StringBuffer s = new StringBuffer("sofa");
//		s.append("prog");
//		 System.out.println(s);
//		String x = new String("x");
//		String y = new String("x");
//		if (x.equals(y))
//			System.out.println(true);
//		else 
//			System.out.println(false);
		//sumPrime(10);
	
//		TreeSet ts = new TreeSet(new myComp());
//		ts.add(new StringBuffer("sofa"));
//		ts.add(new StringBuffer("mule"));
//		ts.add(new StringBuffer("isaac"));
//		ts.add(new StringBuffer("biniam"));
//		ts.add(new StringBuffer("araia"));
//		System.out.println(ts);
		//int x[] = {3, 19};
		
		
 	//System.out.println(sumPrime(10));
	     
		//searchReplace("A quick brown fox jumped over the lazy dog", "jumped", "leaped");
		//removingDublicates();
		//System.out.println(toCapCase("mister sofani should not code"));
		 //int a = 9/0;
	}

}
