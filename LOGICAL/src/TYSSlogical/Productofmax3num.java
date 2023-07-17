package TYSSlogical;

public class Productofmax3num {

	public static void main(String[] args) 
	
	{
		 int[]arr= {0,1,2,3,4,5,0};
		   int fmax=Integer.MIN_VALUE;
		   int smax=Integer.MIN_VALUE;
		   int tmax=Integer.MIN_VALUE;
		   for(int i=0;i<arr.length;i++)
		   {
			   if(arr[i]>fmax)
			   {
				   tmax=smax;
				   smax=fmax;
				   fmax=arr[i];
			   }
			   else if(arr[i]>smax)
			   {
				   tmax=smax;
				   smax=arr[i];
			   }
			   else if(arr[i]>tmax)
			   {
				   tmax=arr[i];
			   }
		   }
	       System.out.print("product of 3 max number"+" "+fmax*smax*tmax);		
			     
	}

}
