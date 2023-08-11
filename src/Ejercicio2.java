import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*
        La presión, el volumen y la temperatura de una masa de aire se relacionan por la
          fórmula:
          Masa = (presión * volumen)/(0.37 * (temperatura + 460)
        */

        float masa;
        float presion = 0;
        float volumen = 0;
        float temperatura = 0;

        JOptionPane.showMessageDialog(null,"Vamos a calcular la masa");
        presion = Float.parseFloat(JOptionPane.showInputDialog(null, "¿ Cuál es la presión ?"));
        volumen = Float.parseFloat(JOptionPane.showInputDialog(null, "¿ Cuál es el volumen ?"));
        temperatura = Float.parseFloat(JOptionPane.showInputDialog(null, "¿ Cuál es la temperatura ?"));

        masa = (float) ((presion * volumen)/(0.37 * (temperatura + 460)));

        JOptionPane.showMessageDialog(null,"La masa es " + masa);

    }
}
