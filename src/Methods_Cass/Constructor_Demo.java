package Methods_Cass;

public class Constructor_Demo {
	int x;
	int y;
	String s;
	Constructor_Demo(){
		x=20;
		y=10;
		s="welcome";
	}
	
	Constructor_Demo(int a , int b, String m){
	x=a;
	y=b;
	s=m;
	}
	

	void displayData() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor_Demo crt = new Constructor_Demo();
		Constructor_Demo cd = new Constructor_Demo(100, 200, "Divs");
		//crt.displayData();
		cd.displayData();
	}

}
