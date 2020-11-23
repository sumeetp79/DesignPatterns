import java.util.*;

public abstract class Registrar {
	String str;
	ArrayList<Observer> registrants;
	public Registrar() {
		str="";
		registrants =  new ArrayList<Observer>();
	}
	public void registerObserver(Observer o) {
		registrants.add(o);
	}
	public void unregisterObserver(Observer o) {
		registrants.remove(o);
	}
	public String getString(){
		return str;
	}
	public void notifyObserver() {
		for(Observer o: registrants) {
			o.execute(getString());
		}
	}
}
