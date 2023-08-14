import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {

        /*
      Tres personas deciden invertir su dinero para fundar una empresa. Cada una de ellas
      invierte una cantidad distinta. Obtener el porcentaje que cada quien invierte con
      respecto a la cantidad total invertida

    */

        // Obtener las cantidades de inversión de las tres personas
        double inversionPersona1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la inversión de la Persona 1:"));
        double inversionPersona2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la inversión de la Persona 2:"));
        double inversionPersona3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la inversión de la Persona 3:"));

        // Calcular el total de la inversión
        double totalInversion = inversionPersona1 + inversionPersona2 + inversionPersona3;

        // Calcular los porcentajes de inversión de cada persona
        double porcentajePersona1 = (inversionPersona1 / totalInversion) * 100;
        double porcentajePersona2 = (inversionPersona2 / totalInversion) * 100;
        double porcentajePersona3 = (inversionPersona3 / totalInversion) * 100;

        // Mostrar los resultados
        String mensaje =
                "Inversión Persona 1: $" + inversionPersona1 + " (" + porcentajePersona1 + "%)\n" +
                        "Inversión Persona 2: $" + inversionPersona2 + " (" + porcentajePersona2 + "%)\n" +
                        "Inversión Persona 3: $" + inversionPersona3 + " (" + porcentajePersona3 + "%)\n" +
                        "Total de Inversión: $" + totalInversion;

        JOptionPane.showMessageDialog(null, mensaje);



    }
}
