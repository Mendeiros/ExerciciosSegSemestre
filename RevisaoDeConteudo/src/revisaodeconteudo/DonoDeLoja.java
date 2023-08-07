package revisaodeconteudo;

import javax.swing.JOptionPane;

public class DonoDeLoja {

    public static void main(String[] args) {
 
            String escolha;
            String dtlh = " - - - - - ";
            String n = "\n";
            String problema = "";
            
            String Escolha = JOptionPane.showInputDialog(null, "  " + dtlh + " BEM-VINDO " + dtlh + n + n + "Central de ajuda a problemas de entrega" + n
                    + "" + n+ "{1} Produto veio danificado " + n+ "{2} Produto veio incorreto " + n + "{3} Produto não foi entregue " 
                    + n + "{4} Produto veio com defeitos de fábrica");
             
            escolha = switch (Escolha) {
                
            case "1" -> "Se seus problemas envolvem um item danificado na entrega, entre em contato com a distribuidora que realizou esse processo "
                    + n + "para que medidas possam ser tomadas à respeito" + n + n + (problema = "{1} Produto danificado"); 
            case "2" -> "Caso produto recebido não tenha atendido suas especificações, entre em contato com a empresa responsavel pelo envio do produto."
                     + n + n + (problema = "{2} Produto enviado incorreto");   
            case "3" -> "Em caso de produto não recebido, verifique o histórico de entrega em caso de envio à terceiros, certifique-se de enviar "
                    + n + "algum conteúdo visual em que comprove que o produto não foi entregue." + n + n + (problema = "{3} Produto não foi recebido") ; 
            case "4" -> "Se o produto recebido veio com alguma falha de fábrica, entre em contato com a empresa responsavel pelo envio e certifique-se de que" 
                    + n +"sua garantia esteja em dia para a troca." + n + n + (problema = "{4} Produto com defeitos de fábrica ou funcionamento"); 
            default -> "Opção inexistente!";
            };
                    
            JOptionPane.showMessageDialog(null,  escolha);
    }
}
