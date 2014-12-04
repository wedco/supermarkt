

/**
 * @author Colin Wedel
 * @version 2010-10-20
 */
public class Queue
{
    private Node head, tail;

    /**
     * Ein Knoten besteht aus einem Inhaltsobjekt 
     * und einem Nachfolgeknoten.
     */
    private class Node
    {
        private Object content;
        private Node nextNode;

        /**
         * Es wird ein neuer Knoten erzeugt.
         *
         * @param pContent das Inhaltsobjekt
         * @param pNext der Nachfolgeknoten
         */
        public Node(Object pContent, Node pNext)
        { content = pContent;
            nextNode = pNext;
        }

        /**
         * Das Inhaltsobjekt wird geaendert.
         *
         * @param pContent das neue Inhaltsobjekt
         */
        public void setContent(Object pContent)
        {
            content = pContent;
        }

        /**
         * Das Inhaltsobjekt wird zurueckgegeben.
         *
         * @return das Inhaltsobjekt
         */
        public Object content()
        {
            return content;
        }

        /**
         * Der Nachfolgeknoten wird geaendert.
         *
         * @param pNext der neue Nachfolgeknoten
         */
        public void setNext(Node pNext)
        {
            nextNode = pNext;
        }

        /**
         * Der Nachfolgeknoten wird zurueckgegeben.
         *
         * @return der Nachfolgeknoten
         */
        public Node next()
        {
            return nextNode;
        }
    }

    /**
     * Eine leere Schlange wird erzeugt.
     */
    public Queue()
    {
        head = null;
        tail = null;
    }

    /**
     * Die Anfrage liefert den Wert true, wenn die Schlange keine Objekte
     * enthaelt, sonst liefert sie den Wert false.
     *
     * @return true, falls die Schlange leer ist, sonst false
     */
    public boolean isEmpty(){
        return head == null;
    }

    /**
     * Das Objekt pObjekt wird an die Schlange angehaengt.
     * Falls pObject gleich null ist, bleibt die Schlange
     * unveraendert.
     *
     * @param pObject das anzuhaengende Objekt
     */
    public void enqueue(Object pObject)
    {
        if (pObject != null){
            Node lNewNode = new Node(pObject, null);
            if (this.isEmpty()){
                head = lNewNode;
                tail = lNewNode;
            }
            else{
                tail.setNext(lNewNode);
                tail = lNewNode;
            }
        }
    }

    /**
     * Das erste Objekt wird aus der Schlange entfernt.
     * Falls die Schlange leer ist, wird sie nicht 
     * veraendert.
     */
    public void dequeue()
    {
        if (!this.isEmpty()){
            head = head.next();
        }
    }

    /**
     * Die Anfrage liefert das erste Objekt der Schlange.
     * Die Schlange bleibt unveraendert. Falls die 
     * Schlange leer ist, wird null zurueck gegeben.
     *
     * @return das erste Objekt der Schlange oder null, falls 
     * die Schlange leer ist.
     */
    public Object front(){
        if (this.isEmpty())
        {
            return null;
        }
        else{
            return head.content();
        }
    }

}

