package logical;

public class James {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=153;
		int copy=a;
		int res=0;
     
		while(a!=0)
		{
			int rem=a%10;
		 res+=Math.pow(rem, 3);
			a=a/10;
			
		}
        if(res==copy)
        {
        	System.out.println("armstrong");
        }
        else
        {
        	System.out.println("no");
        }
        	
	}

}
