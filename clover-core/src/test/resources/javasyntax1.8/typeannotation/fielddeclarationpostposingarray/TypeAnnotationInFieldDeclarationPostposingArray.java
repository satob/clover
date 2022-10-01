package typeannotation.fielddeclarationpostposingarray;

import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* Testcase for declaratorBrackets */
public class TypeAnnotationInFieldDeclarationPostposingArray {
    private int intArray @AnnotationForType1 [][] = new int[2][2];
    private char charArray @AnnotationForType1 @AnnotationForType2 [][] = new char[2][2];
    private short shortArray @AnnotationForType1 [] @AnnotationForType1 [] = new short[2][2];
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType1 {
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType2 {
}
