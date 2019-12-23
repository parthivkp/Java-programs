package sem3;
import java.util.*;

public class Matrix {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int m,n,p,q,c,d,k,sum=0;
	System.out.println("enter no of rowns and coloums of matrix 1");
	m=sc.nextInt();
	n=sc.nextInt();
	int first[][]=new int[m][n];
	System.out.println("enter elements");
	for(c=0;c<m;c++)
		for(d=0;d<n;d++)
			first[c][d]=sc.nextInt();
	
	System.out.println("enter no of rows and coloums of matrix 2");
	p=sc.nextInt();
	q=sc.nextInt();
	if(n!=p)
		System.out.println("cant multiply");
	else {
		
		int second[][]=new int [p][q];
		int multiply[][]=new int [m][q];
		
		
		System.out.println("enter elements");
		for(c=0;c<p;c++)
			for(d=0;d<q;d++)
				second[c][d]=sc.nextInt();
		
		
		
		for(c=0;c<m;c++) {
			for(d=0;d<q;d++) {
				for(k=0;k<p;k++)
					sum=sum+first[c][k]*second[k][d];
				
				multiply[c][d]=sum;
				sum=0;
			}
		}
		for(c=0;c<m;c++) {
			for(d=0;d<q;d++) {
				System.out.print(multiply[c][d]+"\t");
	} System.out.println("\n");
		}
	
  } }
}
