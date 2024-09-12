package oopsconcepts.oopsconcepts;

public class Reverse {
	public static void main(String[] args) {
		// Input str="My Name is Divya Pandey"
		// Output yedanP ayviD si emaN yM"
		//Pandey Divya is Name My
		String s= "My Name is Divya Pandey";
		String[] str= s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			String tmp= str[i];
			for(int j=0;j<=tmp.length()-1;j++) {
				System.out.print(tmp.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
