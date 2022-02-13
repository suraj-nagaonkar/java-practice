import java.util.Scanner;
class Surname {
public static void Myname(String Surname){
	System.out.println(Surname);
}


public static void main(String args[]){

	
Scanner sc = new Scanner(System.in);
System.out.print("Enter your surname : ");
String Surname = sc.nextLine();
System.out.print("Your surname is : ");
Myname(Surname);
}

}