import java.lang.annotation.Documented;

@Documented
@interface CustomAnnotation {
    String value();
}
@CustomAnnotation("adasd")
 class DocumentedAnnotationTest{
    public static void main(String[] args) {
        System.out.println("Documented Annotation Test");
    }
}