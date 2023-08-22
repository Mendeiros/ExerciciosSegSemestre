package aula_21_08;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Exerc6_0 {
    
    public static void main(String[] args){
        int numMaior = 0, numMenor = 9999, numLido = 0;
        
        do {
            
            do{
                numLido = Integer.parseInt(JOptionPane.showInputDialog("Informe um número positivo: \n- 0 (zero) para sair-"));
            } while (numLido < 0);
            
            if (numLido != 0){
                numMaior = Math.max(numMaior, numLido);
                numMenor = Math.min(numMenor, numLido);
                JOptionPane.showMessageDialog(null, "O maior número é: "+numMaior+"\nO menor número é: "+numMenor);
            }
        } while (numLido != 0);
        
    }
    
}
