package Oop;

public class abtraction extends multiplication {
	
	public void add(int a, int b) {
		
		int sum =a+b;
		
		System.out.println(sum);
		
	}
	
	public int add(int a, int b, int c) {
		
		
		int sum =a+b+c;
		
		return sum; 
		
	}
		
		public void multiply( int a, int b) {
			
			int sum= a/b;
			
			System.out.println(sum);
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abtraction a1 = new abtraction ();
		
		a1.add(25, 56);
		
		System.out.println(a1.add(35, 40, 55));

		
		a1.multiply(50, 25);
	}

}
