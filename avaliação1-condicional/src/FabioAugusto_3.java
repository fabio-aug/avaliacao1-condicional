import javax.swing.*;

public class FabioAugusto_3 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] arg) {
        int maiorNumero = 0;
        String numero = JOptionPane.showInputDialog("Informe um número de 4 digitos: ");
        try {
            String[] vetorNumeros = numero.split("");
            if (vetorNumeros.length > 4) {
                JOptionPane.showMessageDialog(null, "Informe um número com no máximo 4 digitos");
            } else {
                int i = 0;
                while (i < vetorNumeros.length) {
                    int value = Integer.parseInt(vetorNumeros[i]);
                    if (value > maiorNumero) {
                        maiorNumero = value;
                    }
                    i++;
                }
                JOptionPane.showMessageDialog(null, "A menor base que o número consegue ser representado é: " + (maiorNumero + 1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe um número válido");
        }
    }
}
