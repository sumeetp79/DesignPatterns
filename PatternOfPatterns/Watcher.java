public class Watcher implements Observer {
	private static int count;
	public Watcher() {
		count++;
	}
	public void notify(Quackable duck) {
		System.out.println("Watcher"+count+" notified of the duck's quacking");
	}
}