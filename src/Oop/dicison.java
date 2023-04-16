package Oop;

public class dicison {
	
	public void add (int a, int b) {
		
		int sum = a+b;
		
		System.out.println(sum);
	}
	
	 public int add(int a, int b, int c) {
		 
		  int sum= a+b+c;
		  
		  return sum; 
		 
	 }
	
	 public void add(double a, double b) {
		 
		 double sum = a+b;
		
				 
		System.out.println(sum);
		 
	 }
	
	
	public static void main(String[] args) {
		
		dicison  d1= new dicison();
		 
		d1.add(30, 80);
		
		d1.add(40.4,25.8);
		

	}

}
