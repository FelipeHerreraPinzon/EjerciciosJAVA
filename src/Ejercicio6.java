import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
        El dueño de una tienda compra un artículo a un precio determinado. Obtener el precio
        en que lo debe vender para obtener una ganancia del 30%.
        */

        float precioInicial;
        float precioFinal = 0;

        precioInicial = Float.parseFloat(JOptionPane.showInputDialog(null, "¿ Cuál es el precio inicial ?"));

        precioFinal = precioInicial + (precioInicial * 0.30f);

        JOptionPane.showMessageDialog(null,"El precio para vender debe ser : " + precioFinal);



    }
}
