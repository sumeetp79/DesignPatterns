public class QuackCounter implements Quackable{
	Quackable duck;
	Observable ob;
	static int quackCount;
	public QuackCounter(Quackable d) {
		duck = d;
		ob = new DuckObserver(this);
	}
	public void quack() {
		//System.out.println("In Quack Counter");
		quackCount++;
		duck.quack();
		ob.notifyObservers();
	}
	public void registerObserver(Observer o) {
		ob.registerObserver(o);
	}
	public void notifyObservers() {
		ob.notifyObservers();
	}
	public static int getCount() {
		return quackCount;
	}
}