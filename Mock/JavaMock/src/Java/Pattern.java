package Java;

public class Pattern {

	public static void main(String[] args) 
	
	{
		int space=0;
	for(int i=4;i>=1;i--)
	{
		for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
		for(int j=i;j>=1;j--)
		{
			System.out.print(j );
		}
		System.out.println();
		space++;
	}

	}

}