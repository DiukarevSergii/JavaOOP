package Example.collection;

import lesson04.studentlist.MyClass;

import java.util.Objects;

public class TypeLiterals {

    public static <T> T getInstance(Class<T> theClass)
            throws IllegalAccessException, InstantiationException {

        return theClass.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println(getInstance(String.class));

        MyClass myClass = getInstance(MyClass.class);

    }

}
