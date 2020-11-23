public class TestObserver{
	public static void main(String[] args) {
		Registrar nytimes = new NYTimes();
		Registrar ajit = new Ajit();
		Observer user1 = new Subscriber();
		user1.register(nytimes);
		user1.register(ajit);
		
		Observer user2 = new Subscriber();
		user2.register(nytimes);
		
		nytimes.notifyObserver();
		
		user2.unregister(nytimes);
		nytimes.notifyObserver();
		
		user2.register(ajit);
		ajit.notifyObserver();
	}
}