package thinktank.simulator.actions;

import java.awt.event.ActionEvent;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DeleteScenarioActionTest</code> contains tests for the class <code>{@link DeleteScenarioAction}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class DeleteScenarioActionTest {
	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testActionPerformed_1()
		throws Exception {
		DeleteScenarioAction fixture = DeleteScenarioActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.deleteSavedScenario(ScenarioIO.java:186)
		//       at thinktank.simulator.actions.DeleteScenarioAction.actionPerformed(DeleteScenarioAction.java:61)
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testActionPerformed_2()
		throws Exception {
		DeleteScenarioAction fixture = DeleteScenarioActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.deleteSavedScenario(ScenarioIO.java:186)
		//       at thinktank.simulator.actions.DeleteScenarioAction.actionPerformed(DeleteScenarioAction.java:61)
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testActionPerformed_3()
		throws Exception {
		DeleteScenarioAction fixture = DeleteScenarioActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.deleteSavedScenario(ScenarioIO.java:186)
		//       at thinktank.simulator.actions.DeleteScenarioAction.actionPerformed(DeleteScenarioAction.java:61)
	}

	/**
	 * Run the void actionPerformed(ActionEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testActionPerformed_4()
		throws Exception {
		DeleteScenarioAction fixture = DeleteScenarioActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.mkdir(File.java:1311)
		//       at java.io.File.mkdirs(File.java:1343)
		//       at thinktank.simulator.scenario.ScenarioIO.checkScenariosFolder(ScenarioIO.java:217)
		//       at thinktank.simulator.scenario.ScenarioIO.deleteSavedScenario(ScenarioIO.java:186)
		//       at thinktank.simulator.actions.DeleteScenarioAction.actionPerformed(DeleteScenarioAction.java:61)
	}

	/**
	 * Run the DeleteScenarioAction getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		DeleteScenarioAction result = DeleteScenarioAction.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getKeys());
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the DeleteScenarioAction getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		DeleteScenarioAction result = DeleteScenarioAction.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getKeys());
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the void setScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetScenario_1()
		throws Exception {
		DeleteScenarioAction fixture = DeleteScenarioActionFactory.createInstance();
		String scenarioName = "";

		fixture.setScenario(scenarioName);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(DeleteScenarioActionTest.class);
	}
}