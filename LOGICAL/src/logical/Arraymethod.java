package logical;

public class Arraymethod 
{
	static int[]arr= {5,3,8,2,1};

	static int large(int[]abb)
	{
		int largest=abb[0];
		for (int i = 0; i < abb.length; i++) 
		{
			if(abb[i]>largest)
			{
				largest=abb[i];
			}
		}
		return largest;
	}
	static int small(int[]acc)
	{
		int smallest=acc[0];
		for (int i = 0; i < acc.length; i++) 
		{
			if(acc[i]<smallest)
			{
				smallest=acc[i];
			}
		}
		return smallest;
	}
	public static void main(String[] args) 
	{
		System.out.println(large(arr));
		System.out.println(small(arr));
	}

}
