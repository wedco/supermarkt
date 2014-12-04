import java.awt.Graphics;

/**
 * Der Supermarkt ist die Oberklasse mit der wir arbeiten.
 * Hier werden die Simulationen durchgefuehrt und Kassen und Kunden angelegt.
 * Dies ist praktisch die hauptschaltzentrale
 *
 * @author Colin Wedel
 * @version 2014-12-4 1.0
 */
public class Supermarkt
{
    KundenGenerator kG;
    List kassen;
    public static int runde;

    /**
     * Constructor for objects of class Supermarkt
     */
    public Supermarkt()
    {
        kG = new KundenGenerator();
        kassen = new List();
        kassen.append(new Kasse("Kasse 1", true));
        runde = 0;
        //simulation(100);
    }

    /**
     * Die Methode steuert die Simulation durch 
     *
     * @param  durchgaenge   a sample parameter for a method
     * @return Value the sum of x and y
     */
    public void simulation(int durchgaenge)
    {
        for (int i = 0; i < durchgaenge; i++){
            naechsteRunde();
        }
    }

    public void naechsteRunde(){
        Queue neueKunden = kG.generiereKunden(4);
        runde++;
        //toDo: Anh�ngen der neu generierten Kunden an die Kassen.
        kassenArbeiten();
        //Kassen ausgeben
        kassenAusgeben(this.runde);
        //warten, falls eine automatisierte Wiederholung stattfindet.
        warte();

    }



    /**
     * Sucht nach der Kasse, die besetzt ist und die kuerzeste Laenge hat.
     */
    private Kasse getKuerzesteKasse(){
        //toDo
        return null; //damit der Funktionskopf ohne Fehler kompiliert werden kann. Muss sp�ter entfernt werden.
    }

    /**
     * Die Kassen bearbeiten die Artikel der vordersten Kunden.
     */
    private void kassenArbeiten(){

    }

    private void kassenAusgeben(int aktuelleRunde){
        System.out.print ('\f');//Konsole loeschen
        System.out.println("Ihr freundlicher Supermarkt");
        System.out.println("Runde[" + aktuelleRunde + "]");

        kassen.toFirst();
        while(kassen.hasAccess()){
            ((Kasse)kassen.getObject()).ausgeben(aktuelleRunde);
            kassen.next();
        }
    }

    private void warte(){
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){

        }
    }
}
