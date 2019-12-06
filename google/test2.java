package google;
import java.util.*;



class Test{ 
	public static void main(String args[]) { int i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of faculty");
	n=sc.nextInt();
	
	
	
	ise[] ob=new ise[5]; 
	for(i=1;i<=n;i++) {
		ob[i]=new ise();
		System.out.println("enter the details of faculty"+i);
		try {
			
		ob[i].readdata();
		}catch(AgeException e) {
			System.out.println("caught "+e); }
			
		
	}for(int j=1;j<=n;j++) {
		System.out.println("printing......");
		
		ob[j].print();
	}
	
	
	}
}
