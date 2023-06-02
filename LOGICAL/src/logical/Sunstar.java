package logical;

public class Sunstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fb1=0;
		int fb2=1;
		//System.out.print(fb1+ " " +fb2+ " ");
		
		
		for (int i=1;i<=10;i++)
		{
			int fb3=fb1+fb2;
			System.out.print(fb3+ " ");
			fb1=fb2;
			fb2=fb3;
		}

	}

}
