package interviewProgram;
// Q#7 Write a Java pragram to find whether a number is prime or not
// Prime Number are divisible by 2 natural number (1 and itself)

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
int temp,num;
boolean isPrime= true;
Scanner input= new Scanner (System.in);
num=input.nextInt();
input.close();
for (int i=2; i<num/2;i++) {
	temp = num%i;
	if (temp==0){
		isPrime =false;
		break;
		
	}
	
}
if (isPrime) {
	System.out.println(num +"Numberis Prime");}
else { System.out.println(num + "Number is not a Prime");
}
}
	}


