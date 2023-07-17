package TYSSlogical;

public class Removetheduplicateword {

	public static void main(String[] args)
	{
		String s="hi am yes hi am yes";
		String[]arr=s.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					arr[j]="google";
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]!="google")
			{
				System.out.print(arr[k]+" ");
			}
		}
	}

}
