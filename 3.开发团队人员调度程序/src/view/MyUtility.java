package view;

import java.util.Locale;
import java.util.Scanner;

public class MyUtility {
    public static Scanner scanner = new Scanner(System.in);

    public static int readMenuSelection() {
        int input;
        input = scanner.nextInt();
        while (input != 1 && input != 2 && input != 3 && input != 4) {
            System.out.print("输入错误! 请输入1-4：");
            input = scanner.nextInt();
        }

        return input;
    }


    //    public static void readReturn {
//
//    }
    public static int readId() {
        int Id = MyUtility.scanner.nextInt();
        return 1;
    }


    public static boolean readConfimSelection() {
        String input = MyUtility.scanner.nextLine();
        return input.toUpperCase().equals("Y");
    }

//    public static Object getValue(Object value) {
//        return value == null ? value : "";
//    }
}
