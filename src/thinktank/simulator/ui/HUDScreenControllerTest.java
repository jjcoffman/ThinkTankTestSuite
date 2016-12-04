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
 * The class <code>HUDScreenControllerTest</code> contains tests for the class <code>{@link HUDScreenController}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class HUDScreenControllerTest {
	/**
	 * Run the HUDScreenController() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testHUDScreenController_1()
		throws Exception {

		HUDScreenController result = new HUDScreenController();

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
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();
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
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.cleanup();

		// add additional test code here
	}

	/**
	 * Run the void endSimulation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEndSimulation_1()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.endSimulation();

		// add additional test code here
	}

	/**
	 * Run the void endSimulation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEndSimulation_2()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.endSimulation();

		// add additional test code here
	}

	/**
	 * Run the void fastForward() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testFastForward_1()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.fastForward();

		// add additional test code here
	}

	/**
	 * Run the void fastForward() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testFastForward_2()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.fastForward();

		// add additional test code here
	}

	/**
	 * Run the void goToBreakpoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGoToBreakpoint_1()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.goToBreakpoint();

		// add additional test code here
	}

	/**
	 * Run the void goToBreakpoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGoToBreakpoint_2()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.goToBreakpoint();

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
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();
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
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

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
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.onStartScreen();

		// add additional test code here
	}

	/**
	 * Run the void pause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testPause_1()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.pause();

		// add additional test code here
	}

	/**
	 * Run the void pause() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testPause_2()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.pause();

		// add additional test code here
	}

	/**
	 * Run the void play() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testPlay_1()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.play();

		// add additional test code here
	}

	/**
	 * Run the void play() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testPlay_2()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.play();

		// add additional test code here
	}

	/**
	 * Run the void rewind() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRewind_1()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.rewind();

		// add additional test code here
	}

	/**
	 * Run the void rewind() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRewind_2()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.rewind();

		// add additional test code here
	}

	/**
	 * Run the void saveBreakpoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveBreakpoint_1()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.saveBreakpoint();

		// add additional test code here
	}

	/**
	 * Run the void saveBreakpoint() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveBreakpoint_2()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.saveBreakpoint();

		// add additional test code here
	}

	/**
	 * Run the void savePlayback() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSavePlayback_1()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.savePlayback();

		// add additional test code here
	}

	/**
	 * Run the void savePlayback() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSavePlayback_2()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.savePlayback();

		// add additional test code here
	}

	/**
	 * Run the void skipBack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSkipBack_1()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.skipBack();

		// add additional test code here
	}

	/**
	 * Run the void skipBack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSkipBack_2()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.skipBack();

		// add additional test code here
	}

	/**
	 * Run the void skipForward() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSkipForward_1()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.skipForward();

		// add additional test code here
	}

	/**
	 * Run the void skipForward() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSkipForward_2()
		throws Exception {
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();

		fixture.skipForward();

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
		HUDScreenController fixture = HUDScreenControllerFactory.createHUDScreenController();
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
		new org.junit.runner.JUnitCore().run(HUDScreenControllerTest.class);
	}
}