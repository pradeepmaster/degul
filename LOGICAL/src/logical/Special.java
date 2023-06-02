package logical;

import java.util.Scanner;

public class Special {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in) ;
       System.out.println("enter a");
       int a=sc.nextInt();
       System.out.println("enter b");
       int b=sc.nextInt();
       int k1=a+b;
       int k2=a-b;
       int k3=a*b;
       int k4=a/b;
       System.out.println(a+ "+" +b + "=" + k1);
       System.out.println( a + "-" +b + "=" + k2);
       System.out.println(a + "*" +b + "=" + k3);
       System.out.println(a + "/" +b + "=" + k4);
       
	}

}
   