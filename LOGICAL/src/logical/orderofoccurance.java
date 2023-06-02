package logical;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class orderofoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[]arr= {10,20,10,30,20,50};
        LinkedHashMap<Integer,Integer> l1=new LinkedHashMap <Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
        	if(!l1.containsKey(arr[i]))
        	{
        		l1.put(arr[i], 1);
        	}
        	else
        	{
        		int x=l1.get(arr[i]);
        		x++;
        		l1.put(arr[i],x);
        	}
        	
        }
//        for(Entry<Integer, Integer> a:l1.entrySet())
//        {
//        	System.out.println(a.getKey()+ " "+ a.getValue());
//        }
        
        for(Entry<Integer, Integer> a:l1.entrySet())
        {
        	int y=a.getKey();
        	int z=a.getValue();
        	if(z==1)
        	{
        		System.out.println(a.getKey());
        	}
        }
        
        
	}
}
