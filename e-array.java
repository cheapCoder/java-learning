class array4 {
  public static void main(String[] args) {
    // int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
    // int[] arr3 = { 1, 213, 123, 1231, 12, 233 };
    // System.out.println(arr.length);
    // NOTE:默认值
    // // int arr2[] = new int[5];
    // // float[] arr2 = new float[4];
    // // char[] arr2 = new char[4];
    // // boolean[] arr2 = new boolean[4];
    // String[] arr2 = new String[4];

    // NOTE:遍历
    // for (int i = 0; i < arr2.length; i++) {
    // System.out.println(arr2[i]);
    // }

    // NOTE: 二维数组
    // int[][] arr = new int[2][3][];
    // int[][] arr = new int[][]{{1,2,3,4}, {5,6,7,8,9}};
    // int[][] arr = { { 1, 2, 3, 4 }, { 213, 1234, 234, 5 }};

    // System.out.println(arr[1][1]);

    // int[] arr1 = { 1, 2, 3, 4 }; // Arrays工具类
    // int[] arr2 = { 1, 2, 3, 4 };
    // System.out.println(arr1 == arr2);
    // System.out.println(Arrays.equals(arr1, arr2));

    // System.out.println(Arrays.toString(arr1));

    String[] arr = new String[4];
    // arr = null;
    // System.out.println(arr[0]);
    arr[0] = null;
    System.out.println(arr[0].toString());
  }
}