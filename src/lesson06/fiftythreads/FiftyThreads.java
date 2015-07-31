package lesson06.fiftythreads;

/* Создать поток, который создаст 50 потоков, каждый их которых выведет на экран свой номер и дождется,
 пока его прервут. Прерывание дочерних потоков должно выполнятся из потока их порождающего.*/

import java.util.Scanner;

public class FiftyThreads {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Fifty Threads");
        for (int i = 0; i < 50; i++) {
                CountFiftyThreads countFiftyThreads = new CountFiftyThreads(threadGroup, "Number of thread: " + i);
                countFiftyThreads.start();
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        if (stop.equalsIgnoreCase("stop"))
            threadGroup.interrupt();
        System.out.println("Thread isInterrupt");
    }

    private static final class CountFiftyThreads extends Thread {

        public CountFiftyThreads(ThreadGroup threadGroup, String name) {
            super(threadGroup, name);
        }

        @Override
        public void run() {

            for (int i = 1; i < 40; i++) {
                System.out.println(getName() + ": " + i);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
