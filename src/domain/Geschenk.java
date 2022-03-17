package domain;

public class Geschenk {
    private double Prijs;

    public Geschenk(double prijs) {
        Prijs = prijs;
    }

    public double getPrijs() {
        return Prijs;
    }

    @Override
    public String toString() {
        return "Geschenk{" +
                "Prijs=" + Prijs +
                '}';
    }
}
