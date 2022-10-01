package typeannotation.newoperator;

import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.HashMap;

/* Testcase for type */
public class TypeAnnotationInNewOperator {
    private final HashMap<String, String> map1 = new @AnnotationForType1 HashMap<>();
    private final int primitive1[] = new @AnnotationForType1 int[2];
    private final HashMap<String, String> map2 = new @AnnotationForType1 @AnnotationForType2 HashMap<>();
    private final int primitive2[] = new @AnnotationForType1 @AnnotationForType2 int[2];
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType1 {
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType2 {
}
