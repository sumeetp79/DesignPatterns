import java.util.*;

public class Flock implements Quackable {
	ArrayList<Quackable> list;
	Observable ob;
	public Flock() {
		list = new ArrayList<Quackable>();
		ob = new DuckObserver(this);
	}
	public void addDuck(Quackable duck) {
		list.add(duck);
	}
	public void quack() {
		Iterator<Quackable> it = list.iterator();
		while(it.hasNext()) {
			Quackable duck = it.next();
			duck.quack();
			ob.notifyObservers();
		}
	}
	public void registerObserver(Observer o) {
		ob.registerObserver(o);
	}
	public void notifyObservers() {
		ob.notifyObservers();
	}
}