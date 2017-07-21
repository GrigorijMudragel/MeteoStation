package mudragel.grigorij.study.designpatterns.observer.interfaces;

/**
 * Created by Grigorij_Mudragel on 7/19/2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
