package oopsconcepts.oopsconcepts;

abstract class Clothes{
	public static void clothes() {
		System.out.println("made clothes");
	}
	void girlsClothes1() {
		System.out.println("Black Colour");
	}
	public void boysClothes1() {
		System.out.println("Maroon Colour");
	}
	public abstract void kid();
}
class Girls extends Clothes{
	public void girlsClothes() {
		System.out.println("Green Colour");
	}

	@Override
	public void kid() {
		System.out.println("Frock");
	}
}
class Boys extends Clothes{
	public void boysClothes() {
		System.out.println("White Colour");
	}

	@Override
	public void kid() {
		System.out.println("sherwani");
		
	}
}

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Clothes.clothes();
//        Clothes c= new Clothes();
//        c.girlsClothes1();
//        c.boysClothes1();
        Girls g= new Girls();
        g.girlsClothes();
        g.kid();
        g.girlsClothes1();
        Boys b= new Boys();
        b.boysClothes();
        b.boysClothes1();
        b.kid();
        Clothes c= new Girls();
        c.kid();
        Clothes c1=new Boys();
        c1.kid();
    }
}
