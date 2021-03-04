
package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author Pjevovic
 */

@Entity
public class Zaposleni {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    private String ime;
    private String prezime;
    @Column (name = "korisnicko_ime",unique = true )
    private String korisnickoIme;
    private String sifra;

    public Zaposleni() {
    }

    public Zaposleni(String ime, String prezime, String korisnickoIme, String sifra) {
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    
  
            
    
    
    
}
