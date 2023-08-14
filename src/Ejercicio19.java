import javax.swing.*;

public class Ejercicio19 {
    public static void main(String[] args) {
        /*
        Automatizar el proceso para encontrar la distancia entre dos puntos (Xo, Yo) (X1, Y1)
         */


        double x0 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada X del primer punto (X0):"));
        double y0 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada Y del primer punto (Y0):"));
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada X del segundo punto (X1):"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la coordenada Y del segundo punto (Y1):"));


        double distancia = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));


        String mensaje = "La distancia entre los puntos (" + x0 + ", " + y0 + ") y (" + x1 + ", " + y1 + ") es: " + distancia;
        JOptionPane.showMessageDialog(null, mensaje);


    }
}
