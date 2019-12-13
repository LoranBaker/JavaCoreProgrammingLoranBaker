/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eight.enumeration;

/**
 *
 * @author PC
 */
public enum Season {
    WINTER("Winter", 1),
    SPRING("SPring", 2),
    SUMMER("Summer", 3),
    FALL("FALL", 4);
    
    
    private String name;
    private int sequence;
    private Season(String name, int sequence){
    this.name = name;
}

    public int getSequence() {
        return sequence;
    }
        
    
    public String getName(){
    return name;
}
    public static int findSequenceBySeason(Season season){
        Season[] array= Season.values();
        int sequenceToReturn = 0;
        for(Season seasonMutant : array){
            if(season!=null && season.equals(seasonMutant)){
                sequenceToReturn = seasonMutant.getSequence();
            }
        }
        return sequenceToReturn;
    }
}