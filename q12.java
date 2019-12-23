package sem3;
import java.util.*;

public class q12

{

	public static void main(String args[]){ Scanner sc=new Scanner(System.in);
		String s;
		LinkedList<String> ll=new LinkedList<String>();
		
		
		while(true) {
			System.out.println("1.add name to ll");
			System.out.println("2.delete front");
			System.out.println("3.display whose lenght is <5 ");
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:System.out.println("enter name");
			      s=sc.next();
			      ll.add(s);
			      break;
			
			case 2:if(ll.peekFirst()==null)
					System.out.println("nothing to delete");
			        else
			        	System.out.println("deleted iteam is"+ll.remove(0));
					break;
					
			case 3:if(ll.peekFirst()==null)
				   System.out.println("nothing to print");
	               else {
	            	   Iterator<String> itr=ll.iterator();
	            	   while(itr.hasNext()) {
	            		   String e=itr.next();
	            		   if(e.length()<5) {
	            			   System.out.println(e);
	            		   }
	            	   }
	               } break;
			
			
			
			}
		}
		
	                

	
		
		

		}
	
}