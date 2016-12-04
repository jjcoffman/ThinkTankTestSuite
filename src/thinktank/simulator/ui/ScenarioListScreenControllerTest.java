package thinktank.simulator.ui;

import java.util.List;
import java.util.Vector;
import de.lessvoid.nifty.screen.ScreenController;
import de.lessvoid.nifty.spi.sound.SoundDevice;
import de.lessvoid.nifty.nulldevice.NullRenderDevice;
import de.lessvoid.nifty.spi.input.InputSystem;
import de.lessvoid.nifty.nulldevice.NullSoundDevice;
import org.junit.*;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.nulldevice.NullInputSystem;
import de.lessvoid.nifty.spi.time.TimeProvider;
import de.lessvoid.nifty.spi.render.RenderDevice;
import de.lessvoid.nifty.controls.ListBox;
import static org.junit.Assert.*;
import com.jme3.app.Application;
import com.jme3.app.state.AppStateManager;
import de.lessvoid.nifty.spi.time.impl.AccurateTimeProvider;
import de.lessvoid.nifty.controls.ListBoxSelectionChangedEvent;
import de.lessvoid.nifty.Nifty;

/**
 * The class <code>ScenarioListScreenControllerTest</code> contains tests for the class <code>{@link ScenarioListScreenController}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class ScenarioListScreenControllerTest {
	/**
	 * Run the ScenarioListScreenController() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testScenarioListScreenController_1()
		throws Exception {

		ScenarioListScreenController result = new ScenarioListScreenController();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Error!", result.errorMessage());
		assertEquals("Loading, please wait...", result.loadingMessage());
		assertEquals(true, result.isEnabled());
		assertEquals(false, result.isInitialized());
	}

	/**
	 * Run the void bind(Nifty,Screen) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testBind_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();
		Nifty nifty = new Nifty(new NullRenderDevice(), new NullSoundDevice(), new NullInputSystem(), new AccurateTimeProvider());
		Screen screen = new Screen(new Nifty(new NullRenderDevice(), new NullSoundDevice(), new NullInputSystem(), new AccurateTimeProvider()), "", new HUDScreenController(), new AccurateTimeProvider());

		fixture.bind(nifty, screen);

		// add additional test code here
	}

	/**
	 * Run the void cancel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCancel_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.cancel();

		// add additional test code here
	}

	/**
	 * Run the void cancel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCancel_2()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.cancel();

		// add additional test code here
	}

	/**
	 * Run the void cleanup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCleanup_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.cleanup();

		// add additional test code here
	}

	/**
	 * Run the void confirm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testConfirm_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.confirm();

		// add additional test code here
	}

	/**
	 * Run the void confirm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testConfirm_2()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.confirm();

		// add additional test code here
	}

	/**
	 * Run the void deleteSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeleteSelected_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.deleteSelected();

		// add additional test code here
	}

	/**
	 * Run the void deleteSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeleteSelected_2()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.deleteSelected();

		// add additional test code here
	}

	/**
	 * Run the void deleteSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeleteSelected_3()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.deleteSelected();

		// add additional test code here
	}

	/**
	 * Run the void deleteSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeleteSelected_4()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.deleteSelected();

		// add additional test code here
	}

	/**
	 * Run the void deleteSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeleteSelected_5()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.deleteSelected();

		// add additional test code here
	}

	/**
	 * Run the String errorMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testErrorMessage_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		String result = fixture.errorMessage();

		// add additional test code here
		assertEquals("Error!", result);
	}

	/**
	 * Run the void errorOK() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testErrorOK_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.errorOK();

		// add additional test code here
	}

	/**
	 * Run the void errorOK() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testErrorOK_2()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.errorOK();

		// add additional test code here
	}

	/**
	 * Run the void initialize(AppStateManager,Application) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();
		AppStateManager stateManager = new AppStateManager(new Application());
		Application app = new Application();

		fixture.initialize(stateManager, app);

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_2()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_3()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_4()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_5()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_6()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_7()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_8()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_9()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_10()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_11()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_12()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_13()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the void loadSelected() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadSelected_14()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.loadSelected();

		// add additional test code here
	}

	/**
	 * Run the String loadingMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testLoadingMessage_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		String result = fixture.loadingMessage();

		// add additional test code here
		assertEquals("Loading, please wait...", result);
	}

	/**
	 * Run the void mainMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testMainMenu_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.mainMenu();

		// add additional test code here
	}

	/**
	 * Run the void mainMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testMainMenu_2()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.mainMenu();

		// add additional test code here
	}

	/**
	 * Run the void onEndScreen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnEndScreen_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.onEndScreen();

		// add additional test code here
	}

	/**
	 * Run the void onListBoxSelectionChanged(String,ListBoxSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnListBoxSelectionChanged_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();
		String id = "";
		ListBoxSelectionChangedEvent<String> evt = new ListBoxSelectionChangedEvent((ListBox<Object>) null, new Vector(), new Vector());

		fixture.onListBoxSelectionChanged(id, evt);

		// add additional test code here
	}

	/**
	 * Run the void onStartScreen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnStartScreen_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioListScreenController.onStartScreen(ScenarioListScreenController.java:178)
	}

	/**
	 * Run the void onStartScreen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnStartScreen_2()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioListScreenController.onStartScreen(ScenarioListScreenController.java:178)
	}

	/**
	 * Run the void update(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		ScenarioListScreenController fixture = ScenarioListScreenControllerFactory.createScenarioListScreenController();
		float tpf = 1.0f;

		fixture.update(tpf);

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
		new org.junit.runner.JUnitCore().run(ScenarioListScreenControllerTest.class);
	}
}