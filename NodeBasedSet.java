/**
 * Write a description of class NodeBasedSet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NodeBasedSet<T> implements SetInterface<T> {
    private SetNode<T> theSet;

    // constructor to create an empty set
    public NodeBasedSet() {
        theSet = null;
    }

    // method to return the number of elements in the set
    public int size() {
        SetNode<T> curr = theSet; 
        int count = 0; 

        while (curr != null) {
            count++; 
            curr = curr.getLink();
        }

        return count;
    }

    // method to return true if element is in the set else return false
    public boolean memberOf(T element) {
        SetNode<T> curr = theSet; // set curr to theSet

        // loop over the set to search for the element
        while (curr != null) {
            if (curr.getInfo().equals(element))
                return true;
            curr = curr.getLink();
        }

        return false;
    }

    // method to add an element to the set if it doesn't exist in the set
    public void add(T element) throws DuplicateFoundException {
        if (memberOf(element)) 
            throw new DuplicateFoundException("Duplicate cannot be added to a Set");
        SetNode<T> node = new SetNode<T>(element); 
        node.setLink(theSet);
        theSet = node; 
    }

    // method to delete the element from the set
    public void delete(T element) {
        if (memberOf(element)) 
        {
            SetNode<T> curr = theSet; 
            SetNode<T> pre = null; 

            // loop over the set
            while (curr != null) {
                if (curr.getInfo().equals(element)) 
                    break;
                pre = curr;
                curr = curr.getLink();
            }

            if (pre == null) 
                theSet = theSet.getLink();
            else 
                pre.setLink(curr.getLink());
        }
    }

    // method to return the String representation of the set
    public String toString() {
        String str = "[";
        SetNode<T> curr = theSet; 

        // loop over the set
        while (curr != null) {
            str += curr.getInfo().toString();
            if (curr.getLink() != null)
                str += ", ";
            curr = curr.getLink(); 
        }

        str += "]";
        return str;
    }
}