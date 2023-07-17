package TYSSlogical;

public class Return5intryblock {
	public static int go()
	{
		try {
			return 5;
		}
		finally
		{
			System.out.println("done");
		}
	}
	public static void main(String[] args)
	{
	   System.out.println(go());
	}
}
