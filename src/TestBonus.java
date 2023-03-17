import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestBonus {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Titolo 1", LocalDate.of(2024, 10, 25), 500);
        Evento evento2 = new Evento("Titolo 2", LocalDate.of(2024, 10, 25), 500);
        Evento evento3 = new Evento("Titolo 3", LocalDate.of(2024, 10, 25), 500);
        Evento evento4 = new Evento("Titolo 4", LocalDate.of(2024, 8, 25), 500);

        Concerto concerto1 = new Concerto("Concerto 1", LocalDate.of(2023,10,28), 1500, LocalTime.of(21, 45),
                new BigDecimal(125));
        Concerto concerto2 = new Concerto("Concerto 2", LocalDate.of(2023,10,28), 1500, LocalTime.of(21, 45),
                new BigDecimal(125));
        Concerto concerto3 = new Concerto("Concerto 3", LocalDate.of(2023,10,21), 1500, LocalTime.of(21, 45),
                new BigDecimal(125));
        Concerto concerto4 = new Concerto("Concerto 4", LocalDate.of(2023,10,20), 1500, LocalTime.of(21, 45),
                new BigDecimal(125));
        Concerto concerto5 = new Concerto("Concerto 5", LocalDate.of(2023,10,21), 1500, LocalTime.of(21, 45),
                new BigDecimal(125));


        ProgrammaEventi programma = new ProgrammaEventi("Rock in Roma");

        programma.aggiungiEvento(evento1);
        programma.aggiungiEvento(evento2);
        programma.aggiungiEvento(evento3);
        programma.aggiungiEvento(evento4);
        programma.aggiungiEvento(concerto1);
        programma.aggiungiEvento(concerto2);
        programma.aggiungiEvento(concerto3);
        programma.aggiungiEvento(concerto4);
        programma.aggiungiEvento(concerto5);

        System.out.println(programma.getTuttiEventi());
        System.out.println(programma.getEventiStessaData(LocalDate.of(2024, 10, 25)));

        programma.svoutaLista();

        System.out.println(programma.getTuttiEventi());
    }
}
