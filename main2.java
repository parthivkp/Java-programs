package sem3;
import java.util.*;

 class personal {
String name;
int age;
String education;
float salary=0,basic=0,da=0,hra=0;
int year_exp;
int no_loan;
float loan_amt;


void details() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	name=sc.nextLine();
	System.out.println("enter age");
	age=sc.nextInt();
	System.out.println("enter education qualifications");
	education=sc.nextLine();
	education=sc.nextLine();
	System.out.println("enter salary");
	salary=sc.nextFloat();
	
	System.out.println("enter year of exp");
	year_exp=sc.nextInt();
	System.out.println("number of loans taken");
	no_loan=sc.nextInt();
	
	
}

void is_elegible() {
	basic=salary;
	da=salary*(5/100f);
	hra=(10/100f)*salary;
	salary=hra+da+basic;
	if(age<18||salary<10000||no_loan>=1) {
		System.out.println(name+" "+"is not elegible for loan");
	}else {
		System.out.println(name+" "+" is elegible for loan");
	}
}
void tax() { float tax=0;
	System.out.println("printing tax info of "+" "+ name);
	tax=(10/100f)*salary;
	System.out.println(name+" "+"needs to pay tax of RS"+tax);
}
void promotion() {
	if(year_exp>5) {
		System.out.println(name+" "+"is eligible for a promotion");
	}else {
		System.out.println(name+" "+"is not eligible for a promotion");
		System.out.println(" ------------------------------------------------------ ");
	}
}

}
 public class main2{
	 public static void main(String args[]) { int n;
	 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number of employies");
		 n=sc.nextInt();
		 personal[] ob=new personal[10];
		 for(int i=1;i<=n;i++) {
			 ob[i]=new personal();           
			 System.out.println("enter details of employee no."+i);
			 ob[i].details();
		 }for(int j=1;j<=n;j++) {
			 System.out.println("eligibility,tax and details of employee "+j);
			 ob[j].is_elegible();
			 ob[j].tax();
			 ob[j].promotion();
		 } 
	 }
 }




