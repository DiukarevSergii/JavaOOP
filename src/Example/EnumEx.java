package Example;

public class EnumEx {


    public enum Level {
        HIGH  (3),  //calls constructor with value 3
        MEDIUM(2),  //calls constructor with value 2
        LOW   (1)   //calls constructor with value 1
        ; // semicolon needed when fields / methods follow

        private final int levelCode;

        private Level(int levelCode) {
            this.levelCode = levelCode;
        }

        public int getLevelCode() {
            return this.levelCode;
        }
    }

    public static void main(String[] args) {
        int a = 0;
        Level level = Level.MEDIUM;  //assign some Level constant to it

        if (level == Level.HIGH) {
            a += 1;
        } else if (level == Level.MEDIUM) {
            a += 90;
        } else if (level == Level.LOW) {
            a = 9;
        }
        System.out.println(a);

        level = Level.HIGH;

        switch (level) {
            case HIGH:
                System.out.println("level high");
                break;
            case MEDIUM:
                System.out.println("level medium");
                break;
            case LOW:
                System.out.println("level low");
                break;
        }

        System.out.println();

        for (Level level1 : Level.values()) {
            System.out.println(level1);
        }

        System.out.println("\n"+level.getLevelCode());

    }
}
