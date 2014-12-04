
/**
 * Write a description of class KundenGenerator here.
 *
 * @author Colin Wedel
 * @version 2014-12-04 1.0
 */
public class KundenGenerator
{


    /**
     * Constructor for objects of class KundenGenerator
     */
    public KundenGenerator()
    {

    }

    public Queue generiereKunden(int maxKunden){
        Queue neueKunden = new Queue();
        int anzahlKundenProRunde = (int)(maxKunden * Math.random());
        for (int i = 0; i < anzahlKundenProRunde; i++){
            neueKunden.enqueue(new Kunde((int)(10*Math.random())));
        }
        return neueKunden;
    }
}
