import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int capienza;
    private int prenotazioni = 0;

    public Evento(String titolo, LocalDate data, int capienza) {

        if(data.isBefore(LocalDate.now())){
            throw new DateTimeException("Non puoi creare un evento per una data passata");
        }
        if(capienza < 1){
            throw new IllegalArgumentException("Non puoi creare un evento con una capienza di 0 o meno");
        }
        this.titolo = titolo;
        this.data = data;
        this.capienza = capienza;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getCapienza() {
        return capienza;
    }

    public int getPrenotazioni() {
        return prenotazioni;
    }

    public void prenota(){
        if(prenotazioni >= capienza){
            throw new ExceedCapacityException("Non è possibile più prenotare, raggiunta la capienza massima");
        }
        if(data.isBefore(LocalDate.now())){
            throw new DateTimeException("L'evento è già terminato.");
        }
        prenotazioni++;
    }

    public void disdici(){
        if(prenotazioni < 1){
            throw new RuntimeException("Non ci sono al momento prenotazioni per questo evento.");
        }
        if(data.isBefore(LocalDate.now())){
            throw new DateTimeException("L'evento è già terminato.");
        }
        prenotazioni--;
    }

    @Override
    public String toString() {
        return formatData(data) + " - " + titolo;
    }

    protected String formatData(LocalDate data){
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}

