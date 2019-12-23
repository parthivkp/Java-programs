package sem3;
import java.util.*;

interface student {
			void	getname();
			void getbranch();
			}
				class creditlimitexception extends Exception{
					creditlimitexception(String s){
						super(s);
					}
				}
public class register_std implements student{ public String name;

String branch; int marks[]=new int[10];int credit[]=new int[10],total_crd=0,n;public float sgpa;

	Scanner sc=new Scanner(System.in);
	public void getname() {
		System.out.println("enter name");
		name=sc.next();
	}
	public void getbranch() {
		System.out.println("enter branch");
		branch=sc.next();
	}public void register() {
		System.out.println("enter number of subjects");
		 n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("enter marks and credit of subject"+" "+i);
			marks[i]=sc.nextInt();
			credit[i]=sc.nextInt();
			
		}for(int i=1;i<=n;i++) {
			
			total_crd=total_crd+credit[i];
			
		}
		try {
		if(total_crd>30) {
			throw new creditlimitexception("exceeded");

		}
		} catch(creditlimitexception e) {
			System.out.println(e);
			System.exit(0); 
		}
	}
	public void sgpa() { int sum=0;
		for(int i=1;i<=n;i++) {
			if(marks[i]>90) {
				System.out.println("s grade in subject"+" "+i);
				sum=sum+10*credit[i];
			}else if(marks[i]>80) {
				System.out.println("A grade in subject"+" "+i);
				sum=sum+9*credit[i];
			}else if(marks[i]>70) {
				System.out.println("B grade in subject"+" "+i);
				sum=sum+8*credit[i];
			}else if(marks[i]>60) {
				System.out.println("C grade in subject"+" "+i);
				sum=sum+7*credit[i];
			}else if(marks[i]>50) {
				System.out.println("D grade in subject"+" "+i);
				sum=sum+6*credit[i];
			}else if(marks[i]>40) {
				System.out.println("E grade in subject"+" "+i);
				sum=sum+5*credit[i];
			}else if(marks[i]<40) {
				System.out.println("F grade in subject"+" "+i);
				
			}
		}  sgpa=(float)sum/total_crd;
		System.out.println("sgpa is "+sgpa);
			
		
	}
	
}
