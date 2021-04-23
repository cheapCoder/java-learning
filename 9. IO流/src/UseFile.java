import com.sun.java.accessibility.util.GUIInitializedListener;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Date;

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
        if(file5.exists()) {
            System.out.println("delete");
//            file5.delete();
        } else {
            System.out.println("make");
            file5.mkdirs();
        }

    }

}
