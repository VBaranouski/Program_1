package Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by Vlad on 7/31/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{
    String str() default "Cool";

}

@Retention(RetentionPolicy.RUNTIME)
@interface MySecondMarker{
    String str() default "Not Cool";

}
@MySecondMarker
public class Marker {
    @MyMarker
    public static void showAnno(){
        Marker ob = new Marker();
        try{
            //MySecondMarker annotationSecond = ob.getClass().getAnnotation(MySecondMarker.class);
            //System.out.println(annotationSecond.str());
            Method m = ob.getClass().getMethod("showAnno");
            //MyMarker annotation = m.getAnnotation(MyMarker.class);
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.print("Yeep" + " ;  " + m.getAnnotation(MyMarker.class));
            }
        } catch (NoSuchMethodException e) {
           System.out.print("no such method");
        }
    }


}
