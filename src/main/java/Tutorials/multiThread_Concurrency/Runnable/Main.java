package Tutorials.multiThread_Concurrency.Runnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      Runnable  a = new A();
      Runnable b = new B();
     // t2.start();
      Thread  t1 = new Thread(a);
      Thread  t2 = new Thread(b);

      t1.start();
        try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
        //The above sleep is used to prevent the two threads from reaching the schedulers at same time;
      t2.start();
    }
}