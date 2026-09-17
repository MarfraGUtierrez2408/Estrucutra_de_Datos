
public class ListaEnlazada {

public static void main(String[]args){
   Nodo<String> n1 = new Nodo<>("Al");
    Nodo<String> n2 = new Nodo<>("B");
    Nodo<String> n3 = new Nodo<>("C");
    Nodo<String> n4 = new Nodo<>("De");
    Nodo<String> n5 = new Nodo<>("Mc");
    Nodo<String> n6 = new Nodo<>("Zi");

    n1.setSiguiente(n2);
    n2.setSiguiente(n3);
    n3.setSiguiente(n4);
    n4.setSiguiente(n5);
    n5.setSiguiente(n6);

    System.out.println("------ESTADO INICIAL----");
    imprimirLista(n1);
    //.........................................................

    System.out.println("\n------PRIMER NODO----\n"+ n1.getDato());
    //...........................................................

    System.out.println("\n------ESTADO ULTIMO NODO----\n"+n6.getDato());
    System.out.println("\n------COMPLETO----\n"+n6.getSiguiente());
    //..........................................................

    Nodo<String> fe = new Nodo<>("Fe");
    fe.setSiguiente(n4.getSiguiente());
    n4.setSiguiente(fe);
    System.out.println("\n------NUEVO NODO (Fe), ENTRE De y Mc");
    imprimirLista(n1);
//...............................................................
    Nodo<String> zz = new Nodo<>("Zz");
    n6.setSiguiente(zz);
    System.out.println("\n------NUEVO NODO FINAL (Zz)----\n");
    imprimirLista(n1);
//.................................................................
    Nodo<String> aa = new Nodo<>("Aa");
    aa.setSiguiente(n1);
    n1= aa;
    System.out.println("\n------NUEVO NODO INICIAL----\n");
    imprimirLista(n1);


}
static void imprimirLista(Nodo<String> inicio){
    Nodo<String> actual = inicio;
    int pos = 1;
    while (actual != null){
        System.out.println(" NODO "+pos+"; DATO = "+actual.getDato()+" SIGUIENTE =" +
                (actual.getSiguiente() != null ? actual.getSiguiente().getDato() : "null"));

        actual= actual.getSiguiente();
        pos++;
    }
}
}
