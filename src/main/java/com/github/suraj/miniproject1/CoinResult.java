package com.github.suraj.miniproject1;
import java.util.Random;
/**
 * @author 14-03-2022
 */

public class CoinResult {
    public void coinResult(String input) {
        System.out.print("The coin is being flipped");
        Thread T1 = new Thread();
        for (int i = 0; i <= 10; i++) {
            try {
                T1.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        // defining the range
        int max = 2;
        int min = 1;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        System.out.println(rand);

        if (rand == 1) {
            String c = "Head";
            String d = "Tail";
            if (input.compareTo(c) == 0) {
                System.out.println("Hey congratulations player 1 won");
            }

            else if (input.compareTo(d) == 0) {
                System.out.println("Hey congratulations player 2 won");
            }
        }

        else if(rand == 2){
            String c = "Tail";
            String d = "Head";
            if (input.compareTo(c) == 0) {
                System.out.println("Hey congratulations player 1 won");
            }

            else if (input.compareTo(d) == 0) {
                System.out.println("Hey congratulations player 2 won");
            }
        }
    }
}




