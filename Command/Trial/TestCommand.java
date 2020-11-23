public class TestCommand {
	public static void main(String[] args) {
		Device garage = new Garage();
		Command turnOnGarage = new TurnOnCommand(garage);
		Invoker inv = new Invoker();//turnOnGarage);
		inv.setCommand(0,turnOnGarage);
		inv.buttonPressed(0);
		
		Device tv = new Television();
		Command turnOffTelevision = new TurnOffCommand(tv);
		inv.setCommand(1, turnOffTelevision);
		inv.buttonPressed(1);
		
		inv.buttonPressed(7);
	}
}