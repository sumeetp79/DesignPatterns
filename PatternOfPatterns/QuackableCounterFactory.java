public class QuackableCounterFactory implements AbstractFactory {
	public Quackable createDuck(String str) {
		if(str.equals("Mallard"))
			return new QuackCounter(new MallardDuck());
		else if(str.equals("Redhead"))
			return new QuackCounter(new RedheadDuck());
		return new QuackCounter(new MallardDuck());
	}
}
