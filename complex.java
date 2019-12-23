package sem3;
import java.util.*;

public class complex {
	
	int real,img;
	
	
	
	
	void set() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter real part");
		real=sc.nextInt();
		System.out.println("enter img part");
		img=sc.nextInt();
	}
	void add(complex a) {
		this.real=a.real+this.real;
		this.img=a.img+this.img;
		System.out.println("addition is-----");
		System.out.println(this.real+" + "+this.img+"i");
	}
	void sub(complex a) { 
		this.real=this.real-a.real;
		this.img=this.img-a.img;
		System.out.println("subtraction is-----");
		System.out.println(this.real+" + "+this.img+"i");
	}
	void mul(complex a) {
		int temp=this.real;
		this.real=this.real*a.real-this.img*a.img;
		this.img=a.real*this.img+a.img*temp;
		System.out.println("multiplication is-----");
		System.out.println(this.real+" + "+this.img+"i");
	}
	
	
	
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		complex a=new complex();
		complex b=new complex();
		System.out.println("1.add");
		System.out.println("2.subtract");
		System.out.println("3.multiply");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:System.out.println("1st complex number");
				a.set();
				System.out.println("2nd complex number ");
			   b.set();
			   a.add(b);
			   break;
		case 2:System.out.println("1st complex number");
				a.set();
				System.out.println("2nd complex number ");
				b.set();
				a.sub(b);
				break;
		case 3:System.out.println("1st complex number");
			a.set();
			System.out.println("2nd complex number ");
			b.set();
			a.mul(b);
			break;
		
		}
		
	}
	
	
	
	
		
	}
		
	
	
	

