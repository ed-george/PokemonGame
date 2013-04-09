package exceptions;

/**
 * This class provides a custom Exception that can be thrown if the Pokemon
 * specified by the player tries to add a new attack when MAX_ATTACKS is reached.
 * @author Jiggy
 *
 */
public class PokemonsMaxAttacks extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PokemonsMaxAttacks(String message) {
		super(message);
	}

	public PokemonsMaxAttacks(String message, Throwable cause) {
		super(message, cause);
	}
}
