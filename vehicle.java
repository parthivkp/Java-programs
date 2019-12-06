package jjk;
import java.util.*;

 abstract class vehicle1 { int year_of_man,year_of_man2;
vehicle1(){
	year_of_man=0;
}	Scanner sc =new Scanner(System.in);
	abstract void getdata();
	abstract void putdata();
}
 class twowheeler extends vehicle1{int year_of_man;

	twowheeler() {
		super();
		
	} 


	void getdata() {
		System.out.println("two wheeler year of manufacture");
		year_of_man=sc.nextInt();
		
	}

	
	void putdata() {
		System.out.println("two wheeler year of manufacture");
		System.out.println(year_of_man);
		
	}
	 
 } 
 final class fourwheeler extends vehicle1{

	

	
	void getdata() {
		System.out.println("four wheeler year of manufacture");
		year_of_man2=sc.nextInt();
		
	}

	
	void putdata() {
		System.out.println("four wheeler year of manufacture is.....");
		System.out.println(year_of_man2);
		
	}
	 
 } class mytwowheeler extends twowheeler{
	 {
		 super.year_of_man=2000;   
		 super.getdata();
		 super.putdata();
		 
	 }

} public class vehicle{
	public static void main (String[] args) {
		mytwowheeler ob=new mytwowheeler();
		fourwheeler ob2=new fourwheeler();
		ob2.getdata();ob2.putdata();
	}
}
	 
 
