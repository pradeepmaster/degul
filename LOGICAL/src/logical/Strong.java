package logical;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=145;
		int copy=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(copy==sum)
		{
			System.out.println("strong");
		}
		else
		{
			System.out.println("no");
		}
		
		

	}

}
