import javax.swing.JOptionPane;

import clases.*;

public class AppNotasObjetos {
    public static void main(String[] args) throws Exception {
        /*Estudiante est = new Estudiante("Carlos Rodriguez", Float.parseFloat("2.5"), Float.parseFloat("5.0"));
        Estudiante est1 = new Estudiante("Santiago Ibañez", Float.parseFloat("2.5"), Float.parseFloat("3.0"));
        est.calcularNotaFinal();
        est1.calcularNotaFinal();
        System.out.println("El estudiante " + est.obtenerNombre() + " obtuvo una nota final de " + est.obtenerNotaFinal() 
        + " por consiguiente " + est.obtenerMensaje());*/
        Estudiante est;
        for(int i = 0; i < 2; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante: ");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 1 del estudiante"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 2 del estudiante"));
            est = new Estudiante(nombre);
            est.asignarNotaParcial1(nota1);
            est.asignarNotaParcial2(nota2);
            est.calcularNotaFinal();
            System.out.println("El estudiante " + est.obtenerNombre() + " obtuvo una nota final de " + est.obtenerNotaFinal() 
            + " por consiguiente " + est.obtenerMensaje());
        }
        
    }
}
