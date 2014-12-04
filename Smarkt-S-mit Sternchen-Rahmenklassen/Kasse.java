
/**
 * Write a description of class Kasse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kasse
{
    private String name;
    private boolean besetzt;
    private int laenge;
    
    private Queue schlange;

    /**
     * Constructor for objects of class Kasse
     */
    public Kasse()
    {

    }

    /**
     *
     * @param name Setzt Kassen Name
     */
    public Kasse(String name){

    }

    /**
     *
     * @param name Namen der Kasse
     * @param besetzt Wenn Kasse besetzt dann true, wenn nicht dann false
     */
    public Kasse(String name, boolean besetzt){

    }

    /**
     *
     * @return Gibt die Laenge der Schlange zurueck
     */
    public int getLaenge(){
        return laenge;
    }

    /**
     *
     * @return Gibt aus ob Kasse besetzt ist oder nicht
     */
    public boolean istBesetzt(){
        return besetzt;
    }

    /**
     *
     */
    public void vorderstenKundenBedienen(){
        //toDo
    }

    /**
     *
     * @param Stellt kunde k an die Kasse an
     */
    public void anstellen(Kunde k){
        //toDo
    }
    
    /**
     * Die Kasse wird in einer Zeile ausgegeben. Dabei werden alle Kunden die an der Kasse 
     * warten in der Zeile ausgegeben.
     *
     */
    public void ausgeben(int aktuelleRunde){
        System.out.print(name);
        if (!besetzt) System.out.print(" nicht besetzt");
        Queue ersatzSchlange = new Queue();
        while(!schlange.isEmpty()){
            Kunde aktuellerKunde = (Kunde) schlange.front();
            System.out.print("*");//Hier kann auch auf Daten des Kunden zur�ckgegriffen werden.
            ersatzSchlange.enqueue(aktuellerKunde);
            schlange.dequeue();
        }
        schlange = ersatzSchlange;
        System.out.println();//Ende der Zeile;
    }     
    
}
