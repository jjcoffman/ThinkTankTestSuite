package thinktank.simulator.scenario;

import java.io.File;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ScenarioIOTest</code> contains tests for the class <code>{@link ScenarioIO}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class ScenarioIOTest {
	/**
	 * Run the ScenarioIO() constructor test.
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testScenarioIO_1()
		throws Exception {
		ScenarioIO result = new ScenarioIO();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the boolean deleteSavedScenario(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeleteSavedScenario_1()
		throws Exception {
		File file = new File("");

		boolean result = ScenarioIO.deleteSavedScenario(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.deleteSavedScenario(ScenarioIO.java:186)
		assertTrue(result);
	}

	/**
	 * Run the boolean deleteSavedScenario(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeleteSavedScenario_2()
		throws Exception {
		File file = new File("");

		boolean result = ScenarioIO.deleteSavedScenario(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.deleteSavedScenario(ScenarioIO.java:186)
		assertTrue(result);
	}

	/**
	 * Run the boolean deleteSavedScenario(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeleteSavedScenario_3()
		throws Exception {
		File file = new File("");

		boolean result = ScenarioIO.deleteSavedScenario(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.deleteSavedScenario(ScenarioIO.java:186)
		assertTrue(result);
	}

	/**
	 * Run the ArrayList<String> getSavedScenarioList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSavedScenarioList_1()
		throws Exception {

		ArrayList<String> result = ScenarioIO.getSavedScenarioList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.getSavedScenarioList(ScenarioIO.java:203)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String> getSavedScenarioList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSavedScenarioList_2()
		throws Exception {

		ArrayList<String> result = ScenarioIO.getSavedScenarioList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.getSavedScenarioList(ScenarioIO.java:203)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String> getSavedScenarioList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSavedScenarioList_3()
		throws Exception {

		ArrayList<String> result = ScenarioIO.getSavedScenarioList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.getSavedScenarioList(ScenarioIO.java:203)
		assertNotNull(result);
	}

	/**
	 * Run the ArrayList<String> getSavedScenarioList() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSavedScenarioList_4()
		throws Exception {

		ArrayList<String> result = ScenarioIO.getSavedScenarioList();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.getSavedScenarioList(ScenarioIO.java:203)
		assertNotNull(result);
	}

	/**
	 * Run the Scenario loadScenario(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadScenario_1()
		throws Exception {
		File file = new File("");

		Scenario result = ScenarioIO.loadScenario(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.loadScenario(ScenarioIO.java:128)
		assertNotNull(result);
	}

	/**
	 * Run the Scenario loadScenario(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadScenario_2()
		throws Exception {
		File file = new File("");

		Scenario result = ScenarioIO.loadScenario(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.loadScenario(ScenarioIO.java:128)
		assertNotNull(result);
	}

	/**
	 * Run the boolean saveScenario(Scenario,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_1()
		throws Exception {
		Scenario scenario = ScenarioFactory.createScenario();
		File file = null;

		boolean result = ScenarioIO.saveScenario(scenario, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveScenario(Scenario,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_2()
		throws Exception {
		Scenario scenario = ScenarioFactory.createScenario2();
		File file = new File("");

		boolean result = ScenarioIO.saveScenario(scenario, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario2(ScenarioFactory.java:41)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveScenario(Scenario,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_3()
		throws Exception {
		Scenario scenario = ScenarioFactory.createScenario3();
		File file = new File("");

		boolean result = ScenarioIO.saveScenario(scenario, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveScenario(Scenario,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_4()
		throws Exception {
		Scenario scenario = ScenarioFactory.createScenario4();
		File file = new File("");

		boolean result = ScenarioIO.saveScenario(scenario, file);

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
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario4(ScenarioFactory.java:71)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveScenario(Scenario,File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_5()
		throws Exception {
		Scenario scenario = ScenarioFactory.createcreateScenario();
		File file = new File("");

		boolean result = ScenarioIO.saveScenario(scenario, file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:96)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:472)
		//       at thinktank.simulator.scenario.ScenarioFactory.createcreateScenario(ScenarioFactory.java:61)
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(ScenarioIOTest.class);
	}
}