package logical;

public class Arraycombining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int []arr= {11,21};
         int []arr1= {1,2,3};
         int size=arr.length + arr1.length;
         int []acc=new int[size];
         int pos=0;
         int x=0;
         int y=0;
         int z=0;
         
         for(int i: arr)
         {
        	 acc[pos]=i;
        	 pos++;
         }
//         for(int i=0;i<arr.length;i++)
//         {
//        	 acc[pos]=i;
//        	 pos++;
//         }
         for(int j: arr1)
         {
        	 acc[pos]=j;
        	 pos++;
         }
//         
         for(int k=0;k<acc.length;k++)
         {
        	 
        	 System.out.print(acc[k]+ " ");
//              x=acc[0]+acc[2];
//              y=acc[1]+acc[3];
//              z=acc[4];
            
        	 
        	 
         }
//         System.out.print(x +" "+ y+ " "+z);
	}
}



