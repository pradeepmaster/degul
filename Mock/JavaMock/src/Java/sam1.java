package Java;

public class sam1 {

	public static void main(String[] args) {

		String s="s12f";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				System.out.print("");
			}
			else
			{
				sum=sum+s.charAt(i);
			}
		}
				System.out.println(sum);
	}

}
