package week1.day2;

public class MyCalculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj = new Calculator();
		
		int sum = obj.add(10, 11 , 12);
		System.out.println("The sum of the given numbers is: " + sum);
		
		int difference = obj.sub(10, 15);
		System.out.println("The difference of the given numbers is: " + difference);
		
		float product = obj.multiply(100, 75);
		System.out.println("The product of the given numbers is: " + product);
		
		double quotient = obj.division(100, 33);
		System.out.println("The quotient of the given numbers is: " + quotient);
	}

}


