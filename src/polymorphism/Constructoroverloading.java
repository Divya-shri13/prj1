package polymorphism;

public class Constructoroverloading {
int x;
int y;
double s;

	
		// TODO Auto-generated method stub
		Constructoroverloading() {
			x=10;
			y=20;
	
	}
		Constructoroverloading(int a , int b){
			x=a;
			y=b;
		}
		
		Constructoroverloading(int a , double f){
			x=a;
			s=f;
			
		}
		Constructoroverloading( double f , int a ){
			f=s;
			x=a;
		}
		void display() {
			System.out.println(x);
			System.out.println(y);
			System.out.println(s);
		}
		public static void main(String[] args) {
			//Constructoroverloading cons = new Constructoroverloading();
			Constructoroverloading cons = new Constructoroverloading(10,20);
			cons.display();
		}
}
