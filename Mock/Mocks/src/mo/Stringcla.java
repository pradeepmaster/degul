package mo;

public class Stringcla {

	public static void main(String[] args) {

		java.lang.String s="x1y2z3";
		char ch=' ';
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)>='0' && s.charAt(i)>='9')
			{
				sum=sum+s.charAt(i);
			}
		}
		System.out.println(sum);
	}

}
