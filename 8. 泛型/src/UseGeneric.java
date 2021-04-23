import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseGeneric {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(new Integer(12));
//
////        arrayList.add("tom");
//
//        for (Integer integer : arrayList
//        ) {
//            System.out.println(integer);
//        }

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("heng", 4);
        hashMap.put("li", 2);
        Set<Map.Entry<String, Integer>> entry =  hashMap.entrySet();
    }
}
