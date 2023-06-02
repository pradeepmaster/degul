
package logical;

import java.util.Scanner;

public class Arrayscanner {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in) ; 
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("enter value");
		int[]arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		for(int p=0;p<arr.length;p++)
		{
			System.out.println(arr[p]);
		}
		
	}
	

}
