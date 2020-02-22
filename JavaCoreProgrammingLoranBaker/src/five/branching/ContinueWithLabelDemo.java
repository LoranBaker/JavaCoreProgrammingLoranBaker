
package five.branching;

import javax.swing.JOptionPane;
//da li je rijec sadrzana u recenici

public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = JOptionPane.showInputDialog("Unesi recenicu: ");
        String rijec = JOptionPane.showInputDialog("Unesi rijec: ");
        
        boolean contains = false;
        int max = recenica.length()-rijec.length();
        label: for(int i =0;i<=max;i++){
            int k=i;
            for(int j=0;j<rijec.length();j++){
                if(recenica.charAt(k++) != rijec.charAt(j)){    
                    continue label;
                }
          
            }
            contains = true;
            break label;
                    
            
        }
        System.out.println(contains? "Sadrzana" : "Nije sadrzana rijec u recenici");
    }
  
}
