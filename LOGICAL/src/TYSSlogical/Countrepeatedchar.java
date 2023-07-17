package TYSSlogical;

public class Countrepeatedchar {

	public static void main(String[] args)
	{
      String s="aaabcccdeee";
      String s1="";
      int count=0;
      for(int i=0;i<s.length();i++)
      {
    	  for(int j=i+1;j<s.length();j++)
    	  {
    		  if(s.charAt(i)==s.charAt(j))
    		  {
    			  count++;
    			  System.out.print(s.charAt(i));
    		  }
    		  else
    		  {
//    			  System.out.print(s.charAt(j));
    		  }
    	  }
      }
      
	}

}
