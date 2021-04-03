package view;

import java.util.Locale;
import java.util.Scanner;

public class MyUtility {
    public static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection() {
        return '1';
    }

    ;

    //    public static void readReturn {
//
//    }
    public static int readId() {
        int Id = MyUtility.scanner.nextInt();
        return 1;
    }

    ;

    public static boolean readConfimSelection() {
        String input = MyUtility.scanner.nextLine();
        return input.toUpperCase().equals("Y");
    }

    ;

    public static void main(String[] args) {
        System.out.println(MyUtility.readConfimSelection());
    }
}
