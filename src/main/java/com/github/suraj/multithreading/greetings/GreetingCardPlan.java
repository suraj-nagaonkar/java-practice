package com.github.suraj.multithreading.greetings;

/**
 * @author 27-02-2022
 */

public class GreetingCardPlan implements Runnable {
    private int cardsToCreate;

    public int getCardsToCreate() {
        return cardsToCreate;
    }

    public void setCardsToCreate(int cardsToCreate) {
        this.cardsToCreate = cardsToCreate;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();

        System.out.println(current.getName() + " has started");
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(current.getName() + " has completed");
        subtractCardCout();
    }

    private void subtractCardCout() {
        int current = cardsToCreate;
        int updated = current - 1;
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        cardsToCreate = updated;
    }
}
