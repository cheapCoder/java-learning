import org.junit.platform.engine.support.hierarchical.ThrowableCollector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.ProxySelector;
import java.sql.SQLOutput;

public class DynamicProxy {
    public static void main(String[] args) {
        Man proxySuperman = (Man) Proxyfactory.getInstance(new Superman());
        proxySuperman.eat("snack");
        System.out.println(proxySuperman.getBelif());

        MyInterface proxyPerson = (MyInterface) Proxyfactory.getInstance(new Person());
        proxyPerson.info();
//        proxyPerson.display("basketball");

    }
}

interface Man {
    String getBelif();

    void eat(String food);
}

class Superman implements Man {

    @Override
    public String getBelif() {
        return "I believe china";
    }

    @Override
    public void eat(String food) {
        System.out.println("superman love " + food);
    }
}

class Proxyfactory {

//    Object factory;

//    public void bind(Object obj) {
//        this.factory = obj;
//    }

    public static Object getInstance(Object obj) {

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("进行前置操作");

                Object returnObj = method.invoke(obj, args);

                System.out.println("进行后置操作");

                return returnObj;
            }
        });
    }


}




