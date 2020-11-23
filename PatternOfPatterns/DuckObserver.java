import java.util.*;

public class DuckObserver implements Observable {
	Quackable duck;
	ArrayList<Observer> list;
	public DuckObserver(Quackable d) {
		list = new ArrayList<Observer>();
		duck = d;
	}
	public void registerObserver(Observer o) {
		list.add(o);
	}
	public void notifyObservers() {
		Iterator<Observer> it = list.iterator();
		while(it.hasNext()) {
			Observer ob = it.next();
			ob.notify(duck);
		}
	}
}