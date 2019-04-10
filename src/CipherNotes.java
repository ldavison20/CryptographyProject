
public class CipherNotes {

	public static void main(String[] args) 
	{
		char letter = 'x';
		int number = letter - 'a';
		number = (number + 5) % 26;
		System.out.print((char)(number + 'a'));
	//int number = letter - 'a';
	//System.out.print("\n" + number);
	//number += 5;
	//System.out.print((char) (number + 'a'));
		
	}

}
