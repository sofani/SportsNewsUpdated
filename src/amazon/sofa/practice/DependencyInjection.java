package amazon.sofa.practice;

public class DependencyInjection {
	public static  class Shape {
		public void draw() {
			System.out.println("Shape");
		}
	}
	static void drawMethod(Shape s) {
		s.draw();
	}
    static class   Triangle extends Shape {
		public void draw() {
			System.out.println("Triangle");
		}
	}
    static class Circle extends Shape {
        public void draw() {
			System.out.println("Circle");
		}
	}

	public static void main(String[] args) {
      Shape sh = new Triangle();
      drawMethod(sh);
	}

}
