package pratices_java;

public class Student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Java_class_obj Stu=new Java_class_obj();
 
		//apporach1: using reference variable
/*Stu.sid=102;
		Stu.sname="DivS";
		Stu.grade='A';
		
		Stu.display();
		*/
		
		//apporach 2 : using method 
		// Stu.setDaata(102,"John",'A');
		
		//apporach 3 : using constructor 
		 Java_class_obj stu = new Java_class_obj(102,"John",'A');
		 
		   
		 stu.display();
	}

}
