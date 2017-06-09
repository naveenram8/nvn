import java.io.*;
import java.util.*;
public class palindrome {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int i=s.nextInt();
    System.out.println("The given number is:"+i);
		int sum= 0,reverse=0;
		int a, a1;
		while(i!=0) {
			a=i%10;
			sum=sum+a;
			i=i/10;
		}
		System.out.println("Sum of the digit in the number : " + sum);
		int pa=sum;
		while(sum!=0) {
			a1=sum%10;
			reverse=(reverse*10)+a1;
			sum=sum/10;
		}
		System.out.println("Reverse of sum: " + reverse);
		if(pa==reverse) {
			System.out.println("The sum is a palindrome");
		} else {
			System.out.println("The sum is not a palindrome");

		}

	}

}
