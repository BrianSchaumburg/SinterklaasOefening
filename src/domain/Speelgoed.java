package domain;

public class Speelgoed extends Geschenk{
    private String naam, firmanaam;

    public Speelgoed(double prijs, String naam, String firmanaam) {
        super(prijs);
        this.naam = naam;
        this.firmanaam = firmanaam;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNaam:"+naam + "\nFirmanaam:" + firmanaam;
    }

}
