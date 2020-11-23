public class Printer implements Device{
	private static Printer mInstance=null;
	public static Device createInstance() {
		System.out.println("Thread attempting to enter");
		synchronized(Printer.class) {
			System.out.println("Thread has successfully entered");
			if(mInstance==null) {
				mInstance = new Printer();
			}
			else {
				System.out.println("Instance already created");
			}
			return mInstance;
		}
		
	}
	private Printer() {
		System.out.println("Printer is ready");
	}
}