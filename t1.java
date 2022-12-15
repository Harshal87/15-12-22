/*
1.	You have to design the code such that the user has only three tries to guess the correct pin of the account. 
You set the pin as a constant. When correct display “Correct, welcome back.” 
When incorrect display “Incorrect, try again.”. When ran out of three tries display “Sorry but you have been locked out.”
 */

package test1;

import java.util.Scanner;

public class t1 {
	public static void main(String[] arg) {
		final int pin = 1941;
		int guessPin;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=3; i++)
		{
			System.out.println("Enter the Pin");
			guessPin =sc.nextInt();
			
			if (guessPin==pin)
			{
				System.out.println("Correct pin, Welcome to the System");
				break;
			}
			else {
				count++;
				if(count>=3)
				{
					System.out.println("Sorry , You have been locked");
					break;
				}
				System.out.println("Incorrect Pin Retry again");
				}
			}
		}
		
}
