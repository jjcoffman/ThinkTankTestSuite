package thinktank.simulator.scenario;

import org.junit.*;
import thinktank.simulator.entity.EnvironmentObjectFactory;
import thinktank.simulator.entity.EnvironmentObject;
import thinktank.simulator.environment.Tank;
import thinktank.simulator.environment.TankFactory;
import static org.junit.Assert.*;
import com.jme3.math.Vector3f;

/**
 * The class <code>GridTest</code> contains tests for the class <code>{@link Grid}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class GridTest {
	/**
	 * Run the Grid(Scenario) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGrid_1()
		throws Exception {
		Scenario scenario = ScenarioFactory.createScenario();

		Grid result = new Grid(scenario);

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
		assertNotNull(result);
	}

	/**
	 * Run the Vector3f[][][] getGrid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetGrid_1()
		throws Exception {
		Grid fixture = GridFactory.createGrid();

		Vector3f[][][] result = fixture.getGrid();

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
		//       at thinktank.simulator.scenario.GridFactory.createGrid(GridFactory.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the int getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSize_1()
		throws Exception {
		Grid fixture = GridFactory.createGrid();

		int result = fixture.getSize();

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
		//       at thinktank.simulator.scenario.GridFactory.createGrid(GridFactory.java:29)
		assertEquals(0, result);
	}

	/**
	 * Run the float getXIncr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetXIncr_1()
		throws Exception {
		Grid fixture = GridFactory.createGrid();

		float result = fixture.getXIncr();

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
		//       at thinktank.simulator.scenario.GridFactory.createGrid(GridFactory.java:29)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float getYIncr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetYIncr_1()
		throws Exception {
		Grid fixture = GridFactory.createGrid();

		float result = fixture.getYIncr();

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
		//       at thinktank.simulator.scenario.GridFactory.createGrid(GridFactory.java:29)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float getZIncr() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetZIncr_1()
		throws Exception {
		Grid fixture = GridFactory.createGrid();

		float result = fixture.getZIncr();

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
		//       at thinktank.simulator.scenario.GridFactory.createGrid(GridFactory.java:29)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the void setGrid(Tank) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetGrid_1()
		throws Exception {
		Grid fixture = GridFactory.createGrid();
		Tank tank = TankFactory.createTank();

		fixture.setGrid(tank);

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
		//       at thinktank.simulator.scenario.GridFactory.createGrid(GridFactory.java:29)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_3()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_4()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_5()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_6()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_7()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_8()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_9()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_10()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_11()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_12()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_13()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_14()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_15()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
	}

	/**
	 * Run the void update(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_16()
		throws Exception {
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		Grid.update(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		//       at thinktank.simulator.scenario.Grid.update(Grid.java:150)
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
		new org.junit.runner.JUnitCore().run(GridTest.class);
	}
}