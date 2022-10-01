package typeannotation.typeparameter;

import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* Testcase for typeParameter */
public class TypeAnnotationTypeParameter<@AnnotationForType1 T> {
    public void bar(String obj) {
    }
}

class TypeAnnotationTypeParameter2<@AnnotationForType1 @AnnotationForType2 T> {
    public void bar(String obj) {
    }
}

class TypeAnnotationTypeParameter3<@AnnotationForType1 T extends @AnnotationForType1 String> {
    public void bar(String obj) {
    }
}

class TypeAnnotationTypeParameter4<@AnnotationForType1 T extends @AnnotationForType1 String & @AnnotationForType1 CharSequence> {
    public void bar(String obj) {
    }
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType1 {
}


@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType2 {
}
