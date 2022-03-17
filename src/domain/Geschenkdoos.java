package domain;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Geschenkdoos {
    private ArrayList<Geschenk> geschenken;
    private final Persoon schenker, ontvanger;
    public Geschenkdoos(Persoon schenker, Persoon ontvanger, Geschenk geschenk)
    {
        geschenken = new ArrayList<>();
        if(schenker == null || ontvanger == null || geschenk == null)
            throw new IllegalArgumentException( );
        if(schenker.equals(ontvanger))
            throw new IllegalStateException();
        this.schenker = schenker;
        this.ontvanger = ontvanger;
        geschenken.add(geschenk);
    }
    public void add(Geschenk geschenk)
    {   if(geschenk instanceof MinimumLeeftijd)
            if(((MinimumLeeftijd) geschenk).getLeeftijd()>Period.between(ontvanger.getDatum(), LocalDate.now()).getYears())
        if(geschenk instanceof  VervalbaarObject)
                if(((VervalbaarObject) geschenk).vervallen())
                    throw new IllegalStateException();

        geschenken.add(geschenk);


    }
    public ArrayList<Geschenk> remvoeVervallen()
    {   ArrayList<Geschenk> verwijderdeGeschenken = new ArrayList<>();
        for(Geschenk e: geschenken)
        {
            if(e instanceof VervalbaarObject)
            {   verwijderdeGeschenken.add(e);
                geschenken.remove(e);
            }
        }
        return verwijderdeGeschenken;
    }
    public int totalePrijs()
    {int som = 0;
        for(Geschenk e: geschenken)
        {
            som+=e.getPrijs();
        }
        return som;
    }

}
