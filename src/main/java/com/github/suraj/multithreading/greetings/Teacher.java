package com.github.suraj.multithreading.greetings;

/**
 * @author 27-02-2022
 */

public class Teacher {
    public static void main(String[] args) throws InterruptedException {
        GreetingCardPlan plan = new GreetingCardPlan();
        plan.setCardsToCreate(10);

        for (int i = 1; i <= 10; i++) {
            Thread children = new Thread(plan);
            children.setName("child-" + i);
            children.start();
        }
        Thread.sleep(1000);
        System.out.println("Remaining cards " + plan.getCardsToCreate());
    }
}

