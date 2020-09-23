package pkg1;

public class MainMethodOverload1 
{
	// Overloaded main() method 1   
	//invoked when an int value is passed  
	public void main(Integer args)   
	{   
	System.out.println("Overloaded main() method invoked that parses an integer argument");   
	}   
	// Overloaded main() method 2   
	//invoked when a char is passed  
	public static void main(char args)   
	{   
	System.out.println("Overloaded main() method invoked that parses a char argument");   
	}   
	//Original main() method  
	public static void main(String[] args)   
	{   
	MainMethodOverload1 s1=new MainMethodOverload1();
	System.out.println("Original main() method invoked");   
	s1.main(6);
	main('h');
	}   

}
