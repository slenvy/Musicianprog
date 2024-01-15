/**
 * Write a description of class SetDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SetDemo {
    public static void main(String[] args) {
        // create a reference of SetInterface<Musician> called rush and refer it to the object of NodeBasedSet<Musician> type
        SetInterface<Musician> rush = new NodeBasedSet<Musician>();

        // create Musicians
        Musician geddyLee = new Musician();
        geddyLee.setName("Geddy Lee");
        geddyLee.addInstrument("Vocals");
        geddyLee.addInstrument("Bass");
        geddyLee.addInstrument("Synthesizers");

        Musician alexLifeson = new Musician();
        alexLifeson.setName("Alex Lifeson");
        alexLifeson.addInstrument("Electric Guitar");
        alexLifeson.addInstrument("Acoustic Guitar");
        alexLifeson.addInstrument("Background Vocals");

        Musician johnRutsey = new Musician();
        johnRutsey.setName("John Rutsey");
        johnRutsey.addInstrument("Drums");

        try {
            // add the musicians
            rush.add(johnRutsey);
            rush.add(geddyLee);
            rush.add(alexLifeson);

            // display the set and its size
            System.out.println(rush.toString());
            System.out.println("Size: " + rush.size());

            rush.delete(johnRutsey); // delete a musician
            System.out.println(rush.toString());

            // create a new musician and add it to set
            Musician neilPeart = new Musician();
            neilPeart.setName("Neil Peart");
            neilPeart.addInstrument("Drums");
            neilPeart.addInstrument("Percussion");
            rush.add(neilPeart);
            System.out.println(rush.toString()); 

            rush.add(neilPeart); 
            // delete the musicians
            rush.delete(neilPeart);
            rush.delete(geddyLee);
            rush.delete(alexLifeson);
        } catch (DuplicateFoundException e) {
            // display the exception message
            System.out.println(e.getMessage());
        }
    }
}
