package sem3;
import java.util.*;

 interface department {
	 void readdata(); 
	 void printdata();
	 
}
 class age_exception extends Exception{
	 age_exception(String s){
		 super(s);
	 }
 }
 
 class faculty{
	 int age,year_exp;
	 String name,subject;
	 
 }
class ise_department implements department {

	faculty o=new faculty();

	 public void readdata()  {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter name  ");
	    o.name=sc.nextLine();
	    System.out.println("enter the subject handled by this faculty");
		o.subject=sc.nextLine();
		System.out.println("enter age  ");
		o.age=sc.nextInt();
		System.out.println("enter year of exp");
		o.year_exp=sc.nextInt();
		try {
		if (o.age>58) {
			throw new age_exception("age limit EXCEEDED");
		} } catch(age_exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void printdata() {
		if(o.year_exp>20) {
		System.out.println("name of the faculty is "+" "+o.name);
		System.out.println("age is "+o.age);
		System.out.println("year of exp"+" "+o.year_exp);
		System.out.println("subjects handle by this faculty is/are: "+""+o.subject);
		
		System.out.println("Next faculty details printing...if any");
		
	}
	}
}
 public class ISE {
	 public static void main(String[] args) { Scanner sc=new Scanner(System.in);
		System.out.println("enter number of faculty");
		int n=sc.nextInt();
		ise_department[] ob=new ise_department[6];
		for(int i=1;i<=n;i++) {
			ob[i]=new ise_department();
			System.out.println("reading details of faculty "+i);
			ob[i].readdata();
			
		}for(int j=1;j<=n;j++) {
			System.out.println("printing details of faculty "+j+"whose exeprience is greater than 20");
			ob[j].printdata();
			System.out.println("\n");
		}
		
	}
 }





















