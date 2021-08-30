import javax.swing.*;

public class FabioAugusto_1 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] arg) {
        try {
            double r = new Double(JOptionPane.showInputDialog("Posição do jogador R: "));
            double l = new Double(JOptionPane.showInputDialog("Posição do jogador L: "));
            double d = new Double(JOptionPane.showInputDialog("Posição do jogador D: "));
            if ( (r < 0 || l < 0 || d < 0) || (r > 100 || l > 100 || d > 100)) {
                JOptionPane.showMessageDialog(null, "Informe valores entre 0 e 100");
            } else {
                if (r > 50 && l < r && r > d) {
                    JOptionPane.showMessageDialog(null, "Jogador impedido");
                } else {
                    JOptionPane.showMessageDialog(null, "Jogador livre");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe valores válidos!!!");
        }
    }
}
