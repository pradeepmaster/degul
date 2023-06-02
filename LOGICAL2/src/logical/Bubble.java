package logical;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {3,7,8,2,1};
      int n =arr.length;
      int temp = 0;
      for(int j=0;j<n;j++)
      {
    	  for(int i=0;i<n-1;i++)
    	  {
    		  if(arr[i]>arr[i+1])
    		  {
    		     temp=arr[i];
    		     arr[i]=arr[i+1];
    		     arr[i+1]=temp;
    		  }	 
    	  }
      }
      for(int k=0;k<arr.length;k++)
      {
    	  System.out.print(arr[k]+ " ");
      }
	}
}
