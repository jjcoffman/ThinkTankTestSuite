package thinktank.simulator.entity;



/**
 * The class <code>FishFactory</code> implements static methods that return instances of the class <code>{@link Fish}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class FishFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private FishFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Fish}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Fish createFish() {
		return new Fish();
	}
}