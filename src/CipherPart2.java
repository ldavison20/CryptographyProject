import java.io.IOException;
import java.util.Scanner;
public class CipherPart2 
{
	public static void main(String args[])
	{
		boolean encrypt = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Would you like to encrypt or decrypt?: ");
		String crypt = keyboard.nextLine();
		if(crypt == "encrypt")
		{
			encrypt = true;
			System.out.print("How many spaces should the alphabet be shifted?: ");
			int shiftamount = keyboard.nextInt();
			
			System.out.print("Enter a filename to encrypt: ");
		}
		else if(crypt == "decrypt")
		{
			encrypt = false;
			System.out.print("How many spaces should the alphabet be shifted?: ");
			int shiftamount = keyboard.nextInt();
			
			System.out.print("Enter a filename to decrypt: ");
		}
	
		
		
	}

	public static String caesar_cipher(String filename, boolean encrypt, int shiftamount) throws IOException
	{
		

	}
	

}
