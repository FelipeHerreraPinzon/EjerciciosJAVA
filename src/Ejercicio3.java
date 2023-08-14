import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
          Calcular el número de pulsaciones que una persona debe tener por cada 10 segundos
          de ejercicio, si la fórmula es:
          Número de pulsaciones = (220 - edad)/10
         */

         byte edad;
         int numeroPulsaciones = 0;

        JOptionPane.showMessageDialog(null,"Vamos a calcular el número de pulsaciones que una persona debe tener por cada 10 segundos\n" +
                "de ejercicio");

        edad = Byte.parseByte(JOptionPane.showInputDialog(null, "¿ Cuál es la edad de la persona ?"));

        numeroPulsaciones = (220-edad)/10;

        JOptionPane.showMessageDialog(null,"el número de pulsaciones que una persona debe tener por cada 10 segundos\n" +
                "de ejercicio es " + numeroPulsaciones);


    }
}
