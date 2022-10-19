package BeanObserver;

/**
 *
 * Observable interface
 *
 * @author Dr. Baliga
 *
 */

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Object data);
}
