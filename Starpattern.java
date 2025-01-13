package introduction;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
       int n = num.nextInt();
       
       if(n%2==0) {
       	System.out.println("Enter Odd numbers only");
       	return;
      }
       
       else {
       for (int i = 1; i <= n / 2 + 1; i++) {     
           for (int j = 1; j < i; j++) {
               System.out.print(" ");
           }
           
           System.out.print("*");
           for (int j = 1; j <= n - 2 * i; j++) {
               System.out.print(" ");
           }
           if (i != n / 2 + 1) {
               System.out.println("*");
           } else {
               System.out.println();
           }
     }

       for (int i = n / 2; i >= 1; i--) {
           for (int j = 1; j < i; j++) {
               System.out.print(" ");
           }
           
           System.out.print("*");
           for (int j = 1; j <= n - 2 * i; j++) {
               System.out.print(" ");
           }
           System.out.println("*");
       }
   }


	}
}
	    	
	
output:
Enter the number of rows: 5
*   *
 * *
  *
 * *
*   *


