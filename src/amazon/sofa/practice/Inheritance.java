package amazon.sofa.practice;

public class Inheritance {
	 private int x;
	 private int y;
//	 public Inheritance(int x, int y) {
//		 this.x = x;
//		 this.y = y;
//	 }
	 public void set(int x) {
		 this.x = x;
	 }
	 public int getX() {
		 return this.x;
	 }
	public void print() {
		System.out.println( getX());
	}
	

	public static void main(String[] args) {
		Inheritance i = new Inheritance();
		i.set(2);
		
		i.print();
     
	}

}
