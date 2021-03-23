import java.util.Scanner;

public class AccountRecord {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int choice;
    String record = "";
    int account = 1000;
    Label: while (true) {
      System.out.println("-----------------家庭收支记账软件-----------------\n");
      System.out.println("                   1 收支明细");
      System.out.println("                   2 登记收入");
      System.out.println("                   3 登记支出");
      System.out.println("                   4 退    出\n");
      System.out.print("                   请选择(1-4)：");

      choice = scanner.nextInt();

      switch (choice) {
        case 1: {
          System.out.println("-----------------当前收支明细记录-----------------\n收支    账户金额        收支金额        说    明");
          System.out.println(record);
          break;
        }
        case 2: {
          System.out.print("本次收入金额：");
          int income = scanner.nextInt();
          System.out.print("本次收入说明：");
          String des = scanner.next();
          record += "收入    " + (account + income) + "           " + income + "             " + des + "\n";
          break;
        }
        case 3: {
          System.out.print("本次支出金额：");
          int outcome = scanner.nextInt();
          System.out.println("本次支出说明：");
          String des = scanner.next();
          record += "支出    " + (account - outcome) + "           " + outcome + "             " + des + "\n";
          break;
        }
        case 4: {
          scanner.close();
          break Label;
        }
        default:
          System.out.print("选择错误，请重新输入：");
      }
    }
  }
}