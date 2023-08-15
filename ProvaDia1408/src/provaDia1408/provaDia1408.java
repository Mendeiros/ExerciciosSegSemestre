package provaDia1408;

import javax.swing.JOptionPane;

public class provaDia1408 {

    public static void main(String[] args) {
        // atividade 01
        int horasTrab = 0;
        double valorHora = 0, salarioMensal = 0;
        int escolha = 0;
        
        do{
            salarioMensal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário mensal do funcionário em reais: "));
            horasTrab = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas trabalhadas no mês pelo mesmo funcionário: "));
            valorHora = salarioMensal/horasTrab;
            
            JOptionPane.showMessageDialog(null, "O valor hora do funcionário é de R$ "+valorHora);
            
            do{
                escolha = Integer.parseInt(JOptionPane.showInputDialog("Deseja sair? \n1 -> Sim \n0 -> Não"));
                if (escolha < 0 || escolha > 1){
                    JOptionPane.showMessageDialog(null," -Informe uma opção válida (0 ou 1)- ");
                }
            } while (escolha < 0 || escolha > 1);
            
        } while (escolha == 0);
    }
    
}
