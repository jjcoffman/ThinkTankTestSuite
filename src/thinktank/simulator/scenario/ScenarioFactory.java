package thinktank.simulator.scenario;

import thinktank.simulator.environment.EnvironmentFactory;
import thinktank.simulator.environment.Environment;


/**
 * The class <code>ScenarioFactory</code> implements static methods that return instances of the class <code>{@link Scenario}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class ScenarioFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private ScenarioFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Scenario}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Scenario createScenario() {
		return Scenario.createScenario("");
	}


	/**
	 * Create an instance of the class <code>{@link Scenario}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Scenario createScenario2() {
		return Scenario.createScenario("", EnvironmentFactory.createEnvironment());
	}


	/**
	 * Create an instance of the class <code>{@link Scenario}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Scenario createScenario3() {
		return Scenario.createScenario("0123456789", (Environment) null);
	}


	/**
	 * Create an instance of the class <code>{@link Scenario}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Scenario createcreateScenario() {
		return Scenario.createScenario();
	}


	/**
	 * Create an instance of the class <code>{@link Scenario}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Scenario createScenario4() {
		return Scenario.createScenario(DEFAULT_SCENARIO.BIG_AND_BUSY);
	}
}