
package nine1.reference.inner;




public class OuterExecutor {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass objekatStatickeKlase = new OuterClass.StaticNestedClass();
        OuterClass outerKlasaObjekat = new OuterClass();
        OuterClass.InnerClass innerClassObjekat = outerKlasaObjekat.new InnerClass();
    }
 
}
