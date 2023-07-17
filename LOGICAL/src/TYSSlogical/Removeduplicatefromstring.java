package TYSSlogical;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Removeduplicatefromstring {

	public static void main(String[] args) 
	{
		String s="hi am pradeep am";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			s1=s1+s.charAt(i);
		}
       System.out.println(s1);
       LinkedHashSet<Character>l=new LinkedHashSet<>();
       for(int j=0;j<s.length();j++)
       {
    	   l.add(s.charAt(j));
       }
      for(Character ch:l)
      {
    	  int count=0;
    	  
    	  for(int j=0;j<s.length();j++)
    	  {
    		  if(ch==s.charAt(j))
    		  {
    			  count++;
    		  }
    	  }
    	  if(count==1)
    	  {
    		  System.out.print(ch+" ");
    	  }
      }
       
}
}
