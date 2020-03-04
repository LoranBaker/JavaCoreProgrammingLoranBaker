
package nine1.collection;

import java.util.ArrayList;

public class DataContainerUser {
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList();
        IntegerContainer dataContainer = new IntegerContainer();
        for(int numbers : dataContainer){
            System.out.println(numbers);
        }
    }
}
