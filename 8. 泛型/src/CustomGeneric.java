import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Date;

public class CustomGeneric<E> {
    public static void main(String[] args) {
//        Order<String> order = new Order<String>();
//        order.setOrderT("liheng");
//
//        System.out.println(Order.print("liheng"));
//
//        SubOrder<Date> subOrder = new SubOrder();
//        subOrder.setSuborder();

//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        ArrayList<?> list3 = new ArrayList<>(1);
//////        list1 = list2;
////        list3 = list1;
////        list3 = list2;
//        list3.add(null);
//        System.out.println(list3.get(0));


    }
}

class Order<T> {
    String name;
    int age;

    T orderT;

    public Order() {
//        T[] arr = (T[]) new Object[10];

    }

    public Order(String name, int age, T orderT) {
        this.name = name;
        this.age = age;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return this.orderT;
    }
    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    public static  <E> E[] print(E e) {
        System.out.println(e);
        return (E[])new Object[]{e};
    }
}


class SubOrder<T> extends Order<T> {
    T suborder;

    public void setSuborder(T suborder) {
        this.suborder = suborder;
    }

}

//class MyException<T> extends Exception {}