package logical;

import java.util.Scanner;

public class Dynamicfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
       int  no=sc.nextInt();
       int fact=1;
       for(int i=no;i>=1;i--)
       {
    	   fact=fact*i;
       }
	System.out.println(fact);
	}
	

}
