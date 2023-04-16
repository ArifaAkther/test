package Oop;

public class subtraction extends abtraction {
	
	int x;
	
	int y;
	
	public void sub() {
		
		int sum =x-y;
		
		System.out.println(sum);
		
	}
	
	public void add(double a,double b) {
		
		double sum =a+b;
		
		System.out.println(sum);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subtraction s1= new subtraction();
		
		s1.add(40, 53);
		
		s1.add(43.5, 54.5);
		
		s1.x=3;
		
		s1.y=5;
		
		s1.add(25.7, 56.7);
		

	}

}
