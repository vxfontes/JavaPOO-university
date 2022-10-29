package aula6.agenda;

import java.util.LinkedList;

/**
 *
 * @author vxfontes
 */
public class Main {

    public static void main(String[] args) {
        LinkedList<Contato> agenda = new LinkedList<>();
        agenda.add(new Contato("nome teste", "43434", "detalhes"));

//        for (Contato contato : agenda) {
//            System.out.println(contato.toString());
//        }

        agenda.stream().map(Contato::toString).forEach(System.out::println);
    }
}
