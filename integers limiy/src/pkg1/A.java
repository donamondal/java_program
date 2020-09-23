package pkg1;

class B 
{
		public void methodA() 
		{ 
			System.out.println("Base class method"); 
		} 
	}
	class A extends B 
	{ 
		public void methodB() 
		{ 
			System.out.println("Child class method"); 
		} 
		public static void main(String args[]) 
		{ 
			A obj = new A(); 
			obj.methodA(); //calling super class method 
			obj.methodB(); //calling local method 
		} 
	} 


