package clases;

public class Estudiante {
    private String nombre;
    private float nota1;
    private float nota2;
    private float notaFinal;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, float nota1, float nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void asignarNotaParcial1(float nota1) {
        this.nota1 = nota1;
    }

    public void asignarNotaParcial2(float nota2) {
        this.nota2 = nota2;
    }

    public float obtenerNotaParcial1() {
        return nota1;
    }

    public float obtenerNotaParcial2() {
        return nota2;
    }

    public String obtenerNombre() {
        return nombre;
    } 

    public void calcularNotaFinal() {
        notaFinal = (nota1 + nota2) / 2;
    }

    public float obtenerNotaFinal() {
        return notaFinal;
    }

    public String obtenerMensaje() {
        if(notaFinal <= 3) {
            return "Reprobo";
        } else {
            return "Aprobo";
        }
    }
}
