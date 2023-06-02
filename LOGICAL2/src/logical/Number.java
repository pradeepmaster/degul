package logical;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=4567;
		int rem;
		int temp =0;
		int count=0;
		
		while(i!=0)
		{ 
			rem=i%10;
			//if(i%2==0)
			
			//	System.out.println(rem);
			temp=temp+rem;
			//count++;
			
			
			i=i/10;
			
		}
//	System.out.println(count);
		System.out.println(temp);

	}

}
