package Lesson01_01_StaticCount;

public class Main {
    public static void main(String[] args) {
        System.out.println(StaticCount.count);

        int n = 10;
        while (n-- > 0)
            new StaticCount();

        System.out.println(StaticCount.count);

    }
}
