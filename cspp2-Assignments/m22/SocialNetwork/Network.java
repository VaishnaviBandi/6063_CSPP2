import java.util.Arrays;
class User {
	private String name;
	private String[] connections = new String[10];
	private int size = 0;

	User(String name, String[] connections) {
		this.name = name;
		for(int i = 0; i < connections.length; i++) {
			this.connections[i] = connections[i];
		}
		size = connections.length;
	}

	public void addConnections(String names) {
		connections[size++] = names;
	}
	public String[] getConnections() {
		String ret[] = new String[size];
		for(int i = 0; i < size; i++){
			ret[i] = connections[i];
		}
		return ret;
	}

	public String getName() {
		return name;
	}
}
class Network {

	private User[] users;
	private int size;

	Network() {
		users = new User[20];
		size = 0;
	}

	public void getConnections(String user1) {
		User u = null;
		int index = -1;
		for(int i = 0; i < size; i++) {
			if(users[i].getName().equals(user1)){
				u = users[i];
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("Not a user in Network");
			return;
		}
		System.out.println(Arrays.toString(u.getConnections()));
	}
	public void addConnections(String user1, String user2) {
		// System.out.println(user1);
		User u = null;
		int index = -1;
		int index1 = -1;
		for(int i = 0; i < size; i++) {
			if(users[i].getName().equals(user1)){
				u = users[i];
				index = i;
				break;
			}
		}
		for(int i = 0; i < size; i++) {
			if(users[i].getName().equals(user2)){
				u = users[i];
				index1 = i;
				break;
			}
		}
		if(index == -1 || index1 == -1){
			System.out.println("Not a user in Network");
			return;
		}
		String[] connections = u.getConnections();
		for(String connection : connections) {
			if((connection.equals(user2))) {
				System.out.println("already in connections");
				return;
			}
		}
		u.addConnections(user2);
		// System.out.println(Arrays.toString(u.getConnections()));
		users[index] = u;

	}
	public void addUser(User u) {
		if(size == 0) {
			users[size++] = u;
			return;
		}
		for(int i = 0; i < size; i++) {
			if(users[i].getName().equals(u.getName())) {
				System.out.println("User already in the network");
				return;
			}
		}
		users[size++] = u;
	}

	public String[] commonConnections(String user1, String user2) {
		User u1 = null;
		User u2 = null;
		for(int i = 0; i < size; i++) {
			if(users[i].getName().equals(user1)){
				u1 = users[i];
			}
		}
		for(int i = 0; i < size; i++) {
			if(users[i].getName().equals(user2)){
				u2 = users[i];
			}
		}
		String[] connection1 = u1.getConnections();
		String[] connection2 = u2.getConnections();
		String[] ret = new String[20];
		int retSize = 0;
		for (String s : connection1) {
			for (String t : connection2) {
				if (s.equals(t)) {
					ret[retSize++] = s;
				}
			}
		}
		String[] common = new String[retSize];
		for (int i = 0; i < retSize; i++) {
			common[i] = ret[i];
		}
		return common;
	}
	public void showNetwork() {
		String[] arr = new String[size];
		for (int i = 0; i < size; i++) {
			arr[i] = users[i].getName();
		}
		Arrays.sort(arr);
		int c1 = arr.length;
		// System.out.println(arr.length);
		int inc = 0;
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] +": ");
			String name = arr[i];
			for (int j = 0; j < size; j++) {
				if (name.equals(users[j].getName())) {
					if (inc == c1-1) {
						System.out.print(Arrays.toString(users[j].getConnections()));
					}
					else {
						System.out.print(Arrays.toString(users[j].getConnections())+ ", ");
						inc++;
						// System.out.println(inc);
					}
				}
			}
		}
		System.out.println();
	}
}