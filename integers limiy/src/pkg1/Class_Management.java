package pkg1;

public class Class_Management
{
	
	public static boolean name_compare(String n1,String n2)
	{
		n1=n1.toUpperCase();
		n2=n2.toUpperCase();
		int s=(n1.length()>n2.length())?n2.length():n1.length();
		for(int i=0;i<s;i++)
		{
			if(n1.charAt(i)>n2.charAt(i))
			{
				return true;
			}
			if(n1.charAt(i)<n2.charAt(i))
			{
				return false;
			}
		}
		return (n1.length()>n2.length())?true:false;
	}
	
	public static boolean if_same(String n1,String n2)
	{

		n1=n1.toUpperCase();
		n2=n2.toUpperCase();
		int c=1;
		if(n1.length()==n2.length())
		{
			for(int i=0;i<n1.length();i++)
			{
				if(n1.charAt(i)==n2.charAt(i))
				{
					c+=1;
				}
			}
		}
		return (c==n1.length())?true:false;
	}
	
	
	
	public static void firstName_compare(String[][] student)
	{
		String temp;
		for(int i=0;i<student.length;i++)
		{
			for(int r=0;r<student.length-1;r++)
			{
				boolean co=if_same(student[r][0],student[r+1][0]);
				if(co==true)
				{
					lastName_compare(student);
				}
//			}
//		}	
//		
//		for(int i=0;i<student.length;i++)
//		{
//			for(int r=0;r<student.length-1;r++)
//			{
			else
			{		
				boolean com=name_compare(student[r][0],student[r+1][0]);
				if(com==true)
				{	for(int c=0;c<student[r].length;c++)
					{
					 	temp=student[r+1][c];
					 	student[r+1][c]=student[r][c];
					 	student[r][c]=temp;
					}
				}
			}	
//			}	
	}	
	}
		}
	
	public static void lastName_compare(String[][] student)
	{

		String temp;
		for(int i=0;i<student.length;i++)
		{
			for(int r=0;r<student.length-1;r++)
			{
				boolean com=name_compare(student[r][1],student[r+1][1]);
				if(com==true)
				{	for(int c=0;c<student[r].length;c++)
					{
					 	temp=student[r+1][c];
					 	student[r+1][c]=student[r][c];
					 	student[r][c]=temp;
					}
				}
			}	
		}	
	}
	
	
	public static int roll_count(int roll)
	{
		roll+=1;
		return roll;
	}
	
		
	
	public static void main(String[] args)
	{
		String[][] stud= {
				{"Abacus","Aas"},
				{"Dosa","Das"},
				{"Fili","Fas"},
				{"Billi","Bhas"},
				{"Ele","Ehant"},
				{"Abacus","Aaasa"}};
		firstName_compare(stud);
		int roll=0;
		for(int r=0;r<stud.length;r++)
		{	
			roll=roll_count(roll);
			System.out.print(roll+"\t");
			for(int c=0;c<stud[r].length;c++)
			{	
			 System.out.print(stud[r][c]+"\t");
			} 
			System.out.print("\n");
		}
	}
}
