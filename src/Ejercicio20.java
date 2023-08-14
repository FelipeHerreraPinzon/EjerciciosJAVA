import javax.swing.*;

public class Ejercicio20 {
    public static void main(String[] args) {
        /*
        El área de un triángulo se puede calcular a partir del valor de dos de sus lados, a y b, y del
ángulo que estos forman entre sí. Calcular el área dados dichos lados y dicho ángulo (investigar
fórmula)
         */


        double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado A:"));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado B:"));
        double angulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ángulo entre los lados A y B (en grados):"));


        double anguloRadianes = Math.toRadians(angulo);


        double area = 0.5 * ladoA * ladoB * Math.sin(anguloRadianes);


        String mensaje = "El área del triángulo es: " + area;
        JOptionPane.showMessageDialog(null, mensaje);


    }
}
