/* 2.	Write a Java class called CountDigits. Here you need to accept a number as input.
 And you have to find how many digits are there in that number. For example, 
 if you get a number as 37921, then your output should be 5. You MAY assume that accepted number is a positive integer.
 */
package test2;

import java.util.Scanner;

public class t2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while (num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count of digits in number: " + count);
		}
}
