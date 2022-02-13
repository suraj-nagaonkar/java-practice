// Creating a function to calculate the factorial of 2 numbers

import java.util.Scanner;
class OddNumbers {
public static void PrintOddNumbers(int n){
	for (int i=1; i<=n; i++){

		if (i % 2==1){

System.out.print(i + " ");

}

else {

	System.out.print("");
}
	}
return;
	}

public static void main(String args[]){

	
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
int n = sc.nextInt();
PrintOddNumbers(n);
}

}






