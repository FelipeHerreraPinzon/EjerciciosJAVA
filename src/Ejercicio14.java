import javax.swing.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
        Automatizar el proceso para hallar el área y perímetro de un círculo cuyo diámetro es d cm
         */

        Float radio = Float.valueOf(JOptionPane.showInputDialog("Ingrese valor del radio "));

        Float area = 3.1416f * (radio * radio);

        JOptionPane.showMessageDialog(null, "El área del circulo es " + area);

    }
}
