import javax.swing.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Automatizar el proceso para que, dado cualquier número entero de seis cifras, nos diga cuantas unidades
tiene, cuantas decenas, cuantas centenas, etc.…ejemplo:
Si nos dan 452783 entonces el programa debe decir: Hay 3 unidades, 8 decenas, 7 unidades de mil, 2
unidades de mil, 5 unidades de diez mil y 4 unidades de cien mil.
         */


        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero de seis cifras:"));


        if (numero < 100000 || numero > 999999) {
            JOptionPane.showMessageDialog(null, "El número debe tener exactamente seis cifras.");
        } else {

            int unidades = numero % 10;
            int decenas = (numero / 10) % 10;
            int centenas = (numero / 100) % 10;
            int unidadesDeMil = (numero / 1000) % 10;
            int decenasDeMil = (numero / 10000) % 10;
            int centenasDeMil = (numero / 100000) % 10;


            String mensaje = "Número ingresado: " + numero + "\n" +
                    "Unidades: " + unidades + "\n" +
                    "Decenas: " + decenas + "\n" +
                    "Centenas: " + centenas + "\n" +
                    "Unidades de mil: " + unidadesDeMil + "\n" +
                    "Decenas de mil: " + decenasDeMil + "\n" +
                    "Centenas de mil: " + centenasDeMil;

            JOptionPane.showMessageDialog(null, mensaje);
        }



    }
}
