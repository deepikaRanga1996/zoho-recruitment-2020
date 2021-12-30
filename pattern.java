import java.util.*;
public class pattern {

	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);  //System.in is a standard input stream   
		String str= sc.next();   //reads string before the space  
		
		 int i, j, n= str.length();  

	        for(i=0; i<n; i++) //an outer loop for number of rows(n) 
              { 
	        	for(j=2*(n-i); j>=0; j--) // an inner loop for spaces 

	            {           

	                System.out.print(" "); // to print space

	            } 

	            for(j=0; j<=i; j++) // an inner loop for columns

	            {       
	            	
	                System.out.print(str.charAt(j)); // to print star

	            }           

	            System.out.println(); // end-line after every row

	        } 
	}
	
}
