package logical;

public class Separateall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1="01aA%b2R";
//       char[]arr=s1.toCharArray();
       String uc="";
       String lc="";
       String no="";	   
       String spc="";
       for(int i=0;i<s1.length();i++)
       {
    	   char ch=s1.charAt(i);
    	   if(ch>=65 && ch<=90)
    	   {
    		   uc=uc+ch;
    	   }
    	 
    	   else if(ch>=97 && ch<=122)
    	   {
    		   lc=lc+ch;
    	   }
    	   else if(ch>=48 && ch<=57)
    	   {
    		   no=no+ch;
    	   }
    	   else
    	   {
    		   spc=spc+ch;
    	   }
       }
       System.out.println(uc);
       System.out.println(lc);
       System.out.println(no);
       System.out.println(spc);
       
       
       
       }

}
