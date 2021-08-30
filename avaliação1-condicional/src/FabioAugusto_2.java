import javax.swing.*;

public class FabioAugusto_2 {

    /* Fábio Augusto Araújo Santos */

    public static void main(String[] arg) {
        try {
            double nadadorA = new Double(JOptionPane.showInputDialog("Tempo do nadador A: (MINUTOS)"));
            double nadadorB = new Double(JOptionPane.showInputDialog("Tempo do nadador B: (MINUTOS)"));
            double nadadorC = new Double(JOptionPane.showInputDialog("Tempo do nadador C: (MINUTOS)"));
            if (nadadorA < nadadorB && nadadorA < nadadorC) {
                if (nadadorB < nadadorC) {
                    JOptionPane.showMessageDialog(null, "Ouro: Nadador A: " + nadadorA
                            + "\nPrata: Nadador B: " + nadadorB
                            + "\nBronze: Nadador C: " + nadadorC);
                } else {
                    JOptionPane.showMessageDialog(null, "Ouro: Nadador A: " + nadadorA
                            + "\nPrata: Nadador C: " + nadadorC
                            + "\nBronze: Nadador B: " + nadadorB);
                }
            } else if (nadadorB < nadadorA && nadadorB < nadadorC) {
                if (nadadorA < nadadorC) {
                    JOptionPane.showMessageDialog(null, "Ouro: Nadador B: " + nadadorB
                            + "\nPrata: Nadador A: " + nadadorA
                            + "\nBronze: Nadador C: " + nadadorC);
                } else {
                    JOptionPane.showMessageDialog(null, "Ouro: Nadador B: " + nadadorB
                            + "\nPrata: Nadador C: " + nadadorC
                            + "\nBronze: Nadador A: " + nadadorA);
                }
            } else {
                if (nadadorA < nadadorB) {
                    JOptionPane.showMessageDialog(null, "Ouro: Nadador C: " + nadadorC
                            + "\nPrata: Nadador A: " + nadadorA
                            + "\nBronze: Nadador B: " + nadadorB);
                } else {
                    JOptionPane.showMessageDialog(null, "Ouro: Nadador C: " + nadadorC
                            + "\nPrata: Nadador B: " + nadadorB
                            + "\nBronze: Nadador A: " + nadadorA);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe valores válidos!!!");
        }
    }
}
