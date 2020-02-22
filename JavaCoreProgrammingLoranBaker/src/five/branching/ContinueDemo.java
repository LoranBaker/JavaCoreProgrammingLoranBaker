package five.branching;

import javax.swing.JOptionPane;

public class ContinueDemo {
    public static void main(String[] args) {
        String recenica = JOptionPane.showInputDialog("Unesi recenicu: ");
        String karakter = JOptionPane.showInputDialog("Unesi slovo");
        if(karakter.length()>1){
        JOptionPane.showMessageDialog(null,"Unesi slovo ali ne recenicu");
        }else{
            int count = 0;
            for(int i = 0;i<recenica.length();i++){
                char slovo = recenica.charAt(i);
                if(slovo !=karakter.charAt(0)){
                    continue;
                    
                }
                count++;
            }
            JOptionPane.showMessageDialog(null,"Slovo u receni se pojavljuje " + count + " puta");
        }
    }
    
}
