package logical;

public class Splitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="hi my name is rama";
      String []arr=s1.split(" ");
      
      for(int i=0;i<arr.length;i++)
      {
    	  if(i==2)
    	  {
    		  String s2=arr[i];
    		  String rev=" ";
    		  for(int j=s2.length()-1;j>=0;j--)
    		  {
    			  rev=rev+s2.charAt(j);
    			 
    		
    		  }
    		  System.out.print(rev + " ");
    	  }
    	  else
    	  {
    		  System.out.print(arr[i]+ " ");
    	  }
      }
	}

}
