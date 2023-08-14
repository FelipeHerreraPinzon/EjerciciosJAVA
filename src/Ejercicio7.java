import javax.swing.*;

public class Ejercicio7 {

    public static void main(String[] args) {

         /*
        Todos los lunes, miércoles y viernes, una persona corre la misma ruta y cronometra
        los tiempos obtenidos. Determinar el tiempo promedio que la persona tarda en
        recorrer la ruta en una semana cualquiera
         */

        float tiempoLunes;
        float tiempoMiercoles;
        float tiempoViernes;
        float tiempoPromedio;

        tiempoLunes = Float.parseFloat(JOptionPane.showInputDialog(null, "¿ Cuál fue el tiempo del LUNES ?"));
        tiempoMiercoles = Float.parseFloat(JOptionPane.showInputDialog(null, "¿ Cuál fue el tiempo del MIERCOLES ?"));
        tiempoViernes = Float.parseFloat(JOptionPane.showInputDialog(null, "¿ Cuál fue el tiempo del VIERNES ?"));

        tiempoPromedio = (tiempoLunes + tiempoMiercoles + tiempoViernes ) /3 ;

        JOptionPane.showMessageDialog(null,"El tiempo promedio es : " + tiempoPromedio);


    }

}
