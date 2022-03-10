package com.github.suraj.miniproject2;


/**
 * @author 09-03-2022
 */

public class SnakeLadder {

    static int box1 = 0;

    public static int diceFunction1(int c) {
        for (int i = 1; i<=c; i++){
            box1++;
        }
        return box1;
    }

    public static void main(String [] args){

        while (box1 < 15){
            System.out.println("Dice is rolling");
            for(int i = 1; i<=10; i++){
                System.out.print(".");
            }

            int b = (int) (Math.random()*10);
            System.out.println("Random no." +" "+ b);
            System.out.println("House no."+ " " +box1);
            if (b == 0) {
                int c = 1;
                diceFunction1(c);

                if (box1 == 10){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking you to house no. 1");
                    box1 = 1;
                }

                else if(box1 == 14){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 4");
                    box1 = 4;
                }

                else if(box1 == 2){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 6");
                    box1 = 6;
                }

                else if (box1 == 9){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 13");
                    box1 = 13;
                }
            }

            else if (b > 0 && b < 3) {
                int c = 2;
                diceFunction1(c);

                if (box1 == 10){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 1");
                    box1 = 1;
                }

                else if(box1 == 14){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 4");
                    box1 = 4;
                }

                else if(box1 == 2){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 6");
                    box1 = 6;
                }

                else if (box1 == 9){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 13");
                    box1 = 13;
                }
            }

            else if (b > 2 && b < 5) {
                int c = 3;
                diceFunction1(c);

                if (box1 == 10){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 1");
                    box1 = 1;
                }

                else if(box1 == 14){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 4");
                    box1 = 4;
                }

                else if(box1 == 2){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 6");
                    box1 = 6;
                }

                else if (box1 == 9){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 13");
                    box1 = 13;
                }
            }

            else if (b > 4 && b < 7) {
                int c = 4;
                diceFunction1(c);

                if (box1 == 10){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 1");
                    box1 = 1;
                }

                else if(box1 == 14){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 4");
                    box1 = 4;
                }

                else if(box1 == 2){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 6");
                    box1 = 6;
                }

                else if (box1 == 9){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 13");
                    box1 = 13;
                }
            }

            else if (b > 6 && b < 9) {
                int c = 5;
                diceFunction1(c);

                if (box1 == 10){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 1");
                    box1 = 1;
                }

                else if(box1 == 14){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 4");
                    box1 = 4;
                }

                else if(box1 == 2){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 6");
                    box1 = 6;
                }

                else if (box1 == 9){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 13");
                    box1 = 13;
                }
            }

            else if (b == 9) {
                int c = 6;
                diceFunction1(c);

                if (box1 == 10){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 1");
                    box1 = 1;
                }

                else if(box1 == 14){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Oops you are in the mouth of a snake taking to to house no. 4");
                    box1 = 4;
                }

                else if(box1 == 2){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 6");
                    box1 = 6;
                }

                else if (box1 == 9){
                    System.out.println("House no." + " " + box1);
                    System.out.println("Congratulations you are at the step of a ladder taking you to box no. 13");
                    box1 = 13;
                }
            }
        }

                System.out.println("House no." + " " + box1);
                System.out.println("Game over");
    }
}

