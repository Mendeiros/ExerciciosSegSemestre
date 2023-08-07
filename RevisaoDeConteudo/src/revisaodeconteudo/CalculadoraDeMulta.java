package revisaodeconteudo;

import javax.swing.JOptionPane;

public class CalculadoraDeMulta {
    
    public static void main(String[] args) {
        //Variaveis do programa
        int limiteDaRota = 0;
        float velocidadeDaInfração;
        float multaLeve = 130, multaMediana = 195, multaPesada = 880;
        float calculoMultaLeve, calculoMultaMediana;

        //Estrutura DO-WHILE para o programa se repetir enquanto um valor maior que 0 seja informado na velocidade do motorista
        do {
            //JOption perguntando a velocidade do motorista estava para guardar na variavel velocidadeDaInfracao
            velocidadeDaInfração = Float.parseFloat(JOptionPane.showInputDialog("Em quantos km/h estava o motorista?"));

            //Estrutura if else para a pergunta sobre a velocidade da via só aparecer caso a velocidade do motorista for maior que 0
            if (velocidadeDaInfração > 0) {
                Object[] limitesPermitidos = {"110 km/h", "80km/h", "60 km/h", "20 km/h"};
                Object perguntaLimite = JOptionPane.showInputDialog(null, "Escolha uma opção que se adapta no limite de velocidade do local:", "Limite de velocidade",
                        JOptionPane.QUESTION_MESSAGE, null, limitesPermitidos, limitesPermitidos[0]);
                /* 
                A cima uma pergunta da velocidade que é permitida na via
                para na estrutura switch a baixo seja definida a variavel limiteDaRota
                 */
                String definaLimite = (String) perguntaLimite;
                switch (definaLimite) {
                    case "110 km/h" -> {
                        limiteDaRota = 110;
                    }
                    case "80 km/h" -> {
                        limiteDaRota = 80;
                    }
                    case "60 km/h" -> {
                        limiteDaRota = 60;
                    }
                    case "20 km/h" -> {
                        limiteDaRota = 20;
                    }
                    default ->
                        JOptionPane.showMessageDialog(null, "Parabens! Você conseguiu burlar o sistema");
                }

                /*
                Utilizando a variavel calculoMultaLeve e calculoMultaMediana para armazenar o valor do calculo da velocidade necessaria para atingir essas multas
                calculoMultaLeve = os km/h até 20% a cima do permitido
                calculoMultaMediana = os km/h de 20% até 50% a cima do permitido 
                 */
                calculoMultaLeve = limiteDaRota + ((limiteDaRota * 20) / 100);
                calculoMultaMediana = limiteDaRota + ((limiteDaRota * 50) / 100);

                //estrutura de if e else para definir em qual multa o motorista se enquandra
                //if = Até 20% a cima do permitido
                if (velocidadeDaInfração > limiteDaRota && velocidadeDaInfração <= calculoMultaLeve) {                    
                    JOptionPane.showMessageDialog(null, "O motorista estava a " + velocidadeDaInfração + " km/h. "
                            + "\nSignifa que ele ultrapassou o limite de " + limiteDaRota + "km/h. da rota"
                            + "\nO valor de multa a ser paga é de " + multaLeve + "R$");
                //else if = De 20% até 50% a cima do permitido
                } else if (velocidadeDaInfração > calculoMultaLeve && velocidadeDaInfração <= calculoMultaMediana) {
                    JOptionPane.showMessageDialog(null, "O motorista estava a " + velocidadeDaInfração + " km/h. "
                            + "\nSignifa que ele ultrapassou o limite de " + limiteDaRota + "km/h da rota em mais de 20%."
                            + "\nO valor de multa a ser paga é de " + multaMediana + "R$");
                //else if = A cima de 50% do permitido
                } else if (velocidadeDaInfração > calculoMultaMediana) {
                    JOptionPane.showMessageDialog(null, "O motorista estava a " + velocidadeDaInfração + " km/h. "
                            + "\nSignifa que ele ultrapassou o limite de " + limiteDaRota + "km/h da rota em mais de 50%."
                            + "\nO valor de multa a ser paga é de " + multaPesada + "R$");
                //else = Esta dentro do permitido
                } else {  
                    JOptionPane.showMessageDialog(null, "O motorista estava a " + velocidadeDaInfração + " km/h."
                            + "\nSignifica que ele estava dentro do limite de " + limiteDaRota + " km/h da rota."
                            + "\nNão tem nenhuma multa a ser paga");
                }
            //Estrutura if else para a pergunta sobre a velocidade da via só aparecer caso a velocidade do motorista for maior que 0    
            } else {
                JOptionPane.showMessageDialog(null, "Programa sendo encerrado!"
                        + "\nDa proxima informe um numero maior que zero para que o programa prossiga.");
            }
        //Estrutura DO-WHILE para o programa se repetir enquanto um valor maior que 0 seja informado na velocidade do motorista
        } while (velocidadeDaInfração > 0);
    }
}
