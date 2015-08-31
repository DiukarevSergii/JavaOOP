package lesson01.circleV2;

public class CircleV2 {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5000);
        Circle circle2 = new Circle(15);

        System.out.println(circle1.getS());
        System.out.println(circle2.getS());

        Circle circle3 = Circle.combine(circle1,circle2);
        System.out.println("Circle 3 = " + circle3.getRadius());
    }

    public static class Circle {

        private int radius;

        public Circle (int radius){
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getS(){
            return (int) Math.PI * (radius * radius);
        }

        private static Circle combine (Circle circle1, Circle circle2){
            return new Circle(circle1.radius + circle2.radius);
        }
    }

}
