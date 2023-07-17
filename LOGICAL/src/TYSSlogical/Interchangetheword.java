package TYSSlogical;

public class Interchangetheword {

	public static void main(String[] args) 
	{
       String s="hi friend here";
       String[]arr=s.split(" ");
       String s1="";
       for(int i=arr.length-1;i>=0;i--)
       {
         System.out.print(arr[i]+" ");
       }
	}
}
