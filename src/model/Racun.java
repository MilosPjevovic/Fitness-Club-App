
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Pjevovic
 */
@Entity
public class Racun {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String tipTreninga;
    private String personalniTrener;
    private String cena;
    private String vreme;
    private String datum;

    public Racun() {
    }

    public Racun(String tipTreninga, String personalniTrener, String cena, String vreme, String datum) {
        this.tipTreninga = tipTreninga;
        this.personalniTrener = personalniTrener;
        this.cena = cena;
        this.vreme = vreme;
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipTreninga() {
        return tipTreninga;
    }

    public void setTipTreninga(String toipTreninga) {
        this.tipTreninga = toipTreninga;
    }

    public String getPersonalniTrener() {
        return personalniTrener;
    }

    public void setPersonalniTrener(String personalniTrener) {
        this.personalniTrener = personalniTrener;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }

    public String getVreme() {
        return vreme;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }
    
    
    
}
