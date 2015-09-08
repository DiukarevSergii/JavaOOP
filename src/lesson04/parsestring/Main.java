package lesson04.parsestring;

public class Main {

    public static void main(String[] args) {

        String value = "para";
        String value1 = "para1111=value1&param299=value2&param3=value4";
        String value2 = "para1=value1&param2=value22&param3=";

        Value v = new Value();
        try {
            v.parseValue(value);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("hi");
        }
        try {

            System.out.println("--------");
            v.parseValue(value1);
            System.out.println("--------");
            v.parseValue(value2);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}