package lesson04.parsestring;

public class MyException extends Exception {

    public MyException(String message) {
         super(message);
         }

    @Override
    public String getMessage() {
        return "Exception of key or value. Please, string need a check.";
    }
}
