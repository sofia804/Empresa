public class Empleado {

    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int calcularSalario(){
        return 0;
    }

   public void mostrarEmpleados(){
       System.out.println("--------------------------");
       System.out.println("Nombre: " + nombre);
       System.out.println("Edad: " + edad);

   }

}
