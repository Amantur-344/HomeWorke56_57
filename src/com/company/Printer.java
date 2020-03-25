package com.company;

public class Printer implements Runnable {
    private String txt;
    private int number1;
    @Override
    public void run() {
        print(number1,txt);
    }
    static void print(int number, String text){
        for (int i = 0; i < number; i++) {
            System.out.println(text);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Printer(String txt, int number1) {
        this.txt = txt;
        this.number1 = number1;
    }
}
