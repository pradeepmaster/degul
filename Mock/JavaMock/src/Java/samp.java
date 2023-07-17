package Java;

public class samp {

	public static void main(String[] args)
	{
String s1="bengaluru";
String s2="mysore";
         int length = s1.length()+s2.length();
         String[]arr=new String[length];
         String[]abb=arr;
         
         int pos=0;
         for(Object a:s1.toCharArray())
         {
        	 a=arr[pos];
        	 pos++;
         }
         for(int  i=0;i<abb.length;i++)
         {
        	 System.out.println(arr[i]);
         }
         

	}

}
