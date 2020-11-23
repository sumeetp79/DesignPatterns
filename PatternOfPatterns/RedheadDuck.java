public class RedheadDuck implements Quackable {
	Observable ob;
	public RedheadDuck() {
		System.out.println("Creating Redhead Duck");
		ob = new DuckObserver(this);
	}
	public void quack() {
		System.out.println("RedheadDuck: quack");
		ob.notifyObservers();
	}
	public void registerObserver(Observer o) {
		ob.registerObserver(o);
	}
	public void notifyObservers() {
		ob.notifyObservers();
	}
}