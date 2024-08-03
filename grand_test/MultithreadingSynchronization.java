/**
 * 8) Write a java program to achieve Synchronization in Multithreading?
 */
class Counter {
    int count = 0;
    synchronized void increment() {
        count++;
    }
    int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class MultithreadingSynchronization {
    public static void main(String[] args) throws InterruptedException {
        try{
            Counter counter = new Counter();
            MyThread threadOne = new MyThread(counter);
            MyThread threadTwo = new MyThread(counter);
            threadOne.start();
            threadTwo.start();
            threadOne.join();
            threadTwo.join();
            System.out.println("The Count is: " + counter.getCount());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
