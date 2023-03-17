import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento{
    private LocalTime ora;
    private BigDecimal prezzo;

    public Concerto(String titolo, LocalDate data, int capienza, LocalTime ora, BigDecimal prezzo) {
        super(titolo, data, capienza);
        this.ora = ora;
        this.prezzo = prezzo;
    }

    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Evento in data: " + formatData(getData()) + "\n" + "Alle ore: " + formatOra(ora) + "\n" + "Titolo " +
                "evento: " + getTitolo() + "\n" + "Prezzo evento: " + formatPrezzo(prezzo);
    }

    private String formatOra(LocalTime ora){
       return ora.format(DateTimeFormatter.ofPattern("h:mm a"));
    }

    private String formatPrezzo(BigDecimal prezzo){
        DecimalFormat df = new DecimalFormat("##.##'€'");
        return df.format(prezzo);
    }
}
