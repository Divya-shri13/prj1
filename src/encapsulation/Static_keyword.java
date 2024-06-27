package encapsulation;

public class Static_keyword {
	static int a=10;
	int b=20;
	
	static void m1()
	{
		System.out.println("this is m1 static method");
	}
	void m2() {
		System.out.println("this is non static method"  );
	}
	
	void m() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(a);
m1();
Static_keyword SE = new Static_keyword();
   
System.out.println(SE.b);
SE.m2();
SE.m();
	
	}

}
