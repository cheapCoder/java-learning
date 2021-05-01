import org.junit.jupiter.api.Test;

import java.io.*;
import java.text.BreakIterator;
import java.util.Date;
import java.util.Locale;

public class OtherStream {
    public static void main(String[] args) {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            while (true) {
                String s = bufferedReader.readLine();
                if ("e".equals(s) || "exit".equals(s)) {
                    break;
                }
                System.out.println(s.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //对象流
    @Test
    public void testObjectOutputStream() {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.dat"));

            objectOutputStream.writeObject(new CustomClass("李衡", 22));
//            objectOutputStream.writeObject(new CustomClass("李衡", 22, new SubCutomClass()));
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testObjectInputStream() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("object.dat"));

            System.out.println(objectInputStream.readObject());
//            System.out.println(objectInputStream.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class CustomClass implements Serializable {
    String name;
    int age;
//    SubCutomClass subCutomClass;
    private static final long serialVersionUID = 51236734564667710L;

    public CustomClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public CustomClass(String name, int age, SubCutomClass subCutomClass) {
//        this.name = name;
//        this.age = age;
//        this.subCutomClass = subCutomClass;
//    }

    @Override
    public String toString() {
        return "CustomClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
//                ", subCutomClass=" + subCutomClass +
                '}';
    }
}

class SubCutomClass implements Serializable {
    private static final long serialVersionUID = 6849724470546467710L;

    @Override
    public String toString() {
        return "SubCutomClass{}";
    }
}