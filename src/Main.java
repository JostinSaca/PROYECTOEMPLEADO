public class Main {
    public static void main(String[] args) {

        Sistemas sis = new Sistemas();

        Empleado em1 = sis.informacionEmpleado1();
        Empleado em2 = sis.informacionEmpleado2();


        em1.SalarioAnual();
        em2.SalarioAnual();

        System.out.println("Salario Anual empleado 1: " +em1.SalarioAnual());
        System.out.println("Salario Anual empleado 2: " +em2.SalarioAnual());
        System.out.printf("Aumento empleado 2: " +em2.Aumento());
        System.out.printf("Aumento empleado 1: " +em1.Aumento());

    }

}
