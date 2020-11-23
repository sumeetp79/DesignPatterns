public class GooseAdapter implements Quackable{
	Goose goose;
	Observable ob;
	public GooseAdapter(Goose g) {
		goose = g;
		ob = new DuckObserver(this);
	}
	public void quack() {
		goose.honk();
		ob.notifyObservers();
	}
	public void registerObserver(Observer o) {
		ob.registerObserver(o);
	}
	public void notifyObservers() {
		ob.notifyObservers();
	}
}
	
