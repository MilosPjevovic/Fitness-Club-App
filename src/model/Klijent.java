
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Pjevovic
 */
@Entity
public class Klijent {
    @Id
    private int brojKartice;
    private String ime;
    private String prezime;
    private String brojMobilnog;
    private String brojGodina;
    private String email;
    private String pol;
    private String tipTreninga;
    private String trener;
    private String clanarina;

    
    
    public Klijent() {
    }

    public Klijent(int brojKartice, String ime, String prezime, String brojMobilnog, String brojGodina, String email, String pol) {
        this.brojKartice = brojKartice;
        this.ime = ime;
        this.prezime = prezime;
        this.brojMobilnog = brojMobilnog;
        this.brojGodina = brojGodina;
        this.email = email;
        this.pol = pol;
    }

    public Klijent(int brojKartice, String ime, String prezime, String brojMobilnog, String brojGodina, String email, String pol, String tipTreninga, String trener, String clanarina) {
        this.brojKartice = brojKartice;
        this.ime = ime;
        this.prezime = prezime;
        this.brojMobilnog = brojMobilnog;
        this.brojGodina = brojGodina;
        this.email = email;
        this.pol = pol;
        this.tipTreninga = tipTreninga;
        this.trener = trener;
        this.clanarina = clanarina;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojMobilnog() {
        return brojMobilnog;
    }

    public void setBrojMobilnog(String brojMobilnog) {
        this.brojMobilnog = brojMobilnog;
    }

    public String getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(String brojGodina) {
        this.brojGodina = brojGodina;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getTipTreninga() {
        return tipTreninga;
    }

    public void setTipTreninga(String tipTreninga) {
        this.tipTreninga = tipTreninga;
    }

    public String getTrener() {
        return trener;
    }

    public void setTrener(String trener) {
        this.trener = trener;
    }

    public String getClanarina() {
        return clanarina;
    }

    public void setClanarina(String clanarina) {
        this.clanarina = clanarina;
    }

    
    
    
    
    
}
