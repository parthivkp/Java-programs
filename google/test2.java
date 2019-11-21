package google;



class Test{
	public static void main(String args[]) { 
	
	
	ise ob1=new ise();
	ise ob2=new ise();
	ise ob3=new ise();
	try {
		System.out.println("enter the details of faculty 1");
		ob1.readdata();
	} catch(AgeException e) {
		System.out.println("caught exception of faculty 1"+e.getMessage()+e);
	}
	try {
		System.out.println("enter the details of faculty 2");
		ob2.readdata();
	} catch(AgeException e) {
		System.out.println("caught exception of faculty 2 "+e.getMessage()+e);
	}
	try {
		System.out.println("enter the details of faculty 3");
		ob3.readdata();
	} catch(AgeException e) {
		System.out.println("caught exception of faculty 3"+e.getMessage()+e);
	} System.out.println("Details of faculty Above 20 years of experience...printing...");{
		ob1.print();
		ob2.print();
		ob3.print();
	}
}
}