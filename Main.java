import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args) {
        Set<String> marco= new HashSet<>();
        marco.add("POO");
        marco.add("GENERO");
        marco.add("TLRID");
        marco.add("LABORATORIO");
        marco.add("BASES DE DATOS");
//---------------------------------------------------
        Set<String> sebas = new HashSet<>();
        sebas.add("POO");
        sebas.add("MATEMATICAS APLICADAS");
        sebas.add("PEOGRAMACION WEB");
        sebas.add("ADMINISTRACION DE PROYECTOS");
        sebas.add("BASES DE DATOS");
//.....................................................
        System.out.println("Materias de Marco: "+marco);
        System.out.println("Materias de Sebastian: "+sebas);


        Set<String> union = new HashSet<>(marco);
        union.retainAll(sebas);
        System.out.println("Todas las materias que lleva al mneos uno: "+ union);

        Set<String> comun = new HashSet<>(marco);
        comun.retainAll(sebas);
        System.out.println("Materias en comun entre Sebas Y Marco: "+comun);

        Set<String> MarcoSolo = new HashSet<>(marco);
        MarcoSolo.removeAll(sebas);
        System.out.println("Materias de Marco: " + MarcoSolo);

        Set<String> SebasSolo = new HashSet<>(sebas);
        SebasSolo.removeAll(marco);
        System.out.println("Materias de Sebastian: " + SebasSolo);

        System.out.println("\nMarco cursa Poo? " + marco.contains("POO"));
        System.out.println("Sebas cursa Genero? " + sebas.contains("GENERO"));

        System.out.println("Total de materias distintas: " + union.size());



    }
}