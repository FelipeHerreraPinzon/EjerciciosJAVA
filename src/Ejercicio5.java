import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        /*
        En un hospital existen tres áreas: Ginecología, Pediatría, Traumatología. El
        presupuesto anual del hospital se reparte conforme a la siguiente tabla:

        Área                      Porcentaje del presupuesto

        Ginecología                      40%
        Traumatología                    30%
        Pediatría                        30%

        Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestal.
         */


        float   presupuesto = 0f;
        double  presupuestoGinecologia;
        double  presupuestoTraumatologia;
        double  presupuestoPediatria;


        presupuesto = Float.parseFloat(JOptionPane.showInputDialog(null, "¿ Cuál es el presupuesto ?"));

        presupuestoGinecologia = presupuesto * 0.40;
        presupuestoTraumatologia = presupuesto * 0.30;
        presupuestoPediatria = presupuesto * 0.30;

        JOptionPane.showMessageDialog(null,"El presupuesto de Ginecologia es : " + presupuestoGinecologia);
        JOptionPane.showMessageDialog(null,"El presupuesto de Traumatología es : " + presupuestoTraumatologia);
        JOptionPane.showMessageDialog(null,"El presupuesto de Pediatría es : " + presupuestoPediatria);



    }
}
