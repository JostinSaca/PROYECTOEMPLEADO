import java.util.Scanner;

public class Sistemas {

    Scanner sc;

    public Sistemas(){
        sc = new Scanner(System.in);
    }


    public Empleado informacionEmpleado1(){
        System.out.println("Ingrese los datos del Usuario:");
        System.out.print("Ingrese el primer nombre:");
        String nombre= sc.next();
        System.out.print("Ingrese el Apellido Paterno:");
        String apellidoP = sc.next();
         double salarioM;
        do {
            System.out.print("Ingrese su salario Mensual: ");
            salarioM = sc.nextDouble();

            if (salarioM <= 0) {
                System.out.println("Error: salario no válido.");
            }

        } while (salarioM < 0);

        return new Empleado(nombre, apellidoP, salarioM);
    }
    public Empleado informacionEmpleado2(){
        System.out.println("Ingrese los datos del Usuario 2:");
        System.out.print("Ingrese el primer nombre:");
        String nombre= sc.next();
        System.out.print("Ingrese el Apellido Paterno:");
        String apellidoP = sc.next();
         double salarioM;
        do {
            System.out.print("Ingrese su salario Mensual: ");
            salarioM = sc.nextDouble();

            if (salarioM <= 0) {
                System.out.println("Error: salario no válido.");
            }

        } while (salarioM < 0);

        return new Empleado(nombre, apellidoP, salarioM);
    }




}
