package bca.student;

/**
 * Hello world!
 *
 */
public class App extends Bca
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App s=new App();
//        s.addmission();
//        Bca b=new Bca();
//        b.bca();
//        b.CProgramming();
//        b.DataStructure();
//        b.Java();
        s.CProgramming();
        s.DataStructure();
        s.Java();
    }
}
//class Student
//{
//	public void addmission()
//	{
//		System.out.println("Start Addmission");
//	}
//}
class Bca
{
	public void bca()
	{
		System.out.println("Bca Students");
	}
	public void CProgramming()
	{
		System.out.println("C Programming");
	}
	public void Java()
	{
		System.out.println("Java");
	}
	public void DataStructure()
	{
		System.out.println("Data Structure");
	}
}

