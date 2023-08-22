package aula_21_08;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Exercicios {
    
    public static void main(String[] args){
        
        int numInformado = 0, numCont = 0, contador = 0, numTotal = 0, numElevado;
        
        
        do {
            numInformado = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero de 0 a 10"));
        } while (numInformado < 0 || numInformado > 10);
        
        numCont = numInformado;
        
        while (contador < 20) {
            if ( (numCont % 2) != 0){
                numElevado = (int) Math.pow(numCont,2);
                System.out.println(numCont+" -> "+numElevado);
                numTotal += numElevado;
                contador++;
            }
            numCont++;
        }
        
        System.out.println("A soma dos quadrados dos 20 primeiros números após o número "+numInformado+" é: "+numTotal);
    }
    
}
