public abstract class Command {
	Device dev;
	public Command(Device d) {
		dev = d;
	}
	public abstract void execute();
}