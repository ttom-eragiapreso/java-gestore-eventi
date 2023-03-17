import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
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
        /*Scanner scan = new Scanner(System.in);

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

            System.out.println("Evento creato!");
            System.out.println("Quanti biglietti vuoi prenotare?");
            int bigliettiPrenotazione = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < bigliettiPrenotazione; i++) {
                secondoTest.prenota();
            }

            System.out.println(secondoTest.getCapienza() + " Capienza -" + secondoTest.getPrenotazioni() +
                    " - Prenotazioni");

            System.out.println("Quanti biglietti vuoi disdire?");
            int bigliettiDaDisdire = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < bigliettiDaDisdire; i++) {
                secondoTest.disdici();
            }

            System.out.println(secondoTest.getCapienza() + "Capienza -" + secondoTest.getPrenotazioni() +
                    " - Prenotazioni");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        //Terzo test

        Concerto rhcp = new Concerto("RHCP", LocalDate.of(2023, 12, 10), 500, LocalTime.of(21,30),
                new BigDecimal(115));

        System.out.println(rhcp);
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Evento creato!");
            System.out.println("Quanti biglietti vuoi prenotare?");
            int bigliettiPrenotazione = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < bigliettiPrenotazione; i++) {
                rhcp.prenota();
            }

            System.out.println(rhcp.getCapienza() + " Capienza -" + rhcp.getPrenotazioni() +
                    " - Prenotazioni");

            System.out.println("Quanti biglietti vuoi disdire?");
            int bigliettiDaDisdire = Integer.parseInt(scan.nextLine());

            for (int i = 0; i < bigliettiDaDisdire; i++) {
                rhcp.disdici();
            }

            System.out.println(rhcp.getCapienza() + "Capienza -" + rhcp.getPrenotazioni() +
                    " - Prenotazioni");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}