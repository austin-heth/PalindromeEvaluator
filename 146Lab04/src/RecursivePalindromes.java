//Written by Austin Hetherington

import java.util.Scanner;
public class RecursivePalindromes {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a word and I will determine if it is a palindrome");
		String original = keyboard.nextLine();
		
		//creates copy of original to be passed through recursive method
		String pdrome = original.trim();
		
		if(pdromeCheck(pdrome.toLowerCase()))
		{
			System.out.println("The word "+original+" is a palindrome");
		}
		else System.out.println("The word "+original+" is not a palindrome");
		
		
		
		
	}
	
	//recursive method
	public static boolean pdromeCheck(String aWord)
	{
		System.out.println(aWord);
		if(aWord.length()<2)
		{
			return true;
		}
		else if(aWord.charAt(0) == aWord.charAt(aWord.length()-1))
		{
			aWord = aWord.substring(1, aWord.length()-1);
			return (pdromeCheck(aWord.trim()) && true);
		}
		else return false;
	}

}
