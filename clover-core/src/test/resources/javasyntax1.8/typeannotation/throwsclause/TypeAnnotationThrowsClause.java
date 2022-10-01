package typeannotation.throwsclause;

import static java.lang.annotation.RetentionPolicy.*;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.text.ParseException;

/* Testcase for throwsClause */
public class TypeAnnotationThrowsClause {
    public void foo() throws @AnnotationForType1 IOException, @AnnotationForType1 @AnnotationForType2 ParseException {
        try {
            throw new IOException();
        } finally {
        }
    }
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType1 {
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType2 {
}
