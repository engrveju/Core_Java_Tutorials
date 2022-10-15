package Tutorials.multiThread_Concurrency.synchronization;

public class MySync {
    int count = 0;
    public void increament(){
        count++;
    }


    public static void main(String[] args) throws InterruptedException {
        Runnable b = ()->
        {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread  t1 = new Thread(()->
        {
            for (int i = 1; i <= 5; i++) {
                //count++;
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread  t2 = new Thread(b);

        t1.start();
        try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
        //The above sleep is used to prevent the two threads from reaching the schedulers at same time;
        t2.start();

        t1.join();
        t2.join();//USED TO PAUSE THE THREAD IN THE MAIN METHOD UNTIL OUR THREAD IS DONE

        System.out.println("Bye");

    }
}
