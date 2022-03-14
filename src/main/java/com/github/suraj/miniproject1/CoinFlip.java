package com.github.suraj.miniproject1;
import java.util.*;

/**
 * @author 09-03-2022
 */

public class CoinFlip {

    public static void main(String[] args){

        System.out.println("Player 1 enter your choice as Head or Tail");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        CoinResult flip = new CoinResult();
        flip.coinResult(b);
    }
}


