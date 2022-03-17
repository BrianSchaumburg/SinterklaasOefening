package domain;

public class Boek extends Geschenk implements MinimumLeeftijd{
    private String titel; private Persoon auteur;
    private int minimumLeeftijd;
    private int aantalPagina;

    public Boek(double prijs, String titel, Persoon auteur, int aantalPagina) {
        super(prijs);
        this.titel = titel;
        this.auteur = auteur;
        if(aantalPagina <0)
            throw new IllegalArgumentException();
        this.aantalPagina = aantalPagina;
    }



    @Override
    public int getLeeftijd() {
       int leeftijd = 0;
       int aantalpagina= this.aantalPagina-10;
        if(aantalPagina<10)
          return 0;
       else
           leeftijd = 8;
       leeftijd+=(int)Math.round(aantalpagina/50);
       return leeftijd;
    }
}
