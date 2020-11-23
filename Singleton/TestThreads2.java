public class TestThreads2 implements Runnable {
	public void run() {
		System.out.println("Running Thread 2");
		System.out.println("Creating instance of the Printer from Thread 2");
		Device d = Printer.createInstance();
	}
}
