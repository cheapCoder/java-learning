import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class UseLambda {

    @Test
    public void test1() {
//        Consumer<String> con = s -> System.out.println("string " + s);
        Consumer<String> con = System.out::println;
        con.accept("what");
    }

    @Test
    public void test2() {
        Date date = new Date();
//        Supplier<Long> sup = () -> new Date().getTime();
        Supplier<Long> sup = date::getTime;
        System.out.println(sup.get());
    }

    @Test
    public void test3() {
//        Comparator<String> com = (s1, s2) -> s1.compareTo(s2);
        Comparator<String> com = String::compareTo;

        System.out.println(com.compare("abc", "cba"));
    }

    @Test
    public void test4() {
//        BiPredicate<String, String> bip = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> bip = String::equals;
        System.out.println(bip.test("abc", "abc"));
    }

    @Test
    public void test5() {
//        Supplier<List> list = () -> new ArrayList<>();
        Supplier<List> list = ArrayList::new;
        System.out.println(list.get());
    }



}
