public class TurnOffCommand extends Command{
	public TurnOffCommand(Device d) {
		super(d);
	}
	public void execute() {
		dev.turnOff();
	}
}