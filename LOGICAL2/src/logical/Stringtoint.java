package logical;

public class Stringtoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "12010";
		int no=Integer.parseInt(s);
		int count=0;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==1|| rem==0 )
			{
				count++;
				System.out.println(rem);
			}
			no=no/10;
		}
		System.out.println(no);
		
	}
}
