package amazon.sofa.practice;

public class PassByValueAndPassReference {
	
	

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		String s1 = "alpha";
		String s2 = "ALPHA";
		String s3 = "Beta";
		int result;
		result = s1.compareTo(s2);
		
		t1.a = 10;
		t2.a = 20;
		System.out.println("independent t1 and t2 " + t1.a + " " + t2.a);
		
		Test.c = 20;
		System.out.println(t1.sum());
		Test.c = 100;
		System.out.println(t1.sum());
		
	}

}
class Test {
	int a, b;
	static int c;
	Test() {};
	Test(int i, int j) {
		a = i;
		b = j;
	}
	void change(Test t) {
		t.a = t.a + t.b;
		t.b = -t.b;
		
	}
	void noChange(int i, int j) {
		i = i + j;
		j = -j;
	}
	int sum() {
		return a + c;
	}
}
