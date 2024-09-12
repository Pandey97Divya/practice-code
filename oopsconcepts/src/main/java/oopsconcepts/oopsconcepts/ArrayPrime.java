package oopsconcepts.oopsconcepts;

import java.util.ArrayList;
  


public class ArrayPrime {
	public static void main(String[] args) {
		int[] arr= {5,10,15,3,5,7,24,28,13,19,18,17};
//		{3,5,7,13,19,17}
		ArrayList<Integer> obj1= new ArrayList<Integer>();
		ArrayList<Integer> obj2= new ArrayList<Integer>();
		obj1.add(5);
		obj1.add(10);
		obj1.add(15);
		obj1.add(3);
		obj1.add(7);
		obj1.add(24);
		obj1.add(28);
		obj1.add(13);
		obj1.add(19);
		obj1.add(18);
		obj1.add(17);
		for(int i=0;i<obj1.size();i++) {
			//5= 2,3,4
			//10=2,5,10
			boolean flag= true; 
			for(int j=2;j<obj1.get(i);j++) {
				if(obj1.get(i)%j==0) {
					flag= false;
					break;
				}
			}
			if (flag==true) {
				obj2.add(obj1.get(i));
			}
		}
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
