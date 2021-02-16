// import java.util.Scanner;
// class ScannerTest {
//   public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//     System.out.print("请输入年龄：");
//     int i = scanner.nextInt();

//     System.out.println(i);
//     System.out.println("请输入体重:" + scanner.nextDouble());
//   }
// }

import java.util.Scanner;

class ScannerTest {
  public static void main(String[] args) {
    System.out.println(100.1234 <= 100);
    Scanner scanner = new Scanner(System.in);

    System.out.print("请输入你的成绩：");
    float grade = scanner.nextFloat();
    if (grade == 100) {
      System.out.println("BMW");
    } else if (grade > 80) {
      System.out.println("iphone xs max");
    } else if (grade >= 60) {
      System.out.println("ipad");
    } else {
      System.out.println("nothing");
    }
  }
}
