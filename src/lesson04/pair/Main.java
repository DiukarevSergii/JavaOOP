package lesson04.pair;

public class Main {
    public static void main(String[] args) {
        ValueList v1 = new ValueList();

        String fullText = "para1=value1&param2= &param3=value3";
        String[] text = fullText.split("&");

        for (int i = 0; i < text.length; i++) {
            v1.add(new Value(text[i].split("=")));
        }
        try {
            v1.setNull(v1.get(1));

        } catch (NullException e){
            System.out.println(e.getMessage());
        }

        System.out.println(v1.get(1));
        System.out.println(v1.get(1).getElement(1));
    }
}