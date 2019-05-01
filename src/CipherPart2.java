import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class CipherPart2 
{
	public static void main(String args[])
	{
		boolean encrypt = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Would you like to encrypt or decrypt?: ");
		String crypt = keyboard.nextLine();
		if(crypt.equals("encrypt"))
		{
			encrypt = true;
			System.out.print("How many spaces should the alphabet be shifted?: ");
			int shiftamount = keyboard.nextInt();
			
			System.out.print("Enter a filename to encrypt: ");
			String file = keyboard.nextLine();
			keyboard.close();
			File myFile = new File(file);
			Scanner inputFile = new Scanner (myFile);
			String output = file.substring(0, file.length() -4) + "_ENC.text";
			PrintWriter outputFile = new PrintWriter(output);
			caesar_cipher(myFile, crypt, shiftamount);
			inputFile.close();
			outputFile.close();
			
		}
		else if(crypt.equals("decrypt"))
		{
			encrypt = false;
			System.out.print("How many spaces should the alphabet be shifted?: ");
			int shiftamount = keyboard.nextInt();
			
			System.out.print("Enter a filename to decrypt: ");
			String file = keyboard.nextLine();
			keyboard.close();
			File myFile = new File(file);
			Scanner inputFile = new Scanner (myFile);
			String output = file.substring(0, file.length() -4) + "_ENC.text";
			PrintWriter outputFile = new PrintWriter(output);
			caesar_cipher(myFile, crypt, shiftamount);
			inputFile.close();
			outputFile.close();
			
		}
	
		
	}

	public static String caesar_cipher(String filename, boolean encrypt, int shiftamount) throws IOException
	{
		if(encrypt = true)
		{
		while(inputFile.hasNextLine())
		{
		for(int i = 0; i < filename.length(); i++)
			{
				char  letter = filename.charAt(i);
				if(!isLower(letter) && !isUpper(letter)) 
				{
					System.out.print(letter);
				}
				else
				{
					if(isLower(letter))
					{
						int number = letter - 'a';
						number = (number + shiftamount) % 26;
						if(number < 0)
						{
							number += 26;
						}
						System.out.print((char)(number + 'a'));
					}
					else if(isUpper(letter))
					{
						int number2 = letter - 'a';
						number2 = (number2 + shiftamount) % 26;
						if(number2 < 0)
						{
							number2 += 26;
						}
						System.out.print((char)(number2 + 'a'));
					}
					
				
				}
			}
	
		}
		}
		if(encrypt = false)
		{
		while(inputFile.hasNextLine())
		{
		for(int i = 0; i < filename.length(); i++)
			{
				char  letter = filename.charAt(i);
				if(!isLower(letter) && !isUpper(letter)) 
				{
					System.out.print(letter);
				}
				else
				{
					if(isLower(letter))
					{
						int number = letter - 'a';
						number = (number - shiftamount) % 26;
						if(number < 0)
						{
							number += 26;
						}
						System.out.print((char)(number + 'a'));
					}
					else if(isUpper(letter))
					{
						int number2 = letter - 'a';
						number2 = (number2 - shiftamount) % 26;
						if(number2 < 0)
						{
							number2 += 26;
						}
						System.out.print((char)(number2 + 'a'));
					}
					
				
				}
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
		return c >= 'A' && c <= 'Z';
	}

}