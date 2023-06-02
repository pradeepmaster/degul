package logical;

public class Patterns {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int space1=1;
        int star1=19;
		
		for(int j=1;j<=10;j++)
		{
		for (int i = 1; i <=space1; i++) 
        {
			System.out.print(" ");
		}
		for(int k=1;k<=star1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
		space1++;
		star1-=2;	
		}
		
           int space=10;  
          int star=1;
		
		for(int j=1;j<=11;j++)
		{
		for (int i = 1; i <=space; i++) 
          {
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		} 
		System.out.println();
		space--;
		star+=2;
		}		 
	}
}
