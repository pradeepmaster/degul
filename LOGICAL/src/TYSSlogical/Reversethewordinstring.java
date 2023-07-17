package TYSSlogical;

public class Reversethewordinstring {

	public static void main(String[] args) 
	{
    String s="ih ma yob";
    String s1="";
    for(int i=0;i<s.length();i++)
    {
    	if(s.charAt(i)!=' ')
    	{
    		s1=s.charAt(i)+s1;
    	}
    	else
    	{
    		System.out.print(s1+" ");
    		s1="";
    	}
    	if(i==s.length()-1)
    	{
    		System.out.println(s1);
    	}
    }
    
    
	}

}
