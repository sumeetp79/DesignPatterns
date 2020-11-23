public class TestSingleton{
	public static void main(String args[]) {
		
		Runnable r = new TestThreads();
		Runnable r2=new TestThreads2();
		for(int i=0;i<2;i++) {
			new Thread(r).start();
			new Thread(r2).start();
		}
		
		/*System.out.println("Creating first instance of the Printer");
		Device d=Printer.createInstance();
		
		System.out.println("Creating second instance of the Printer");
		Device d2=Printer.createInstance();*/
	}
}