package polymorphism;

public class methodoverloading {
int x,y,z;	
double d;

 void sum () {
	 x=10;
	 y=20;
	 System.out.println(x+y);
	 	 
 }
 
 void sum (int a,int b) {
	 x=a;
	 y=b;
	 System.out.println(x+y);
 }
 void sum(int a , double f) {
	 x=a;
	 d=f;
	 System.out.println(x+y);
 }
 void sum(double f , int a) {
	 d=f;
	 x=a;
	 System.out.println(x+d);
	 }
 public static void main(String []args) {
	  methodoverloading mo = new methodoverloading();
	  mo.sum(10.7,5);

 }
}
