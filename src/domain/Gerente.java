package domain;

public class Gerente extends Empleado {

    private String departamento; //No tiene subclases en este ejercicio, se pone como privado

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Departamento: " + departamento;
    }
}
