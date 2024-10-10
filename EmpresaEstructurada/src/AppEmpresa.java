import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppEmpresa {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> cargos = new ArrayList<String>();
        ArrayList<Double> salarios = new ArrayList<Double>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados"));

        for(int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
            String cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));

            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);
        }

            System.out.println("El numero de empleados es " + cantidad);

            System.out.println("Los nombres y los salarios de los empleados son:");
            for(int i = 0; i < cantidad; i++) {
                System.out.println("Nombre: " + nombres.get(i) + " Salario: " + salarios.get(i));
            }

            System.out.println("Total de salarios pagados a todos los empleados:");
            double total = 0;
            for(int i = 0; i < cantidad; i++) {
                total = total + salarios.get(i);
            }
            System.out.println("El total de dinero pagado a todos los empleados es: " + total);

            System.out.println("El empleado que mas dinero gana es:");
            double mayorSalario = salarios.get(0);
            int posicion = 0;
            for(int i = 1; i < cantidad; i++) {
                if(salarios.get(i) > mayorSalario) {
                    mayorSalario = salarios.get(i);
                    posicion = i;
                }
            }
            System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) + 
            " Salario: " + salarios.get(posicion));
    }
}    
