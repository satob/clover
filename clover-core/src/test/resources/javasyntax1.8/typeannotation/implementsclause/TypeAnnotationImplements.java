package typeannotation.implementsclause;

import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* Testcase for classOrInterfaceType */
public class TypeAnnotationImplements implements Outer.Middle<String>, @AnnotationForType1 @AnnotationForType2 Outer<String> {

}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType1 {
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType2 {
}

interface Outer<T> {
    public interface Middle<T> {
        public interface Inner<T> {
            public void foo(@Outer.AnnotationInOuter String obj);
        }
    }

    @Retention(RUNTIME) @Target({ElementType.TYPE_USE})
    @interface AnnotationInOuter {}
}

