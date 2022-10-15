package Tutorials.multiThread_Concurrency.Thread;

     class A extends Thread{
         public void run(){
            for (int i = 1; i <= 5; i++) {
                //count++;
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    class B extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }}

