package week1.day1;

public class WhileLoop {
// sum of digits 345
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 123;
int quotient;
int remainder;
int sum=0; 
System.out.println(" The Numb = " + number);
while (number != 0) {
	quotient= number/10;
	remainder= number % 10;
	sum=sum+remainder;
	number=quotient;
	System.out.println(" The quotient is " + quotient);
	System.out.println(" The Remainder is " + remainder);
}
System.out.println(" The sum of digits is " + sum);
	}

}
