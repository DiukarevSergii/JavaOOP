package lesson09;

import java.util.Objects;

/**
 * Created by 1 on 12.08.2015.
 */
public class HumanSiraliz {

    public static class Human implements Cloneable {
        private int a, b;

        public Human(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public Human clone() throws CloneNotSupportedException {
            return (Human) super.clone();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Human human = new Human(1, 4);
        Human brother = human.clone();
        brother.setA(44);

        System.out.println(human);
        System.out.println(brother);
    }
}
