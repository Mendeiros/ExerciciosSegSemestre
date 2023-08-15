package provaDia1408;

import javax.swing.JOptionPane;

public class ProvaDia1408_2 {
    
    public static void main(String[] args){
        String[] nomesTurma = new String[99];
        double[] mediasTurma = new double[99];
        String[] situacaoTurma = new String[99];
        
        int quantidadeAlunos = 0;
        String nomeLido = "";
        double nota0Lida = 0;
        double nota1Lida = 0;
        double nota2Lida = 0;
        
        String mensagemFinal = "";
        
        int escolha = 0;
        
        do {
            
            mensagemFinal = "";
            
            do {
                quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos alunos deseja cadastrar: "));
                if (quantidadeAlunos < 0 || quantidadeAlunos > 99){
                    JOptionPane.showMessageDialog(null, "Informe uma quantidade válida (maior que 0 e menor que 99)");
                }
            } while (quantidadeAlunos < 0 || quantidadeAlunos > 99);
            
            for (int i = 0; i < quantidadeAlunos; i++){
                
                do{
                    nomeLido = JOptionPane.showInputDialog("Informe o nome do aluno "+(i+1));
                    if (nomeLido == ""){
                        JOptionPane.showMessageDialog(null, "Nome inválido, informe algo");
                    }
                } while (nomeLido == "");
                nomesTurma[i] = nomeLido;
                
                do{
                    nota0Lida = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
                    if (nota0Lida < 0 || nota0Lida > 10){
                        JOptionPane.showMessageDialog(null, "Informe uma nota válida (entre 0 e 10)");
                    }
                } while (nota0Lida < 0 || nota0Lida > 10);
                
                do{
                    nota1Lida = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
                    if (nota1Lida < 0 || nota1Lida > 10){
                        JOptionPane.showMessageDialog(null, "Informe uma nota válida (entre 0 e 10)");
                    }
                } while (nota1Lida < 0 || nota1Lida > 10);
                
                do{
                    nota2Lida = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
                    if (nota2Lida < 0 || nota2Lida > 10){
                        JOptionPane.showMessageDialog(null, "Informe uma nota válida (entre 0 e 10)");
                    }
                } while (nota2Lida < 0 || nota2Lida > 10);
                
                mediasTurma[i] = (nota0Lida + nota1Lida + nota2Lida)/3;
                
                if (mediasTurma[i] >= 7){
                    situacaoTurma[i] = "Aprovado";
                } else if (mediasTurma[i] < 7 && mediasTurma[i] >= 6){
                    situacaoTurma[i] = "Em exame";
                } else if (mediasTurma[i] < 6){
                    situacaoTurma[i] = "Reprovado";
                }
            }
            
            for (int i = 0; i < quantidadeAlunos; i++){
                mensagemFinal += "| Nome: "+nomesTurma[i]+" | Média: "+mediasTurma[i]+" | Situação: "+situacaoTurma[i]+" |\n";
            }
            
            JOptionPane.showMessageDialog(null, mensagemFinal);
            
            do{
                escolha = Integer.parseInt(JOptionPane.showInputDialog("Deseja finalizar ou cadastrar outra turma? \n1 -> Sair \n0 -> Cadastrar turma"));
                if (escolha < 0 || escolha > 1){
                    JOptionPane.showMessageDialog(null," -Informe uma opção válida (0 ou 1)- ");
                }
            } while (escolha < 0 || escolha > 1);
            
        } while (escolha == 0);
        
    }
}
