package typeannotation.fielddeclarationarray;

import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* Testcase for arraySpecOpt */
public class TypeAnnotationInFieldDeclarationArray {
    private int @AnnotationForType1 [] intArray = new int[2];
    private String [] @AnnotationForType1 [] stringArray = new String[2][2];
    private long @AnnotationForType1 [] @AnnotationForType2 [] longArray = new long[2][2];
    private double @AnnotationForType1 @AnnotationForType2 [] [] doubleArray = new double[2][2];

    public void getSize() {
        System.out.println(intArray.length);
        System.out.println(stringArray.length);
        System.out.println(longArray.length);
        System.out.println(doubleArray.length);
    }}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType1 {
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType2 {
}
