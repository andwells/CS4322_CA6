//import java.util.ArrayList;
public interface Subject
{
  public void notifyObservers(Object arg);
  public Boolean register(Observer anObserver);
  public Boolean unregister(Observer toRemove);
}