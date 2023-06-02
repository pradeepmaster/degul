package logical;

public class Numberr {

	public static void main(String[] args) {
		int primecount=0;
		int sum=0;
		for(int j=1;j<=100;j++)
		{
		int num=j;
		int count=0;
		for(int i =1;i<=num;i++)
		{
			if(num% i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println( num + " " );
			primecount++;
			sum=sum+num;
		}
		
	}
		System.out.println( "total count of prime num is "  + primecount);
		System.out.println("total sum of prime num is "   + sum);
	}
}
