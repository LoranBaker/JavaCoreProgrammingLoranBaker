
package nine1.reference;

public class StringExecutor {
    public static void main(String[] args) {
        String name = new String ("Loran ");
        String name1 = new String ("Ridji");
        String name2 = "Ridji";
        System.out.println(name1.equals(name2));
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        
        String names = "Ferida Kanita Rijad Fadila ";
        String [] niz = names.split(" ");
        for(int i = 0; i<niz.length; i++){
            String vrijednost = niz[i];
            System.out.println(vrijednost + ", ");
        }
    }
}
