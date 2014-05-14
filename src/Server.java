
public class Server implements Runnable{
	
	static int port;
	static String[] connectedUsers;
	static Room[] rooms;
	
	public Server() {
		
		createRooms();
		
	}

	public void run() {
		
		port = main.getPort();
		
		/* Blah blah tcp stuff */

	}
	
	private void createRooms(){
	}
	
}
