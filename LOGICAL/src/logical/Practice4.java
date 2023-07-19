package logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.FileHandler;

public class Practice4 {

	
//	public static String randomAlphanumericString(int length) {
//	    String alphanumericCharacters = "ABCDEFGHI!@#$%678JKLMNOPQRSTUVWXYZ0123456789abcdefghij!@#$%^&*()_klmnopqrstuv4327423787";
//	 
//	    StringBuffer randomString = new StringBuffer(length);
//	    Random random = new Random();
//	 
//	    for (int i = 0; i < length; i++) {
//	        int randomIndex = random.nextInt(alphanumericCharacters.length());
//	        char randomChar = alphanumericCharacters.charAt(randomIndex);
//	        randomString.append(randomChar);
//	    }
//	    return randomString.toString();
//	}
	
	public static void main(String[] args) 
	{
//		for(int i=1;i<=10;i++)
//		{
//		String s=randomAlphanumericString(10);
//		System.out.println(s);
//		}
		
		
//		ArrayList<Object> l1=new ArrayList<Object>();
//		l1.add(10);
//		l1.add(10);
//		l1.add(null);
//		l1.add(20);
//		System.out.println(l1);
//		
//		ArrayList<Object> l2=new ArrayList<Object>();
//		l2.add(21);
//		l2.add(22);
//		l2.add("hi");
//		System.out.println(l2);
//		
//		l1.addAll(l2);
//		System.out.println(l1);
//		
//		if(l1.contains(22))
//		{
//			System.out.println("yes");
//		}
//		else
//		{
//		System.out.println("no");
//		}
//	
//		for(Object i:l1)
//		{
//			System.out.print(i+ " ");
//		}
//		
//		Iterator<Object> it=l1.iterator();
//		
//		while(it.hasNext())
//		{
//			Object val=it.next();
//			System.out.print(val +" ");
//			
//		}
//		
//		System.out.print(l1.remove(2));
//		System.out.println(l1.indexOf("hi"));
//		
//		Stack<Object>s=new Stack<Object>();
//		s.push(10);
//		s.push(40);
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		
//		LinkedList<Object> l3=new LinkedList<Object>();
//	  l3.add(40);
//	  l3.add(41);
//	  System.out.println(l3);
//	  l3.addFirst(20);
//		l3.addLast(21);
//		System.out.println(l3);
//		
//		PriorityQueue<Object> l4=new PriorityQueue<Object>();
//		l4.add(22);
//		l4.add(23);
//		l4.add(24);
//		System.out.println(l4);
//		System.out.println(l4.poll());
//		System.out.println(l4);
//		System.out.println(l4.peek());
//		System.out.println(l4);
//		
//		HashSet<Object> l5=new HashSet<Object>();
//	    l5.add(10);
//	    l5.add(10);
//	    l5.add("yes");
//	    l5.add(null);
//	    l5.add(null);
//		System.out.println(l5);
//	
//		ArrayList<Object> l6=new ArrayList<Object>(l5);
//		l6.add(20);
//		l6.add(21);
//		l6.add(10);
//		//l5.addAll(l6);
//		System.out.println(l6);
//		
//		LinkedHashSet<Object> l7=new LinkedHashSet<Object>();
//	    l7.add(10);
//	    l7.add(10);
//	    l7.add("yes");
//	    l7.add(null);
//	    l7.add(null);
//		System.out.println(l7);
//	
//		
//	TreeSet<Object> l8=new TreeSet<Object>();
//	    l8.add(30);
//	    l8.add(20);
//	    l8.add(10);
//		System.out.println(l8);
//		System.out.println(l8.descendingSet());
//	
//		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
//	map.put(10, "hi");
//	map.put(20, "hi");
//	
//	map.put(11, "hi");
//	map.put(11, "yes");
//	map.put(11, "no");
//	System.out.println(map);
//		
//	HashMap<Integer,String> map1=new HashMap<Integer,String>();
//	
//	map1.put(10, "hi");
//	map1.put(10, "hey");
//	map1.put(11, null);
//	map1.put(12, null);
//	map1.put(null, null);
//	map1.put(null, "yes");
//	System.out.println(map1);
//	
//
//	LinkedHashMap< Integer, String>map3=new LinkedHashMap<Integer,String>();
//	
//	map3.put(11, null);
//	map3.put(10, "hi");
//	map3.put(12, "hi");
//	map3.put(15, "hey");
//	map3.put(null, "yes");
//	map3.put(null, null);
//	System.out.println(map3);
//	
//for(Entry<Integer, String> a:map3.entrySet())
//{
//System.out.println(a.getKey()+" "+a.getValue());
//}
//	
//
//    HashMap<Integer, String> map4=new HashMap<Integer,String>();
//    map4.put(14, "a");
//    map4.put(13, "b");
//    map4.put(15, "c");
//    System.out.println(map4);
//    
//    TreeMap<Integer, String> map5=new TreeMap<Integer,String>(map4);
//     map5.put(12, "d");
//     System.out.println(map5);
//    
//     for(Entry<Integer, String> a:map5.entrySet())
//     {
//     System.out.println(a.getKey()+" "+a.getValue());
//     }
//		
//		swap 2 numbers without using 3rd variable
//		int a=20;
//		int b=10;
//		
//		a=a-b;
//		b=a+b;
//		System.out.println("a is "+ a);
//		System.out.println("b is " +b);
//		
//    swap 2 numbers using 3rd variable
//		int a=10;
//		int b=20;
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("a is "+ a);
//		System.out.println("b is "+b);
//		
//		sort array in ascending order using bubble sort
//		
//		   int arr[]= {3,7,0,8,2,1};
//		      int n =arr.length;
//		      int temp = 0;
//		      for(int j=0;j<n;j++)
//		      {
//		    	  for(int i=0;i<n-1;i++)
//		    	  {
//		    		  if(arr[i]>arr[i+1])
//		    		  {
//		    		     temp=arr[i];
//		    		     arr[i]=arr[i+1];
//		    		     arr[i+1]=temp;
//		    		  }	 
//		    	  }
//		      }
//		      for(int k=0;k<arr.length;k++)
//		      {
//		    	  System.out.print(arr[k]+ " ");
//		      }
//		      for(int l:arr)
//		      {
//		    	  System.out.print(l+" ");
//		      }
//		
//		//normal sort of an array
//		int[]arr= {3,2,1,4,5};
//		Arrays.sort(arr);
//
//		for(int a:arr)
//		{
//			System.out.print(a+ " ");
//		}
		//find the first minimum num in array
//		
//		int []arr= {3,2,1,4,5,6};
//		int min=arr[0];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]<min)
//			{
//               min=arr[i];
//			}
//		}
//		System.out.println(min);
	
//		//find the maximum num in array
//		int []arr= {0,3,2,1,4,5,6};
//		int max=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//			{
//               max=arr[i];
//			}
//		}
//		System.out.println(max);
//	
		//sum of the first 3 minimum numbers	
//		 int arr[]= {3,7,8,2,1};
//	      int n =arr.length;
//	      int temp = 0;
//	      for(int j=0;j<n;j++)
//	      {
//	    	  for(int i=0;i<n-1;i++)
//	    	  {
//	    		  if(arr[i]>arr[i+1])
//	    		  {
//	    		     temp=arr[i];
//	    		     arr[i]=arr[i+1];
//	    		     arr[i+1]=temp;
//	    		  }	 
//	    	  }
//	      }
//		int sum=0;
//	      for(int k=0;k<arr.length;k++)
//	      {
//	    	  if(k<3)
//	    	  {
//	    		  sum=sum+arr[k];
//	    	  }
//	    	  
//	      }
//	      System.out.println(sum);
//	      
//	      sum of the first 3 maximum numbers
//	      int arr[]= {3,5,6,4,2,1};
//	      int n =arr.length;
//	      int temp = 0;
//	      int sum=0;
//	      for(int j=0;j<3;j++)
//	      {
//	    	  for(int i=j;i<n;i++)
//	    	  {
//	    		  if(arr[j]<arr[i])
//	    		  {
//	    		     temp=arr[j];
//	    		     arr[j]=arr[i];
//	    		     arr[i]=temp;
//	    		  }	 
//	    	  }
//	    	  sum=sum+arr[j];
//	      }
//	      System.out.println(sum);
//	
//	first min and 2nd minimum
//		
//		int[]arr= {5,1,2,0,2,0};
//		int first=Integer.MIN_VALUE;
//		int second=Integer.MIN_VALUE;
//		int third=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>first)
//			{
//				    third=second;
//					second=first;
//					first=arr[i];
//			}
//			else if(arr[i]>second)
//			{
//				second=arr[i];
//				third=second;
//			}
//			else if(arr[i]>third)
//			{
//				third=arr[i];
//			}
//		}
//		System.out.println(first+" "+second+" "+third);
//	
//
       //program to add the arrays	
//	   int []arr={0,5,1,2,0};
//	   int[]abb={3,4,5,1};
//
//	   for(int i=0;i<arr.length;i++)
//	   {
//			   try {
//             System.out.print(arr[i]+abb[i]+" ");
//			   }
//			   catch(Exception e)
//			   {
//				   if(arr.length<abb.length)
//				   {
//					   System.out.print(abb[i]);
//				   }
//				   else 
//				   {
//					   System.out.println(arr[i]);
//				   }
//		   }
//	   }
//	   
          //program to append 0s at last in array
//	   int []arr= {0,1,2,4,0,3,5,0,8};
//	   
//	   
//	   for(int j=0;j<arr.length;j++)
//
//	   {
//          if(arr[j]==0)
//          {
//        	  System.out.print(arr[j]+" ");
//          }
//	   }
//	   for(int i=0;i<arr.length;i++)
//	   {
//		   if(arr[i]!=0)
//		   {
//			   System.out.print(arr[i]+" ");
//		   }
//	   }
//	  
//		
         //program for combination of numbers
//		
//		int[]arr= {1,2,5,6,9,7,4};
//		int n=11;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]+arr[j]==n)
//				{
//					System.out.println(arr[i] +"+"+arr[j]+"="+n);
//				}
//			}
//		}
//		
		//program to reverse a string
//		
//		String s="peedarp";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//     System.out.println(rev);
//	
//		
//		String s="peedarp";
//	char[]a=	s.toCharArray();
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.print(a[i]);
//		}
//		
//		
//		String s="peedarp";
//		char[]a=s.toCharArray();
//		int count=0;
//		for(char s1:a)
//		{
//			count++;
//		}
//		for(int i=count-1;i>=0;i--)
//		{
//			System.out.print(a[i]+ " ");
//		}
//		
//		StringBuilder s2=new StringBuilder("peedarp");
//		System.out.println(s2.reverse());
//		
//		
		//program for string palindrome
//		
//		
//		for(;;)
//		{
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter string");
//			String s=sc.next();
//			String rev="";
//			for(int j=s.length()-1;j>=0;j--)
//			{
//			rev=rev+s.charAt(j);
//			}
//		if(rev.equals(s))
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("no");
//		}
//		}
//		
        //	program to remove duplicates
//		String s="Tester";
//		String s1=s.toLowerCase();
//		LinkedHashSet< Character>set=new LinkedHashSet<Character>();
//		for(int i=0;i<s1.length();i++)
//		{
//			set.add(s1.charAt(i));
//		}
//		for(Character ch:set)
//		{
//			int count=0;
//			for(int i=0;i<s1.length();i++)
//			{
//				if(ch==s1.charAt(i))
//				{
//					count++;
//				}
//			}
////		if(count>1)
//		{
//			System.out.println(ch +" "+count);
//		}
//		}
//		
        //program for how many time e is repeated 
//	   String s="hey pradeep";
//	   int count=0;
//	   for(int i=0;i<s.length();i++)
//	   {
//		   if(s.charAt(i)=='e')
//		   {
//			   count++;
//		   }
//	   }
//	   System.out.println(count);
//	
		//program for position of String without duplicates output t=1,e=2,s=3,r=6
//		String s="tester";
//		LinkedHashSet< Character>set=new LinkedHashSet<Character>();
//	for(int i=0;i<s.length();i++)
//{
//set.add(s.charAt(i));	
//}
//	for(Character ch:set)
//	{
//		for(int i=0;i<s.length();i++)
//		{
//		if(ch==s.charAt(i))
//		{
//          System.out.println(ch+" "+(i));
//          break;
//		}
//	}		
//}
//	
//		
		//program for output s=3,t=4,e=5,r=6
//		String s="tester";
//		LinkedHashSet< Character>set=new LinkedHashSet<Character>();
//	for(int i=0;i<s.length();i++)
//{
//set.add(s.charAt(i));	
//}
//	for(Character ch:set)
//	{
//		for(int i=s.length()-1;i>=0;i--)
//		{
//		if(ch==s.charAt(i))
//		{
//          System.out.println(ch+" "+(i+1));
//          break;
//		}
//	}		
//}
//		
      // program for String remove space
//		String s="I am software Engineer";
//		String[]arr=s.split(" ");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]);
//		}
//		
     //program for reverse sentense
//		String s="peedarp ma ih";
//		String[]arr=s.split(" ");
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}
//	
//		
//      String s="I am a software engineer";
//      String []arr=s.split(" ");
//    	  String s1=arr[0];
//    	  arr[0]=arr[arr.length-1];
//    	  arr[arr.length-1]=s1;
//       for(int i=0;i<arr.length;i++)
//       {
//    	   System.out.print(arr[i]+" ");
//       }
//		
		//reverse a word in given sentence
//		String s="hi am good";
//		String[]arr=s.split(" ");
//		String rev="";
//			for(int i=0;i<arr.length;i++)
//			{
//				String s1=arr[i];
//				 String rev1="";
//				for(int j=s1.length()-1;j>=0;j--)
//				{
//					rev1=rev1+s1.charAt(j);
//				}
//				rev=rev+rev1+" ";
//			}
//      System.out.println(rev);
//		
      //remove the duplicates word in string 
//		and no of duplicate words 
//		and occurance of each word 
//		and position of word without duplicates
//	
//	String s="hi yes god hi";
//		String []arr=s.split(" ");
//        HashMap<String,Integer> l1=new HashMap <String,Integer>();
//        for(int i=0;i<arr.length;i++)
//        {
//        	if(!l1.containsKey(arr[i]))
//        	{
//        		l1.put(arr[i], 1);
//        	}
//        	else
//        	{
//        		int x=l1.get(arr[i]);
//        		x++;
//        		l1.put(arr[i],x);
//        	}
//        	
//        }
//        System.out.println("occurance of each word");
//        for(Entry<String, Integer> a:l1.entrySet())
//        {
//        	System.out.println(a.getKey()+ " "+ a.getValue());
//        }
//        
//        System.out.println("duplicate words");
//        for(Entry<String, Integer> a:l1.entrySet())
//        {
////        	String y=a.getKey();
//        	int z=a.getValue();
//        	if(z>1)
//        	{
//        		System.out.println(a.getKey()+" "+z);
//        }
//        }
//        
       //position of word without duplicates in string
//        
//		String s="hi am yes am";
//		      String[]arr  =s.split(" ");
//		      for(int i=0;i<arr.length;i++)
//		      {
//        String s1=arr[i];
//		LinkedHashSet< String>set=new LinkedHashSet<String>();
//	for(int i2=0;i2<s1.length();i2++)
//{
//set.add(s1);
//}
//
//	for(String s2:set)
//	{
//		for(int i1=0;i1<s1.length();i1++)
//		{
//		if(s2.equals(s1))
//		{
//          System.out.println(s2+" "+(i1+1));
//          break;
//		}
//	}		
//}
//	}
//
// to remove the duplicates
//		
//	String s="hi am yes hi am yes";
//	String[]arr=s.split(" ");
//	
//	for(int i=0;i<arr.length;i++)
//	{
//		for(int j=i+1;j<arr.length;j++)
//		{
//			if(arr[i].equals(arr[j]))
//			{
//				arr[j]="google";
//			}
//		}
//	}
//	for(int k=0;k<arr.length;k++)
//	{
//		if(arr[k]!="google")
//		{
//			System.out.print(arr[k]+" ");
//		}
//	}
//	
//	program to print no of vowels in string
//		String v="Aaeious";
//		String s=v.toLowerCase();
//		char ch=' ';
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			ch=s.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//			{
//				count++;
//				System.out.println(ch+" "+count);
//			}
//		}
//		
//		program to print the vowels  count without duplicates
//	
//		String s="aeia";
//		LinkedHashSet< Character>set=new LinkedHashSet<Character>();
//	for(int i=0;i<s.length();i++)
//{
//set.add(s.charAt(i));	
//}
//	int count=0;
//	for(Character ch:set)
//	{
//		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//		{
//			count++;
//			System.out.println(ch);
//		}
//	}
//System.out.println(count);
//
//
//	program to sum first 3 minimum number  
//		int[]arr= {11,1,5,4,2,3};
//		int first=arr[0];
//		int second=arr[0];
//		int third=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(first>=arr[i])
//			{
//				first=arr[i];
//				second=first;
//				third=second;
//				}
//			else if(second>=arr[i]||second==first)
//			{
//				third=second;
//				second=arr[i];
//			}
//			else if(third>=arr[i]||third==second)
//			{
//				third=arr[i];
//			}
//		}
//		System.out.println(first+" "+second+" "+third);
//		System.out.println("sum is"+" "+(first+second+third));
	//
		//program to find the length of String witthout length method
//		String s="abcde";
//		int l=0;
//		for(char ch:s.toCharArray())
//		{
//		l++;
//		}
//		System.out.println("length is"+" "+l);
//		
		//program to find the length of an array int without length method
//		int[]arr= {2,4,2,4,5};
//		int length=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			length++;
//		}
//		System.out.println(length);
//
		//	
	//program to remove the duplicate from the array
//		int []arr= {5,3,2,1,2,3,5,6};
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					arr[j]=123;
//				}
//			}
//		}
//		for(int k=0;k<arr.length;k++)
//		{
//			if(arr[k]!=123)
//			{
//				System.out.print(arr[k]+" ");
//			}
//		}
//		
	//program to find the count of duplicates from array
//	  int[]arr= {1,2,1,2,3};
//	  int count=0;
//	  for(int i=0;i<arr.length;i++)
//	  {
//		  for(int j=i+1;j<arr.length;j++)
//		  {
//			  if(arr[i]==arr[j])
//			  {
//				  count++;
//			  }
//		  }
//	  }
//	System.out.println(count);
//		
		//for the occurance of numbers in array
//
//		int []arr= {1,2,3,1,2,4,5};
//        HashMap<Integer,Integer> l1=new HashMap <Integer,Integer>();
//        for(int i=0;i<arr.length;i++)
//        {
//        	if(!l1.containsKey(arr[i]))
//        	{
//        		l1.put(arr[i], 1);
//        	}
//        	else
//        	{
//        		int x=l1.get(arr[i]);
//        		x++;
//        		l1.put(arr[i],x);
//        	}
//        }
//        for(Entry<Integer, Integer> a:l1.entrySet())
//        {
//        	System.out.println(a.getKey()+ " "+ a.getValue());
//        }
//		
//		//program for position of number with duplicates in array
//		
//		int[]arr= {10,20,30,10,40};
//		int pos=0;
//		for(int i=0;i<arr.length;i++)
//		{
//				pos++;
//				System.out.println(arr[i]+" "+pos);
//		
//		}
//		
		//program for position of number without duplicates in array
//		int []arr= {5,3,1,1,4,5,6};
//		LinkedHashSet< Integer>set=new LinkedHashSet<Integer>();
//		for(int i=0;i<arr.length;i++)
//		{
//		set.add(arr[i]);
//		}
//		for(Integer ch:set)
//	  {
//		for(int i=0;i<arr.length;i++)
//		{
//		if(ch==arr[i])
//		{
//          System.out.println(ch+" "+(i+1));
//          break;
//		}
//	}		
//	}
	//program to find the minimum length of string in given array
//		String []arr= {"hi","hey","ho","hello","pavankulkarni	"};
//		int length=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			String yes=arr[i];
//			length=yes.length();
//			if(length<3)
//			{
//				System.out.println(arr[i]+" "+length);
//			}
//		}
//		program to find the minimum length of string in given array
//		String []arr= {"ab","bcde","hello","ec"};
//		String min=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i].length()<min.length())
//			{
//				min=arr[i];
//			}
//		}
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i].length()==min.length())
//{
//	System.out.println(arr[i]);
//}
//	}
//		
	//program to find the maximum length of string in array
//	String[]arr= {"hey","hi","hello","pavankulkarni"};
//	String max=arr[0];
//	for(int i=0;i<arr.length;i++)
//	{
//		if(arr[i].length()>max.length())
//		{
//			max=arr[i];
//		}
//	}
//	for(int i=0;i<arr.length;i++)
//	{
//		if(max.length()==arr[i].length())
//		{
//			System.out.println(arr[i]);
//		}
//	}
//		
		//program to add numbers in string
//		String s="a1sb4b6";
//        int sum=0;
//		for(int i=0;i<s.length();i++)
//		{
//             	 if(s.charAt(i)>='0'&&s.charAt(i)<='9')
//             	 {
//             		 int n=s.charAt(i)-48;
//             		 sum=sum+n;
//             	 }
//					
//			}
//		System.out.println(sum);
//		
		//program to add 2 numbers from string 
//		String s="a12b12c12d1";
//		int sum=0;
//		int tsum=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
//			{
//				int n=s.charAt(i)-48;
//				tsum=tsum*10+n;
//			}
//			else
//			{
//				sum=sum+tsum;
//				tsum=0;
//			}
//		}
//		sum=sum+tsum;
//		System.out.println(sum);
//	
		//program to get the posion of element in array without duplicates
//		int []arr= {1,2,3,1,2,4};
//		boolean[]abb=new boolean[arr.length];
//				for(int i=0;i<arr.length;i++)
//				{
//					if(abb[i]==false)
//					{
//						for(int j=i;j<arr.length;j++)
//						{
//							if(arr[i]==arr[j])
//							{
//								abb[j]=true;
//							}
//						}
//	                     System.out.println(arr[i]+" "+(i+1));					
//					}
//				}
//				
	 //factorial of number scanner
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number");
//		int num=sc.nextInt();
//		int fact=1;
//		for(int i=num;i>=1;i--)
//		{
//			fact=fact*i;
//		}
//		System.out.println(fact);
//		
		//program for armstrong number
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//		int copy=num;
//		int rem=0;
//		 double sum = 0;
//		while(num!=0)
//		{
//			rem=num%10;
//			sum=sum+Math.pow(rem, 3);
////			sum=sum+rem*rem*rem;
//			num=num/10;
//	}
//         if(sum==copy)
//         {
//        	System.out.println("arm");
//         }
//         else
//         {
//        	 System.out.println("no");
//         }
//		
		//program for fibonoci series;
//		int fib1=0;
//		int fib2=1;
//		System.out.print(fib1+" "+fib2+" ");
//		for(int i=1;i<=10;i++)
//		{
//			int fib3=fib1+fib2;
//			fib1=fib2;
//			fib2=fib3;
//			System.out.print(fib3+" ");
//		}
//	
		//program for prime number
//		int num=24;
//		int count=0;
//                for(int i=1;i<=num;i++)
//                {
//                	if(num%i==0)
//                	{
//                		count++;
//                	}
//                }
//		if(count==2)
//		{
//			System.out.println("it is prime no");
//		}
//		else
//		{
//			System.out.println("no");
//		}
//		
		//program for prime number with range
//
//		for(int j=1;j<=100;j++)
//		{
//		int num=j;
//		int count=0;
//                for(int i=1;i<=num;i++)
//                {
//                	if(num%i==0)
//                	{
//                		count++;
//                	}
//                }
//		
//		if(count==2)
//		{
//			System.out.println(num+ " is prime ");
//		}
//		else
//		{
//			System.out.println("no");
//		}
//		}
//	
		//program for prime no in array
//		int[]arr= {10,20,3,40};
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			int count=0;
//			for(int j=1;j<=arr[i];j++)
//			{
//				if(arr[i]%j==0)
//				{
//					count++;
//				}
//			}
//		if(count==2)
//		{
//			System.out.println(arr[i]+" "+"is prime");
//		}
//		}
//
        //		program to print unique character from string(order of occurance)
//		String s="testyantra";
//		LinkedHashMap< Character, Integer>map=new LinkedHashMap();
//		for(int i=0;i<s.length();i++)
//		{
//			map.put(s.charAt(i), i);
//		}
//		for(Entry<Character,Integer>m:map.entrySet())
//		{
//			int count=0;
//			for(int i=0;i<s.length();i++)
//			{
//				if(m.getKey()==s.charAt(i))
//				{
//					count++;
//				}
//			}
//			if(count==1)
//			{
//				System.out.println(m.getKey()+" "+count);
//			}
//		}
//		
		//program to print the duplicate character from string
//		String yes="aaabbcdeee";
//		LinkedHashMap<Character, Integer>map=new LinkedHashMap<>();
//		for(int i=0;i<yes.length();i++)
//		{
//			map.put(yes.charAt(i), i);
//		}
//		for(Entry<Character,Integer>s:map.entrySet())
//		{
//			boolean flag=false;
//			int count=0;
//			for(int k=0;k<yes.length();k++)
//			{
//				if(s.getKey()==yes.charAt(k))
//				{
//					count++;
//					flag=true;
//				}
//			}
//			if(count>=1)
//			{
//				System.out.print(s.getKey());
//				System.out.print(count);
//			}
//		}
//		
     //		program for strong number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		int num=sc.nextInt();
//		int copy=num;
//		int sum=0;
//		while(num!=0)
//		{
//			int rem=num%10;
//			int fact=1;
//             for(int i=rem;i>=1;i--)
//             {
//            	 fact=fact*i;
//             }
//             sum=sum+fact;
//		      num=num/10;
//		}
//		if(copy==sum)
//		{
//			System.out.println("strong");
//		}
//		else
//		{
//			System.out.println("no");
//		}
//	
	//program for perfect number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		int num=sc.nextInt();
//		int copy=num;
//	    int	sum=0;
//		for(int i=1;i<num;i++)
//		{
//			int rem=num%10;
//			if(num%i==0)
//			{
//				sum=sum+i;
//			}
//		}
//              if(copy==sum)
//           {
//           System.out.println("perfect"); 	 
//              }
//              else
//              {
//            	  System.out.println("no");
//              }
//		
        //program for substring in given string
//		String s="pavankulkarni";
//		String get=s.substring(5);
//		String yes=s.substring(5, 9);
//		System.out.println(get);
//		System.out.println(yes);
//	
	//program for number palindrome 
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		int num=sc.nextInt();
//		int copy=num;
//		int rev=0;
//		while(num!=0)
//		{
//			int rem=num%10;
//			rev=rev*10+rem;
//			num=num/10;
//		}
//	     if(copy==rev)
//	     {
//	    	 System.out.println("palindrome");
//	     }
//	     else
//	     {
//	    	 System.out.println("no");
//	     }
//	
	//patterns programs
		/*
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 */
//		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
		//2
//		for(int i=1;i<=5;i++)                 //   * * * *  *
//		{                                     //   * * * *
//			for(int j=i;j<=5;j++)             //   * * *
//			{                                  //  * *
//				System.out.print("* ");        //  *
//			}
//			System.out.println();
//		}
//		
		//3
//		for(int i=1;i<=5;i++)                    // * 
//		{                                        // * * 
//			for(int j=1;j<=i;j++)                // * * * 
//			{                                    // * * * *
//				System.out.print("* ");          // * * * * *
//			}
//	
//		System.out.println();
//		}
//	
		//4
//		int star1=1;
//		int space1=3;
//		for(int j=1;j<=4;j++)                     //         *
//		{                                         //       * * *
//		for (int i = 1; i <=space1; i++)          //     * * * * *
//        {                                       //   * * * * * * * 
//			System.out.print(" ");
//		}
//		for(int k=1;k<=star1;k++)
//		{
//			System.out.print("*");
//			
//		}
//		System.out.println();1
//		space1--;
//		star1+=2;	
//		}
//		
		//5
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=i;j<=5;j++)                 //          *
//			{                                     //        * *
//				System.out.print(" ");            //      * * *
//			}                                     //    * * * *  
//			for(int j=1;j<=i;j++)                 //  * * * * *
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		//6
//		int space1=0;
//        int star1=7;
//		
//		for(int j=1;j<=7;j++)
//		{
//		for (int i = 1; i <=space1; i++)           // * * * * * * *
//        {                                        //   * * * * *
//			System.out.print("  ");                 //    * * *
//		}                                          //       *
//		for(int k=1;k<=star1;k++)                  //
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//		space1++;
//		star1-=2;	
//		}
//		
		//7
//		int space1=0;
//        int star1=5;
//		for(int j=1;j<=10;j++)                       
//		{                                           //  * * * * *
//		for (int i = 1; i <=space1; i++)            //    * * * *
//        {                                           //    * * *
//			System.out.print("  ");                  //       * *
//		}                                           //          *
//		for(int k=1;k<=star1;k++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//		space1++;
//		star1-=1;	
//		}
//		
		//8
//		int space=4;
//		int star=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=space;j++)             //       *
//			{                                     //      * *
//				System.out.print(" ");            //     * * *
//			}                                     //    * * * *
//			for(int k=1;k<=star;k++)              //   * * * * *
//	 		{                                     //
//				System.out.print("* ");
//			}
//			System.out.println();
//			space--;
//			star++;
//		}
//		
		//9
//		int space=4;
//		int star=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=space;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=star;k++)
//			{                                          //             *
//				System.out.print("*");                 //           * * *
//			}                                          //         * * * * *
//			System.out.println();                      //       * * * * * * *
//			star+=2;                                   //     * * * * * * * * *
//			space--;                                   //     * * * * * * * * * 
//		}                                              //       * * * * * * *  
//		int space1=1;                                  //         * * * * * 
//		int star1=7;                                   //           * * * 
//		for(int i=1;i<=5;i++)                          //             *
//		{                                              //
//			for(int j=1;j<=space1;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=1;k<=star1;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			space1++;
//			star1-=2;
//		}
//		
		//10
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4;j++)               // 1111
//			{                                   // 2222
//				System.out.print(j);            // 3333 
//			}                                   // 4444
//			System.out.println();
//		}
//		
		//11
//		for(int i=1;i<=5;i++)                 
//		{                                         //  1
//			for(int j=1;j<=i;j++)                 //  12
//			{                                     //  123 
//				System.out.print(j);              //  1234
//			}                                     //  12345
//			System.out.println();
//		}
//		
//		int space=0;
//		for(int i=4;i>=1;i--)
//		{
//			
//			for(int k=1;k<=space;k++)
//			{                                  // 4321 
//				System.out.print(" ");         //  321
//			}                                  //   21
//			for(int j=i;j>=1;j--)              //    1
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//			space++;
//		}		
		//12
//		int space=4;
//		int star=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=space;j++)             //       1
//			{                                     //      2 2
//				System.out.print(" ");            //     3 3 3
//			}                                     //    4 4 4 4
//			for(int k=1;k<=star;k++)              //   5 5 5 5 5
//	 		{                                     //
//				System.out.print(i+" ");
//			}
//			System.out.println();
//			space--;
//			star++;
//		}
//		
//		
//		
//		//14
//		char ch='Z';
//		for(int i=1;i<=5;i++)
//		{                                           
//	for(int j=1;j<=5;j++)                                   //   A B C D E 
//	{                                                        //  F G H I J 
//		System.out.print(ch-- +" ");	                      // K L M N O 
//	}	                                                      // P Q R S T 			  
//	System.out.println();                                     // U V W X Y
//		}
//		
//		for(int i=1;i<=8;i++)
//		{
//			for(int j=1;j<=8;j++)
//			{                                              //
//				if(i==8||i==1||i==8/2)                     //  ********
//				{                                          //  *
//					System.out.print("*");                 //  *
//				}                                          //  ********
//				else if(i<4 &&j==1)                        //         *
//				{                                          //         *
//					System.out.print("*");                 //  ********
//				}                                          //
//				else if(i>4&&j==8)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i=1;i<=8;i++)
//		{
//			for(int j=1;j<=8;j++)
//			{
//				if(i==1||i==8||i==j)
//				{
//					System.out.print("*");               // *********
//				}                                        //  *
//				else if(i==j)                            //   *        
//				{                                        //    *
//					System.out.print("*");               //     *
//				}                                        //      *
//				else                                     //       *
//				{                                        //        *
//					System.out.print(" ");               // *********
//				}
//			}
//			System.out.println();
//		}
//		
//		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{                                        // ******
//				if(i==1||i==5||i+j==6)               //     *
//				System.out.print("*");               //    * 
//				else                                 //   *
//					System.out.print(" ");           //  * 
//			}                                        // ******
//			System.out.println();
//		}
//		
//		for(int i=1;i<=7;i++)
//		{
//			for(int j=1;j<=7;j++)
//			{                                   //  *     *
//				if(i==j||i+j==8)                //   *   * 
//				System.out.print("*");          //    * *
//				else                            //     *
//					System.out.print(" ");      //   *   *
//			}                                   //  *     *
//			System.out.println();               // *       *
//		}
//		
//		for(int i=1;i<=6;i++)
//		{
//			for(int j=1;j<=6;j++)
//			{
//				if(i==1||i==3||j==1)         // ******
//				System.out.print("*");       // *    *
// 				else if(i<4&&j==6)           // ******
//				System.out.print("*");       // *    
//				else                         // *
//				System.out.print(" ");       // *
//			}                                //
//			System.out.println();
//		}
//		
//		int yes=2;
//		boolean flag=false;
//		for(int i=1;i<=7;i++)
//		{
//			for(int j=1;j<=7;j++)
//			{
//			 	if(i==1||i==3||j==1)             // *******
//					System.out.print("*");       // *     *
//				else if(j==7&&i<3)               // *******
//					System.out.print("*");       // **
//				else if(i>=4&&j==yes)            // * *
//				{                                // *  *
//					System.out.print("*");       // *   *
//                        flag=true;
//				}                          
//				else                             
//					System.out.print(" ");
//			}
//			System.out.println();
//			if(flag==true)
//			yes++;
//		}
//		
//		int yes=2;
//		boolean b=false;
//		for(int i=1;i<=7;i++)
//		{
//			for(int j=1;j<=4;j++)
//			{
//				if(j==1||i+j==6)                    // *  *
//					System.out.print("*");          // * *
//				else if(i>4&&j==yes)                // **
//				{                                   // **
//					System.out.print("*");          // * *
//				    b=true;                         // *  *
//				}                                   // *   *
//				else                                //
//					System.out.print(" ");
//			}
//			System.out.println();
//			if(b==true)
//			{
//				yes++;
//			}
//		}
//	
//         int n=5;
//         for(int i=1;i<=n;i++)
//         {
//        	 for(int j=1;j<=n-i;j++)
//        	 {
//        		 System.out.print(" ");
//        	 }
//        	 for(int k=1;k<=i;k++)
//        	 {
//        		 System.out.print("* ");
//        	 }
//        	 System.out.println();
//         }
//         for(int i=1;i<=n;i++)
//         {
//        	 for(int j=1;j<=i;j++)
//        	 {
//        		 System.out.print(" ");
//        	 }
//        	 for(int k=1;k<=n-i;k++)
//        	 {
//        		 System.out.print("* ");
//        	 }
//        	 System.out.println();
//         }
//		
//		
      //program to reverse string according to space //hi am=>ma ih
//		
//		String s="hi god";
//		int i=s.length()-1,j=s.length()-1;
//		while(j>-1)
//		{
//		for(int k=0;k<s.length();k++)
//		{
//			if(s.charAt(k)!=' ')
//			{
//				if(s.charAt(i)==' ')
//				{
//					i--;
//					j--;
//				}
//				System.out.print(s.charAt(i--));
//				j--;
//			}
//			else
//			{
//				System.out.print(" ");
//				j--;
//			}
//		}
//		}
//	
//		String s="s1d2f3";
//		int sum=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
//				{
//                  sum=sum+s.charAt(i)-48; 
//				}
//		}
//		System.out.println(sum);
//		
		//
//		String s1="acharya";
//		String s2="pradeep";
//		 s1=s1+s2;
//		s2=s1.substring(0, 7);
//		s1=s1.substring(7);
//		System.out.println("s2 = "+s2);
//		System.out.println("s1 = "+s1);
		
//		String s="hi god";
//		String s1=s.replace(" ", "");
//		String s2="";
//		System.out.println(s);
//		for(int i=s1.length()-1;i>=0;i--)
//	{
//        s2=s2+s1.charAt(i);		
//	}
//		int count=0;
//		for(int k=0;k<s.length();k++)
//		{
//			if(s.charAt(k)==' ')
//			{
//			System.out.print(' ');
//			}
//			else
//			{
//				System.out.print(s2.charAt(count));
//             count++;
//            }
//		}
//		
//		String s="hi god";
//		int i=s.length()-1,k=s.length()-1;
//		
//		while(k>-1)
//		{
//			for(int j=0;j<s.length();j++)
//			{
//				if(s.charAt(j)!=' ')
//				{
//				if(s.charAt(i)==' ') 
//				{
//				  i--;
//				  k--;
//				}
//				System.out.print( s.charAt(i--));
//				k--;
//				}
//				else
//				{
//					System.out.print(" ");
//					k--;
//				}
//			}
//		}
//		
//		
//		String s="hi god are u there";
//		String s1="";
//		System.out.println(s);
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			if(s.charAt(i)!=' ')
//			{
//			s1=s1+s.charAt(i);
//			}
//		}
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)==' ')
//			{
//				System.out.print(" ");
//			}
//			else
//			{
//				System.out.print(s1.charAt(count));
//				count++;
//			}
//		}
//
//		String s="god help me";
//	int i=s.length()-1,k=s.length()-1;
//	while(k>-1)
//	{
//       for(int j=0;j<s.length();j++)
//       {
//    	   if(s.charAt(j)!=' ')
//    	   {
//    		   if(s.charAt(i)==' ')
//    		   {
//    			   i--;
//    			   k--;
//    		   }
//    		   System.out.print(s.charAt(i--));
//    	       k--;
//    	   }
//    	   else
//    	   {
//    		   System.out.print(" ");
//    		   k--;
//    	   }
//       }
//	}
//
//      String s="god please help me";
//      String s1="";
//      for(int i=s.length()-1;i>=0;i--)
//      {
//    	  if(s.charAt(i)!=' ')
//    	  s1=s1+s.charAt(i);
//      }
//      System.out.println(s1);
//      int count=0;
//      for(int j=0;j<s.length();j++)
//      {
//    	  if(s.charAt(j)==' ')
//    	  {
//    		  System.out.print(" ");
//    	  }
//    	  else
//    	  {
//    		  System.out.print(s1.charAt(count));
//    	     count++;
//    	  }
//      }
//
//		String s="h1e2l3";
//		String s1="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
//			s1=s1+s.charAt(i);
//		}
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
//			{
//				System.out.print(s1.charAt(count));
//			    count++;
//			}
//			else
//			{
//				System.out.print(s.charAt(i));
//			}
//		}
//		
//       String s="taerg dnim";
//       String s1="";
//       for(int i=0;i<s.length();i++)
//       {
//           if(s.charAt(i)!=' ')
//           {
//        	   s1=s.charAt(i)+s1;
//           }
//           else
//           {
//        	   System.out.print(s1+" ");
//        	   s1="";
//           }
//           if(i==s.length()-1)
//           {
//        	   System.out.println(s1);
//           }
//       }
//	
//        String s="ih peedarp";
//        String s1="";
//        for(int i=0;i<s.length();i++)
//        {
//        	if(s.charAt(i)!=' ')
//        	{
//           s1=s.charAt(i)+s1;
//        	}
//        	else
//        	{
//        		System.out.print(s1+" ");
//        		s1="";
//        	}
//        	if(i==s.length()-1)
//        	{
//        		System.out.print(s1);
//        	}
//        }
//    		
//		  String s="tae rg sidog";
//		  int i=s.length()-1,k=s.length()-1;
//		  while(k>-1)
//		  {
//			  for(int j=0;j<s.length();j++)
//			  {
//				  if(s.charAt(j)!=' ')
//				  {
//					  if(s.charAt(i)==' ')
//					  {
//						  i--;
//						  k--;
//					  }
//					  System.out.print(s.charAt(i--));
//					  k--;
//				  }
//				  else
//				  {
//					  System.out.print(" ");
//					  k--;
//				  }
//			  }
//		  }
//		
//		String s="dn eirfih";
//		String s1="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			if(s.charAt(i)!=' ')
//			{
//              s1=s1+s.charAt(i);
//			}
//		}
//		   System.out.println(s1);
//		int count=0;
//		for(int j=0;j<s.length();j++)
//		{
//			if(s.charAt(j)==' ')
//			{
//				System.out.print(" ");
//			}
//			else
//			{
//				System.out.print(s1.charAt(count));
//				count++;
//			}
//		}
//		 
//		int[]arr= {1,0,2,0,1};
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]!=1)
//			{
//				System.out.print(arr[i]+ " ");
//			}
//		}
//		for(int j=0;j<arr.length;j++)
//		{
//			if(arr[j]==1)
//			{
//				System.out.print(arr[j]+" ");
//			}
//		}
//		
//	   int[]arr= {11,12,14,15,44,10,1,45,44,44,0};
//	   int fsmall=Integer.MAX_VALUE;
//	   int ssmall=Integer.MAX_VALUE;
//	   int tsmall=Integer.MAX_VALUE;
//	   for(int i=0;i<arr.length;i++)
//	   {
//		   if(arr[i]<fsmall)
//		   {
//			   tsmall=ssmall;
//			   ssmall=fsmall;
//			   fsmall=arr[i];
//		   }
//		   else if(arr[i]<ssmall)
//		   {
//			   tsmall=ssmall;
//			   ssmall=arr[i];
//		   }
//		   else if(arr[i]<tsmall)
//		   {
//			   tsmall=arr[i];
//		   }
//	   }
//       System.out.print(fsmall+" ");		
//		System.out.print(ssmall+" ");
//		System.out.print(tsmall);
//		
//      	String[]arr= {"hlh","hi","i","hello"};
//      	String small=arr[0];
//        for(int i=0;i<arr.length;i++)
//        {
//        	if(arr[i].length()<small.length())
//        	{
//        		small=arr[i];
//        	}
//        }
//        System.out.println(small);
//		
//		for(int i=1;i<=8;i++)
//		{
//			for(int j=1;j<=8;j++)
//			{
//				if(i==1||j==1||i==8||j==8||i!=j)
//				System.out.print("* ");
//			else
//			{
//				System.out.print("  ");
//			}
//		}
//			System.out.println();
//		}
//		
//
//		String s="hi bangara";
//		String[]arr=s.split(" ");
//		for(int i=arr.length-1;i>=0;i--)
//		{
//            System.out.print(arr[i]+" ");
//		}
//		
//		String s="hi appa";
//		String[]arr=s.split(" ");
//		String a=arr[0];
//		for(int i=0;i>arr.length;i--)
//		{
//			if(arr[i].length()>a.length())
//			{
//				a=arr[i];
//			}
//		}
//		System.out.println(a);
//		
//	String s="hi mani";
//	String s1="";
//	for(int i=s.length()-1;i>=0;i--)
//	{
//		s1=s1+s.charAt(i);
//	}
//	System.out.println(s1);
//	
//	int []arr= {10,20,15,50,20};
//	
//	for(int i=0;i<arr.length;i++)
//	{
//		for(int j=i+1;j<arr.length;j++)
//		{
//			if(arr[i]==arr[j])
//			{
//				arr[j]=100;
//			}
//		}
//	}
//	for(int k=0;k<arr.length;k++)
//	{
//		if(arr[k]!=100)
//		{
//			System.out.println(arr[k]+" ");
//		}
//	}
//	
//		int iteration=0;
//		int []arr= {1,2,3,4,5,6};
//		for(int i=0;i<=iteration;i++)
//		{
//			for(int j=0;j<arr.length-1;j++)
//			{
//				 {
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//				 }
//			}
//		}
//       for(int k=0;k<arr.length;k++)
//       {
//    	   System.out.print(arr[k]+" ");
//       }
//       
//		int []arr= {1,4,6};
//		for(int i=0;i<=10;i++)
//		{
//			boolean flag=false;
//			for(int j=0;j<arr.length;j++)
//			{
//			if(arr[j]==i)
//			{
//				flag=true;
//				break;
//			}
//			}
//		if(!flag)
//		{
//			System.out.print(i+" ");
//		}
//		}
//			
//		   int c=0;
//		   int d=0;
//	        int[]arr= {1,2,3};
//	        int []abb= {1,2,3,4};
//	        for(int i=0;i<arr.length;i++)
//	        {
//	        	for(int j=0;j<abb.length;j++)
//	        	{
//	        		if(i==j)
//	        		{
//	        			c=abb[i]+arr[j];
//	        		}
//	        		else
//	        		{
//	        		   d=abb[j];	
//	        		}
//	        	}
//	        	System.out.println(c);
//	        }
//	System.out.println(d);
//	
//	
//		int []arr= {1,2,3};
//		int []abb= {2,1,3,0};
//		
//		for(int i=0;i<abb.length;i++)
//		{
//			try
//			{
//				System.out.println(arr[i]+abb[i]);
//			}
//			catch(Exception e)
//			{
//				if(arr.length<abb.length)
//				{
//					System.out.print(abb[i]);
//				}
//				else
//				{
//					System.out.print(arr[i]);
//				}
//			}
//		}
//		
//		String s="god";
//		String s1="dog";
//		char []ch1=s.toCharArray();
//	    char []ch2=s1.toCharArray();
//	    Arrays.sort(ch2);
//	    Arrays.sort(ch1);
//	    
//	    if(Arrays.equals(ch1, ch2)==true)
//	    {
//	    	System.out.println("anagram");
//	    }
//	    else
//	    {
//	    	System.out.println("not anagram");
//	    }
//		
//		String s="ppradee";
//		char[]arr=s.toCharArray();
//		int key=1;
//		while(key-->0)
//		{
//			for(int i=0;i<arr.length;i++)
//			{
//				try {
//				int temp=arr[i];
//				arr[i]=arr[i+1];
//				arr[i+1]=(char) temp;
//				}
//				catch(Exception e)
//				{
//					
//				}
//			}
//		}
//		for(int k=0;k<arr.length;k++)
//		{
//			System.out.println(arr[k]);
//		}
//		
//	    int []arr= {1,2,3};
//		int[]arr1= {10,1,2,3,40};
//		for(int i=0;i<arr1.length;i++)
//		{
//			boolean flag=false;
//			for(int j=0;j<arr.length;j++)
//				{
//				if(arr[j]==arr1[i])
//				{
//					flag=true;
//					break;
//				}
//				}
//		if(!flag)
//		{
//			System.out.println(arr1[i]);
//		}
//		}
//		
//	  String s="aaabbccdde";
//	  LinkedHashMap< Character, Integer>l1=new LinkedHashMap<>();
//	  for(int i=0;i<s.length();i++)
//	  {
//          l1.put(s.charAt(i), i);		  
//	  }
//       for(Entry< Character,Integer> ch:l1.entrySet())
//       {
//    	   int count=0;
//    	   boolean flag=false;
//    	   for(int k=0;k<s.length();k++)
//    	   {
//    		   if(ch.getKey()==s.charAt(k))
//    		   {
//    			   count++;
//    			   flag=true;
//    		   }
//    	   }
//    		   if(count>=1)
//    		   {
//    			   System.out.print(ch.getKey());
//    			   System.out.print(count);
//    		   }
//       }
		
//		 int n=145;int sum1=0;int temp=n;
//	     while(n>0) {
//	    	 int c=n%10;
//	    	 int sum=1;
//	    	 while(c>0) {
//	    		 sum=sum*c;
//	    		 c--;
//	    	 }
//	    	 sum1=sum1+sum;
//	    	 n=n/10;
//	     }if(temp==sum1) {
//	    	 System.out.println("it is strong number");
//	     }else {
//	    	 System.out.println("it is not strong number");
//	     }
//		
//		String s="aaaabbbccca";
//		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			int count=1;
//			while(i+1<s.length()&&s.charAt(i+1)==ch)
//			{
//				count++;
//				i++;
//			}
//			sb.append(ch).append(count);
//			}
//		System.out.println(sb.toString());
//	
//	    int n=0;
//         for(int i=0;i<=5;i++)
//	    {
//			n=(n*2)+1;
//			System.out.print(n+" ");
//		}
//		int n=0;
//		while(n<127)
//		{
//			n=(n*2)+1;
//			System.out.print(n+" ");
//		}
//		int fib1=1;
//		int fib2=2;
//		int fib3=0;
//		for(int i=0;i<=5;i++)
//		{
//			fib3=fib1+fib2;
//			fib1=fib3;
//			fib2=fib3+1;
//			System.out.print(fib3+" ");
//		}
//	    for(int i=0;i<=100;)
//	    {
//	    	i=i+i;
//	    	i++;
//	    	System.out.println(i+" ");
//	    }
//		char[]arr= {'a','e','i','o','u'};
//		for(int i=0;i<5;i++)
//		{
//			for(int j=0;j<5;j++)
//			{
//				if(i>=j)
//				{
//				 System.out.print(arr[j]+" ");
//				}
//			}
//			System.out.println();
//		}
//		
//		int yes=2;
//		int no=1;
//		boolean flag=false;
//		boolean fl=false;
//		for(int i=1;i<=7;i++)
//		{
//			for(int j=1;j<=7;j++)
//			{
//				if(j==1&&i%2==1||i==4&&j==7)
//				{
//					System.out.print("*");
//				}
//				else if(i<5&&j==yes)
//				{
//					flag=true;
//					System.out.print("*");
//				}
//				else if(i>4&&i+j==10||i==4&&j==3)
//				{
//					fl=true;
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//			if(flag==true)
//			{
//				yes+=2;
//			}
//			if(fl==true)
//			{
//				no+=2;
//			}
//		}
//		
//		for(int i=1;i<=11;i++)
//		{
//			for(int j=1;j<=17;j++)
//			{
//				if(j==9||i==11&&j<9||i==1&&j>8)
//				{
//					System.out.print("*");
//				}
//				else if(i==6||j==1&&i<6||j==17&&i>6)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//		int []arr= {1,5,8};
//		for(int i=1;i<=10;i++)
//		{
//			boolean flag=false;
//          for(int k=0;k<arr.length;k++)
//          {
//        	  if(arr[k]==i)
//        	  {
//        		  flag=true;
//        	  }
//          }
//          if(!flag)
//    	  {
//    		  System.out.print(i+" ");
//    	  }
//		}
//	   String s="god";
//	   String s1="dog";
//        char[]arr=s.toCharArray();
//        char[]arr1=s1.toCharArray();
//         Arrays.sort(arr);
//         Arrays.sort(arr1);
//	      if(Arrays.equals(arr, arr1)==true)
//	      {
//	    	  System.out.println("anagram");
//	      }
//	      else
//	      {
//           System.out.println("no");	    	  
//	      }
//	
//		
//	 String s="ssf12dff11xfff5gdfg6";
//	 String[]arr=s.split("[^\\d]+");
//	 System.out.println(Arrays.toString(arr));
//	int[]in=new int[arr.length];
//	int multi=1;
//	 for(int i=1;i<arr.length;i++)
//	 {
//		 in[i]=Integer.parseInt(String.valueOf(arr[i]));
//		 multi=multi*in[i];
//		 System.out.print(in[i]+"*");
//	 }
//	 System.out.print("="+multi);
//		
//	String s="pe ed arpmaih";
//	int i=s.length()-1,k=s.length()-1;
//	while(k>-1)
//	{
//		for(int j=0;j<s.length();j++)
//		{
//			if(s.charAt(j)!=' ')
//			{
//				if(s.charAt(i)==' ')
//				{
//					i--;
//					k--;
//				}
//				System.out.print(s.charAt(i--));
//				k--;
//			}
//			else
//			{
//				System.out.print(" ");
//				k--;
//			}
//		}
//	}
//		String s="fsdj12kjsd4jdfn4jn5";
//		String[]arr=s.split("[^\\d]+");
//		System.out.println(Arrays.toString(arr));
//		int[]in=new int[arr.length];
//		int multi=1;
//		for(int i=1;i<arr.length;i++)
//		{
//			in[i]=Integer.parseInt(String.valueOf(arr[i]));
//			multi=multi*in[i];
//			System.out.print(in[i]+"*");
//		}
//		System.out.print("="+multi);
		
		String s="hnhiub6c364578nm9mjnbhnhj/9999/jgtrcvjki8nj";
		s=" "+s+"    ";
		for(int i=0;i<s.length();i++)
			{
if((s.charAt(i)>='0'&&s.charAt(i)<='9')&&(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9')&&(s.charAt(i+2)>='0'&&s.charAt(i+2)<='9')&&
		(s.charAt(i+3)>=' '&&s.charAt(i+3)<='9')&&(s.charAt(i-1)=='/'&&s.charAt(i+4)=='/'))
              {
	                 System.out.print(s.charAt(i));
	                 System.out.print(s.charAt(i+1));
	                 System.out.print(s.charAt(i+2));
	                 System.out.print(s.charAt(i+3));
              }
			}
			}
}

