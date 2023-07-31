package revisaodeconteudo;

import javax.swing.JOptionPane;

public class RevisaoDeConteudo {

    public static void main(String[] args) {
        //Variáveis nessa ordem: quantidade de notas, total de notas, media das notas, escolha de se quer calcular uma nova média e a situação do aluno (aprovado ou reprovado)
        int qntNotas = 0;
        float ttlNotas = 0f, mediaNotas = 0f;
        char escolha = 'N';
        String situacao = "APROVADO";
        
        //DO-WHILE para repetir o cálculo das médias caso a escolha seja S (de sim)
        do{
            //Reset das variáveis para 0
            qntNotas = 0;
            ttlNotas = 0;
            mediaNotas = 0;
            
            //Armazena a quantidade de notas a serem informadas pela professora
            qntNotas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de notas a serem informadas: "));
            //FOR loop para adicionar a nota informada ao total de notas
            for (int i = 0; i < qntNotas; i++){
                int notaInformada = 0;
                //DO-WHILE para repetir o pedido de nota caso a nota informada seja menor que 0 ou maior que 10
                do{
                    notaInformada = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota N"+(i+1)+": "));
                    if (notaInformada < 0 || notaInformada > 10){
                        JOptionPane.showMessageDialog(null, "Nota inválida, o valor deve ser entre 0 e 10");
                    }
                }while(notaInformada < 0 || notaInformada > 10);
                ttlNotas += notaInformada;
            }
            
            //cálculo da média
            mediaNotas = ttlNotas / qntNotas;
            
            //IF-ELSE para verificar se a média das notas do aluno é suficiente para ser aprovado ou reprovado
            if (mediaNotas >= 7.0){
                situacao = "APROVADO";
            } else {
                situacao = "REPROVADO";
            }
            
            //informa a média do aluno e a situação dele
            JOptionPane.showMessageDialog(null, "A média das notas do aluno é: "+mediaNotas+"\n A situação do aluno é: "+situacao);
            
            //DO-WHILE para verificar se a professora deseja calcular a média de outro aluno e se a resposta é 'S' ou 'N'
            do{
            escolha = JOptionPane.showInputDialog("Deseja calcular a média de mais um aluno? (S/N)").toUpperCase().charAt(0);
            if(escolha != 'N' && escolha != 'S'){
                JOptionPane.showMessageDialog(null, "Resposta inválida, informe \'S\' ou \'N\'");
            }
            } while(escolha != 'N' && escolha != 'S');
        }while(escolha == 'S');
    }
    
}
