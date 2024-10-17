package clasesobjetos;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;
	
	public Empresa() {
		empleados = new ArrayList<Empleado>();
	}

	public void contratarEmpleado(Empleado e) {
		empleados.add(e);
	}

	public int getTotalEmpleados() {
		return empleados.size();
	}

	public void nombreSalario() {
		for(Empleado e:empleados) {
			System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
		}
	}

	public double getTotalSalarios() {
		double total = 0;
		for(Empleado e:empleados) { 
			total = total + e.getSalario();
		}
		return total;
	}

	public void empleadoMayorSalario() {
		Empleado empMayorSalario = empleados.get(0);
		double maxSalario = empleados.get(0).getSalario();
		for(Empleado e:empleados) {
			if(e.getSalario() > maxSalario) {
				maxSalario = e.getSalario();
				empMayorSalario = e;
			}
		}
		System.out.println("El empleado que mas dinero gana es: ");
		System.out.print("Nombre: " + empMayorSalario.getNombre());
		System.out.print("Cargo: " + empMayorSalario.getCargo());
		System.out.println("Salario: " + empMayorSalario.getSalario());
	}

	public void empleadoMenorSalario() {
		Empleado empMenorSalario = empleados.get(0);
		double menSalario = empleados.get(0).getSalario();
		for(Empleado e:empleados) {
			if(e.getSalario() < menSalario) {
				menSalario = e.getSalario();
				empMenorSalario = e;
			}
		}
		System.out.println("El empleado que menos dinero gana es: ");
		System.out.print("Nombre: " + empMenorSalario.getNombre());
		System.out.print("Cargo: " + empMenorSalario.getCargo());
		System.out.println("Salario: " + empMenorSalario.getSalario());
	}
}
