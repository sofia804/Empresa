public class EmpleadoPlanta extends Empleado{

    private int salario = 2100000;

    public EmpleadoPlanta(String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }


    @Override
    public int calcularSalario() {
        return salario;
    }

    @Override
    public void mostrarEmpleados() {
        super.mostrarEmpleados();
        System.out.println("Tipo de empleado: Planta");
        System.out.println("Salario: $" + calcularSalario());
    }
}
