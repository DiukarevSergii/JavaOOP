package lesson04.pair;

public class NullException extends Exception {

    public NullException(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return "NullException: " + super.getMessage();
    }

}
