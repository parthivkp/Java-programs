package circle;
import java.lang.*;

 class circle{
double radius; 
final double pi=3.14;
circle(int r){
	radius=r;
} double area() {
	return(pi*radius*radius);
	
}
} 
 class sector extends circle{
double areasector; 
 double angle;
	sector(int r,double ang) {
		super(r);
		radius=r;
		angle=ang;
		
	} double areasector() {
		return(0.5*radius*radius*angle);
	}
	 
 }
 class segment extends circle{
	 int length; double angle;
	 segment(int r,int leg,double ang){
		 super(r);
		 radius=r;
		 length=leg;
		 angle=ang;
	 } double areasegment() {
		 return(radius*radius*((radius-length/radius)-(radius-length)*Math.pow(2*radius*length-length*length,0.5)));
	 }
 }
public class circle1{
	public static void main (String args[]) {
		circle area=new circle(5);
		System.out.println("area of circle is "+area.area());
		sector areasec=new sector(5,30);
		System.out.println("area of sector is "+areasec.areasector());
		segment areaseg=new segment(5,10,56);
		System.out.println("area of segment is "+areaseg.areasegment());
	}
}