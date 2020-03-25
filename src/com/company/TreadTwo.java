package com.company;

public class TreadTwo implements Runnable {
    @Override
    public void run() {
        print(10,"I am two");
    }
    static void print(int number, String text){
        for (int i = 0; i < number; i++) {
            System.out.println(text);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
