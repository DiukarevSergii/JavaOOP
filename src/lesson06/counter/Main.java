package lesson06.counter;

public class Main {
    public static void main(String[] args) {
        try {
            Counter c = new Counter();
            c.start(); // запускаем поток
            c.join(); // ждем завершения потока
            System.out.println("Thread finished");
        } catch (Exception e) {
            ;
        }
    }

    public static class Counter extends Thread {
        public void run() {
            int x = 1;
            while (x < 1000) {
                if (x > 9 && x < 30)
                    System.out.println(x);
                x++;
            }
        }
    }
}