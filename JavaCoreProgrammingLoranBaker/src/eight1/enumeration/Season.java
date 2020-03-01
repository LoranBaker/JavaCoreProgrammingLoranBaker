
package eight1.enumeration;

public enum Season {
    WINTER("Winter", 1),
    SPRING("Spring", 2),
    SUMMER("Summer", 3),
    FALL("Fall", 4);
    
    private String name;
    private int order;
    private Season(String name, int order){
        this.name = name;
        this.order= order;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }
    public static int findSeasonbyOrder(Season season){
        Season[] niz = Season.values();
        int orderToReturn = 0;
        for(Season seasonMutant: niz){
            if(season != null && season.equals(seasonMutant)){
                orderToReturn = seasonMutant.getOrder();
            }
            
        }
        return orderToReturn;
    }
    
}
