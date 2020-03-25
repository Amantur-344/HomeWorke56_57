package com.company;

public class AnotherThread implements Runnable {
    @Override
    public void run() {
        print(5,"I am  AnotherThread");
    }
    static void print(int number, String text){
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }
}
