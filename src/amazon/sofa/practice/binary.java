package amazon.sofa.practice;

import java.util.Scanner;

public class binary {
	private int [] theArray = new int[50];
	private  int arraySize = 10;
	
	public void randomgenerator() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int)(Math.random() * 10 ) + 10;
		}
	}
	public void print() {
		for (int i = 0; i < arraySize; i++) {
			System.out.println("----------");
			System.out.print("|" + i + "|");
			System.out.println("|" + theArray[i] + "|");
			System.out.println("----------");
		}
	}
    public int getValueByIndex(int index) {
    	if (index <  arraySize) 
    		return theArray[index];
    	return 0  ;
        
    }
    
    public boolean doesTheArrayContainsValue(int searchValue) {
		  
		   for (int i = 0; i < arraySize; i++) {
			   if (theArray[i] == searchValue) {
				   return true;
			   }
		   }
		   return false;
	}
	public void deleteIndex(int index) {
		if (index < arraySize) {
			for (int i = index; i < (arraySize - 1); i++) {
				theArray[i] = theArray[i + 1];
			}
		
		}
		arraySize--;
	}
	public void insertValue(int index) {
		if (arraySize < 50) {
			
			theArray[arraySize] = index;
		
		}
		arraySize++;
	}
	public String linearSearch(int value) {
		boolean valueInArray = false;
		String indexWithValue = " ";
		System.out.print("The value was found in ");
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				System.out.print(i + " ");
				indexWithValue += i + ", ";
			}
		}
		if (!valueInArray) {
			indexWithValue = "none ";
			System.out.print(indexWithValue);
		}
		System.out.println();
		return indexWithValue;
		
	}
	
	public void accmultiArray(String [] [] [] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				for (int k = 0; k < myArray[i][j].length; k++) {
					System.out.println(myArray[i][j][k]);
				}
			}
		}
		
	}
	
	public void bubbleSort() {
		for (int i = arraySize - 1; i > 1; i--) {
			for (int j = 0; j < i; j++)  {
				if (theArray[j] > theArray[j + 1]) {
					swapAnArray(j, j + 1);
					printHorzArray(i, j);
				}
				printHorzArray(i, j);
			}
		}
		
	}
	public void selection() {
	
		for (int x = 0; x < arraySize; x++) {
			int minimum = x;
			for (int y = x; y < arraySize; y++) {
				if (theArray[minimum] > theArray[y]) {
					minimum = y;
				}
			}
			swapAnArray(x, minimum);
			printHorzArray(x, -1);
		}
	}
	public void insertion() {
		
		for (int i = 1; i < arraySize; i++) {
			int j  = i;
			int toInsert = theArray[i];
			while ((j > 0) && (theArray[j - 1] > toInsert)) {
				theArray[j] = theArray[j - 1];
				j--;
				printHorzArray(i, j);
			}
			theArray[j] = toInsert;	
		}
	}
	public void binarySearch(int value) {
		int lowerIndex = 0 ;
		int higherIndex = arraySize - 1;
		while (lowerIndex <= higherIndex) {
			int middleIndex = (lowerIndex + higherIndex) / 2;
			if (theArray[middleIndex] < value) {
				lowerIndex = middleIndex + 1;
			} else if (theArray[middleIndex] > value) {
				higherIndex = middleIndex;
			}  else {
			     System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
			     lowerIndex = higherIndex + 1;
			}
            printHorzArray(middleIndex, -1);
	   }

	}
	public void swapAnArray(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		 theArray[indexOne] =  theArray[indexTwo];
		 theArray[indexTwo] = temp;
	}
	
	public void printHorzArray(int i, int j) {

		        for (int n = 0; n < 51; n++)
		        	System.out.print("-");
		        System.out.println();
		        for (int n = 0; n < arraySize; n++) {
		            System.out.print("| " + n + "  ");
		        }
		        System.out.println("|");
		        for(int n = 0; n < 51; n++)
		        	System.out.print("-");
		        System.out.println();
		        for (int n = 0; n < arraySize; n++) {
		            System.out.print("| " + theArray[n] + " ");
		        }
		        System.out.println("|");
		        for (int n = 0; n < 51; n++)
		        	System.out.print("-");
		        System.out.println();
		        // END OF FIRST PART

		        // ADDED FOR BUBBLE SORT
		        if (j != -1) {
		            // ADD THE +2 TO FIX SPACING
		        	for (int k = 0; k < ((j*5) + 2); k++)
		        		System.out.print(" ");

		            System.out.print(j);
		        }
		        // THEN ADD THIS CODE
		
		        if(i != -1) {
		            // ADD THE -1 TO FIX SPACING
		            for (int l = 0; l < (5*(i - j) - 1); l++)
		            	System.out.print(" ");
		            System.out.print(i);
		        }
		        System.out.println();
    }

	
	
	
	public static void main(String[] args) {
//		binary b = new binary();
//		b.randomgenerator();
//		b.print();
//		b.selection();
		//TheStack myStack = new TheStack(4);
//	    myStack.push("sofani");
//	    myStack.push("million");
//	    myStack.push("mule");
//	    myStack.pop();
//	    myStack.peek();
		char x = 'b';
		//hi
	   System.out.println('e' - 'a');
		

	  
    }  
}
