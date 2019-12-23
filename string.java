package sem3;
import java.util.*;

public class string {
	public static void main(String[] args) { int m,n,p,q,sum=0,c=0;
		Scanner sc=new Scanner(System.in);
		String s1,s,s2,s3,t;
		System.out.println("enter main string");
		s=sc.nextLine();
		String a[]=s.split(" ");
		System.out.println("enter m and n values");
		m=sc.nextInt();
		n=sc.nextInt();
		System.out.println("extracted string is "+s.substring(m, m+n));
		System.out.println("enter word to find occurance");
		s1=sc.next();
		for(String assets:a) {
			if(assets.equals(s1))
				c++;}
			System.out.println("word count is "+ c);
			System.out.println("enter word that u want to replace");
			s1=sc.next();
			System.out.println("enter new word ");
			s2=sc.next();
			t=s.replace(s1, s2);
			System.out.println("new string is "+t);
			char ab[]=s.toCharArray();
			Arrays.sort(ab);
			System.out.println(ab);
			System.out.println("enter string to compare with main string");
			s2=sc.next();
			if(s.equalsIgnoreCase(s2)) {
				System.out.println("equal");
			}else System.out.println("not equal");
			
		
			
	}
    }