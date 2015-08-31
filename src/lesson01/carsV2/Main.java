package lesson01.carsV2;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car("BMW", 10_000);
        Car tesla = new Car("Tesla");
        Car lada = new Car("Lada");

        bmw.setIgnition(true);
        tesla.setIgnition(true);
        lada.setIgnition(false);

        bmw.setSpeed(60);
        tesla.setSpeed(60);
        lada.setSpeed(60);

        bmw.setTime(20);
        tesla.setTime(20);
        lada.setTime(20);

        System.out.println(bmw.getMileage());
        System.out.println(tesla.getMileage());
        System.out.println(lada.getMileage());



    }
}
