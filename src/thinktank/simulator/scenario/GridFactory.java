package thinktank.simulator.scenario;



/**
 * The class <code>GridFactory</code> implements static methods that return instances of the class <code>{@link Grid}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class GridFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private GridFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Grid}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Grid createGrid() {
		return new Grid(Scenario.createScenario(""));
	}
}