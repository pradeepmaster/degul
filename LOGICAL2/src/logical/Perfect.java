package logical;

public class Perfect {

	public static void main(String[] args) {
     int num=28;
     int sum=0;
     
     for(int i=1;i<num;i++)
     {
    	 if(num%i==0)
    		 
    	 {
    		 sum=sum+i;
    	 }
     }
     if(sum==num)
     {
    	 System.out.println("perfect");
     }
     else
     {
    	 System.out.println("no");
     }
     
	}

}
