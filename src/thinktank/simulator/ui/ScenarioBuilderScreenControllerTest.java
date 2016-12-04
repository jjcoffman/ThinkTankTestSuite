package thinktank.simulator.ui;

import org.junit.*;
import thinktank.simulator.util.IObservable;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.nulldevice.NullInputSystem;
import de.lessvoid.nifty.controls.DropDownSelectionChangedEvent;
import thinktank.simulator.util.IObservableFactory;
import de.lessvoid.nifty.spi.time.TimeProvider;
import de.lessvoid.nifty.controls.DropDown;
import de.lessvoid.nifty.spi.render.RenderDevice;
import thinktank.simulator.actions.SelectEntityActionFactory;
import de.lessvoid.nifty.screen.ScreenController;
import de.lessvoid.nifty.spi.sound.SoundDevice;
import de.lessvoid.nifty.nulldevice.NullRenderDevice;
import de.lessvoid.nifty.spi.input.InputSystem;
import de.lessvoid.nifty.nulldevice.NullSoundDevice;
import static org.junit.Assert.*;
import com.jme3.app.Application;
import com.jme3.app.state.AppStateManager;
import de.lessvoid.nifty.spi.time.impl.AccurateTimeProvider;
import de.lessvoid.nifty.Nifty;

/**
 * The class <code>ScenarioBuilderScreenControllerTest</code> contains tests for the class <code>{@link ScenarioBuilderScreenController}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class ScenarioBuilderScreenControllerTest {
	/**
	 * Run the ScenarioBuilderScreenController() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testScenarioBuilderScreenController_1()
		throws Exception {

		ScenarioBuilderScreenController result = new ScenarioBuilderScreenController();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Error!", result.errorMessage());
		assertEquals("Are you sure?", result.confirmMessage());
		assertEquals(true, result.isEnabled());
		assertEquals(false, result.isInitialized());
	}

	/**
	 * Run the void addFish() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddFish_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.addFish();

		// add additional test code here
	}

	/**
	 * Run the void addFish() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddFish_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.addFish();

		// add additional test code here
	}

	/**
	 * Run the void addPlant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddPlant_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.addPlant();

		// add additional test code here
	}

	/**
	 * Run the void addPlant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddPlant_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.addPlant();

		// add additional test code here
	}

	/**
	 * Run the void addPot() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddPot_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.addPot();

		// add additional test code here
	}

	/**
	 * Run the void addPot() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddPot_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.addPot();

		// add additional test code here
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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

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
	public void testCancel_3()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

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
	public void testCancel_4()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.cancel();

		// add additional test code here
	}

	/**
	 * Run the void cancelSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCancelSave_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.cancelSave();

		// add additional test code here
	}

	/**
	 * Run the void cancelSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCancelSave_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.cancelSave();

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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.cleanup();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_3()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_4()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_5()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_6()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_7()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_8()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_9()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_10()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_11()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_12()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the void completeSave() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCompleteSave_13()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.completeSave();

		// add additional test code here
	}

	/**
	 * Run the String confirmMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testConfirmMessage_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		String result = fixture.confirmMessage();

		// add additional test code here
		assertEquals("Are you sure?", result);
	}

	/**
	 * Run the void confirmNo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testConfirmNo_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.confirmNo();

		// add additional test code here
	}

	/**
	 * Run the void confirmNo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testConfirmNo_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.confirmNo();

		// add additional test code here
	}

	/**
	 * Run the void confirmYes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testConfirmYes_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.confirmYes();

		// add additional test code here
	}

	/**
	 * Run the void confirmYes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testConfirmYes_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.confirmYes();

		// add additional test code here
	}

	/**
	 * Run the void deleteEntity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeleteEntity_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.deleteEntity();

		// add additional test code here
	}

	/**
	 * Run the void deleteEntity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeleteEntity_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.deleteEntity();

		// add additional test code here
	}

	/**
	 * Run the void done() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDone_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.done();

		// add additional test code here
	}

	/**
	 * Run the void done() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDone_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.done();

		// add additional test code here
	}

	/**
	 * Run the void done() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDone_3()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.done();

		// add additional test code here
	}

	/**
	 * Run the void done() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDone_4()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.done();

		// add additional test code here
	}

	/**
	 * Run the void done() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDone_5()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.done();

		// add additional test code here
	}

	/**
	 * Run the void done() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDone_6()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.done();

		// add additional test code here
	}

	/**
	 * Run the void done() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDone_7()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.done();

		// add additional test code here
	}

	/**
	 * Run the void done() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDone_8()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.done();

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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		AppStateManager stateManager = new AppStateManager(new Application());
		Application app = new Application();

		fixture.initialize(stateManager, app);

		// add additional test code here
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_3()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_4()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_5()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_6()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_7()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_8()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_9()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_10()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_11()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_12()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_13()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_14()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_15()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
	}

	/**
	 * Run the void onDropDownSelectionChanged(String,DropDownSelectionChangedEvent<String>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnDropDownSelectionChanged_16()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String id = "";
		DropDownSelectionChangedEvent<String> evt = new DropDownSelectionChangedEvent((DropDown<Object>) null, new Object(), 1);

		fixture.onDropDownSelectionChanged(id, evt);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onDropDownSelectionChanged(ScenarioBuilderScreenController.java:564)
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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.onEndScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onEndScreen(ScenarioBuilderScreenController.java:260)
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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onStartScreen(ScenarioBuilderScreenController.java:272)
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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onStartScreen(ScenarioBuilderScreenController.java:272)
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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onStartScreen(ScenarioBuilderScreenController.java:272)
	}

	/**
	 * Run the void onStartScreen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnStartScreen_4()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onStartScreen(ScenarioBuilderScreenController.java:272)
	}

	/**
	 * Run the void onStartScreen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnStartScreen_5()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onStartScreen(ScenarioBuilderScreenController.java:272)
	}

	/**
	 * Run the void onStartScreen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnStartScreen_6()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onStartScreen(ScenarioBuilderScreenController.java:272)
	}

	/**
	 * Run the void onStartScreen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnStartScreen_7()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onStartScreen(ScenarioBuilderScreenController.java:272)
	}

	/**
	 * Run the void onStartScreen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnStartScreen_8()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.onStartScreen();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.onStartScreen(ScenarioBuilderScreenController.java:272)
	}

	/**
	 * Run the void saveScenario() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.saveScenario();

		// add additional test code here
	}

	/**
	 * Run the void saveScenario() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.saveScenario();

		// add additional test code here
	}

	/**
	 * Run the void saveScenario() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_3()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.saveScenario();

		// add additional test code here
	}

	/**
	 * Run the void saveScenario() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_4()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.saveScenario();

		// add additional test code here
	}

	/**
	 * Run the void saveScenario() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_5()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.saveScenario();

		// add additional test code here
	}

	/**
	 * Run the void saveScenario() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_6()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.saveScenario();

		// add additional test code here
	}

	/**
	 * Run the void saveScenario() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSaveScenario_7()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();

		fixture.saveScenario();

		// add additional test code here
	}

	/**
	 * Run the void setSelectedObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSelectedObject_1()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String objNum = "0";

		fixture.setSelectedObject(objNum);

		// add additional test code here
	}

	/**
	 * Run the void setSelectedObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSelectedObject_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String objNum = "";

		fixture.setSelectedObject(objNum);

		// add additional test code here
	}

	/**
	 * Run the void setSelectedObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSelectedObject_3()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String objNum = "0";

		fixture.setSelectedObject(objNum);

		// add additional test code here
	}

	/**
	 * Run the void setSelectedObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSelectedObject_4()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String objNum = "";

		fixture.setSelectedObject(objNum);

		// add additional test code here
	}

	/**
	 * Run the void setSelectedObject(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSelectedObject_5()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		String objNum = "";

		fixture.setSelectedObject(objNum);

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
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		float tpf = 1.0f;

		fixture.update(tpf);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_3()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_4()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_5()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_6()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_7()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_8()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_9()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_10()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_11()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_12()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_13()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_14()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_15()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = new Object();

		fixture.update(o, arg);

		// add additional test code here
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_16()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = SelectEntityActionFactory.createInstance();
		Object arg = null;

		fixture.update(o, arg);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.ui.ScenarioBuilderScreenController.update(ScenarioBuilderScreenController.java:612)
	}

	/**
	 * Run the void update(IObservable,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_17()
		throws Exception {
		ScenarioBuilderScreenController fixture = ScenarioBuilderScreenControllerFactory.createScenarioBuilderScreenController();
		IObservable o = IObservableFactory.createcreateInstance();
		Object arg = new Object();

		fixture.update(o, arg);

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
		new org.junit.runner.JUnitCore().run(ScenarioBuilderScreenControllerTest.class);
	}
}