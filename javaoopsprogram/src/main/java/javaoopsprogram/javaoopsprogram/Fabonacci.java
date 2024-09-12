package javaoopsprogram.javaoopsprogram;

public class Fabonacci {
	public static void main(String[] args) {
		int a=0, b=1,c;
//		int sum= 0;
//		System.out.println(a);
//		System.out.println(b);
//		while(sum<100) {
//			sum=a+b;
//			System.out.println(sum);
//			a=b;
//			b=sum;
//		}	
		int count= 10;
		System.out.println(a + "" + b);
		for(int i=2;i<count;i++) {
			c= a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
