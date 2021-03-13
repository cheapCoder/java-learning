// 重载
class Overload {
  public static void main(String[] args) {
    // Overload overload = new Overload();
    // overload.mOL("what");
    // overload.mOL(1234);
    // overload.mOL(2, 2134);
    // overload.variableArgus(1, 2, 3, 4, 5, 6);

    System.out.println(new char[] { 'a', 'b', 'c', 'd' });
  }

  void mOL(int a) {
    System.out.println(a * a);
  }

  void mOL(int a, int b) {
    System.out.println(a * b);
  }

  void mOL(String s) {
    System.out.println(s);
  }

  // 可变个数形参
  void variableArgus(int... args) {
    System.out.println(args[2]);
  }
}