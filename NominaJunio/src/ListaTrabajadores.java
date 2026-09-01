public class ListaTrabajadores {

    private Trabajador[] trabajadores;
    private int cantidad;

    public ListaTrabajadores(int capacidad) {
        trabajadores = new Trabajador[capacidad];
        cantidad = 0;
    }

    public void agregar(Trabajador trabajador) {
        if (cantidad < trabajadores.length) {
            trabajadores[cantidad] = trabajador;
            cantidad++;
        }
        }
        public Trabajador obtener ( int posicion){
            if (posicion >= 0 && posicion < cantidad) {
                return trabajadores[posicion];
            }

            return null;
        }

        public int obtenerCantidad () {
            return cantidad;
        }
    public Trabajador obtenerMayorAntiguedad(int anioActual) {
        Trabajador mayor = trabajadores[0];

        for (int posicion = 1; posicion < cantidad; posicion++) {
            if (trabajadores[posicion].calcularAntiguedad(anioActual)
                    > mayor.calcularAntiguedad(anioActual)) {

                mayor = trabajadores[posicion];
            }
        }

        return mayor;
    }

    public Trabajador obtenerMenorAntiguedad(int anioActual) {
        Trabajador menor = trabajadores[0];

        for (int posicion = 1; posicion < cantidad; posicion++) {
            if (trabajadores[posicion].calcularAntiguedad(anioActual)
                    < menor.calcularAntiguedad(anioActual)) {

                menor = trabajadores[posicion];
            }
        }

        return menor;
    }
    }



