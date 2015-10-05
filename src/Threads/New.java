package Threads;

public class New {

    static class Clock implements Runnable {
        private volatile  boolean isCancel = false;

        public void cancel() {
            this.isCancel = true;
        }

        public void run() {
            int counter = 1;
            while (!this.isCancel) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik " + counter++);
            }
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clock.cancel();
    }
}
