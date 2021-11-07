// Writing and calling function//
import java.util.Scanner;
class CallingFunction {
// Defining functiontion
	public static void PrintMyName(String name){
	  System.out.println("Your name is : ");
System.out.print(name);
return;  // returns to the part of the code from where the function was called

	}
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name : ");
String name  = sc.nextLine(); // Prints the entire string
PrintMyName(name);

	}
}
