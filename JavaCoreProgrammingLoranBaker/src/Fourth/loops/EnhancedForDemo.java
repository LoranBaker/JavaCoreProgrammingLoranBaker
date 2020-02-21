package Fourth.loops;



public class EnhancedForDemo {
    public static void main(String[] args) {
        int[] numbers = {12, 3552, 21, 233, 324, 42, 77};
        for(int i = 0; i<numbers.length; i++){
        int vrijednostNaItojpoziciji = numbers[i];
            System.out.println(vrijednostNaItojpoziciji);
        }
        //enhaced for petlja (Y)
        System.out.println("EnHANCED");
        for(int mutant: numbers){
            System.out.println(mutant);
        }
    }
  
}
