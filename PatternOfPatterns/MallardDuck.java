public class MallardDuck implements Quackable {
	Observable ob;
	public MallardDuck() {
		System.out.println("Creating Mallard Duck");
		ob = new DuckObserver(this);
	}
	public void quack() {
		System.out.println("MallardDuck: quack");
		ob.notifyObservers();
	}
	public void registerObserver(Observer o) {
		ob.registerObserver(o);
	}
	public void notifyObservers() {
		ob.notifyObservers();
	}
}