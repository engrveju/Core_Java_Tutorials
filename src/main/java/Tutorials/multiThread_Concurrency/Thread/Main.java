package Tutorials.multiThread_Concurrency.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      A t1 = new A();
      B t2 = new B();
     // t2.start();
      t1.start();
        try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
        //The above sleep is used to prevent the two threads from reaching the schedulers at same time;
      t2.start();
    }
}