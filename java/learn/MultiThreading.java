package learn;

class Thread1 extends Thread {


    public Thread1(String name) {
        super(name);
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("inside thread1" + Thread.currentThread() + " " + i);
        }
    }

}

class Thread2 implements Runnable{
     
    public void run() {
        
        for(int i = 0; i<5; i++) {

            System.out.println(Thread.currentThread() + "," + i);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {

        System.out.println("main is starting");

        Thread thread1 = new Thread1("Thread1");
        thread1.start();

        Thread thread2 = new Thread(new Thread2(), "thread2");
        thread2.start();

        System.out.println("main is exiting");
    }
}
