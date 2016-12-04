package thinktank.simulator.environment;



/**
 * The class <code>TankFactory</code> implements static methods that return instances of the class <code>{@link Tank}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class TankFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private TankFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Tank}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Tank createcreateTank() {
		return Tank.createTank();
	}


	/**
	 * Create an instance of the class <code>{@link Tank}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Tank createTank() {
		return Tank.createTank(TANK_TYPE.FIFTEEN_GAL);
	}
}