package introduction;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		
		
		Scanner word = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = word.nextLine();
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reversedStr += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversedStr);
       
	}

}




output:
	
	Enter a string: prarthana
	Reversed string: anahtrarp
