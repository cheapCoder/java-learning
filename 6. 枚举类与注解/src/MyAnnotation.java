import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.LOCAL_VARIABLE})
public @interface MyAnnotation {
    String value() default "value";
//    String name();
}
