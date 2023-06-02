package logical;

public class Maxno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {15,8,333,5,1,33};
		int temp;
		int size = arr.length;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr.length-1;j>=0;j--)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}
		System.out.println("first largest is  " + arr[size-1]);
		System.out.println(" second largest is " + arr[size-2]);
		System.out.println("third largest is " + arr[size-3]);
		
	}

}
