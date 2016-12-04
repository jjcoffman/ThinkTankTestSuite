package thinktank.simulator.util;

import thinktank.simulator.actions.SelectEntityActionFactory;


/**
 * The class <code>IObservableFactory</code> implements static methods that return instances of the class <code>{@link IObservable}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class IObservableFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private IObservableFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link IObservable}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static IObservable createcreateInstance() {
		return SelectEntityActionFactory.createInstance();
	}
}