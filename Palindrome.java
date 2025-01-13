package introduction;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		

          Scanner word = new Scanner(System.in);
    	  System.out.print("Enter a word: ");
    	  String str = word.nextLine();
          str = str.toLowerCase();      
    	  int len = str.length();
    	        
    	  for (int i = 0; i < len / 2; i++) {
    	      if (str.charAt(i) != str.charAt(len - i - 1)) {
    	        	System.out.println("It is not a palindrome.");
    	            return; 
    	          }
    	      }
    	  System.out.println("It is a palindrome.");
          word.close();
    	    }
		
	
}
	


