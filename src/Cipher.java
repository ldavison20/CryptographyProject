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
			int num = letter;
			num = (num - -4) % 26;
			System.out.print((char)(num + 'a'));
		}
	
	}

}
