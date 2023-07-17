package TYSSlogical;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Reversefirstandlastchar 
{

   
    public static void main(String[] args) 
	{
      String str="i am selenium";
      
//    int i=str.length()-1,k=str.length()-1;
//    while(k>-1)
//    {
//    	for(int j=0;j<str.length();j++)
//    	{
//    		if(str.charAt(j)!=' ')
//    		{
//    			if(str.charAt(i)==' ')
//    			{
//    				i--;
//    				k--;
//    			}
//    			System.out.print(str.charAt(i--));
//    			k--;
//    		}
//    		else
//    		{
//    			System.out.print(" ");
//    			k--;
//    		}
//    	}
//    }
      
           String s1="";
           for(int i=str.length()-1;i>=0;i--)
           {
        	   if(str.charAt(i)!=' ')
        	   s1=s1+str.charAt(i);
           }
           System.out.println(s1);
           
           int count=0;
           for(int i=0;i<str.length();i++)
           {
        	   if(str.charAt(i)!=' ')
        	   {
        		   System.out.print(s1.charAt(count));
        		   count++;
        	   }
        	   else
        	   {
        		   System.out.print(" ");
        	   }
           }
	}
}
