public class Ajedrez {

    public static void main(String[] args) {
        Array2D tablero = new Array2D(8, 8);

        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                tablero.setElemento(fila, columna, '\u0020');
            }
        }
        System.out.println("Prueba");
        tablero.setElemento(0, 0, '\u265C');
        tablero.setElemento(0, 1, '\u265E');
        tablero.setElemento(0, 2, '\u265D');
        tablero.setElemento(0, 3, '\u265B');
        tablero.setElemento(0, 4, '\u265A');
        tablero.setElemento(0, 5, '\u265D');
        tablero.setElemento(0, 6, '\u265E');
        tablero.setElemento(0, 7, '\u265C');

        for (int columna = 0; columna < 8; columna++) {
            tablero.setElemento(1, columna, '\u265F');
        }
        for (int columna = 0; columna < 8; columna++) {
            tablero.setElemento(6, columna, '\u2659');
        }

        tablero.setElemento(7, 0, '\u2656');
        tablero.setElemento(7, 1, '\u2658');
        tablero.setElemento(7, 2, '\u2657');
        tablero.setElemento(7, 3, '\u2655');
        tablero.setElemento(7, 4, '\u2654');
        tablero.setElemento(7, 5, '\u2657');
        tablero.setElemento(7, 6, '\u2658');
        tablero.setElemento(7, 7, '\u2656');
        System.out.println("JAQUE MATE°3°");


        for (int fila = 0; fila < 8; fila++) {
            System.out.print((8 - fila) + "  ");


            for (int columna = 0; columna < 8; columna++) {
                System.out.print(tablero.getElemento(fila, columna) + "  ");
            }

            System.out.println();
        }
    }
}