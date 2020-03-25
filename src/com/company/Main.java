package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      //  MyRhreed myRhreed = new MyRhreed();
       // myRhreed.start();
      //  System.out.println("I am main");

        Thread thread = new Thread(new AnotherThread());
       // thread.start();
     //   System.out.println("I am main 2");


        Thread thread2 = new Thread(new TreadOne());
        Thread thread3 = new Thread(new TreadTwo());
       // thread2.start();
       // thread3.start();


        Thread thread4 = new Thread(new Printer("bla-bla",5));
        thread4.start();
        Thread thread5 = new Thread(new Printer("Hello",2));
        thread5.start();
        Thread thread6 = new Thread(new Printer("world",3));
        thread6.start();
    }
}
