package Clg_exmple;

//Nested if...else Statement
public class Number
{
	 public static void main(String[] args) {
		 
	        // declaring double type variables
	        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;
	        // checks if n1 is greater than or equal to n2
	        if (n1 >= n2) {
	            // if...else statement inside the if block
	            // checks if n1 is greater than or equal to n3
	            if (n1 >= n3) {
	                largestNumber = n1;
	            }
	            else {
	                largestNumber = n3;
	            }
	        }
	        else {
	            // if..else statement inside else block
	            // checks if n2 is greater than or equal to n3
	            if (n2 >= n3) {
	                largestNumber = n2;
	            }
	 
	            else {
	                largestNumber = n3;
	            }
	        }
	        System.out.println("The largest number is " + largestNumber);
	    }
}


