public class TestPatterns {
	public static void main(String[] args) {
		
		AbstractFactory factory = new QuackableCounterFactory();
		Quackable mallardDuck = factory.createDuck("Mallard");
		Quackable redheadDuck = factory.createDuck("Redhead");
		
		Flock f = new Flock();
		
		f.addDuck(mallardDuck);
		f.addDuck(redheadDuck);
		
		Observer w1 = new Watcher();
		Observer w2 = new Watcher();
		
		mallardDuck.registerObserver(w1);
		mallardDuck.registerObserver(w2);
		
		redheadDuck.registerObserver(w1);
		
		f.quack();
		System.out.println("Quack Count: "+QuackCounter.getCount());
		
	}
}