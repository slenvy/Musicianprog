/**
 * Write a description of class Musician here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Musician {
    private String name;
    private String[] instrumentArray;
    private int numberOfInstruments;

    // Default constructor to set name to an empty string,
    // Set numberOfInstruments to 0, and create instrumentArray as an array of 10 Strings
    public Musician() {
        name = "";
        numberOfInstruments = 0;
        instrumentArray = new String[10];
    }

    // Method to set name
    public void setName(String name) {
        this.name = name;
    }

    // Method to return name
    public String getName() {
        return name;
    }

    // Method to add an instrument to the instrument array & If the array is full, newInstrument is not added
    public void addInstrument(String newInstrument) {
        if (numberOfInstruments < instrumentArray.length) {
            instrumentArray[numberOfInstruments] = newInstrument;
            numberOfInstruments++; // Increment numberOfInstruments by 1
        }
    }

    // Method to return the instruments in the instrumentArray as a string
    public String getInstruments() {
        if (numberOfInstruments == 0) // No instruments, return an empty string
            return "";
        else {
            StringBuilder instruments = new StringBuilder();
            for (int i = 0; i < numberOfInstruments; i++) {
                instruments.append(instrumentArray[i]);
                if (i < numberOfInstruments - 1)
                    instruments.append(" ");
            }

            return instruments.toString();
        }
    }

    // Method to return the number of instruments
    public int getNumberOfInstruments() {
        return numberOfInstruments;
    }

    // Method to return the String representation of the Musician object
    public String toString() {
        return "Name: " + name + " plays " + numberOfInstruments + " instruments which are " + getInstruments();
    }

    // Method to return true if this Musician is equal to otherObject, otherwise return false
    public boolean equals(Object otherObject) {
        if ((otherObject != null) && (otherObject instanceof Musician)) {
            Musician m = (Musician) otherObject; // Cast otherObject to Musician
            return (name.equals(m.getName()) && getInstruments().equals(m.getInstruments()) &&
                    numberOfInstruments == m.getNumberOfInstruments());
        }

        return false; // otherObject is not an object of the Musician class
    }
}
