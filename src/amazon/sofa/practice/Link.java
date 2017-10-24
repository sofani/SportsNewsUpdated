package amazon.sofa.practice;

public class Link {
	public String name;	
	public Link next;
	public Link() {};
	public Link(String name) {
		this.name = name;	
	}
	public void dispaly() {
		System.out.println(name);
	}
    public static void main(String[] args) {  
	   LinkedList  myLinkedlist = new LinkedList();
	   myLinkedlist.addFirstLink("sofa");
	   myLinkedlist.addFirstLink("mule");
	   myLinkedlist.display();
    }
}
class LinkedList {
	  public Link firstLink;
	  
	  LinkedList() {
		  firstLink = null; 
	  }
	  
	  boolean isEmpty() {
		  return (firstLink == null);
			 
	  }
	  
	  public void addFirstLink(String newString) {
		  Link newLink = new Link();
		  newLink.next = firstLink;
		  newLink = firstLink;
	  }
	  public Link removeFirst() {
		  Link referenceLink = firstLink;	  
		  if (!isEmpty()) {
			  firstLink = firstLink.next;
		  } else {
			  System.out.print("Empty Link");
		  }
		  return referenceLink;
	  }
	  
	  public void display() {
		  Link theLink = firstLink;
		  while (theLink != null) {
			  theLink.dispaly();
			  System.out.println("next Link " + theLink.next);
			  theLink = theLink.next;
			  System.out.println();
		  }  
	  }
	  public Link find(String bookName ) {
		  Link theLink = firstLink;
		  if (!isEmpty()) {
				  while (theLink.name != bookName) {
					  if (theLink.next == null) {
						  return null;
					  } else {
						  theLink = theLink.next;
					  }
				  }
		  } else {
			  System.out.println("Empty LinkedList");
		  }
		  return theLink;
	  }
	  public Link removeLink(String bookName) {
		  Link curr = firstLink;
		  Link prev = firstLink;	 
		  while (curr.name != bookName) {
			    if (curr.next == null) {
			    	return null;
			    } else {
			    	prev = curr;
			    	curr = curr.next;
			    }		  
		  }
		  if (curr == firstLink) {
			  firstLink = firstLink.next;
		  } else {
			  prev.next = curr.next;
		  }
		  return curr;			  
	   } 
	  
	  public boolean hasCycle() {
		  Link fast = firstLink.next;
		  Link slow = firstLink;
		  if (firstLink == null) {
			  return false;
		  } else {
			  
			  while(fast != null &&  fast.next != null && slow != null) {
				  if (fast == slow) {
					  return true;
				  }
				  fast = fast.next.next;
				  slow = slow.next;
			  }
		  }
		  return false;
	  }
	  
}


