package com.github.suraj.snakeladder;
import java.util.Scanner;
/**
 * @author 14-03-2022
 */

public class GameCoordinator {
    public void gameCoordinator(){
        System.out.println("Hey folks I am Jennifer the coordinator of this game, let's begin the game");
        System.out.println("Dear players please enter your names");

        Scanner sc = new Scanner(System.in);
        String player1 = sc.nextLine();
        String player2 = sc.nextLine();
        String player3 = sc.nextLine();
        String player4 = sc.nextLine();

        Thread s1 = new Thread();
        System.out.println("Hey everyone please give a big round of applause to all the four participants - "+ player1+", "+player2+", "+player3+", "+player4);
        try {
            s1.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("So without wasting the time let's start the game");

        try {
            s1.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        DiceFunction D1 = new DiceFunction();
        SnakeLadder sl = new SnakeLadder();
        int value =0;
        int value2 = 0;
        int value3 = 0;
        int value4 = 0;
        int p1block = 0, p2block = 0, p3block = 0, p4block = 0;

            while(p1block <= 15 || p2block <= 15 || p3block <= 15 || p4block <= 15) {
                value = D1.diceFunction(player1); // Value returned by the dice function//
                p1block = sl.snakeLadder(value, player1,p1block); // To know the house no. of the player1//
                System.out.println(player1 +" you are in house no."+p1block);
                value2 = D1.diceFunction(player2); // Value returned by the dice function//
                p2block = sl.snakeLadder(value2, player2,p2block); // To know the house no. of the player1//
                System.out.println(player2 +" you are in house no."+p2block);
                value3 = D1.diceFunction(player3); // Value returned by the dice function//
                p3block = sl.snakeLadder(value3, player3,p3block); // To know the house no. of the player1//
                System.out.println(player3 +" you are in house no."+p3block);
                value4 = D1.diceFunction(player4); // Value returned by the dice function//
                p4block = sl.snakeLadder(value4, player4,p4block); // To know the house no. of the player1//
                System.out.println(player4 +" you are in house no."+p4block);
            }

            if (p1block >= 15) {
                System.out.println(player1+" wins");
            }

            else if(p2block >= 15){
                System.out.println(player2+" wins");
            }

            else if(p3block >= 15){
                System.out.println(player3+" wins");
            }
            else if(p4block >= 15){
                System.out.println(player4+ " wins");
            }
        }
    }

