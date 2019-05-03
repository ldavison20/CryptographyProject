import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class Cipher3 
{
	private static Scanner inputFile;
	public static void main(String args[]) throws IOException
	{
		String encryptedString = "";
		boolean encrypt = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Would you like to encrypt, decrypt or crack?: ");
		String crypt = keyboard.nextLine();
		if(crypt.equals("encrypt"))
		{
			encrypt = true;
			System.out.print("How many spaces should the alphabet be shifted?: ");
			int shiftamount = keyboard.nextInt();
			keyboard.nextLine();
			System.out.print("Enter a filename to encrypt: ");
			String file = keyboard.nextLine();
			keyboard.close();
			encryptedString = caesar_cipher(file, encrypt, shiftamount);
			
		}
		else if(crypt.equals("decrypt"))
		{
			encrypt = false;
			System.out.print("How many spaces should the alphabet be shifted?: ");
			int shiftamount = keyboard.nextInt();
			keyboard.nextLine();
			System.out.print("Enter a filename to decrypt: ");
			String file = keyboard.nextLine();
			
			keyboard.close();
			encryptedString = caesar_cipher(file, encrypt, shiftamount);
			
		}
		else if(crypt.equals("crack"))
		{
			System.out.print("Enter a filename to crack: ");
			String file = keyboard.nextLine();
			
			
		}
		
		
	
		System.out.println(encryptedString);
	}

	public static String caesar_cipher(String filename, boolean encrypt, int shiftamount) throws IOException
	{
		String fileContents = "";
		String doneString = "";
		File myFile = new File(filename);
		inputFile = new Scanner (myFile);
		String output = filename.substring(0, filename.length() -4) + "_ENC.text";
		PrintWriter outputFile = new PrintWriter(output);
		if(encrypt = true)
		{
		while(inputFile.hasNextLine())
		{
			fileContents += inputFile.nextLine();
		}
		for(int i = 0; i < fileContents.length(); i++)
			{
				char  letter = fileContents.charAt(i);
				if(!isLower(letter) && !isUpper(letter)) 
				{
					outputFile.print(letter);
					doneString+=(letter);
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
						outputFile.print((char)(number + 'a'));
						doneString+=((char)(number + 'a'));
					}
					else if(isUpper(letter))
					{
						int number2 = letter - 'a';
						number2 = (number2 + shiftamount) % 26;
						if(number2 < 0)
						{
							number2 += 26;
						}
						outputFile.print((char)(number2 + 'a'));
						doneString+=((char)(number2 + 'a'));
					}
					
				
				}
			}
		
		}
	
		if(encrypt = false)
		{
		while(inputFile.hasNextLine())
		{
			fileContents += inputFile.nextLine();
		}
		for(int i = 0; i < fileContents.length(); i++)
			{
				char  letter = fileContents.charAt(i);
				if(!isLower(letter) && !isUpper(letter)) 
				{
					outputFile.print(letter);
					doneString+=(letter);
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
					outputFile.print((char)(number + 'a'));
					doneString+=((char)(number + 'a'));
					}
					else if(isUpper(letter))
					{
						int number2 = letter - 'a';
						number2 = (number2 - shiftamount) % 26;
						if(number2 < 0)
						{
							number2 += 26;
						}
						outputFile.print((char)(number2 + 'a'));
						doneString+=((char)(number2 + 'a'));
					}
					
				
				}
			}
	
		}
		inputFile.close();
		outputFile.close();
		return doneString;
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
