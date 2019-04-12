import java.util.Scanner;
public class Cipher 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Enter name of file: ");
        String file = keyboard.nextLine();
        for(int i = 0; i < file.length(); i++)
        {
            char letter = file.charAt(i);
            int index = alphabet.indexOf(letter);
            if(!isLower(letter) && !isUpper(letter))
            {
                System.out.print(letter);
            }
            
            else
            {
                if(isLower(letter))
                {
                	System.out.print(alphabet.charAt(26 - Math.abs(index - 3)));
                }
                
                else if(isUpper(letter))
                {
                    System.out.print(alphabetUpper.charAt((3 % 26) + 26) % 26);
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

