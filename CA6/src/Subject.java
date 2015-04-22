//import java.util.ArrayList;
public interface Subject
{
  public void notifySubscribers(Object arg);
  
  public void notifySubscribers();
  
  public Boolean subscribe(Observer anObserver);
  
  public Boolean unsubscribe(Observer toRemove);
  
  //public void start();
}