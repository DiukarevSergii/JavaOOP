package Threads;

//: concurrency/SimpleDaemons.java
// Потоки-демоны не препятствуют завершению работы программы.

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {
    public void run() {
        try {
            while(true) {
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch(InterruptedException e) {
            System.out.println("sleep() interrupted");
        }
    }
    public static void main(String[] args) throws Exception {
        for(int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true); // Необходимо вызвать перед start()
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(5000);
    }
}