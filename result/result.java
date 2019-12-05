package result;
import static sgpa.registerstudent.*;

import sgpa.*;


public class result  {
public static void main(String[] args) { 
	registerstudent ob=new registerstudent();
	ob.name();
	ob.branch();try {
	ob.register();} catch(Exception e) {
		System.out.println("credit over flow"+e);
	}ob.marks();
		for(int i=1;i<=2;i++) {
		System.out.println(i+"semester......");
		System.out.println("grade of subject 1 is.."+ob.getgrade(sub1[i]));
		System.out.println("grade of subject 2 is.."+ob.getgrade(sub2[i]));
		}
	 ob.sgpa();
	 }
}
	


