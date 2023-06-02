package logical;

public class Noloop {

	
	static void disp(int a)
	{
		//int a=1;
		if(a<=5)
		{
			
			System.out.println(a);
			++a;
			
			
			disp(a);
		}
				
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       disp(1);  
	}

}
