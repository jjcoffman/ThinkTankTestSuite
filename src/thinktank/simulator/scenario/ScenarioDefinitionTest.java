package thinktank.simulator.scenario;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ScenarioDefinitionTest</code> contains tests for the class <code>{@link ScenarioDefinition}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class ScenarioDefinitionTest {
	/**
	 * Run the Scenario genScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGenScenario_1()
		throws Exception {
		String defName = "";

		Scenario result = ScenarioDefinition.genScenario(defName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Scenario genScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGenScenario_2()
		throws Exception {
		String defName = "";

		Scenario result = ScenarioDefinition.genScenario(defName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Scenario genScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGenScenario_3()
		throws Exception {
		String defName = "";

		Scenario result = ScenarioDefinition.genScenario(defName);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Scenario genScenario(DEFAULT_SCENARIO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGenScenario_4()
		throws Exception {
		DEFAULT_SCENARIO def = DEFAULT_SCENARIO.BIG_AND_BUSY;

		Scenario result = ScenarioDefinition.genScenario(def);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		//       at thinktank.simulator.scenario.ScenarioDefinition.genScenario(ScenarioDefinition.java:452)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isDefault(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsDefault_1()
		throws Exception {
		String defName = "";

		boolean result = ScenarioDefinition.isDefault(defName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefault(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsDefault_2()
		throws Exception {
		String defName = "";

		boolean result = ScenarioDefinition.isDefault(defName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isDefault(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsDefault_3()
		throws Exception {
		String defName = "";

		boolean result = ScenarioDefinition.isDefault(defName);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ScenarioDefinitionTest.class);
	}
}