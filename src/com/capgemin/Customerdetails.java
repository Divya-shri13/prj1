package com.capgemin;
 
import java.io.*;
import java.util.*;
 class Customerdetails
 {
	 int id;
	 String name;
	 double expenses;
	 Customerdetails(int id,String name,double salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.expenses=expenses;
	 }
	 public int getId()
	 {
		 return this.id;
	 }
	 public String getName()
	 {
		 return this.name;
	 }
	    public double getExpenses()
	    {
	    	return this.expenses;
	    }
	    public void setId(int id){
	    	this.id=id;
	    }
	    public void setName(String name){
	    	this.name = name;
	    }
	    public void setExpenses(double expenses){
	    	this.expenses = expenses;
	    }
	    public void showData(){
	    	System.out.println("CustdId ="+id+" "+"CustdName="+name+" "+"CustdExpenses="+expenses);
	    	System.out.println();
	    }
 }
 class Main {

	public static void main(String[] args) {
		Customerdetails[] C = new Customerdetails[5];
		C[0]=new Customerdetails(1,"aa",1000);
		C[1]=new Customerdetails(2,"om",1000);
		C[2]=new Customerdetails(3,"jai",2000);
		C[3]=new Customerdetails(4,"ram",3000);
		C[4]=new Customerdetails(5,"raghu",4500);
		
		System.out.println("Customerdetails 1:");
		C[0].showData();
		System.out.println("Customerdetails 2:");
		C[1].showData();
		System.out.println("Customerdetails 3:");
		C[2].showData();
		System.out.println("Customerdetails 3:");
		C[3].showData();
		System.out.println("Customerdetails 4:");
		C[4].showData();
	}
		
		
				
		
		// TODO Auto-generated method stub

	}


