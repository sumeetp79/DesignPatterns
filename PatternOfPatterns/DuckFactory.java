public class DuckFactory implements AbstractFactory {
	public Quackable createDuck(String str) {
		if(str.equals("Mallard"))
			return new MallardDuck();
		else if(str.equals("Redhead"))
			return new RedheadDuck();
		return new MallardDuck();
	}
}
