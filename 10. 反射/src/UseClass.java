import org.junit.jupiter.api.Test;

import java.lang.reflect.*;
import java.util.Calendar;

public class UseClass {
    @Test
    public void getClassInstance() throws ClassNotFoundException {
//        1
        Class<Person> c1 = Person.class;
//        2
        Class<Person> c2 = (Class<Person>) new Person().getClass();
        System.out.println(c2);
//        3
        Class<Person> c3 = (Class<Person>) Class.forName("Person");
        System.out.println(c3);
//        4
        ClassLoader classLoader = UseClass.class.getClassLoader();
        Class<Person> c4 = (Class<Person>) classLoader.loadClass("Person");
        System.out.println(c4);
        System.out.println(Class.class);
    }

    @Test
    public void newInstance() throws Exception {
        Class<Person> c = Person.class;
        Person person = c.getDeclaredConstructor().newInstance();
        System.out.println(person);
    }

    @Test
    public void getPersonInstructure() throws NoSuchMethodException {
        Class clazz = Person.class;
//        Field[] fields = clazz.getFields();
//
////        for (Field field : fields) {
////            System.out.println(field.getModifiers());
////        }
//
//        System.out.println();
//
//        for (Field field : clazz.getDeclaredFields()) {
//            System.out.println("field = " + field);
//            System.out.println(field.getName());
//            System.out.println(Modifier.toString(field.getModifiers()));
//            System.out.println(field.getType().getName());
//            System.out.println("------------");
//        }

//        Method[] methods = clazz.getMethods();
//        methods = clazz.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println("------------");
////            System.out.println(method.getReturnType());
//            System.out.println(method.getName());
////            System.out.println(method.getAnnotations());
////            for(Annotation annotation:method.getAnnotations()) {
////                System.out.println(annotation);
////            }
////                        System.out.println(Modifier.toString(method.getModifiers()));
//
////            Class[] types = method.getParameterTypes();
////            if (types !=null && types.length != 0) {
////                for (Class type: types) {
////                    System.out.println(type);
////                }
////            }
//            for (Class type : method.getExceptionTypes()) {
//                System.out.println(type);
//            }

//        System.out.println(clazz.getGenericSuperclass());
        System.out.println(clazz.getAnnotations()[0]);
    }

    @Test
    public void invokeInstructure() throws Exception {
        Class<Person> clazz = Person.class;
        Person p = clazz.getDeclaredConstructor().newInstance();

//        Field id = clazz.getDeclaredField("name");
//        id.setAccessible(true);
//        id.set(p, "liheng");
//        System.out.println(id.get(p));

//        Method show = clazz.getDeclaredMethod("show", String.class);
//        show.setAccessible(true);
//        String s = (String) show.invoke(p, "china");
//        System.out.println(s);

//        Method staticMethod  = clazz.getDeclaredMethod("staticMethod");
//        staticMethod.setAccessible(true);
//        staticMethod.invoke(clazz);
        Constructor<Person> constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Person person = constructor.newInstance("liheng");
        System.out.println(person);
    }
}
