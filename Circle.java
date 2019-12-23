package sem3;
import java.math.*;

 class circle1 {
 double r;
 
 
circle1(int radius){
	r=radius;
} 

double area() {
	return(3.14*r*r);
}
}
 class sector extends circle1{
	 double radians;
	sector(int radius,double radians) {
		super(radius);
		 this.radians=radians;
	}
	double area() {
		return(0.5*r*r*radians);
	}
	 
 }
class segment extends circle1{
 double h;
	segment(int radius,double h) {
		super(radius);
		this.h=h;
		
	}
	double area() {
		double a=(r*r*((r-h)/r));
		double b=(r-h)*Math.pow(2*r*h-h*h,0.5);
		return((r*r*((r-h)/r))-(r-h)*Math.pow(2*r*h-h*h,0.5));
	}
}
			public class Circle {
			public static void main(String[] args) {
			circle1 ob=new circle1(5);	
			System.out.println(ob.area());
			circle1 ob1=new sector(5,6);
			System.out.println(ob1.area());
			circle1 ob2=new segment(15,8);
			System.out.println(ob2.area());
			
			
			}
			}









