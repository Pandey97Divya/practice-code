package javapractice1.java1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String str="My name is Harsh Kumar Upadhyay";
        str= str.toLowerCase();
        //str= str.toUpperCase();
        char a='A';
        int n=0;
        for(int i=0;i<str.length();i++) 
        {
        	if(str.charAt(i)=='h') {
        		n++;
        	}
        }
        System.out.println(n);
        System.out.println(str);
        System.out.println(str.length());
        String abc="I am Divya Pandey";
       // abc= abc.toLowerCase();
        abc= abc.toUpperCase();
        
        
        
        int l=0;
        for(int i=0;i<abc.length();i++)
        {
        	if(abc.charAt(i)=='A') {
        	 l++;
        	}
        }
        System.out.println(l);
        System.out.println(abc);
        System.out.println(abc.length());
        for(int i=0;i<abc.length();i++)
        {
        	System.out.print(abc.charAt(i));
        }
        System.out.println();
        for(int i=abc.length()-1;i>=0;i--) 
        {
        	System.out.print(abc.charAt(i));
        }
    }
}
