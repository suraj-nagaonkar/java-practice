import java.util.Scanner;
class CallFunctionAdd {
public static int CalculateSum(int a, int b){
	  int sum = a+b; // Or directly we can write a+b; not necessary to define a variable
    return sum;  // returns to the part of the code from where the function was called

	}
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
int a = sc.nextInt();
System.out.println("Enter the second number");
int b = sc.nextInt();
int sum = CalculateSum(a,b);
System.out.println("Sum of 2 numbers is : "+ sum);
	}
}