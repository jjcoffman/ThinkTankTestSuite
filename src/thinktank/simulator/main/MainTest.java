package thinktank.simulator.main;

import java.util.ArrayList;
import org.junit.*;
import thinktank.simulator.scenario.Grid;
import static org.junit.Assert.*;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import thinktank.simulator.scenario.ScenarioFactory;
import thinktank.simulator.scenario.Scenario;

/**
 * The class <code>MainTest</code> contains tests for the class <code>{@link Main}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class MainTest {
	/**
	 * Run the Main() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {

		Main result = new Main();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getWorkingScenario());
		assertEquals(null, result.getActiveCam());
		assertEquals(true, result.isInMenus());
		assertEquals(true, result.isMouselookActive());
		assertEquals(false, result.isCTRLDown());
		assertEquals(true, result.isShowSettings());
		assertEquals(null, result.getFlyByCamera());
		assertEquals(null, result.getContext());
		assertEquals(null, result.getListener());
		assertEquals(true, result.isPauseOnLostFocus());
		assertEquals(null, result.getAssetManager());
		assertEquals(null, result.getInputManager());
		assertEquals(null, result.getRenderManager());
		assertEquals(null, result.getAudioRenderer());
		assertEquals(null, result.getCamera());
		assertEquals(null, result.getGuiViewPort());
		assertEquals(null, result.getViewPort());
		assertEquals(null, result.getRenderer());
	}

	/**
	 * Run the void addScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddScenario_1()
		throws Exception {
		Main fixture = MainFactory.createMain();
		String scenarioName = "a";

		fixture.addScenario(scenarioName);

		// add additional test code here
	}

	/**
	 * Run the void addScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddScenario_2()
		throws Exception {
		Main fixture = MainFactory.createMain();
		String scenarioName = null;

		fixture.addScenario(scenarioName);

		// add additional test code here
	}

	/**
	 * Run the void addScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddScenario_3()
		throws Exception {
		Main fixture = MainFactory.createMain();
		String scenarioName = "";

		fixture.addScenario(scenarioName);

		// add additional test code here
	}

	/**
	 * Run the void attachToRootNode(Spatial) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAttachToRootNode_1()
		throws Exception {
		Main fixture = MainFactory.createMain();
		Spatial obj = new Geometry();

		fixture.attachToRootNode(obj);

		// add additional test code here
	}

	/**
	 * Run the void attachToRootNode(Spatial) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAttachToRootNode_2()
		throws Exception {
		Main fixture = MainFactory.createMain();
		Spatial obj = null;

		fixture.attachToRootNode(obj);

		// add additional test code here
	}

	/**
	 * Run the Main.CAM_MODE getActiveCam() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetActiveCam_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		Main.CAM_MODE result = fixture.getActiveCam();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Grid getGrid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetGrid_1()
		throws Exception {

		Grid result = Main.getGrid();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ArrayList<String> getScenarioNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetScenarioNames_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		ArrayList<String> result = fixture.getScenarioNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the long getTime() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetTime_1()
		throws Exception {

		long result = Main.getTime();

		// add additional test code here
		assertEquals(298079L, result);
	}

	/**
	 * Run the Scenario getWorkingScenario() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetWorkingScenario_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		Scenario result = fixture.getWorkingScenario();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void hideStatsInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testHideStatsInfo_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.hideStatsInfo();

		// add additional test code here
	}

	/**
	 * Run the boolean isCTRLDown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsCTRLDown_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		boolean result = fixture.isCTRLDown();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isCTRLDown() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsCTRLDown_2()
		throws Exception {
		Main fixture = MainFactory.createMain();

		boolean result = fixture.isCTRLDown();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isInMenus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsInMenus_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		boolean result = fixture.isInMenus();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isInMenus() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsInMenus_2()
		throws Exception {
		Main fixture = MainFactory.createMain();

		boolean result = fixture.isInMenus();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLoading() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsLoading_1()
		throws Exception {

		boolean result = Main.isLoading();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLoading() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsLoading_2()
		throws Exception {

		boolean result = Main.isLoading();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isMouselookActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsMouselookActive_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		boolean result = fixture.isMouselookActive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isMouselookActive() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsMouselookActive_2()
		throws Exception {
		Main fixture = MainFactory.createMain();

		boolean result = fixture.isMouselookActive();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isWorkingScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsWorkingScenario_1()
		throws Exception {
		Main fixture = MainFactory.createMain();
		String scenarioName = "";

		boolean result = fixture.isWorkingScenario(scenarioName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.Main.isWorkingScenario(Main.java:241)
		assertTrue(result);
	}

	/**
	 * Run the boolean isWorkingScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsWorkingScenario_2()
		throws Exception {
		Main fixture = MainFactory.createMain();
		String scenarioName = "";

		boolean result = fixture.isWorkingScenario(scenarioName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.Main.isWorkingScenario(Main.java:241)
		assertTrue(result);
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
		Main fixture = MainFactory.createMain();
		String binding = "";
		boolean value = true;
		float tpf = 1.0f;

		fixture.onAction(binding, value, tpf);

		// add additional test code here
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
		Main fixture = MainFactory.createMain();
		String binding = "";
		boolean value = true;
		float tpf = 1.0f;

		fixture.onAction(binding, value, tpf);

		// add additional test code here
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
		Main fixture = MainFactory.createMain();
		String binding = "Pause";
		boolean value = true;
		float tpf = 1.0f;

		fixture.onAction(binding, value, tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.jme3.app.state.AppStateManager.attach(AppStateManager.java:133)
		//       at thinktank.simulator.main.Main.pause(Main.java:481)
		//       at thinktank.simulator.main.Main.onAction(Main.java:467)
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
		Main fixture = MainFactory.createMain();
		String binding = "";
		boolean value = false;
		float tpf = 1.0f;

		fixture.onAction(binding, value, tpf);

		// add additional test code here
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
		Main fixture = MainFactory.createMain();
		String binding = "Pause";
		boolean value = false;
		float tpf = 1.0f;

		fixture.onAction(binding, value, tpf);

		// add additional test code here
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
		Main fixture = MainFactory.createMain();
		String binding = "Speed";
		boolean value = true;
		float tpf = 1.0f;

		fixture.onAction(binding, value, tpf);

		// add additional test code here
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
		Main fixture = MainFactory.createMain();
		String binding = "Speed";
		boolean value = true;
		float tpf = 1.0f;

		fixture.onAction(binding, value, tpf);

		// add additional test code here
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
		Main fixture = MainFactory.createMain();
		String binding = "Speed";
		boolean value = false;
		float tpf = 1.0f;

		fixture.onAction(binding, value, tpf);

		// add additional test code here
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
		Main fixture = MainFactory.createMain();
		String binding = "";
		boolean value = true;
		float tpf = 1.0f;

		fixture.onAction(binding, value, tpf);

		// add additional test code here
	}

	/**
	 * Run the void removeFromRootNode(Spatial) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveFromRootNode_1()
		throws Exception {
		Main fixture = MainFactory.createMain();
		Spatial obj = new Geometry();

		fixture.removeFromRootNode(obj);

		// add additional test code here
	}

	/**
	 * Run the void removeFromRootNode(Spatial) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveFromRootNode_2()
		throws Exception {
		Main fixture = MainFactory.createMain();
		Spatial obj = null;

		fixture.removeFromRootNode(obj);

		// add additional test code here
	}

	/**
	 * Run the void removeScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveScenario_1()
		throws Exception {
		Main fixture = MainFactory.createMain();
		String scenarioName = "a";

		fixture.removeScenario(scenarioName);

		// add additional test code here
	}

	/**
	 * Run the void removeScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveScenario_2()
		throws Exception {
		Main fixture = MainFactory.createMain();
		String scenarioName = null;

		fixture.removeScenario(scenarioName);

		// add additional test code here
	}

	/**
	 * Run the void removeScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveScenario_3()
		throws Exception {
		Main fixture = MainFactory.createMain();
		String scenarioName = "";

		fixture.removeScenario(scenarioName);

		// add additional test code here
	}

	/**
	 * Run the void setCTRLDown(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetCTRLDown_1()
		throws Exception {
		Main fixture = MainFactory.createMain();
		boolean ctrlDown = true;

		fixture.setCTRLDown(ctrlDown);

		// add additional test code here
	}

	/**
	 * Run the void setCamMode(CAM_MODE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetCamMode_1()
		throws Exception {
		Main fixture = MainFactory.createMain();
		Main.CAM_MODE mode = Main.CAM_MODE.FLY;

		fixture.setCamMode(mode);

		// add additional test code here
	}

	/**
	 * Run the void setCamMode(CAM_MODE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetCamMode_2()
		throws Exception {
		Main fixture = MainFactory.createMain();
		Main.CAM_MODE mode = Main.CAM_MODE.FLY;

		fixture.setCamMode(mode);

		// add additional test code here
	}

	/**
	 * Run the void setCamMode(CAM_MODE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetCamMode_3()
		throws Exception {
		Main fixture = MainFactory.createMain();
		Main.CAM_MODE mode = Main.CAM_MODE.FLY;

		fixture.setCamMode(mode);

		// add additional test code here
	}

	/**
	 * Run the void setGrid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetGrid_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.setGrid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.scenario.Grid.<init>(Grid.java:56)
		//       at thinktank.simulator.main.Main.setGrid(Main.java:334)
	}

	/**
	 * Run the void setInMenus(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetInMenus_1()
		throws Exception {
		Main fixture = MainFactory.createMain();
		boolean inMenus = true;

		fixture.setInMenus(inMenus);

		// add additional test code here
	}

	/**
	 * Run the void setWorkingScenario(Scenario) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetWorkingScenario_1()
		throws Exception {
		Main fixture = MainFactory.createMain();
		Scenario scenario = ScenarioFactory.createScenario();

		fixture.setWorkingScenario(scenario);

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
	}

	/**
	 * Run the void setWorkingScenario(Scenario) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetWorkingScenario_2()
		throws Exception {
		Main fixture = MainFactory.createMain();
		Scenario scenario = null;

		fixture.setWorkingScenario(scenario);

		// add additional test code here
	}

	/**
	 * Run the void setWorkingScenarioToDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetWorkingScenarioToDefault_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.setWorkingScenarioToDefault();

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
		//       at thinktank.simulator.main.Main.setWorkingScenarioToDefault(Main.java:327)
	}

	/**
	 * Run the void setWorkingScenarioToDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetWorkingScenarioToDefault_2()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.setWorkingScenarioToDefault();

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
		//       at thinktank.simulator.main.Main.setWorkingScenarioToDefault(Main.java:327)
	}

	/**
	 * Run the void simpleInitApp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSimpleInitApp_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.simpleInitApp();

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
		//       at thinktank.simulator.main.Main.setWorkingScenarioToDefault(Main.java:327)
		//       at thinktank.simulator.main.Main.simpleInitApp(Main.java:532)
	}

	/**
	 * Run the void simpleUpdate(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSimpleUpdate_1()
		throws Exception {
		Main fixture = MainFactory.createMain();
		float tpf = 1.0f;

		fixture.simpleUpdate(tpf);

		// add additional test code here
	}

	/**
	 * Run the void simpleUpdate(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSimpleUpdate_2()
		throws Exception {
		Main fixture = MainFactory.createMain();
		float tpf = 1.0f;

		fixture.simpleUpdate(tpf);

		// add additional test code here
	}

	/**
	 * Run the void toggleMouseMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testToggleMouseMode_1()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.toggleMouseMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.Main.toggleMouseMode(Main.java:406)
	}

	/**
	 * Run the void toggleMouseMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testToggleMouseMode_2()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.toggleMouseMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.Main.toggleMouseMode(Main.java:406)
	}

	/**
	 * Run the void toggleMouseMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testToggleMouseMode_3()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.toggleMouseMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.Main.toggleMouseMode(Main.java:406)
	}

	/**
	 * Run the void toggleMouseMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testToggleMouseMode_4()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.toggleMouseMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.Main.toggleMouseMode(Main.java:406)
	}

	/**
	 * Run the void toggleMouseMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testToggleMouseMode_5()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.toggleMouseMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.Main.toggleMouseMode(Main.java:406)
	}

	/**
	 * Run the void toggleMouseMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testToggleMouseMode_6()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.toggleMouseMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.Main.toggleMouseMode(Main.java:406)
	}

	/**
	 * Run the void toggleMouseMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testToggleMouseMode_7()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.toggleMouseMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.Main.toggleMouseMode(Main.java:406)
	}

	/**
	 * Run the void toggleMouseMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testToggleMouseMode_8()
		throws Exception {
		Main fixture = MainFactory.createMain();

		fixture.toggleMouseMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.Main.toggleMouseMode(Main.java:406)
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
		new org.junit.runner.JUnitCore().run(MainTest.class);
	}
}