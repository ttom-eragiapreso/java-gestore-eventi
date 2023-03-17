import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Evento eventoProva = new Evento("RHCP", LocalDate.of(2023, 10, 28), 5);
            System.out.println(eventoProva);
            eventoProva.prenota();
            System.out.println(eventoProva.getPrenotazioni());
            for (int i = 0; i < 4; i++) {
                eventoProva.prenota();
            }
            System.out.println(eventoProva.getPrenotazioni());

            for (int i = 0; i < eventoProva.getCapienza(); i++) {
                eventoProva.disdici();
            }
            System.out.println(eventoProva.getPrenotazioni());


        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }
}