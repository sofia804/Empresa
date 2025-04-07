public class EmpleadoHoras extends Empleado {

    private int pagoHora = 98000;
    private int horas;

    public EmpleadoHoras(String nombre, int edad, int horas) {
        super(nombre, edad);
        this.horas = horas;
    }

    @Override
    public int calcularSalario() {
        return pagoHora * horas;
    }

    @Override
    public void mostrarEmpleados() {
        super.mostrarEmpleados();
        System.out.println("Tipo de empleado: Por horas");
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Pago por hora: $" + pagoHora);
        System.out.println("Salario: $" + calcularSalario());
    }
}
