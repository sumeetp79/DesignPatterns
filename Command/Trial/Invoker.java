public class Invoker {
	
	int maxSwitches = 8;
	Command[] command;
	public Invoker() {
		command = new Command[maxSwitches];
	}
	public void setCommand(int index, Command c) {
		command[index]=c;
	}
	public void buttonPressed(int index) {
		if(command[index]==null) {
			System.out.println("Oopsie! You've hit a dead end. This switch does nothing");
			return;
		}
			
		command[index].execute();
	}
}