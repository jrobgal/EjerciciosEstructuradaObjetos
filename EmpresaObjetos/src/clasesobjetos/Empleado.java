package clasesobjetos;

public class Empleado {
	private String nombre;
	private String cargo;
	private double salario;

	public Empleado() {

	}

	public Empleado(String nom, String car, double sal) {
		this.nombre = nom;
		this.cargo = car;
		this.salario = sal;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setCargo(String car) {
		this.cargo = car;
	}

	public String getCargo() {
		return cargo;
	}

	public void setSalario(double sal) {
		this.salario = sal;
	}

	public double getSalario() {
		return salario;
	}
}
