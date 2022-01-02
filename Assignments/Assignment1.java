package Assignments;
class basicmathoperations {
	public static void main(String[] args)
	{
		int n1 = 20, n2 = 10, sum = 0, sub=0, mult=0,div=0;

		System.out.println("number1 = " + n1);
		System.out.println("number2 = " + n2);
		
		sum = n1 + n2;
        System.out.println("The Addition of two numbers");
		System.out.println("The sum = " + sum);

        sub = n1 - n2;
        System.out.println("The subtraction of two numbers");
		System.out.println("The sub = " + sub);

		mult = n1 * n2;
        System.out.println("The multiplication of two numbers");
		System.out.println("The mult = " + mult);

        div = n1 / n2;
        System.out.println("The division of two numbers");
        System.out.println("The div = " + div);
	}
}