package thinktank.simulator.main;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InputListenerTest</code> contains tests for the class <code>{@link InputListener}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class InputListenerTest {
	/**
	 * Run the InputListener getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		InputListener result = InputListener.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the InputListener getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetInstance_2()
		throws Exception {

		InputListener result = InputListener.getInstance();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_1()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "ctrl-mask";
		boolean keyPressed = true;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.CTRLMaskAction.actionPerformed(CTRLMaskAction.java:57)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:118)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_2()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "ctrl-mask";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.CTRLMaskAction.actionPerformed(CTRLMaskAction.java:60)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:65)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_3()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "select-entity";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.SelectEntityAction.actionPerformed(SelectEntityAction.java:74)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:68)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_4()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "add-pot";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.AddPotAction.actionPerformed(AddPotAction.java:53)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:71)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_5()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "add-fish";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.AddFishAction.actionPerformed(AddFishAction.java:53)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:74)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_6()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "add-plant";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.AddPlantAction.actionPerformed(AddPlantAction.java:53)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:77)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_7()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "save-scenario";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.SaveScenarioAction.actionPerformed(SaveScenarioAction.java:79)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:80)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_8()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "toggle-mouselook";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.ToggleMouselookAction.actionPerformed(ToggleMouselookAction.java:47)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:83)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_9()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "toggle-cam-mode";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.ToggleCamModeAction.actionPerformed(ToggleCamModeAction.java:67)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:86)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_10()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "move-entity-left";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.MoveEntityLeftAction.actionPerformed(MoveEntityLeftAction.java:61)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:89)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_11()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "move-entity-right";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.MoveEntityRightAction.actionPerformed(MoveEntityRightAction.java:61)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:92)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_12()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "move-entity-forward";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.MoveEntityForwardAction.actionPerformed(MoveEntityForwardAction.java:61)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:95)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_13()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "move-entity-backward";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.MoveEntityBackwardAction.actionPerformed(MoveEntityBackwardAction.java:61)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:98)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_14()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "move-entity-up";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.MoveEntityUpAction.actionPerformed(MoveEntityUpAction.java:60)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:101)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_15()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "move-entity-down";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.MoveEntityDownAction.actionPerformed(MoveEntityDownAction.java:61)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:104)
	}

	/**
	 * Run the void onAction(String,boolean,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAction_16()
		throws Exception {
		InputListener fixture = InputListenerFactory.createInstance();
		String name = "rotate-entity-right";
		boolean keyPressed = false;
		float tpf = 1.0f;

		fixture.onAction(name, keyPressed, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.actions.RotateEntityRightAction.actionPerformed(RotateEntityRightAction.java:54)
		//       at thinktank.simulator.main.InputListener.onAction(InputListener.java:107)
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
		new org.junit.runner.JUnitCore().run(InputListenerTest.class);
	}
}