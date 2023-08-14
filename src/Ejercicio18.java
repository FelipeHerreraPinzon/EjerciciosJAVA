import javax.swing.*;

public class Ejercicio18 {
    public static void main(String[] args) {
        /*
        Se introduce un cono sólido dentro de cilindro cuya base tiene el mismo diámetro de la base del cono y su
        misma altura. Automatice un proceso que calcule el volumen del espacio que queda libre dentro del cilindro.
        Tu decidirás que variables debe ingresar el usuario.
         */


        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de la base del cono y del cilindro:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del cono y del cilindro:"));


        double volumenCono = (Math.PI * radio * radio * altura) / 3.0;


        double volumenCilindro = Math.PI * radio * radio * altura;


        double volumenEspacioLibre = volumenCilindro - volumenCono;


        String mensaje = "Volumen del espacio libre dentro del cilindro: " + volumenEspacioLibre;
        JOptionPane.showMessageDialog(null, mensaje);




    }
}
