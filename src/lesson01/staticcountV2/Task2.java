package lesson01.staticcountV2;

public class Task2 {


    public static void main(String[] args) {

        for (int i = 0; i < 102; i++)
            new Counter();
        System.out.println(Counter.count);
    }

    public static class Counter {

        private static int count = 0;

        Counter() {
            count++;
        }
    }
}
