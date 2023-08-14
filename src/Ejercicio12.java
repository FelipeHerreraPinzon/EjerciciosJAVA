import javax.swing.*;

public class Ejercicio12 {

    public static void main(String[] args) {
        /*
        Pedir una cantidad de euros, una tasa de interés y un número de años. Muestra por pantalla en
cuánto se habrá convertido el capital inicial transcurridos esos años si cada año se aplica la tasa
de interés introducida. (interés compuesto).

         */


        double capitalInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital inicial en euros:"));
        double tasaInteres = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de interés anual (%):")) / 100.0;
        int numeroAnios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de años:"));

        double montoTotal = capitalInicial * Math.pow(1 + tasaInteres, numeroAnios);

        String mensaje = "El monto total después de " + numeroAnios + " años será: " + montoTotal + " euros";
        JOptionPane.showMessageDialog(null, mensaje);


    }

}
