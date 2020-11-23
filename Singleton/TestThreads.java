public class TestThreads implements Runnable {
	public void run() {
		System.out.println("Running Thread 1");
		System.out.println("Creating instance of the Printer from Thread 1");
		Device d = Printer.createInstance();
	}
}