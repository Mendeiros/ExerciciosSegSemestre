package revisaodeconteudo;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Pizzaria {

    public static void main(String[] args) {
        
            //VARIAVEIS
            int dias = 7;
            float valorDias = 0f;
            float valorPizzas [] = new float[32];
            float valorDia = 0f;
            int contador = 0;
            float media = 0f;
            int resposta = 0;
            int finalizar = 0;
            //CONSTANTES
            String n = "\n";
            String espaco = " - - - - - - ";
            //Converter para dois pontos
            DecimalFormat df = new DecimalFormat();
            df.applyPattern("##.00);");
            
            JOptionPane.showMessageDialog(null, "Vamos calcular a média de vendas semanal ou mensal de uma pizzaria:");
            
            //DESCOBRIR SE Ã‰ PARA FAZER MEDIA DE VENDA MENSAL OU SEMANAL
            do {
                    String Resposta = JOptionPane.showInputDialog ("Vamos informar os valores recebidos no mês ou na semana?" + n + 
                    "1 - Semanal" + n + "2- Mensal");
                    //CONVERSOR STRING PRO INT
                    resposta = Integer.parseInt(Resposta);

                    switch (resposta) {
                        case 1:
                            dias = 7;
                            break;
                        case 2:
                            dias = 31;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Caracter inválido!"); 
                            break;
                    }
                } while ((dias != 7) && (dias != 31));
            
            //LAÃ‡O PARA SEMANA/MES DE ACORDO COM A RESPOSTA
            do {
                contador ++;
                String pergunta = JOptionPane.showInputDialog("Informe o valor vendido " + n + "Dia {" + (contador) + "}" );
                valorDia = Float.parseFloat(pergunta);
                valorPizzas[contador] = valorDia;
                valorDias += valorDia;
                if (contador == dias) {
                    finalizar = 1;
                }  
            } while (finalizar == 0);    
            //CALCULO DE MEDIA    
            media = (valorDias / dias);

            //IMPRESSAO
            JOptionPane.showMessageDialog(null, espaco + "RESUMO DAS DESPESAS" + espaco + n + "Total de dias: " + contador + espaco 
                    + " Total vendas: R$ " + valorDias + n + "Media diaria de: R$ " + media + espaco + espaco);
        }
}
