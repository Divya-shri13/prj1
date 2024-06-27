package com.capgemin;


	import java.io.BufferedReader;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;

	
	class Customer {
		private int id;
		private String name;
		private double expenses;

		public Customer(int id, String name, double expenses) {
			super();
			this.id = id;
			this.name = name;
			this.expenses = expenses;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getExpenses() {
			return expenses;
		}

		public void setExpenses(double expenses) {
			this.expenses = expenses;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", expenses=" + expenses + "]";
		}
	}
	

	public class Test1 {
		 
		public  void main(String[] args) throws FileNotFoundException {
		
			ArrayList<Test1> list = new ArrayList<Test1>();
			
			
			String fileName="customer1.txt";
			 FileInputStream fis =
					 new FileInputStream(fileName);//checked exception
			 InputStreamReader isr =
					 new InputStreamReader(fis);
			 BufferedReader br=
					 new BufferedReader(isr);
			 try {
				 String line;
				 while((line=br.readLine())!=null) {
					 String data[]=line.split(",");
					 int id=Integer.parseInt(data[0]);
					 String name=data[1];
					 double exps=Double.parseDouble(data[2]);
					 
					 Test1 customer=new Test1(id,name,exps);
					 
					 list.add(customer);
				 } 
			} catch (IOException e) {
				 e.printStackTrace(); //handle the exception
			}
			 
			
			 try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			
			 for(int index=0;index<list.size();index++) {
				 System.out.println(list.get(index));
			 }
			
			
			
		}

	}
	
	