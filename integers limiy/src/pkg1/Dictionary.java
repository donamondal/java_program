package pkg1;
import java.util.Scanner;
public class Dictionary 
{

	public static void main(String[] args)

	{

		String word[][]= {{"apple","fruit"},{"bat","play"},{"cat","animal"},{"draw","art"}};

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a word\n");

		String n= in.nextLine();

		in.close();

		n=n.toLowerCase();

		for(int r=0;r<word.length;r++)

		{

			if(word[r][0].equals(n))

			{

				System.out.print(word[r][1]);

			}
		}	
	}	
}			
