import java.io.UnsupportedEncodingException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Date;

public class TestString {
    public static void main(String[] args) throws UnsupportedEncodingException {

//        String s1 = "what";
//        String s2 = "whatwhat";
//        System.out.println((s1 + "what").intern() == s2);
//        System.out.println("abcdefg" == "abcdefg");
//        System.out.println(String.valueOf(123) + 1);
//        System.out.println("123".toString() + 1);

//        String s = "abc中国";
//        System.out.println(Arrays.toString(s.getBytes("gbk")));
//        System.out.println(new String(s.getBytes("gbk"), "GBK"));
//        System.out.println(new StringBuffer("abc").append(1).append("2").append('3').delete(3,4));
//        System.out.println(System.currentTimeMillis());
//        System.out.println(new Date(2234123412341L));
//        System.out.println(new java.sql.Date(123412341234L));
//        System.out.println(new String(new StringBuffer("123123")));
//        System.out.println(TestString.trim("   what the fuck    "));
//        System.out.println(TestString.partReverse("lihengIsGood", 1,6));
//        System.out.println("what".indexOf("ha"));
//        System.out.println(TestString.getMaxSameString("abcwerthelloyuiodefabcdef", "cvhellobnm"));

        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(new StringBuffer(null));

    }
    public static String getMaxSameString(String str1, String str2) {   // 假设只存在一个相同子串
        if(str1 == null || str2 == null) {
            return null;
        }

        String maxStr = str1.length() >= str2.length() ? str1: str2;
        String minStr = str1.length() < str2.length() ? str1: str2;

        for (int i = 0 ; i< minStr.length(); i++) {
            for (int left = 0, right = minStr.length() - i; right <=minStr.length(); left++, right++) {
                String s = minStr.substring(left, right);
                System.out.println(s);
                if(maxStr.contains(s)){
                    return s;
                }
            }
        }
        return null;
    }

    private static String partReverse (String s, int start, int end) {
        if(s == null) {
            return null;
        }
        char[] arr = s.toCharArray();
        while (start < end) {
            char tem = arr[start];
            arr[start] = arr[end];
            arr[end] = tem;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
//        return Arrays.toString(arr);
        return new String(arr);
    }

    private static String trim(String s) {
        int left = 0, right = s.length() - 1;

        while (s.charAt(left) == ' ') {
            left++;
        }
        while (s.charAt(right) == ' ') {
            right--;
        }
        return s.substring(left, right + 1);
    }
}

