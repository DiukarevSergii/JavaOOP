package Example;

import util.Constants;

import java.io.*;

public class SerializableRectangular {
    private static final String oldFilePath = Constants.FILE_PATH_LESSON05_FINDFILES;

    public static class Rectangular implements Serializable {

        private static final long serialVersionUID = 1L; // версия (InvalidClassException)

        public /* transient */ int height;
        public int width;

        public Rectangular(int height, int width) {
            this.height = height;
            this.width = width;
        }
    }

    public static void main(String[] args) {
        try {
            SerializableRectangular.Rectangular r = new SerializableRectangular.Rectangular(11, 22);
// запись
            FileOutputStream fos = new FileOutputStream(oldFilePath + "/temp.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            try {
                oos.writeObject(r);
            } finally {
                oos.close();
            }
// чтение
            Rectangular r1;
            FileInputStream fis = new FileInputStream(oldFilePath + "/temp.out");
            ObjectInputStream oin = new ObjectInputStream(fis);
            try {
                r1 = (Rectangular) oin.readObject();
                System.out.println("Height = " + r1.height);
                System.out.println("Width = " + r1.width);
            } finally {
                oin.close();
            }
        } catch (IOException | ClassNotFoundException ex) {
        }
    }
}

