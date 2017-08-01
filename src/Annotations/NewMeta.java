package Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Vlad on 7/31/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MySecondAnnotation{
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyThrirdAnnotation{
    String str() default "test";
    int val() default 300;
}

@MySecondAnnotation(str = "Class annotation", val = 100)
public class NewMeta {
    @MyThrirdAnnotation(str = "Method annotation") //(str = "Method annotation", val = 200)
    public static void mySecondMeth() {
        NewMeta ob = new NewMeta();
        try{
        Annotation anno[] = ob.getClass().getAnnotations();
        for (Annotation a : anno) {
            System.out.println(a);
        }

            anno = ob.getClass().getMethod("mySecondMeth").getAnnotations();
            for (Annotation a : anno) {
                System.out.println(a);
            }

        } catch (NoSuchMethodException e) {
            System.out.print("No such method");
        }
    }
}
