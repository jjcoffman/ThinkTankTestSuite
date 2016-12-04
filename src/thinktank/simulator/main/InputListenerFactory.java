package thinktank.simulator.main;



/**
 * The class <code>InputListenerFactory</code> implements static methods that return instances of the class <code>{@link InputListener}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class InputListenerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private InputListenerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link InputListener}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static InputListener createInstance() {
		return InputListener.getInstance();
	}
}