package revisaodeconteudo;

import javax.swing.JOptionPane;

public class Veterinario {

    public static void main(String[] args) {
        
        int quantidadeAnimais = 0;
        int gatos = 0;
        int caes = 0;
        int coelhos = 0;
        int consultas = 35; 
        int totalAnimais = 0;
        
        String dtlh = "";
        String n = "\n";
        
        
       JOptionPane.showMessageDialog(null, dtlh + "Bem-vindo doutor!" + dtlh + n + "Vamos começar a agendar nossa semana?");
        
        String Caes = JOptionPane.showInputDialog("Quantos cachorros serão atendidos essa semana?"  + n + "Numero de consultas disponiveis: " + consultas );
        caes = Integer.parseInt(Caes);
        if (caes < consultas) {
            consultas -= caes;
        } else {
            JOptionPane.showMessageDialog(null, "Número informado maior do que a disponibilidade semanal do doutor");
            caes = 0;
        }
                
        String Gatos = JOptionPane.showInputDialog("Quantos gatos serão atendidos essa semana?"  + n + "Numero de consultas disponiveis: " + consultas );
        gatos = Integer.parseInt(Gatos);
        if (gatos < consultas) {
            consultas -= gatos;
        } else {
            JOptionPane.showMessageDialog(null, "Número informado maior do que a disponibilidade semanal do doutor");
            gatos = 0;
        }
        
        String Coelhos = JOptionPane.showInputDialog("Quantos coelhos serão atendidos essa semana?" + n + "Numero de consultas disponiveis: " + consultas);
        coelhos = Integer.parseInt(Coelhos);
        if (coelhos < consultas) {
            consultas -= coelhos;
        } else {
            JOptionPane.showMessageDialog(null, "Número informado maior do que a disponibilidade semanal do doutor");
            coelhos = 0;
        }
        
        totalAnimais = (coelhos + caes + gatos);
        
        JOptionPane.showMessageDialog(null, "O número de animais que serão atendidos essa semana é de: " + n + "Cães -> " + caes + n
        + "Gatos -> " + gatos + n + "Coelhos -> " + coelhos + n + n + "Foram marcadas " + totalAnimais + " consultas para semana." + n 
        + "Disponibilidade restante: " + (35 - totalAnimais )+ " horários disponveis.");
        
    }
}