import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgrammaEventi {
    private String titolo;
    private List<Evento> eventi;

    public ProgrammaEventi(String titolo) {
        this.titolo = titolo;
        eventi = new ArrayList<>();
    }

    public void aggiungiEvento(Evento evento){
        eventi.add(evento);
    }

    public List<Evento> getEventiStessaData(LocalDate data){
        List<Evento> eventiCoincidenti = new ArrayList<>();
        for (Evento e : eventi) if (e.getData().isEqual(data)) eventiCoincidenti.add(e);

        return eventiCoincidenti;
    }

    public int getTuttiEventi(){
        return eventi.size();
    }

    public void svoutaLista(){
        eventi = new ArrayList<>();
    }


}
