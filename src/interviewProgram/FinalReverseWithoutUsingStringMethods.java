package interviewProgram;

import java.util.Scanner;

//Q1: Write a Java Program to reverse a string with using String Inbuilt function?

public class FinalReverseWithoutUsingStringMethods {

	public static void main(String[] args) {
		
String  str = "Automation";
StringBuilder str2 = new StringBuilder();
str2.append(str);// append means add something as attachment
str2 = str2.reverse();//used string builder to reverse
System.out.println(str2);


//Q2 write a Java Program to reverse a string without using String inbuiltfunction reverse().
//Method 1

String str1= "Nirup Amatya";
char chars[]= str1.toCharArray(); //converted to character array and printed in reverse order
for (int i= chars.length-1;i>=0 ;i--) {
	System.out.println(chars[i]);
}
//Method 2
	String str3;
	Scanner input = new Scanner(System.in);
	System.out.println("enter your string  :");
	str3= input.nextLine();
	String [] token = str3.split(""); //used split method to print in reverse order
	for (int j = token.length-1;j>=0;j--) {
		System.out.print(token[j]+ "");
	
}
	
// Method 3
	
	String orginal;
	String reverse= "";
	System.out.println("Enter the string to be reverse :");
	Scanner input1 = new Scanner(System.in);
	orginal = input1.nextLine();
	int length = orginal.length();
	for(int k=length-1;k>=0;k--) {
		reverse = reverse +orginal.charAt(k);// used inbuilt charAt() to reverse the string	
	}
	System.out.println(reverse);
	input.close();
	input1.close();
	
	}

}
