package JavaSchool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Nota> listaNotas = new ArrayList();

        Nota est1, est2, est3, est4, est5;
        est1 = new Nota(5.3, "Matematicas", new Fecha("13-06-2021"), "123-9", "Constanza Ocares",
                new Carrera("Contabilidad"));
        listaNotas.add(est1);

        est2 = new Nota(6.8, "Matematicas", new Fecha("13-06-2021"), "456-8", "Juan Cayul",
                new Carrera("Contabilidad"));
        listaNotas.add(est2);

        est3 = new Nota(5.1, "Lenguaje", new Fecha("10-06-2021"), "987-2", "Tamara Muñoz",
                new Carrera("Telecomunicaciones"));
        listaNotas.add(est3);

        est4 = new Nota(7.0, "Lenguaje", new Fecha("10-06-2021"), "192-5", "Daniel Rojas",
                new Carrera("Administración"));
        listaNotas.add(est4);

        est5 = new Nota(3.5, "Matematicas", new Fecha("13-06-2021"), "625-4", "Bárbara Baeza",
                new Carrera("Telecomunicaciones"));
        listaNotas.add(est5);

        int largoLista = listaNotas.size();
        System.out.println("Cantidad de estudiantes: " + largoLista);

        System.out.println("Listado de Estudiantes: ");
        for (int i = 0; i < listaNotas.size(); i++) {
            listaNotas.get(i).mostrarNota();
            System.out.println("");

        }

    }
}
