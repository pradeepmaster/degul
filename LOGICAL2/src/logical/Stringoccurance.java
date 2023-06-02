package logical;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Stringoccurance {

	public static void main(String[] args) {
		String s1 = "hi am am pradeep";
		String[] arr = s1.split(" ");
		LinkedHashMap<String, Integer> l1 = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) 
		{
			if (!l1.containsKey(arr[i]))
			{
				l1.put(arr[i], 1);
			} 
			else
			{
				int x = l1.get(arr[i]);
				x++;
				l1.put(arr[i], x);
			}
		}
		for (Entry<String, Integer> a : l1.entrySet()) 
		{
			System.out.println(a.getKey() + " " + a.getValue());
		}
	}

}
