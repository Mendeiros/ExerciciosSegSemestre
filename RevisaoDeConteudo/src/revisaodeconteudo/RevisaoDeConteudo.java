package revisaodeconteudo;

import javax.swing.JOptionPane;

public class RevisaoDeConteudo {

    public static void main(String[] args) {
        int qntNotas = 0;
        float ttlNotas = 0f, mediaNotas = 0f;
        char decisao = 'N';
        String situacao = "APROVADO";
        
        do{
            qntNotas = 0;
            ttlNotas = 0;
            mediaNotas = 0;
            
            qntNotas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de notas a serem informadas: "));
            for (int i = 0; i < qntNotas; i++){
                int notaInformada = 0;
                do{
                    notaInformada = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota N"+(i+1)+": "));
                    if (notaInformada < 0 || notaInformada > 10){
                        JOptionPane.showMessageDialog(null, "Nota inválida, o valor deve ser entre 0 e 10");
                    }
                }while(notaInformada < 0 || notaInformada > 10);
                ttlNotas += notaInformada;
            }
            
            mediaNotas = ttlNotas / qntNotas;
            
            if (mediaNotas >= 7.0){
                situacao = "APROVADO";
            } else {
                situacao = "REPROVADO";
            }
            
            JOptionPane.showMessageDialog(null, "A média das notas do aluno é: "+mediaNotas+"\n A situação do aluno é: "+situacao);
            
            do{
            decisao = JOptionPane.showInputDialog("Deseja calcular a média de mais um aluno? (S/N)").toUpperCase().charAt(0);
            if(decisao != 'N' && decisao != 'S'){
                JOptionPane.showMessageDialog(null, "Resposta inválida, informe \'S\' ou \'N\'");
            }
            } while(decisao != 'N' && decisao != 'S');
        }while(decisao == 'S');
    }
    
}
