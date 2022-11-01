package aula6.agenda;

/**
 *
 * @author vanessa e filipe
 */
public class Main {

    public static void main(String[] args) {
        
          AgendaAdicionar.main(args);
          Agenda.adiciona("nome 1", "telefone", "detalhes");
          Agenda.adiciona("nome 2", "telefone", "detalhes");
          Agenda.adiciona("nome 3", "telefone", "detalhes");
          Agenda.visualizar();
          Agenda.remover(2);
          Agenda.visualizar();
    }
}
