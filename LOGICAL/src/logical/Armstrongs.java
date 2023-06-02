package logical;

import java.util.Scanner;
//am god and god will 
public class Armstrongs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=153;
		int originalnum;
		//int remainder;
		int result=0;
		originalnum=number;
		
		while(originalnum!=0)
		{
		int	remainder=originalnum%10;
			result+=Math.pow(remainder, 3);
		
			originalnum/=10;
		}
		if(result==number)
		{
			System.out.println(number + " it is armstrong number");
		}
		else
		{
			System.out.println(number + " it is not armstrong number");
		}
		}
}
