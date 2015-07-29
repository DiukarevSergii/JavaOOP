package lesson06.threadgroup;

/*Создать 100 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут.*/

import java.util.Scanner;

public class HundredThreads {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");
        for (int i = 1; i < 5; i++) {
            try {
                CounterThread counterThread = new CounterThread(threadGroup, "MyThreadCounter " + i);
                counterThread.start();
                counterThread.join();
                counterThread.interrupt();
                if (counterThread.isInterrupted())
                    System.out.println("Thread finished");
            } catch (InterruptedException e) {
                return;
            }
        }
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        if (stop.equalsIgnoreCase("stop"))
            threadGroup.interrupt();
    }

    private static final class CounterThread extends Thread {

        public CounterThread(ThreadGroup threadGroup, String name) {
            super(threadGroup, name);
        }

        @Override
        public void run() {
            for (int i = 1; i < 6; i++)
                System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
