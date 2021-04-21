import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.*;

public class MyCollection {
    public static void main(String[] args) {
//        Collection col = new ArrayList();
//        col.add("aaa");
//        col.add(123);
//        col.add(new Date());
////        System.out.println(col.size());
//
//        Collection collection2 = new ArrayList();
//        collection2.addAll(col);
//        collection2.add("what");

//        for (Object obj : collection2) {
//            System.out.println(obj);
//        }
//        System.out.println(collection2);
//        col.clear();
//        System.out.println(col.isEmpty());
//        System.out.println(col.contains(123));
//        collection2.removeAll(Arrays.asList( 123, new Date()));
//        collection2.retainAll(col);
//        System.out.println(Arrays.toString(collection2.toArray()));;

//        List list = Arrays.asList(new String[]{"a", "b", "c"});
//        List  list2= Arrays.asList(new int[]{1,2,3,4,5,6});
//        System.out.println(list2);
//        System.out.println(collection2);
//        Iterator iterator = collection2.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            iterator.remove();
//        }
//        System.out.println(collection2);

        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");

        set.add(p1);
        set.add(p2);
        System.out.println(set);

        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);
        set.add(new Person(1001, "CC"));
        System.out.println(set);
        set.add(new Person(1001, "AA"));
        System.out.println(set);
    }
}

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
