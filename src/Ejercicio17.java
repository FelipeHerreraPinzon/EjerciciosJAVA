import javax.swing.*;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*
        Se desea automatizar el proceso de calcular el área y volumen de un cono cuyo radio es r y su altura es h
         */


        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del cono (r):"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cono (h):"));


        double areaLateral = Math.PI * radio * Math.sqrt(radio * radio + altura * altura);


        double areaTotal = Math.PI * radio * (radio + Math.sqrt(radio * radio + altura * altura));


        double volumen = (Math.PI * radio * radio * altura) / 3.0;


        JOptionPane.showMessageDialog(null, "El área lateral del cono es: " + areaLateral);
        JOptionPane.showMessageDialog(null, "El área total del cono es: " + areaTotal);
        JOptionPane.showMessageDialog(null, "El volumen del cono es: " + volumen);

    }
}
