package Exception;

public class WrongEntriesException extends Exception{
	public WrongEntriesException() {
		System.out.println("You have entered incorrect entries, please try again.");
	}
}
