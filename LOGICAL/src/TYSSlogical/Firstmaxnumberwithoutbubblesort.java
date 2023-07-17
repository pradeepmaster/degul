package TYSSlogical;

public class Firstmaxnumberwithoutbubblesort 
{
	public static void main(String[] args) 
	{
		int[]arr= {-3,0,2,7,1,-9};
		   int fmax=Integer.MIN_VALUE;
		   for(int i=0;i<arr.length;i++)
		   {
			   if(arr[i]>fmax)
			   {
				   fmax=arr[i];
			   }
		   }
		   System.out.println("first max is"+" "+fmax);
	}
}
