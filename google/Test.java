package google;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

interface department{
	void readdata() throws AgeException;
	void printdata();
	
	
}

class AgeException extends Exception{ 
	
	AgeException(String s){
		
		super(s);
		
	}
}
	class faculty{ int age,year;
	String name,subject;
	
	
		 faculty(){
			 
		 }
		faculty(String name,int age,int year,String subject){
			this.age=age;
			this.name=name;
			this.year=year;
			this.subject=subject;
		}
		
	}
	class ise implements department{
		int age,year,t; String subject;
		String name;
		
		public void readdata() throws AgeException{
			Scanner sc =new Scanner(System.in);
			
			System.out.println("enter name  ");
		    name=sc.nextLine();
		    System.out.println("enter the subject handled by this faculty");
			subject=sc.nextLine();
			System.out.println("enter age  ");
			age=sc.nextInt();
			System.out.println("enter year of exp");
			year=sc.nextInt();
			faculty ob=new faculty(name ,age,year,subject);
			if (age>58) {
				throw new AgeException("age is greater than 58"+" ");
			}	
		}
		public void printdata() {
			
		
			System.out.println("name of the faculty is "+" "+name);
			System.out.println("age is "+age);
			System.out.println("year of exp"+" "+year);
			System.out.println("subjects handle by this faculty is/are: "+""+subject);
			
			System.out.println("Next faculty details printing...if any");
		}
		public void print() {
			if (year>=20) {
				printdata();
			} else return;
		}
	}
	