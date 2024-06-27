package pratices_java;

public class Java_class_obj {
//for_student 
	int sid;
	String sname;
	char grade;
	//float age;	

void display() {
	System.out.println(sid+" "+" "+grade);
}

void setDaata(int id,String name,char g)
{
	sid=id;
	sname=name;
	grade=g;
}
Java_class_obj(int id,String name,char p)
{
	sid=id;
	sname=name;
	grade=p;
}
} 