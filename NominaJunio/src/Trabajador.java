public class Trabajador {

    private int numero;
    private String nombres;
    private String paterno;
    private String materno;
    private double horasExtra;
    private double sueldoBase;
    private int anioIngreso;

    public Trabajador(int numero, String nombres, String paterno, String materno,
                      double horasExtra, double sueldoBase, int anioIngreso) {

         this.numero=numero;
         this.nombres=nombres;
         this.paterno=paterno;
         this.materno=materno;
         this.horasExtra=horasExtra;
         this.sueldoBase=sueldoBase;
         this.anioIngreso=anioIngreso;

    }

    public String obtenerNombreCompleto(){
        return nombres + " " + paterno + " " + materno;

    }

    public int calcularAntiguedad(int anioActual){
        return anioActual- anioIngreso;

    }

    public double calcularSueldo(int anioActual){
        double pagoHorasExtra = horasExtra * 276.5;
        double porcetajePrestacion = calcularAntiguedad(anioActual) * 0.03;
        double prestacion = sueldoBase * porcetajePrestacion;
        return sueldoBase + pagoHorasExtra + prestacion;
    }

    public String mostrarDatos(int anioActual){
        return "Numero" + numero
                + "\nNombre: " + obtenerNombreCompleto()
                + "\nHoras extra: " + horasExtra
                + "\nSueldo base: $" + sueldoBase
                + "\nAño de ingreso: " + anioIngreso
                + "\nAntigüedad: " + calcularAntiguedad(anioActual) + " años"
                + "\nSueldo a pagar: $" + calcularSueldo(anioActual);


    }
}
