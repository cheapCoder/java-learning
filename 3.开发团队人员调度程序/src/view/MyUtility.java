package view;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MyUtility {
    public static Scanner scanner = new Scanner(System.in);

    public static int readMenuSelection() {
        int input = 0;
        while (true) {
//            try {
            input = scanner.nextInt();
//            } catch (Exception e) {
//                System.out.print("输入错误...... 请输入1-5：");
//            }
            if (input != 1 && input != 2 && input != 3 && input != 4 && input != 5) {
                System.out.print("输入错误! 请输入1-5：");
            } else {
                return input;
            }
        }
//        System.out.println(input);
    }


    //    public static void readReturn {
//
//    }
    public static int readId() {
//        int Id = MyUtility.scanner.nextInt();
        return MyUtility.scanner.nextInt();
    }


    public static boolean readConfimSelection() {
        String input = MyUtility.scanner.next();
        return input.toUpperCase().equals("Y");
    }

//    public static Object getValue(Object value) {
//        return value == null ? value : "";
//    }
}
