package logical;

public class Logical {

	public static void main(String[] args) {
      int a=123456,rem,temp=0,temp1=0;
//      int rem;
//      int temp=0;
      
    while (a!=0)
    {
    	rem=a%10;
    	if(rem%2==1)
    	{
    		temp=temp+rem;
    	}
    	else if(rem%2==0)
    	{
    		temp1=temp1+rem;
    	}
    	a=a/10;
    	
    }
    System.out.println(temp);
    System.out.println(temp1);
	}

}
