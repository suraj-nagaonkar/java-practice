package com.github.suraj.Reccursiontrial;

/**
 * @author 19-02-2022
 */

    public class Recursion1{
        public static int calFactorial(int n){
            if (n == 1){
                return 1;
            }

            int fact1 = calFactorial(n-1);
            int fact2 = n*fact1;
            return fact2;
        }

        public static void main(String args[]){
        int n = 5;
        int Factorial = calFactorial(n);
        System.out.println(Factorial);
    }
}
