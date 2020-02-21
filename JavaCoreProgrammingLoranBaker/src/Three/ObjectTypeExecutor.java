package Three;

public class ObjectTypeExecutor {
    public static void main(String[] args) {
        String name = new String("Ridji");
        String name1 = "Ridji";//String literal
        //operator == korisitimo samo kod prostih tipova
        //== poredi reference
        if(name == name1){
            System.out.println("Jednake varijable");
        }else{
            System.out.println("Nisu jednake varijable");
        }
        //equal koristimo kod slozenih tipova
        //poredi vrijednosti
        if(name.equals(name1)){
            System.out.println("Jednake varijable");
        }else{
            System.out.println("Nisu jednake varijable");
        }
    }
    
}
