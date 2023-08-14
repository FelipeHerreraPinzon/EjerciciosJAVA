import javax.swing.*;

public class Ejercicio11 {
    public static void main(String[] args) {

        /*
        Calcular la superficie y el volumen de una esfera

        V = 4/3 pi * R^3

         */

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese radio de esfera:"));

        double volumenEsfera = 4/3 * 3.1416 * Math.pow(radio, 2);

        JOptionPane.showMessageDialog(null, "El volumen de la esfera es: " + volumenEsfera);
    }
}
