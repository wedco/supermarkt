
/**
 * Write a description of class Kunde here.
 *
 * @author Colin Wedel
 * @version 2014-12-04 1.0
 */
public class Kunde
{
    // instance variables - replace the example below with your own
    private int artikelAnzahl;

    /**
     * Constructor for objects of class Kunde
     */
    public Kunde(int artikelAnzahl)
    {
        this.artikelAnzahl = artikelAnzahl;
    }


    /**
     * Dem Kunden werden pro Runde Artikel artikelProRunde Artikel bearbeitet.
     */
    public void bearbeiteArtikel(int artikelProRunde){
        artikelAnzahl = artikelAnzahl - artikelProRunde;
    }




    public void ausgeben(int aktuelleRunde){
        System.out.print( "-[|A:"+artikelAnzahl+"]-");
    }

    public boolean istFertig(){
        return artikelAnzahl <= 0;
    }

}
