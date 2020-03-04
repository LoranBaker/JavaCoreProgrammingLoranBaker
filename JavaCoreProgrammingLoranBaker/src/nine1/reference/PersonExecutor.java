
package nine1.reference;

public class PersonExecutor {
    public static void main(String[] args) {
        int y1 = 23;
        int y2 = 34;
        System.out.println("Prije poziva funkciji x1 = " + y1 + " a u funkciji x2 = " + y2);
        swap(y1, y2);
        System.out.println("Poslije poziva funkciji x1 = " + y1 + " a u funkciji x2 = " + y2);
        Person p = new Person();
        int i = 5;
        p.setName("Faruk");
        System.out.println(p.getName() + " , " + i);
        setPersonName(i, p);
        System.out.println(p.getName() + " , " + i);
        
        int[] numbers = new int[2];
        numbers[0] = 33;
        int j = 5;
        System.out.println(numbers[0] + " , " + j);
        receiveArray(numbers, j);
        System.out.println(numbers[0] + " , " + j);
        
        Person p1 = new Person();
        p1.setName("Maca");
    System.out.println(p1.getName());
        getAnotherPerson(p1);
        System.out.println(p1.getName());
        
    }
    
    static void getAnotherPerson(Person p){
        p = new Person();
        p.setName("Ridji");
    }
    
    static void receiveArray(int [] brojevi, int j ){
        j = 34;
        brojevi[0]= 44;
        
    }
    static void setPersonName(int i, Person p){
        i=11;
        p.setName("Loran");
    }
    
    static void swap(int x1, int x2 ){
        int temp = x1;
        x1 = x2;
        x2 = temp;
        System.out.println("Un funkciji x1 = " + x1 + " a u funkciji x2 = " + x2);
    }
}
