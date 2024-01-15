/**
 * Write a description of interface SetInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface SetInterface<T>
{
public int size();
public boolean memberOf(T element);
public void add(T element) throws DuplicateFoundException;
public void delete(T element);
public String toString();
}