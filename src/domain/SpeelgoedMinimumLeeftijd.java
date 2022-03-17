package domain;

public class SpeelgoedMinimumLeeftijd extends Speelgoed  {
    private int minimumLeeftijd;
    public SpeelgoedMinimumLeeftijd(double prijs, String naam, String firmanaam, int leeftijd) {
        super(prijs, naam, firmanaam);
        setMinimumLeeftijd(minimumLeeftijd);
    }

    public void setMinimumLeeftijd(int leeftijd) {
        this.minimumLeeftijd = leeftijd;
    }

    public int getMinimumLeeftijd() {
        return this.minimumLeeftijd;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMinimumleeftijd: "+minimumLeeftijd;
    }
}
