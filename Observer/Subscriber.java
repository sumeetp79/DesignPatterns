public class Subscriber implements Observer{
	private int id;
	private static int gl=0;
	Registrar registrar;
	public Subscriber() {
		id=(++gl);
	}
	public void unregister(Registrar r) {
		r.unregisterObserver(this);
	}
	public void register(Registrar r) {
		r.registerObserver(this);
	}
	public void execute(String str) {
		System.out.println(id+": Get your latest paper from "+str);
	}
}