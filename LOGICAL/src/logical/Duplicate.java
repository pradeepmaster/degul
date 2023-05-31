package logical;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int []arr= {10,20,30,10};
	   
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]==arr[j])
			   {
				   arr[j]=15;
			   }
		   }
	}
    for(int k=0;k<arr.length;k++)
    {
    	if(arr[k]!=15)
    	{
    		System.out.print(arr[k] + " ");
    	}
    }
}
}
