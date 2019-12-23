package sem3;
import java.util.Scanner;
import java.lang.*;

class account{
	int acc_no;
	String name;
	long ph_no;
	float bal_amt=500;
	
	void get_input(){ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name of account holder");
		name=sc.nextLine();
		System.out.println("enter account number");
		acc_no=sc.nextInt();
		System.out.println("enter phone number ");
		ph_no=sc.nextLong();
		
	}
	void deposit() { float dep;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount u want to deposit");
		dep=sc.nextFloat();
		bal_amt=bal_amt+dep;
		
		
	}
	void withdraw() { float wid;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount u want to withdraw");
		wid=sc.nextFloat();
		bal_amt=bal_amt-wid;
		if(bal_amt<500) {
			System.out.println("withdraw not possible because minimun balance of 500 is required");
			bal_amt=bal_amt+wid;
		}
	} 
	void print() {
		System.out.println("name of account holder is -->"+name);
		System.out.println("account number is----------->"+acc_no);
		System.out.println("phone no. of account holder->"+ph_no);
		System.out.println("Balance amount in account--->"+bal_amt);
	}
}

public class Main { static int ch;static boolean o=true;
 
	public static void main(String args[]) {
		account ob=new account();
		Scanner sc=new Scanner(System.in);
		while(o) {
		System.out.println("1.get input from user");
		System.out.println("2.deposit");
		System.out.println("3.withdraw");
		System.out.println("4.print");
		System.out.println("0 to exit");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:ob.get_input();break;
		case 2:ob.deposit();break;
		case 3:ob.withdraw();break;
		case 4:ob.print();break;
		case 5:System.out.println("terminated");System.exit(0);break;
		}
		
	}
}
}