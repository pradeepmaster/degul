package logical;

public class Fibonoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int fb1=0;
        int fb2=1;
//    System.out.print(fb1 +"  " +fb2+ " ");
        for(int i=1;i<=10;i++)
        {
        int fb3=fb1+fb2;
//        if(fb3%i==1)
//        {
        
//        }
        fb1=fb2;
        fb2=fb3;
      
        if(fb3%2==0)
        {
        	  System.out.print(fb3 + " ");
        }
        }
        }

}
