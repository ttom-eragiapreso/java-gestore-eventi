import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Primo test positivo
       /* try {
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
        }*/


        //Secondo test
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo evento: ");
        System.out.println("Titolo: ");
        String titolo = scan.nextLine();
        System.out.println("Data: (YYYY-mm-dd)");
        LocalDate data = LocalDate.parse(scan.nextLine());
        System.out.println("Capienza: ");
        int capienza = Integer.parseInt(scan.nextLine());

        try {
            Evento secondoTest = new Evento(titolo, data, capienza);
            System.out.println(secondoTest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}