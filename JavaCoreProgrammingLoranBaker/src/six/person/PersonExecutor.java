package six.person;

public class PersonExecutor {

    public static void main(String[] args) {
        Person p1 = new Person("Vedad,", " Efendic");
        Person p2 = new Student("Fadil", "Turalic", 30);
        String result1 = checkPerson(p1);
        System.out.println(result1);
        String result2 = checkPerson(p2);
        System.out.println(result2);
    }
    
    //instaceof - true or false
    static String checkPerson(Person p) {
        if(p instanceof Student){
            return "Student";
        }else if(p instanceof Teacher){
            return "Teacher";
        }else{
            return "Obicna persona";
        }  
    }
}
