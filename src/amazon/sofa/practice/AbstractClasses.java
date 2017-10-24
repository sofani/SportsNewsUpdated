package amazon.sofa.practice;

import java.util.*;
//You want to share code among several closely related classes.

/*You expect that classes that extend your abstract class have many
common methods or fields, or require access modifiers other than
 public (such as protected and private).*/

/*You want to declare non-static or non-final fields. 
  This enables you to define methods that can access and modify 
  the state of the object to which they belong.
 */

/* You cannot instantiate them, 
 * they may contain a mix of methods declared with or without an implementation.  
 * abstract classes, you can declare fields that are not static and 
  final, and define public, protected, and private concrete methods.
 * you can extend only one class, whether or not it is abstract,
 * */


	abstract class GraphicObject {
	    int x, y;
	    static int z = 10;
	    void moveTo(int newX, int newY) {
	       
	    }
	    abstract void draw();
	    abstract void resize();
     }
	class Circle extends GraphicObject {
	    void draw() {
	      System.out.println("Circle");
	    }
	    void resize() {
	       
	    }
	}
	class Rectangle1 extends GraphicObject {
	    void draw() {
	    	  System.out.println("Rectangle");
	    }
	    void resize() {
	       
	    }
	}
	
	public class AbstractClasses {
		public static void main(String[] args) {
			
			
		}
}
