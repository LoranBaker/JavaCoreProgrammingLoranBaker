/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nine.reference;

/**
 *
 * @author PC
 */
public class PersonExectuor {

    public static void main(String[] args) {
        //PROSTI TIPOVI PODATAKA: prosljedivanje fukciji vrijenosti a ne iformaciju o memorijskoj lokaciji
        int y1 = 23;
        int y2 = 34;
        System.out.println("U funkciji y1 = " + y1 + ", y2 = " + y2);
        swap(y1, y2);
        System.out.println("Poslije poziva u funkciji y1 = " + y1 + ", y2 = " + y2);
        //person = objektna referenca
        int i = 5;
        Person person = new Person();
        person.setName("Faruk");
        System.out.println(person.getName() + " , " + i);
        setPersonName(i, person);
        System.out.println(person.getName() + " , " + i);
        
        
        int[] numbers = new int[2];
        numbers[0] = 36;
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
        static void getAnotherPerson(Person person){
            person = new Person();
            person.setName("Ridji");
        
        }
    static void receiveArray(int[] brojevi, int j) {
        j = 34;
        brojevi[0] = 33;
    }

    static void setPersonName(int i, Person p) {
        i = 99;
        p.setName("Loran");
    }

    static void swap(int x1, int x2) {
        int temp = x1;
        x1 = x2;
        x2 = temp;
        System.out.println("U funkciji x1 = " + x1 + ", x2 = " + x2);
    }
}
