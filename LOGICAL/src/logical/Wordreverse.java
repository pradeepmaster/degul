package logical;

public class Wordreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr= {3,2,1};
     int small=arr[0];
     for(int i=0;i<arr.length;i++)
     {
    	 if(arr[i]<small)
    	 {
    		 small=arr[i];
    	 }
    	 
     }
      
     System.out.println(small);
	}

}
