/**
 * Write a description of class SetNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SetNode<T> {
    private T info;
    private SetNode<T> link;

    // constructor to set info to passed value of info and link to null
    public SetNode(T info) {
        this.info = info;
        link = null;
    }

    // method to set the info
    public void setInfo(T info) {
        this.info = info;
    }

    // method to return the info
    public T getInfo() {
        return info;
    }

    // method to set the link
    public void setLink(SetNode<T> link) {
        this.link = link;
    }

    // method to return the link
    public SetNode<T> getLink() {
        return link;
    }
}