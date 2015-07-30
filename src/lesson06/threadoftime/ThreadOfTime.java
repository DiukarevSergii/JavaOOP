package lesson06.threadoftime;

/*Создать поток, который будет каждые 10 секунд выводить текущее время на экран. 
Сделать возможность прерывания потока с помощью команды с консоли.*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThreadOfTime {
    public static void main(String[] args) {
        try {
            Timer timer = new Timer();
            timer.start();
            Scanner scanner = new Scanner(System.in);
            String stop = scanner.nextLine();
            if (stop.equalsIgnoreCase("stop"))
                timer.interrupt();
            if (timer.isInterrupted())
                System.out.println("Thread finished");
        } catch (Exception e) {
            ;
        }
    }

    public static class Timer extends Thread {
        public void run() {
            while (!isInterrupted()) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date();
                System.out.println(sdf.format(date));
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}

