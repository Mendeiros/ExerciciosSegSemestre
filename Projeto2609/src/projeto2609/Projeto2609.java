package projeto2609;

import javax.swing.JOptionPane;

public class Projeto2609 {
    
    public static void main(String[] args) {
        String[][] livros = new String[Integer.MAX_VALUE][5]; //Até 5 são (Título, Autor, Número de ISBN, ano de publicação, status)
        String[][] membros = new String[Integer.MAX_VALUE][3]; //Até 3 são (Nome, Número de indentificação, endereço de e-mail)
        String[][] livros_emprestados_p_m = new String[Integer.MAX_VALUE][Integer.MAX_VALUE]; // historico de livros emprestados por membros
        String[]   livros_emprestados_atual = new String[Integer.MAX_VALUE]; //vetor de livros que estão emprestados no 
        
        //NovaClasseTeste.novoMetodoTeste();
    }
    
    public static void menu(){
        
    }
    
    public static void relatorio(){
        String mensagem = "";
        int entrada = 0;
        
        entrada = Integer.parseInt(JOptionPane.showInputDialog(""));
    }
}
