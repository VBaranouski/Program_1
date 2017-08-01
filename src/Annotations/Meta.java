package Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static java.lang.System.out;

/**
 * Created by Vlad on 7/31/17.
 */


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    int value();

}
public class Meta {
    @MyAnno(100)
    public static void mydMeth() {
        Meta ob = new Meta();
        try {
            //Class<?> c = ob.getClass();
            //Method m = ob.getClass().getMethod("myMeth");
            MyAnno anno = ob.getClass().getMethod("myMeth").getAnnotation(MyAnno.class);
            out.println(anno.value());
        }
catch (NoSuchMethodException e) {
          out.println(e + "no such method");
        }

    }
}