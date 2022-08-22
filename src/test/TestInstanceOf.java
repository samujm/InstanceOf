package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        //--------------------------------------------------------------《 INSTANCEOF 》------------------------------------------------------------------------------------
        //----------- ▀ Significa que vamos a poder determinar el tipo en tiempo de ejecución, de que tipo es la referencia a la que está apuntando la variable -------------------
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        //empleado = new Gerente("Karla", 50, "Contabilidad"); //Reutilizando la variable ya que es de un tipo compatible (padre), ya que importa la referencia
    }

    public static void determinarTipo(Empleado empleado) { //Es static por que se está mandando llamar desde el metodo static
        
        //Se utiliza else if ya que responde que es de varios tipos si solo ponemos if
        
        //SE LEE: La variable EMPLEADO esta apuntando a un objeto en memoria de tipo GERENTE
        if (empleado instanceof Gerente) {//Comenzar a preguntar por la clase hija
            System.out.println("Es de tipo gerente");
        } else if (empleado instanceof Empleado) { //Continuar a preguntar por la clase padre
            System.out.println("Es de tipo empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }
}
