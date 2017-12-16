/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechanacimiento;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo
 */
public class FechaNacimiento {

    public static Integer Calculos(String fecha) {
        Date fechanaciento = null;

        try {
            fechanaciento = new SimpleDateFormat("yyyy").parse(fecha);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        Calendar fechaNac2 = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();
        fechaNac2.setTime(fechanaciento);

        int año = fechaActual.get(Calendar.YEAR)
                - fechaNac2.get(Calendar.YEAR);

        int mes = fechaActual.get(Calendar.MONTH)
                - fechaNac2.get(Calendar.MONTH);

        int dia = fechaActual.get(Calendar.DATE)
                - fechaNac2.get(Calendar.DATE);

        if (mes < 0 || (mes == 0 && dia < 0)) {
            año--;

        }
        return año;

    }

    /**
     * @param args the command line arguments calcular la fecha de nacimiento
     */
    public static void main(String[] args) {
        //String fecha = JOptionPane.showInputDialog(FechaNacimiento.Calculos(""));
        // System.out.println(FechaNacimiento.Calculos("1992"));
        String dato = JOptionPane.showInputDialog("Ingrese Año De Nacimiento para calcular tu edad");
        //JOptionPane.showMessageDialog(null, FechaNacimiento.Calculos(dato));
        JOptionPane.showMessageDialog(null, FechaNacimiento.Calculos(dato), "Tu edad es : ", 0);

    }

}
