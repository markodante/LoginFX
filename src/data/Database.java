package data;

/**
 * @author Marko Orlando
 * date 06/11/2024
 * A database that holds the users username and password
 */
public final class Database {


	// (Don't let anyone create a `new` Database)
	
	/**
	 *  Private constructor 
	 */
	private Database() {}
	
	/**
	 * Set the username
	 */
	public static String username = "";
	
	/**
	 * Set the password
	 */
	public static String password = "";
}