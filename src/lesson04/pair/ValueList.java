package lesson04.pair;

public class ValueList {
    private Value[] list = new Value[10];
    private int p = 0;
    private String str;

    public void add(Value v) {
        list[p++] = v;
    }

    public Value get(int n) {
        return list[n];
    }

    public void setNull (Value s) throws NullException{
        if (s.getElement(0).equals(" ")||s.getElement(1).equals(" "))
            throw new NullException("wrong point");
    }
}
