import java.util.Scanner;

class CalculatingSeconds {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input your age");
	int age = sc.nextInt();
	int Z = age*12*30*24*60*60;
	System.out.println("Total seconds since you were born " + Z);
  }
}