/*3.	Write a program WhileLoop.java that uses while loop to perform the following steps:
1.	Prompt thebuser to input two positive integers: firstNum and secondNum(first Num must be smaller
2.	than second Num).
1.	Prompt the user to input two positive integers: firstNum and secondNum (firstNum must be smaller than secondNum).
2.	Output all the even numbers between firstNum and secondNum inclusive.
3.	Output the sum of all the even numbers between firstNum and secondNum inclusive.
4.	Output all the odd numbers between firstNum and secondNum inclusive.
5.	Output the sum of all the odd numbers between firstNum and secondNum inclusive.
*/

package test3;

import java.util.Scanner;

public class t3 {
	public static void main(String[] arg)
	{
		int Evensum=0;
		int Oddsum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two +ve number (first number must be less than second)");
		
		int first_num = sc.nextInt();
		int second_num = sc.nextInt();
		
		if (first_num < second_num)
		{
			System.out.println("even numbers are :");
			
			for (int i=first_num; i<=second_num; i++)
			{
				if (i%2==0) {
					System.out.println(i +", ");
					Evensum=Evensum+i;
				}
			}
			System.out.println("\n Sum of Even numbers from"+first_num+" to "+second_num+" is" +Evensum+"\n");
			
			System.out.println("odd numbers are :");
			
			for (int i=first_num; i<=second_num; i++)
			{
				if (i%2!=0) {
					System.out.println(i +", ");
					Oddsum=Oddsum+i;
				}
			}
			System.out.println("\n Sum of odd numbers from"+first_num+" to "+second_num+" is" +Oddsum+"\n");
		}
		else
			System.out.println("invalid input");
	}
}
