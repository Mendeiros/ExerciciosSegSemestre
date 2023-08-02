package revisaodeconteudo;

import javax.swing.JOptionPane;

public class CalculadoraDeMulta {
    
    public static void main(String[] args) {

        int limiteDaRota = 0;
        float velocidadeDaInfração;
        float multaLeve = 130, multaMediana = 195, multaPesada = 880;
        float calculoMultaLeve, calculoMultaMediana;

        do {
            velocidadeDaInfração = Float.parseFloat(JOptionPane.showInputDialog("Em quantos km/h estava a pessoa?"));
            if (velocidadeDaInfração > 0) {
                Object[] limitesPermitidos = {"110 km/h", "80km/h", "60 km/h", "20 km/h"};
                Object perguntaLimite = JOptionPane.showInputDialog(null, "Escolha uma opção que se adapta no limite de velocidade do local:", "Limite de velocidade",
                        JOptionPane.QUESTION_MESSAGE, null, limitesPermitidos, limitesPermitidos[0]);

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

                calculoMultaLeve = limiteDaRota + ((limiteDaRota * 20) / 100);
                calculoMultaMediana = limiteDaRota + ((limiteDaRota * 50) / 100);

                if (velocidadeDaInfração > limiteDaRota && velocidadeDaInfração < calculoMultaLeve) {

                    JOptionPane.showMessageDialog(null, "A pessoa estava a " + velocidadeDaInfração + " km/h. "
                            + "\nSignifa que ela ultrapassou o limite de " + limiteDaRota + "km/h. da rota"
                            + "\nO valor de multa a ser pago é de " + multaLeve + "R$");

                } else if (velocidadeDaInfração > calculoMultaLeve && velocidadeDaInfração < calculoMultaMediana) {

                    JOptionPane.showMessageDialog(null, "A pessoa estava a " + velocidadeDaInfração + " km/h. "
                            + "\nSignifa que ela ultrapassou o limite de " + limiteDaRota + "km/h da rota em mais de 20%."
                            + "\nO valor de multa a ser pago é de " + multaMediana + "R$");

                } else if (velocidadeDaInfração > calculoMultaMediana) {
                    JOptionPane.showMessageDialog(null, "A pessoa estava a " + velocidadeDaInfração + " km/h. "
                            + "\nSignifa que ela ultrapassou o limite de " + limiteDaRota + "km/h da rota em mais de 50%."
                            + "\nO valor de multa a ser pago é de " + multaPesada + "R$");
                } else {
                    JOptionPane.showMessageDialog(null, "A pessoa estava a" + velocidadeDaInfração + " km/h."
                            + "\nSignifica que ela esta dentro do limite de " + limiteDaRota + " km/h da rota."
                            + "\nNão tem nenhuma multa a ser paga");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Programa sendo encerrado!"
                        + "/nDa proxima informe um numero maior que zero para que o programa prossiga.");
            }
        } while (velocidadeDaInfração > 0);
    }
}
