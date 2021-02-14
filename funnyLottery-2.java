import java.util.Scanner;

class funnyLottery {
  public static void main(String[] args) {
    int count = (int) (Math.random() * 90 + 10);
    int radomGe = count % 10;
    int radomShi = count / 10;
    System.out.println(radomShi + "  " + radomGe);
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    scanner.close();
    int ge = input % 10;
    int shi = input / 10;
    System.out.println(shi + "  " + ge);
    if (input == count) {
      System.out.println("10000kuai");
    } else if (shi + ge * 10 == count) {
      System.out.println("3000dollar");
    } else if (radomGe == ge || radomShi == shi) {
      System.out.println("1000dollar");
    } else if (radomGe == shi || radomShi == ge) {
      System.out.println("500dollar");
    } else {
      System.out.println("invalid");
    }
  }
}