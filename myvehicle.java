package sem3;
import java.util.*;

abstract class vehicle{
	int year_of_manufacture;
	vehicle(){
		year_of_manufacture=0;
	}
	 abstract void getdata();
	 abstract void putdata();
		
	
}
class twowheeler extends vehicle{

	@Override
	void getdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year of manufacture of two wheeler");
		year_of_manufacture=sc.nextInt();
		
	}

	@Override
	void putdata() {
		System.out.println("printing details....");
		System.out.println("year of manufacture is"+year_of_manufacture);
		
	}
	
}
final class fourwheeler extends vehicle{

	@Override
	void getdata() {
		
		
	}

	@Override
	void putdata() {
		
		
	}
	
}
class mytwowheeler extends twowheeler{
	mytwowheeler(){
		super.year_of_manufacture=2000;
	}
	void print() {
		System.out.println("after using SUPER to initialize the data member of twowheeler class...");
		System.out.println("year of manufacture is"+year_of_manufacture);
	}
}






public class myvehicle {
		public static void main(String[] args) {
	twowheeler ob=new twowheeler();
	ob.getdata();
	ob.putdata();
	mytwowheeler ob1=new mytwowheeler();
	ob1.print();
}
}
