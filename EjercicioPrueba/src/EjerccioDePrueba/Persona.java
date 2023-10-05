package EjerccioDePrueba;

public class Persona {
    // atributos
    private String nombre;
    private int edad;
    //constructores


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //metodos o comportamientos
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("edad: "+edad);
    }
}
