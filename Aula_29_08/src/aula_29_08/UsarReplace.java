package aula_29_08;

import javax.swing.JOptionPane;

public class UsarReplace {
    
    public static void main(String[] args){
        String frase = "";
        
        frase = JOptionPane.showInputDialog("Informe uma frase: ");
        
        JOptionPane.showMessageDialog(null, "Trocando caracteres: a por u -> "+frase.replace("a","u"));
        JOptionPane.showMessageDialog(null, "Tirando espaços vazios -> "+frase.replace(" ",""));
        
        String[] cores = {"amarelo", "vermelho", "azul"};
        System.out.println(cores[0].replace("a","i"));
        System.out.println(cores[1].replace("e"," "));
    }
    
}
