import domain.Employee;
import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UseStreamAPI {
    public static void main(String[] args) {

    }

    @Test
    public void test1() {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");
//        System.out.println(list.stream().map(String::toUpperCase).allMatch(s -> s.startsWith("a")));
//        System.out.println(list.stream().map(String::toUpperCase).anyMatch(s -> s.startsWith("A")));
//        list.stream().map(String::toUpperCase).forEach(System.out::println);
////        System.out.println(list.stream().map(String::toUpperCase).count());
//        String string = list.stream().reduce("what", (s, sum) -> sum + s);




    }
}
