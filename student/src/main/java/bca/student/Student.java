package bca.student;

public class Student implements University, College {
	public static void main(String args[])
	{
		University u= new Student();
		u.university();
		College c= new Student();
		c.college();
		Student s= new Student();
		s.college();
		s.university();
	}

	public void college() {
		// TODO Auto-generated method stub
		System.out.println("College");
	}

	public void university() {
		// TODO Auto-generated method stub
		System.out.println("MDU University");
	}
}

interface University{
	void university(); 
}
interface College{
	void college();
}
