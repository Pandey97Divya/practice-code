package javaoopsprogram.javaoopsprogram;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a=10;
        int b=20;
        System.out.println(" a is " + a + " b is "+b);
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After Swapping a is "+ a+ " b is "+ b);
        int c=0;
        c=b;
        b=a;
        a=c;
        System.out.println("After Swapping a is "+ a+ " b is "+ b);
    }
}
