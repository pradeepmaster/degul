package logical;

public class Palnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num=121;
         int copy=num;
         int rev=1;
          while (num!=0)
          {
        	 int rem=num%10;
        	 rev=rev*10+rem;
        	 num=num/10;
        	 
          }
          if(rev==copy)
          {
        	  System.out.println("number is palindrome");
          }
          else
          {
        	  System.out.println("its not palindrome");
          }
	}

}
