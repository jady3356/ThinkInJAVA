//:C:\Users\tpei\workspace\Chapter_6_2_Exercise_7\src\Access.java
import access.*;

class Soup1 {
	private Soup1() {}
	public static Soup1 makeSoup1() {
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {}
	public static Soup2 ps1 = new Soup2();
	public static Soup2 access() {
		return ps1;
	}
}

class Connection {
	private static int count = 0;
	//private int i = 0;
	private Connection() {System.out.println("Connection()");}
	static Connection makeConnection() {
		count++;
		return new Connection();
	}
	//public static int howMany() {return count;}
	//public String toString() {
		//return ("Connection" + count);
	//}
}

class ConnectionManager {
	static int howManyLeft = 3;
	static Connection[] ca = new Connection[3];
	{
		for(Connection x:ca)
			x = Connection.makeConnection();
	}
	public static Connection getConnection() {
		if(howManyLeft > 0)
			return ca[--howManyLeft];
		else {
			System.out.println("No more connections");
			return null;
		}
	}
}
public class MakeWidget {
	public static void main(String[] args) {
		Widget test = new Widget();
		test.Initialize();
		//static Connection test1 = new Connection();
		ConnectionManager cm = new ConnectionManager();
		System.out.println(cm.howManyLeft);
		cm.getConnection();
		//System.out.println(howManyLeft);
		cm.getConnection();
		//System.out.println(howManyLeft);
		cm.getConnection();
		System.out.println(cm.getConnection());
		//System.out.println(howManyLeft);		
	}
}