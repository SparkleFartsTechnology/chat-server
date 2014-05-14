
public class main {

	public static int port;
	
	public static void main(String[] args) {
		Server server = new Server();
		
		port = Integer.parseInt(args[1]);
		
	}
	
	public static int getPort(){
		return port;
	}
	
}
