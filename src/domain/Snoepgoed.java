package domain;

import java.time.LocalDate;

public class Snoepgoed extends Geschenk implements VervalbaarObject {
    private LocalDate vervaldatum; private final String naam;
    public Snoepgoed(double prijs, LocalDate vervaldatum, String naam) {
        super(prijs);
        setVervaldatum(vervaldatum);
        this.naam = naam;
    }

    @Override
    public double getPrijs() {
        return super.getPrijs();
    }

    @Override
    public void setVervaldatum(LocalDate vervaldatum) {
        this.vervaldatum  = vervaldatum;
    }

    @Override
    public LocalDate getVervaldatum() {
        return vervaldatum;
    }
    @Override
    public boolean vervallen()
    {
        return this.vervaldatum.isAfter(LocalDate.now());
    }



    @Override
    public String toString() {
        return super.toString() + "\nVervaldatum: "+vervaldatum.toString() + "\nNaam: " +naam;
    }
}
