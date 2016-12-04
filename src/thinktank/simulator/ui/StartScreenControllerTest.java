package thinktank.simulator.ui;

import org.junit.*;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.nulldevice.NullInputSystem;
import de.lessvoid.nifty.spi.time.TimeProvider;
import de.lessvoid.nifty.spi.render.RenderDevice;
import de.lessvoid.nifty.screen.ScreenController;
import de.lessvoid.nifty.spi.sound.SoundDevice;
import de.lessvoid.nifty.nulldevice.NullRenderDevice;
import de.lessvoid.nifty.spi.input.InputSystem;
import de.lessvoid.nifty.nulldevice.NullSoundDevice;
import de.lessvoid.nifty.Nifty;
import static org.junit.Assert.*;
import com.jme3.app.Application;
import com.jme3.app.state.AppStateManager;
import de.lessvoid.nifty.spi.time.impl.AccurateTimeProvider;

/**
 * The class <code>StartScreenControllerTest</code> contains tests for the class <code>{@link StartScreenController}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class StartScreenControllerTest {
	/**
	 * Run the StartScreenController() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testStartScreenController_1()
		throws Exception {

		StartScreenController result = new StartScreenController();

		// add additional test code here
		assertNotNull(result);
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
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();
		Nifty nifty = new Nifty(new NullRenderDevice(), new NullSoundDevice(), new NullInputSystem(), new AccurateTimeProvider());
		Screen screen = new Screen(new Nifty(new NullRenderDevice(), new NullSoundDevice(), new NullInputSystem(), new AccurateTimeProvider()), "", new HUDScreenController(), new AccurateTimeProvider());

		fixture.bind(nifty, screen);

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
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.cleanup();

		// add additional test code here
	}

	/**
	 * Run the void enterScenarioBuilder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEnterScenarioBuilder_1()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.enterScenarioBuilder();

		// add additional test code here
	}

	/**
	 * Run the void enterScenarioBuilder() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEnterScenarioBuilder_2()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.enterScenarioBuilder();

		// add additional test code here
	}

	/**
	 * Run the void enterScenarioBuilderNew() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEnterScenarioBuilderNew_1()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.enterScenarioBuilderNew();

		// add additional test code here
	}

	/**
	 * Run the void enterScenarioBuilderNew() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEnterScenarioBuilderNew_2()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.enterScenarioBuilderNew();

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
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();
		AppStateManager stateManager = new AppStateManager(new Application());
		Application app = new Application();

		fixture.initialize(stateManager, app);

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
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.onEndScreen();

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
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.StartScreenController.onStartScreen(StartScreenController.java:146)
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
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.StartScreenController.onStartScreen(StartScreenController.java:146)
	}

	/**
	 * Run the void onStartScreen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnStartScreen_3()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.StartScreenController.onStartScreen(StartScreenController.java:146)
	}

	/**
	 * Run the void quitGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testQuitGame_1()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.quitGame();

		// add additional test code here
	}

	/**
	 * Run the void quitGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testQuitGame_2()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.quitGame();

		// add additional test code here
	}

	/**
	 * Run the void scenarioMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testScenarioMenu_1()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.scenarioMenu();

		// add additional test code here
	}

	/**
	 * Run the void scenarioMenu() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testScenarioMenu_2()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.scenarioMenu();

		// add additional test code here
	}

	/**
	 * Run the void startGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testStartGame_1()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.startGame();

		// add additional test code here
	}

	/**
	 * Run the void startGame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testStartGame_2()
		throws Exception {
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();

		fixture.startGame();

		// add additional test code here
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
		StartScreenController fixture = StartScreenControllerFactory.createStartScreenController();
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
		new org.junit.runner.JUnitCore().run(StartScreenControllerTest.class);
	}
}