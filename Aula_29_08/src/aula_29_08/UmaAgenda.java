package aula_29_08;

import javax.swing.JOptionPane;

public class UmaAgenda {
    
    public static void main(String[] args){
        String[] nomeESobr = {"Carlos Cardoso", "Arthur Pereira", "Marcos Silva", "Júlio Correia", "Anna Castro", "Miguel Ribeiro", "João Ferreira",
            "Gabriela Dias", "Renan Goncalves", "Matheus Santos"};
        String nomeProc = "";
        String sobrProc = "";
        String nomeEncontrado = "Não foi encontrado";
        String sobrEncontrado = "Não foi encontrado";
        
        nomeProc = JOptionPane.showInputDialog("Informe o nome que deseja procurar: ");
        
        for (int i = 0; i < 10; i++){
            if (nomeESobr[i].startsWith(nomeProc)){
                nomeEncontrado = nomeESobr[i];
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, nomeEncontrado);
        
        sobrProc = JOptionPane.showInputDialog("Informe o sobrenome que deseja procurar: ");
        
        for (int j = 0; j < 10; j++){
            if (nomeESobr[j].endsWith(sobrProc)){
                sobrEncontrado = nomeESobr[j];
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, sobrEncontrado);
    }
    
}
