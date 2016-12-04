package thinktank.simulator.util;

import thinktank.simulator.ui.ScenarioBuilderScreenControllerFactory;


/**
 * The class <code>IObserverFactory</code> implements static methods that return instances of the class <code>{@link IObserver}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class IObserverFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private IObserverFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link IObserver}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static IObserver createcreateScenarioBuilderScreenController() {
		return ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
	}
}