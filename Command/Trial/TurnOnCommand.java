public class TurnOnCommand extends Command{
	public TurnOnCommand(Device d) {
		super(d);
	}
	public void execute() {
		dev.turnOn();
	}
}