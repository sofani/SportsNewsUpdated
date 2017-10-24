package amazon.sofa.practice;

import java.util.Arrays;

public class TheQueue {
    private String[] queueArray;
    private int queueSize;
    private int rear, front, numberOfItems = 0;
    
    TheQueue (int size) {
    	queueSize = size;
    	queueArray = new String[size];
    	Arrays.fill(queueArray, "-1");
    }
    public void insert(String input) {
    	if (numberOfItems + 1 <= queueSize) {
    		queueArray[rear] = input;
    		rear++;
    		numberOfItems++;
    		System.out.println("INSERT " + input + " Was Added to the Stack\n");
    	} else {
    		System.out.println("Sorry But the Queue is Full");

    	}
    }
    
    
    
    public void delete() {
    	
    	
    	
    	
    }
}
