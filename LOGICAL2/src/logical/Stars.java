package logical;

import java.util.Arrays;
import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j==1||i==1 ||j==4)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
	
	}

}
