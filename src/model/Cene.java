
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
public class Cene {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private double teretana;
    private double kardio;
    private double teretanaKardio;
    private double grupniFitnes;
    private double crossfit;
    private double personalniTrener;

    public Cene() {
    }

    public Cene(double teretana, double kardio, double teretanaKardio, double grupniFitnes, double crossfit, double personalniTrener) {
        this.teretana = teretana;
        this.kardio = kardio;
        this.teretanaKardio = teretanaKardio;
        this.grupniFitnes = grupniFitnes;
        this.crossfit = crossfit;
        this.personalniTrener = personalniTrener;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTeretana() {
        return teretana;
    }

    public void setTeretana(double teretana) {
        this.teretana = teretana;
    }

    public double getKardio() {
        return kardio;
    }

    public void setKardio(double kario) {
        this.kardio = kario;
    }

    public double getTeretanaKardio() {
        return teretanaKardio;
    }

    public void setTeretanaKardio(double teretanaKardio) {
        this.teretanaKardio = teretanaKardio;
    }

    public double getGrupniFitnes() {
        return grupniFitnes;
    }

    public void setGrupniFitnes(double grupniFitnes) {
        this.grupniFitnes = grupniFitnes;
    }

    public double getCrossfit() {
        return crossfit;
    }

    public void setCrossfit(double crossfit) {
        this.crossfit = crossfit;
    }

    public double getPersonalniTrener() {
        return personalniTrener;
    }

    public void setPersonalniTrener(double personalniTrener) {
        this.personalniTrener = personalniTrener;
    }
    
    
    
    
}
