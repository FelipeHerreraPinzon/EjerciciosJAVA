import javax.swing.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        Automatizar el proceso para encontrar el perímetro y el área de un cuadrado cuyo lado mide x
         */

        Float lado = Float.valueOf(JOptionPane.showInputDialog("Ingrese valor del lado "));

        Float area = lado * lado;

        JOptionPane.showMessageDialog(null, "El área del cuadrado es " + area);


    }
}
