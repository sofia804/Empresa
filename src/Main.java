import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int edad, horas, opc, op;
        String nombre;
        boolean rep = true;
        List<Empleado> listaEmpleados = new ArrayList<>();

        do {
            System.out.println("  EMPRESA  ");
            System.out.println("1. Agregar empleado ");
            System.out.println("2. Ver lista de todos los empleados");
            System.out.println("3. Salir");
            System.out.print("Elija su opción: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.println("Digite qué tipo de empleado desea agregar ");
                    System.out.println("1. Empleado de planta");
                    System.out.println("2. Empleado por horas");
                    op = teclado.nextInt();
                    teclado.nextLine();

                    if (op == 1) {
                        System.out.println("EMPLEADO DE PLANTA");
                        System.out.print("Ingrese el nombre del empleado: ");
                        nombre = teclado.nextLine();
                        System.out.print("Ingrese la edad del empleado: ");
                        edad = teclado.nextInt();
                        listaEmpleados.add(new EmpleadoPlanta(nombre, edad));
                    } else if (op == 2) {
                        System.out.println("EMPLEADO POR HORAS");
                        System.out.print("Ingrese el nombre del empleado: ");
                        nombre = teclado.nextLine();
                        System.out.print("Ingrese la edad del empleado: ");
                        edad = teclado.nextInt();
                        System.out.print("Ingrese la cantidad de horas trabajadas: ");
                        horas = teclado.nextInt();
                        listaEmpleados.add(new EmpleadoHoras(nombre, edad, horas));
                    }
                }

                case 2 -> {
                    System.out.println("LISTA DE TODOS LOS EMPLEADOS");
                    listaEmpleados.forEach(Empleado::mostrarEmpleados);
                }
                case 3 -> {
                    System.out.println("Saliendo...");
                    rep = false;
                }
            }
        } while (rep);
    }
}
