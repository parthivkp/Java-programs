package sgpa;
import java.util.*;


interface student{
	void name();
	void branch();}

class creditexception extends Exception{
	creditexception(String s){
		super(s);
	}
}



 public class registerstudent implements student{ public static String name;public static int sub1[]=new int[6],sub2[]=new int[6];
public String branch;int credit;
 Scanner sc=new Scanner(System.in);
	
	public void name() {
		System.out.println("enter name of student");
		name=sc.nextLine();
		
	}
	public void branch() {
		System.out.println("enter branch of student");
		branch=sc.nextLine();
	} 
	public void register() throws creditexception {
		System.out.println("enter total credits registered for this semester");
		credit=sc.nextInt();
		if (credit>30) {
			throw new creditexception("credits overflow");
		}
		
		
	} public void marks() {  
		for(int i=1;i<=2;i++) {
			System.out.println("semester number"+(i));
		System.out.println("enter marks of subject 1");
		 sub1[i]=sc.nextInt();
		System.out.println("enter marks of subject 2");
		 sub2[i]=sc.nextInt();	
		
		}
	}
	public char getgrade(int subj) {
		if(subj>90) return 's';
		else if(subj>80) return 'a';
		else if(subj>70) return 'b';
		else if (subj>60)return 'c';
		else if(subj>50)return 'd';
		else if(subj>40)return 'e';
		else return 'f';
	}
	public void sgpa() {
		 double percentage1=sub1[1]+sub2[1]/200;
		 System.out.println("sgpa of 1st sem"+(percentage1+9)/10);
		 double percentage2=sub1[2]+sub2[2]/200;
		 System.out.println("sgpa of 1st sem"+(percentage2+9)/10);
		 double cgpa=(((percentage1+9/10)+(percentage2+9/10))/2)/10;
		 System.out.println("cgpa is"+cgpa);
	 }

 } 