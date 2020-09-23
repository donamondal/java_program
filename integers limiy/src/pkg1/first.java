package pkg1;



class Student
{
	String name;
	int roll;
	int clas;
	char section;
	long createdOn;
	
	int sub1;
	int sub2;
	int sub3;
	
	Student(String name, int r, char sec) {
		this.name = name;
		this.roll = r;
		this.section = sec;
		
		createdOn = System.currentTimeMillis();
	}
	
	Student(String name, int r) {
		this.name = name;
		this.roll = r;
		this.section = 'A';
		
		createdOn = System.currentTimeMillis();
	}
	
	public void getRoll() {
		System.out.println(roll);
	}
	
	public void setRoll() {
		System.out.println("method1");
	}
	
	@Override
	public String toString() 
	{
		return name+"\t"+roll+"\t"+section;
	}	
}

public class first 
{
	public static void main(String[] args) throws InterruptedException {
		Student dog = new Student("Dog", 1, 'A');
//		Student dog = new Student();
		Thread.sleep(10);
		Student cat = new Student("Cat", 2, 'B');
		
		
		System.out.println("Time: " + dog.createdOn);
		System.out.println("Name: " + dog.name);
		System.out.println("Roll: " + dog.roll);
		System.out.println("Section: " + dog.section);
		System.out.println();
		System.out.println("Time: " + cat.createdOn);
		System.out.println("Name: " + cat.name);
		System.out.println("Roll: " + cat.roll);
		System.out.println("Section: " + cat.section);

		System.out.println(dog);
		System.out.println(cat);
	}
}