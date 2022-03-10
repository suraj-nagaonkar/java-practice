package com.github.suraj.miniproject1;
import java.util.*;

/**
 * @author 09-03-2022
 */

public class CoinFlip {

    public static void main(String[] args){
        int a = (int) (Math.random()*100);
        System.out.println(a);
        System.out.println("Player 1 enter your choice as Head or Tail");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();

        if (a<50){
            String c = "Head";
            String d = "Tail";
                    if (b.compareTo(c) == 0){
                        System.out.println("Hey congratulations player 1 won");
                    }

                    else if (b.compareTo(d) == 0) {
                        System.out.println("Hey congratulations player 2 won");
                    }
        }

        else {
            String c = "Tail";
            String d = "Head";
            if (b.compareTo(c) == 0){
                System.out.println("Hey congratulations player 1 won");
                return;
            }

            else if(b.compareTo(d) == 0) {
                System.out.println("Hey congratulations player 2 won");
            }
        }
    }
}


