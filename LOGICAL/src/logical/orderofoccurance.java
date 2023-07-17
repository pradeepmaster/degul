package logical;

import java.util.HashMap;
import java.util.Map.Entry;

public class orderofoccurance {

	public static void main(String[] args) {
		String s="hi yes god hi";
		String []arr=s.split(" ");
        HashMap<String,Integer> l1=new HashMap <String,Integer>();
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
        
        for(Entry<String, Integer> a:l1.entrySet())
        {
        	String y=a.getKey();
        	int z=a.getValue();
        	if(z==1)
        	{
        		System.out.println(a.getKey()+" "+z);
        	}
        }
        
        
	}
}
