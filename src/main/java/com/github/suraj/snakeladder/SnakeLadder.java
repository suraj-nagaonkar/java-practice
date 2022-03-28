package com.github.suraj.snakeladder;

/**
 * @author 14-03-2022
 */

public class SnakeLadder {

    public int snakeLadder(int value, String player, int count){
        System.out.println("Moving "+player+" by "+value+" position forward");
        for(int i=1; i<=value; i++){
            count++;
        }
         if (count == 10){
             System.out.println("Oop's "+player+" you are in house no. 10 and you are caught by a snake taking you back to the house no.1");
             count = 1;
         }

         else if(count == 14){
             System.out.println("Oop's "+player+" you are in house no. 14 and you are caught by the snake taking you back to the house no.4");
             count = 4;
         }

         else if(count == 2){
             System.out.println("Hey "+ player+" congrats you are at the base of a ladder taking you directly to the box no. 6");
             count = 6;
         }

         else if(count == 9){
             System.out.println("Hey "+player+" congrats you are at the base of a ladder taking you directly to the box no. 13");
             count = 13;
         }

         else if(count >= 15){
             return count;
         }
         return count;
    }
}
