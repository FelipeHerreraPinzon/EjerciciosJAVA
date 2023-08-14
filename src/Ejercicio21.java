import javax.swing.*;

public class Ejercicio21 {
    public static void main(String[] args) {
        /*
          Se tiene un triángulo, del cual se conocen dos lados a, b, y el ángulo α entre dichos lados en grados.
          Automatizar el proceso para determinar su tercer lado c y sus otros dos ángulos β y ϕ en grados.
          El procedimiento debe ser válido para cualquier tipo de triángulo. Para probarlo hágalo con un triángulo
          rectángulo con a=3, b=4 y alfa=90.
         */


        double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado A:"));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado B:"));
        double anguloAlfa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ángulo alfa en grados:"));


        double anguloAlfaRadianes = Math.toRadians(anguloAlfa);


        double ladoC = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - 2 * ladoA * ladoB * Math.cos(anguloAlfaRadianes));


        double anguloBetaRadianes = Math.asin((ladoB * Math.sin(anguloAlfaRadianes)) / ladoC);
        double anguloBeta = Math.toDegrees(anguloBetaRadianes);


        double anguloPhi = 180.0 - anguloAlfa - anguloBeta;


        String mensaje = "Lado C: " + ladoC + "\n" +
                "Ángulo Beta: " + anguloBeta + " grados\n" +
                "Ángulo Pi: " + anguloPhi + " grados";
        JOptionPane.showMessageDialog(null, mensaje);


    }
}
