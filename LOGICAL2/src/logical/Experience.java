package logical;

public class Experience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int val=1624;
       //int sum=0;
       while(val!=0)
       {
    	   int rem=val%10;
    	   if(rem%2==0)
    	   {
    	  // sum=sum+rem;
    	   int square=rem*rem;
    		  System.out.print(square +" ");
    	   }
    	   val=val/10;
    	   
    
       }
       
	}

}
