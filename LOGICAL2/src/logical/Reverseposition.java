package logical;

public class Reverseposition {
	public static void main(String[] args) 	
	{
//       String s="hi a m go";
//       String []arr=s.split(" ");
//       StringBuffer sf=new StringBuffer(s);
//       sf.reverse();
//       for(int i=0;i<s.length();i++)
//       {
//    	   if(s.charAt(i)==' ')
//    	   {
//    		   sf.insert(i,"");
//    	   }
//       }
//       sf.append("");
//       System.out.println(sf);

		
//	String s1="Deepak kumar";
//    String rev="";     
//	for(int i=s1.length()-1;i>=0;i--)
//	{
//         rev=rev+s1.charAt(i);
//        
//	}
//	String s2=rev.toLowerCase();
//	System.out.print(s2);

		
		
//			String s1="Deepak kumar";
//	    String rev="";     
//	    for(int i=s1.length()-1;i>=0;i--)
//		{
//	         rev=rev+s1.charAt(i);        
//		}
//		String s2=rev.toLowerCase();
//		System.out.println(s2); //output=ramuk kapeed
//		String[]arr=s2.split(" ");
//		String rev2 = arr[1]+" "+arr[0];
//		System.out.print(rev2); //output kapeed ramuk
		
		
//		String s="@%a*s&y";
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>=97 && s.charAt(i)<=122)
//			{
//				System.out.println(s.charAt(i)+" " +"it is alphabet");
//			}
//		}
		
//		String a="a3";
//		int sum=0;
//		String s="";
//		String c=" ";
//		
//		for(int i=0;i<a.length();i++)
//		{
//		  c = c+a.charAt(i);
//		  if(a.charAt(i)>=97 && a.charAt(i)<=122)
//		  {
//			  System.out.println("it is a alphabet");
//		  }
//		  else
//		  {
//			  s=s+a.charAt(i);
//		  }	  
//		}
//         System.out.println(sum);
		String ns="prp";
        int count=0;
		char[]arr=ns.toCharArray();

		for(int i=0;i<arr.length;i++)
		{
			if(ns.charAt(i)==arr[i])
			{
count++;				
			}
		}
		
		System.out.println(count);
		
	}
}
