package com.github.suraj.snakeladder;

/**
 * @author 14-03-2022
 */

public class DiceFunction {
    public int diceFunction(String player){
        System.out.print("Rolling dice for "+player);
        Thread T1 = new Thread();
        for(int i=1; i<=10;i++) {
            System.out.print(".");
            try {
                T1.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Generating a value between 1 to 6
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        System.out.println("Random no. "+rand);
        return rand;
    }
}
