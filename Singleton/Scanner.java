public class Scanner implements Device{
	private static Scanner mInstance=null;
	public static Device createInstance() {
		if(mInstance==null) {
			mInstance = new Scanner();
		}
		else {
			System.out.println("Instance already created");
		}
		return mInstance;
	}
	private Scanner() {
		System.out.println("Scanner is ready");
	}
}