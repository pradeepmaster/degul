package logical;

public class Arrayadd {

	public static void main(String[] args)
	
	{
		int[]arr= {10,20};
		int[]abb= {5,5,35};
		int first=0;
		int second=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<abb.length;j++)
			{
				if(i==j)
				{
					first=arr[i]+abb[j];
				}
				else if(i!=j)
				{
					second=abb[j];
				}
			}
			System.out.print(first +" ");
		}
		System.out.print(second);
	
	}
}


















