import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*
        Un alumno desea saber cuál será su promedio general en las tres materias más
difíciles que cursa y cuál será el promedio que obtendrá en cada una de ellas. Estas
materias se evalúan como se muestra a continuación:

La calificación de Matemáticas se obtiene de la siguiente manera:
Examen 90%
Promedio de tareas 10%
En esta materia se pidió un total de tres tareas.


La calificación de Física se obtiene de la siguiente manera:
Examen 80%
Promedio de tareas 20%
En esta materia se pidió un total de dos tareas.


La calificación de Química se obtiene de la siguiente manera:
Examen 85%
Promedio de tareas 15%
En esta materia se pidió un promedio de tres tareas

         */


        // Matemáticas
        double examenMatematicas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del examen de Matemáticas:"));
        double promedioTareasMatematicas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio de tareas de Matemáticas:"));

        // Física
        double examenFisica = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del examen de Física:"));
        double promedioTareasFisica = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio de tareas de Física:"));

        // Química
        double examenQuimica = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación del examen de Química:"));
        double promedioTareasQuimica = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio de tareas de Química:"));

        // Calcular los promedios generales
        double promedioGeneral = (examenMatematicas + examenFisica + examenQuimica) / 3;

        // Mostrar los resultados
        String mensaje =
                "Promedio de Matemáticas: " + ((examenMatematicas * 0.9) + (promedioTareasMatematicas * 0.1)) + "\n" +
                        "Promedio de Física: " + ((examenFisica * 0.8) + (promedioTareasFisica * 0.2)) + "\n" +
                        "Promedio de Química: " + ((examenQuimica * 0.85) + (promedioTareasQuimica * 0.15)) + "\n" +
                        "Promedio General: " + promedioGeneral;

        JOptionPane.showMessageDialog(null, mensaje);








    }
}
