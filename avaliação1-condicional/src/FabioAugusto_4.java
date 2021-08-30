import javax.swing.*;

public class FabioAugusto_4 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] arg) {
        double respostaA = 0, respostaB = 0, respostaC = 0;
        String respostaD = "";
        try {
            double valor = new Double(JOptionPane.showInputDialog("Informe o preço de compra:"));
            try {
                int categoria = new Integer(JOptionPane.showInputDialog("Informe a categoria:" +
                        "\n1 - limpeza" +
                        "\n2 - alimentação" +
                        "\n3 - vestuário"));
                try {
                    String situacao = JOptionPane.showInputDialog("Informe a situação:" +
                            "\nR - Produtos que necessitam de refrigeração" +
                            "\nN - Produtos que não necessitam de refrigeração");
                    situacao.toUpperCase();

                    //Calculo A

                    if (valor <= 25) {
                        if (categoria == 1) {
                            respostaA = valor * 0.05;
                        } else if (categoria == 2) {
                            respostaA = valor * 0.08;
                        } else if (categoria == 3) {
                            respostaA = valor * 0.10;
                        } else {
                            JOptionPane.showMessageDialog(null, "Categoria informada inválida!!!");
                        }
                    } else if (valor > 25) {
                        if (categoria == 1) {
                            respostaA = valor * 0.12;
                        } else if (categoria == 2) {
                            respostaA = valor * 0.15;
                        } else if (categoria == 3) {
                            respostaA = valor * 0.18;
                        } else {
                            JOptionPane.showMessageDialog(null, "Categoria informada inválida!!!");
                        }
                    }

                    //Calculo B

                    if (categoria == 3 || situacao.equals("R")) {
                        respostaB = (respostaA + valor) * 0.08;
                    } else if (categoria == 2 && situacao.equals("N")) {
                        respostaB = (respostaA + valor) * 0.05;
                    } else {
                        respostaB = (respostaA + valor) * 0.03;
                    }

                    //Calculo C

                    respostaC = valor + respostaA - respostaB;

                    //Calculo D

                    if (respostaC <= 50) {
                        respostaD = "Barato";
                    } else if (respostaC > 50 && respostaC < 120) {
                        respostaD = "Normal";
                    } else if (respostaC >= 120) {
                        respostaD = "Caro";
                    }

                    //Respostas

                    JOptionPane.showMessageDialog(null, "Imposto: " + respostaA
                            + "\nDesconto: " + respostaB
                            + "\nValor final: " + respostaC
                            + "\nClassificação: " + respostaD);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Situação informada inválida, informe uma String");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Categoria informada inválida, informe um número Int");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Preço de compra informado inválido, informe um número Double");
        }
    }
}
