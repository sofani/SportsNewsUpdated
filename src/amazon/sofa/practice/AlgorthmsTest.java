package amazon.sofa.practice;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AlgorthmsTest {

	
    @Test
    public void  maxTest() {
    	 assertEquals(2 , Algorthms.max(new int[]{1, 2}) );	
    }
    @Test
    public void  minTest() {
    	 assertEquals(0 , Algorthms.min(new int[]{1, 2, 0}) );	
    }
    @Test
    public void searchReplaceTest() {
    	assertEquals("i was here", Algorthms.searchReplace("i was there", "there", "here"));
    }
    
    @Test
    public void revereseTest() {
    	
    	assertArrayEquals(new int[]{3, 2, 1},  Algorthms.reverse(new int []{1, 2, 3}));
    }
	
    @Test
    public void pushTest() {
    	assertTrue(Arrays.equals(new int[]{5, 4, 3, 2, 1}, Algorthms.push(new int[]{1,5})));	
    }
    
    @Test
    public void gcdTest() {
    	assertEquals(1, Algorthms.gcd(5, 4));
    }
    @Test
    public void scTest() {
    	assertEquals(360360, Algorthms.sc(new int[]{1, 13}));
    }
    @Test
    public void fibAddSumTest() {
    	assertEquals(5, Algorthms.fibAddSum(4));
    }
    @Test
    public void sumbetweenTest() {
    	assertEquals(15, Algorthms.sumbetween(new int[]{1, 5}));
    }
    @Test
    public void primeNumbersTest() {
    	boolean x =  Algorthms.primeNumbers(5);
        assertEquals(true, x);
    }
    @Test
    public void sumPrimeTest() {
    	assertEquals(17, Algorthms.sumPrime(10));
    }
    
    @Test 
    public void removingDublicates() {
    	 HashSet<String> al = new HashSet<String>();
    	 al.add("sofa");
    	 al.add("mula");
    	 al.add("milli");
    	 Assert.assertEquals(al, Algorthms.removingDublicates());
    	  
    	  
    }
 }

