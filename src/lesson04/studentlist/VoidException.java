package lesson04.studentlist;

public class VoidException extends Exception {
    public VoidException(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return "VoidException: " + super.getMessage();
    }

}
