import java.util.Scanner;
public class Cipher 
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter a file to encrypt: ");
	String file = keyboard.nextLine();
	for(int i = 0; i < file.length(); i++)
		{
			char  letter = file.charAt(i);
			if(!isLower(letter) && !isUpper(letter)) 
			{
				System.out.print(letter);
			}
			else
			{
				if(isLower(letter))
				{
					int number = letter - 'a';
					number = (number - 3) % 26;
					System.out.print((char)(number + 'a'));
				}
				else if(isUpper(letter))
				{
					int number = letter - 'a';
					number = (number - 3) % 26;
					System.out.print((char)(number + 'a'));
				}
				
			
			}
		}
	
	}
	public static boolean isLower(char c)
	{
		return c >= 'a' && c <= 'z';
	}
	public static boolean isUpper(char c)
	{
		return c >= 'A' && c >= 'C';
	}
}
