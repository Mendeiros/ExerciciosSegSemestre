package aula_21_08;

import java.lang.Math;
import javax.swing.JOptionPane;

public class Aula_21_08 {

    public static void main(String[] args) {
        
        double numX, numY, valMaior, valMenor, cuboX, quadradoY, raizQuadX, raizQuadY, numAleat;
        
        
        numX = Integer.parseInt(JOptionPane.showInputDialog("Informe o número X: "));
        numY = Integer.parseInt(JOptionPane.showInputDialog("Informe o número Y: "));
        
        valMaior = Math.max(numX, numY);
        
        valMenor = Math.min(numX, numY);
        
        raizQuadX = Math.sqrt(numX);
        
        raizQuadY = Math.sqrt(numY);
        
        cuboX = Math.pow(numX, 3);
        
        quadradoY = Math.pow(numY, 2);
        
        numAleat = Math.random()*10;
        
        System.out.println("_-============-_");
        System.out.println("X: "+numX+"  |  Y: "+numY);
        System.out.println("Valor maior: "+valMaior);
        System.out.println("Valor menor: "+valMenor);
        System.out.println("Raiz quadrada de X: "+raizQuadX);
        System.out.println("Raiz quadrada de Y: "+raizQuadY);
        System.out.println("X elevado ao cubo: "+cuboX);
        System.out.println("Y elevado ao quadrado: "+quadradoY);
        System.out.println("Numero aleatório entre 0 e 10: "+numAleat);
    }
    
}
