import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {

    /*
     Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su
     salario anterior
    */

        float salarioInicial = 0f;
        salarioInicial = Float.parseFloat(JOptionPane.showInputDialog(null, "¿ Cuál es el salario del obrero ?"));


        float salarioFinal = (salarioInicial + (salarioInicial * 0.25f));
        JOptionPane.showMessageDialog(null,"El salario con aumento es: " + salarioFinal);

    }
}
