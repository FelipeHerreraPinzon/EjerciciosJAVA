import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        /*
        Dada una cantidad en pesos, obtener la equivalencia en dólares,
        asumiendo que la
        unidad cambiaría es un dato desconocido.
        */

        double precioDolar;
        double canntidadDolares;
        double catidadConvertida;

        try{

            JOptionPane.showMessageDialog(null,"Vamos a convertir de Dolares a Pesos");
            precioDolar = Double.parseDouble(JOptionPane.showInputDialog(null, "¿ Cuál es el precio del dolar hoy ?"));
            canntidadDolares = Double.parseDouble(JOptionPane.showInputDialog(null, "¿ Cuántos dolares tienes ?"));
            catidadConvertida = precioDolar * canntidadDolares;
            JOptionPane.showMessageDialog(null,"Tu dinero en pesos es " + catidadConvertida + "pesos");

        } catch(NumberFormatException e){

            JOptionPane.showMessageDialog(null,"¡¡¡ Debes ingresar solo números !!!");
            main(args);
            return;
            //System.exit(0);
        }

    }
}
