package thinktank.simulator.actions;

import java.awt.event.ActionEvent;
import org.junit.*;
import thinktank.simulator.main.Main;
import static org.junit.Assert.*;

/**
 * The class <code>ToggleCamModeActionTest</code> contains tests for the class <code>{@link ToggleCamModeAction}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class ToggleCamModeActionTest {
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
		ToggleCamModeAction fixture = ToggleCamModeActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.ToggleCamModeAction.actionPerformed(ToggleCamModeAction.java:67)
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
		ToggleCamModeAction fixture = ToggleCamModeActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.ToggleCamModeAction.actionPerformed(ToggleCamModeAction.java:67)
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
		ToggleCamModeAction fixture = ToggleCamModeActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.ToggleCamModeAction.actionPerformed(ToggleCamModeAction.java:67)
	}

	/**
	 * Run the ToggleCamModeAction getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		ToggleCamModeAction result = ToggleCamModeAction.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getKeys());
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the ToggleCamModeAction getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		ToggleCamModeAction result = ToggleCamModeAction.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getKeys());
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the void setTargetMode(CAM_MODE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetTargetMode_1()
		throws Exception {
		ToggleCamModeAction fixture = ToggleCamModeActionFactory.createInstance();
		thinktank.simulator.main.Main.CAM_MODE mode = thinktank.simulator.main.Main.CAM_MODE.FLY;

		fixture.setTargetMode(mode);

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
		new org.junit.runner.JUnitCore().run(ToggleCamModeActionTest.class);
	}
}