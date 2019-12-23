package result;
import sem3.*;

public class display {
public static void main(String[] args) {
	
	register_std ob =new register_std();
	register_std ob1=new register_std();
	register_std ob2=new register_std();
	register_std ob3=new register_std();
	register_std ob4=new register_std();
	ob.getname();
	ob.getbranch();
	System.out.println("registration");
	ob.register();
	System.out.println("displaying grade and sgpa of a particular sem");
	ob.sgpa();
	System.out.println("To display cgpa and sgpa of 4 semester");
	System.out.println("enter details of 1st semester");
	ob1.register();
	ob1.sgpa();
	System.out.println("enter details of 2nd semester");
	ob2.register();
	ob2.sgpa();
	System.out.println("enter details of 3rd semester");
	ob3.register();
	ob3.sgpa();
	System.out.println("enter details of 4th semester");
	ob4.register();
	ob4.sgpa();
	System.out.println("printing sgpa of 1st sem"+ob1.sgpa);
	System.out.println("printing sgpa of 2nd sem"+ob2.sgpa);
	System.out.println("printing sgpa of 3rd sem"+ob3.sgpa);
	System.out.println("printing sgpa of 4th sem"+(float)ob4.sgpa);
	float cgpa=(float)(ob1.sgpa+ob2.sgpa+ob3.sgpa+ob4.sgpa)/4;
	System.out.println("cgpa is"+cgpa);
	
	
}
}
