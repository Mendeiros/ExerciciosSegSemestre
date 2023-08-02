package revisaodeconteudo;

import javax.swing.JOptionPane;

public class MetodoComRetorno {
    
    public static void main(String[] args){
        int qntNotas = 0;
        double ttlNotas = 0, mediaNotas = 0;
        char escolha = 'N';
        String situacao = "APROVADO";
        
        do{
            qntNotas = 0;
            ttlNotas = 0;
            mediaNotas = 0;
            
            qntNotas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de notas a serem informadas: "));
            
            ttlNotas = forNotas(qntNotas);
            
            mediaNotas = calcMedia(ttlNotas, qntNotas);
            
            situacao = situacao(mediaNotas);
            
            JOptionPane.showMessageDialog(null, "A média das notas do aluno é: "+mediaNotas+"\n A situação do aluno é: "+situacao);
            
            escolha = decisao();
        }while(escolha == 'S');
    }
    
    public static double calcMedia(double totalNts, int quantNts){
        double mediaNts = 0;
        mediaNts = totalNts / quantNts;
        
        return mediaNts;
    }
    
    public static double forNotas(int quantNts){
        double totalNts = 0;
        for (int i = 0; i < quantNts; i++){
            int notaInformada = 0;
            do{
                notaInformada = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota N"+(i+1)+": "));
                if (notaInformada < 0 || notaInformada > 10){
                    JOptionPane.showMessageDialog(null, "Nota inválida, o valor deve ser entre 0 e 10");
                }
            }while(notaInformada < 0 || notaInformada > 10);
            totalNts += notaInformada;
        }
        return totalNts;
    }
    
    public static String situacao(double mediaNts){
        String situacao = "APROVADO";
        
        if (mediaNts >= 7.0){
            situacao = "APROVADO";
        } else {
            situacao = "REPROVADO";
        }
        
        return situacao;
    }
    
    public static char decisao(){
        char escolha = 'S';
        
        do{
            escolha = JOptionPane.showInputDialog("Deseja calcular a média de mais um aluno? (S/N)").toUpperCase().charAt(0);
        if(escolha != 'N' && escolha != 'S'){
            JOptionPane.showMessageDialog(null, "Resposta inválida, informe \'S\' ou \'N\'");
        }
        } while(escolha != 'N' && escolha != 'S');
        
        return escolha;
    }
}
