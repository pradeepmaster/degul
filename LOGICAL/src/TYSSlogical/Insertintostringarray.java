package TYSSlogical;

public class Insertintostringarray {

	public static void main(String[] args) 
	{
       String s="am  here";
       int n=0;
       String s1="pradeep";
       String[]arr=s.split(" ");
       for(int i=0;i<arr.length;i++)
       {
    	   arr[1]=s1;
       }
       for(int k=0;k<arr.length;k++)
       {
    	   System.out.print(arr[k]+" ");
       }
	}
}
