import javax.swing.*;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        Solicitar al usuario que ingrese su nombre, ejemplo pepito. A continuación, se debe mostrar en
        pantalla el texto Ahora estás en la matrix, ¡¡¡pepito...!!!”
         */


        String nombre = JOptionPane.showInputDialog("Ingrese nombre de persona: ");

        JOptionPane.showMessageDialog(null, "Ahora estás en la MATRIX " + nombre);








    }
}
