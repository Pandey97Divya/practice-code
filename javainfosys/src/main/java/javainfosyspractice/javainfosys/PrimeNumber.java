package javainfosyspractice.javainfosys;

public class PrimeNumber {
	public static void main(String[] args) {
		int n= 37;
		boolean isPrime= true;
		for(int i=2; i<n;i++) {
			if(n %  i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime == true) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
		
	}
}
