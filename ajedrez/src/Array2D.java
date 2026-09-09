public class Array2D {

    private char [][] datos;
    public  Array2D(int filas, int columnas){
        datos = new char [filas][columnas];
    }

    public void setElemento(int fila, int columna, char valor){
        datos[fila][columna] = valor;
    }

    public char getElemento(int fila, int columna){
        return datos[fila][columna];
    }

}