package interviewProgram;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	// Q#3 Write a Java program to swap two numbers with using the third variable.
		
		int x,y,temp;
		System.out.println("Give the value of x  and y :");
		Scanner input = new Scanner (System.in);
		x=input.nextInt();
		y = input.nextInt();
		
		System.out.println("Before Swaping "+ x +" & "+ + y);
		temp = x;
		x=y;
		y =temp;
		System.out.println("After Swaping "+x +  "&" + y);

	//Q#4 Write a Java Program to Swap two numbers without the third variable
		
		int a,b;
		System.out.println("Give the Value of a  and  b");
		Scanner abc = new Scanner(System.in);
		a=abc.nextInt();
		b = abc.nextInt();
		System.out.println("Before Swapping the value of" +a+ "and"+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping the value of"+ a+" and" +b );
	
	}
	
	
	

	}

	


