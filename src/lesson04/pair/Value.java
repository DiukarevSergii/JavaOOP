package lesson04.pair;

import java.util.Arrays;

public class Value {

    private String[] text;

    public Value(String[] text) {
        this.text = text;
    }

    public String getElement(int n) {
        return text[n];
    }

    @Override
    public String toString() {
        return  Arrays.toString(text);
    }
}

