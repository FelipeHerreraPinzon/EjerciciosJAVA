import javax.swing.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
        Automatizar el proceso para encontrar el área de un rectángulo cuya diagonal es d y un lado mide x
         */


        double diagonal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud de la diagonal (d):"));
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado (x):"));


        double otroLado = Math.sqrt(diagonal * diagonal - lado * lado);


        double area = lado * otroLado;


        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + area);
    }
}
