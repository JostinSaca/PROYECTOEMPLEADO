public class Empleado {


    private String nombre;
    private String apellidoP;
    private double salarioM;
    private double pagoAnual;

    public Empleado(String nombre, String apellidoP, double salarioM) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.salarioM = salarioM;
    }



    public double SalarioAnual(){
        pagoAnual = salarioM * 12;
        return pagoAnual;
    }

    public double Aumento(){
        double porcentaje= pagoAnual * 0.10;
        double aumento = pagoAnual + porcentaje;

        return aumento;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public double getSalarioM() {
        return salarioM;
    }

    public void setSalarioM(double salarioM) {
        this.salarioM = salarioM;
    }
}
