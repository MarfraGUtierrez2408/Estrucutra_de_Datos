import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Programa {

    public static void main (String[]args)throws FileNotFoundException {

        System.out.println("Programa de Nomina");
        File archivo = new File("junio.dat");
        Scanner lector = new Scanner(archivo);

        ListaTrabajadores lista = new ListaTrabajadores(14);

        lector.nextLine();

        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            String[] datos = linea.split(",");

            Trabajador trabajador = new Trabajador(
                    Integer.parseInt(datos[0]),
                    datos[1],
                    datos[2],
                    datos[3],
                    Double.parseDouble(datos[4]),
                    Double.parseDouble(datos[5]),
                    Integer.parseInt(datos[6])
            );

            lista.agregar(trabajador);
        }

        lector.close();

        System.out.println("Trabajadores guardados: " + lista.obtenerCantidad());

        int anioActual = java.time.Year.now().getValue();

        for (int posicion = 0; posicion < lista.obtenerCantidad(); posicion++) {
            Trabajador trabajador = lista.obtener(posicion);

            System.out.println(trabajador.mostrarDatos(anioActual));
            System.out.println("||-----------------------------------------||");
        }

        Trabajador mayor = lista.obtenerMayorAntiguedad(anioActual);
        Trabajador menor = lista.obtenerMenorAntiguedad(anioActual);

        System.out.println("\nTRABAJADOR CON MAYOR ANTIGUEDAD +++++++++++++++++++++++++++++++++++");
        System.out.println(mayor.mostrarDatos(anioActual));

        System.out.println("\nTRABAJADOR CON MENOR ANTIGUEDAD ///////////////////////////////////");
        System.out.println(menor.mostrarDatos(anioActual));
    }
}
