package thinktank.simulator.actions;

import java.awt.event.ActionEvent;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AddFishActionTest</code> contains tests for the class <code>{@link AddFishAction}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class AddFishActionTest {
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
		AddFishAction fixture = AddFishActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.AddFishAction.actionPerformed(AddFishAction.java:53)
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
		AddFishAction fixture = AddFishActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.AddFishAction.actionPerformed(AddFishAction.java:53)
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
		AddFishAction fixture = AddFishActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.AddFishAction.actionPerformed(AddFishAction.java:53)
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
		AddFishAction fixture = AddFishActionFactory.createInstance();
		ActionEvent evt = new ActionEvent(new Object(), 1, "");

		fixture.actionPerformed(evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.AddFishAction.actionPerformed(AddFishAction.java:53)
	}

	/**
	 * Run the AddFishAction getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		AddFishAction result = AddFishAction.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getKeys());
		assertEquals(true, result.isEnabled());
	}

	/**
	 * Run the AddFishAction getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		AddFishAction result = AddFishAction.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getKeys());
		assertEquals(true, result.isEnabled());
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
		new org.junit.runner.JUnitCore().run(AddFishActionTest.class);
	}
}