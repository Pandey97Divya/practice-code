package oopsconcepts.oopsconcepts;
class Construct{
	int rollno;
	Construct(){
		
	}
	Construct(int id){
		rollno=id;
	}
	public void construct() {
		System.out.println("Construction");
		System.out.println(rollno);
	}
}
public class Constructor1 {
	public static void main(String[] args) {
		Construct c= new Construct();
		c.construct();
		Construct c1= new Construct(1);
		c1.construct();
		Construct c2= new Construct(2);
		c2.construct();
		Construct c3= new Construct(3);
		c3.construct();
		Construct c4= new Construct(4);
		c4.construct();
	}
}
