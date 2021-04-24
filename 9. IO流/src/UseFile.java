import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class UseFile {
    public static void main(String[] args) throws IOException {
        File file1 = new File("hello.txt");
//        File file2 = new File("C:\\Users\\10615\\Desktop");
        File file4 = new File("C:\\Users\\10615\\Desktop\\myJava");

//        File file3 = new File(file2, "hello.js");
//        System.out.println(file1);
//        System.out.println(file2);
//        System.out.println(file3);

//        System.out.println(file1.getParent());
//        System.out.println(file1.getPath());
//        System.out.println(file1.getAbsolutePath());
//        System.out.println(file1.getName());
//        System.out.println(file1.length());
//        System.out.println(new Date(file1.lastModified()));

//        System.out.println(file1.renameTo(new File(file4.getAbsolutePath() + "\\what.txt")));
//        System.out.println(file1.getAbsoluteFile());
//        System.out.println("what" +  file2.getParent());

//        for (Object obj : file2.list()) {
//            System.out.println(obj);
//        }
//
//        System.out.println(file2.listFiles());

//        System.out.println(file1.isFile());
//        System.out.println(file4.isDirectory());
//        System.out.println(file1.exists());
//        if(file1.exists()) {
//            file1.delete();
//        } else {
//            file1.createNewFile();
//        }
        File file5 = new File("C:\\Users\\10615\\Desktop\\myJava\\what");
        if (file5.exists()) {
            System.out.println("delete");
//            file5.delete();
        } else {
            System.out.println("make");
            file5.mkdirs();
        }
    }

    @Test
    public void test () {
        File file1 = new File("hello.txt");
//        File file2 = new File("C:\\Users\\10615\\Desktop");
//        File file4 = new File("C:\\Users\\10615\\Desktop\\myJava");
//
//        File file3 = new File(file2, "hello.js");
//        System.out.println(file1);
//        System.out.println(file2);
//        System.out.println(file3);

//        System.out.println(file1.getParent());
//        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
    }

}

class FileTrain {
    private static File root;
    private static String dirname = "what";

    public static void main(String[] args) throws IOException {
        File dir = new File("what");
        if (!dir.exists()) dir.mkdirs();

        root = dir;
        System.out.println(dir);
        System.out.println(dir.getParent());
        ArrayList<File> arr = new ArrayList<>(20);
        for (int i = 1; i < 9; i++) {
            boolean isdir = i % 2 == 0;
            File file = new File(dirname + "\\file" + i + (!isdir ? ".txt" : ""));
            if (!file.exists()) {
                if (isdir) {
                    file.mkdirs();
                } else {
                    file.createNewFile();
                }
            }

            arr.add(i - 1, file);
        }

//        System.out.println(arr);
//        System.out.println(delete("file6.txt"));
//        System.out.println(delete("file5.txt"));
//        System.out.println(root.listFiles());
        for(File file :root.listFiles()) {
//            System.out.println(file.getName());
            if(file.getName().endsWith(".jpg")) {
                System.out.println("找到了" + file.getName());
            } else {
//                System.out.println("没找到");
            }
        }
    }

    public static boolean delete(String name) {
        File file = new File(root.getAbsolutePath() + "\\" + name);
        if (file.exists()) {
            file.delete();
            return true;
        }
        return false;
    }
}