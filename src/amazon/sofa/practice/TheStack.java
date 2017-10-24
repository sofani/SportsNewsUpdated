package amazon.sofa.practice;

import java.util.Arrays;
import java.util.Stack;

public class TheStack {
    private String[] stackArray;
    private int stackSize;
    private int topStack = -1;
    public char [][] tokens = { {'{', '}'}, {'[', ']'}, {'(', ')'}};
    TheStack() {
    	
    }
    TheStack(int size) {
    	stackSize = size;
    	stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
    }
    public void push(String input) {
    	if (topStack + 1 < stackSize) {
    		topStack++;
    		stackArray[topStack] = input;
    	} else 
    		System.out.print("Stack is full Sorry");
    	displayTheStack();
        System.out.println("PUSH " + input + " Was Added to the Stack\n");

    }
    
    public String pop() {
    	if(topStack >= 0){
    		displayTheStack();
    		System.out.println("POP " + stackArray[topStack] + " Was Removed From the Stack\n");
    	   stackArray[topStack] = "-1";
    	   return stackArray[topStack--];
    
         } else {
        	 displayTheStack();
    	     System.out.println("Sorry But the Stack is Empty");
    	     return "-1";
    
    	 }
    
    }
    
    public String peek(){

        displayTheStack();
        System.out.println("PEEK " + stackArray[topStack] + " Is at the Top of the Stack\n");

        return stackArray[topStack];

    }
    public void displayTheStack() {

           for(int n = 0; n < 61; n++)
        	   System.out.print("-");
           System.out.println();

           for(int n = 0; n < stackSize; n++) {
               System.out.format("| %2s "+ " ", n);
           }

           System.out.println("|");

           for(int n = 0; n < 61; n++)
        	   System.out.print("-");

           System.out.println();

           for(int n = 0; n < stackSize; n++) {

               if(stackArray[n].equals("-1")) 
            	   System.out.print("|     ");

               else System.out.print(String.format("| %2s "+ " ", stackArray[n]));

           }

           System.out.println("|");
          for(int n = 0; n < 61; n++)
        	  System.out.print("-");

           System.out.println();

   }
    public boolean isOpenTerm(char c) {
    	for (char[] array: tokens) {
    		if (array[0] == c) {
    			return true;
    		}
    	}
    	return false;
    }
    public boolean isMatch(char openTerm, char closeTerm) {
    	for (char[] array: tokens) {
    		if (array[0] == openTerm) {
    			return array[1] == closeTerm;
    		}
    	}
    	return false;
    	
    }
    public boolean isBalanced(String expression) {
    	
    	Stack<Character> myStack = new Stack<Character>();
    	for (char c : expression.toCharArray()) {
    		if (isOpenTerm(c)) {
    			myStack.push(c);
    		} else {
    			if (myStack.isEmpty() || (!isMatch( myStack.pop(), c) )) {
    				return false;
    			}
    		}
    	}
    	return myStack.isEmpty();
    }
    
}
