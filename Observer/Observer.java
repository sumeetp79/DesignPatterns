public interface Observer {
	public void execute(String str);
	public void register(Registrar r);
	public void unregister(Registrar r);
}