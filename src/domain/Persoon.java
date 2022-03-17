package domain;

import java.time.LocalDate;

public final class Persoon {
    private final String naam;
    private final String voornaam;
    private final LocalDate datum;

    public Persoon(String naam, String voornaam, LocalDate datum) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.datum = datum;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public LocalDate getDatum() {
        return datum;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            throw new IllegalArgumentException( );
        if (obj instanceof Persoon
        ) {
            return ((Persoon) obj).getNaam().equals(this.naam) && ((Persoon) obj).getVoornaam().equals(this.voornaam) && this.datum.equals(((Persoon) obj).getDatum());

        }
        return false;
    }
}
