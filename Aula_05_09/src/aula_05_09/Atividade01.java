package aula_05_09;

import javax.swing.JOptionPane;

public class Atividade01 {
    
    static int[] vetorNums = new int[999];
    static int qntNums = 0;
    static int decisao = 0;
    
    public static void main(String[] args){
        
        qntNums = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos números deseja inserir no vetor: "));
        
        for (int i = 0; i < qntNums; i++){
            vetorNums[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+" número: "));
        }
        
        do{
            decisao = Integer.parseInt(JOptionPane.showInputDialog("Informe sua decisão: \n1- Listar Vetor - mostrar o conteúdo do vetor \n2- Exibir apenas os números pares do vetor \n3- Exibir apenas os números ímpares do vetor \n4- Exibir a quantidade de números pares existem nas posições ímpares do vetor \n5- Exibir a quantidade de números ímpares existem nas posições pares do vetor"));
            
            switch(decisao) {
                case 1:
                    listarVet();
                    break;
                case 2:
                    paresVet();
                    break;
                case 3:
                    imparesVet();
                    break;
                case 4:
                    qntImpParVet();
                    break;
                case 5:
                    qntParImpVet();
                    break;
                default:
                    break;
            }
            
        }while(decisao != 0);
    }
    
    public static void listarVet(){
        
        String mensagem = "";
        
        for (int i = 0; i < qntNums; i++){
            mensagem += vetorNums[i]+" ";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
    public static void paresVet(){
        
        String mensagemPares = "";
        
        for (int i = 0; i < qntNums; i++){
            
            if(vetorNums[i]%2 == 0){
                mensagemPares += vetorNums[i]+" ";
            }
        }
        
        JOptionPane.showMessageDialog(null, mensagemPares);
        
    }
    
    public static void imparesVet(){
        
        String mensagemImpares = "";
        
        for (int i = 0; i < qntNums; i++){
            
            if(vetorNums[i]%2 == 1){
                mensagemImpares += vetorNums[i]+" ";
            }
        }
        
        JOptionPane.showMessageDialog(null, mensagemImpares);
        
    }
    
    public static void qntParImpVet(){
        
        int quantidadeParImp = 0;
        
        for (int i = 0; i < qntNums; i++){
            
            if(i%2 == 1 && vetorNums[i]%2 == 0){
                quantidadeParImp++;
            }
        }
        
        JOptionPane.showMessageDialog(null, quantidadeParImp);
        
    }
    
    public static void qntImpParVet(){
        
        int quantidadeImpPar = 0;
        
        for (int i = 0; i < qntNums; i++){
            
            if(i%2 == 0 && vetorNums[i]%2 == 1){
                quantidadeImpPar++;
            }
        }
        
        JOptionPane.showMessageDialog(null, quantidadeImpPar);
        
    }
}
