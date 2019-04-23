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
					if(number < 0)
					{
						number += 26;
					}
					System.out.print((char)(number + 'a'));
				}
				else if(isUpper(letter))
				{
					int number2 = letter - 'a';
					number2 = (number2 - 3) % 26;
					if(number2 < 0)
					{
						number2 += 26;
					}
					System.out.print((char)(number2 + 'a'));
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
		return c >= 'A' && c >= 'Z';
	}
}
