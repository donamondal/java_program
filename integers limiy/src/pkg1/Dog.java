package pkg1;

public class Dog 
{
	int dogAge;
	public Dog(String dogname){
	System.out.println("Dog Name Passed is :" + dogname );
	}
	public void initAge( int dogage ){
	dogAge = dogage;
	}
	public int getDogAge( ){
	System.out.println("Dog’s present age is:" + dogAge );
	return dogAge;
	}
	public static void main(String []args){
	Dog myDog = new Dog( "jimmy" );
	myDog.initAge( 5 );
	myDog.getDogAge( );
	System.out.println("Variable dogAge Value is:" + myDog.dogAge );
	}

}
