package logical;

public class Cone {

	public static void main(String[] args)
	
	{
      String s="";
      String[]arr=s.split(" ");
      StringBuffer f=new StringBuffer(s);
      f.reverse();
      
      for(int i=0;i<s.length();i++)
      {
    	  if(s.charAt(i)==' ') 
    	  {
    		  f.insert(i, " ");
    		  
    	  }
      }
		f.append("");
		System.out.println(f);
	}
	
}
