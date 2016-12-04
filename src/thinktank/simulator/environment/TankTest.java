package thinktank.simulator.environment;

import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.terrain.geomipmap.TerrainQuad;

/**
 * The class <code>TankTest</code> contains tests for the class <code>{@link Tank}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class TankTest {
	/**
	 * Run the Tank createTank() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreateTank_1()
		throws Exception {

		Tank result = Tank.createTank();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:134)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:418)
		assertNotNull(result);
	}

	/**
	 * Run the Tank createTank(TANK_TYPE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreateTank_2()
		throws Exception {
		TANK_TYPE type = TANK_TYPE.FIFTEEN_GAL;

		Tank result = Tank.createTank(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		assertNotNull(result);
	}

	/**
	 * Run the Node getNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetNode_1()
		throws Exception {
		Tank fixture = TankFactory.createcreateTank();

		Node result = fixture.getNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:134)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:418)
		//       at thinktank.simulator.environment.TankFactory.createcreateTank(TankFactory.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the Spatial getSpatial() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSpatial_1()
		throws Exception {
		Tank fixture = TankFactory.createTank();

		Spatial result = fixture.getSpatial();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.TankFactory.createTank(TankFactory.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the TerrainQuad getTerrain() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetTerrain_1()
		throws Exception {
		Tank fixture = TankFactory.createTank();

		TerrainQuad result = fixture.getTerrain();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.TankFactory.createTank(TankFactory.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the TANK_TYPE getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		Tank fixture = TankFactory.createcreateTank();

		TANK_TYPE result = fixture.getType();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:134)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:418)
		//       at thinktank.simulator.environment.TankFactory.createcreateTank(TankFactory.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the float getWolrdUnitHeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetWolrdUnitHeight_1()
		throws Exception {
		Tank fixture = TankFactory.createcreateTank();

		float result = fixture.getWolrdUnitHeight();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:134)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:418)
		//       at thinktank.simulator.environment.TankFactory.createcreateTank(TankFactory.java:29)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float getWorldUnitDepth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetWorldUnitDepth_1()
		throws Exception {
		Tank fixture = TankFactory.createTank();

		float result = fixture.getWorldUnitDepth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.TankFactory.createTank(TankFactory.java:39)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float getWorldUnitWidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetWorldUnitWidth_1()
		throws Exception {
		Tank fixture = TankFactory.createTank();

		float result = fixture.getWorldUnitWidth();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.TankFactory.createTank(TankFactory.java:39)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float getX() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetX_1()
		throws Exception {
		Tank fixture = TankFactory.createcreateTank();

		float result = fixture.getX();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:134)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:418)
		//       at thinktank.simulator.environment.TankFactory.createcreateTank(TankFactory.java:29)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float getY() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetY_1()
		throws Exception {
		Tank fixture = TankFactory.createTank();

		float result = fixture.getY();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.TankFactory.createTank(TankFactory.java:39)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float getZ() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetZ_1()
		throws Exception {
		Tank fixture = TankFactory.createcreateTank();

		float result = fixture.getZ();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:134)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:418)
		//       at thinktank.simulator.environment.TankFactory.createcreateTank(TankFactory.java:29)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the void setTerrain(TerrainQuad) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetTerrain_1()
		throws Exception {
		Tank fixture = TankFactory.createcreateTank();
		TerrainQuad terrain = new TerrainQuad();

		fixture.setTerrain(terrain);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:134)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:418)
		//       at thinktank.simulator.environment.TankFactory.createcreateTank(TankFactory.java:29)
	}

	/**
	 * Run the void setType(TANK_TYPE) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetType_1()
		throws Exception {
		Tank fixture = TankFactory.createTank();
		TANK_TYPE type = TANK_TYPE.FIFTEEN_GAL;

		fixture.setType(type);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.TankFactory.createTank(TankFactory.java:39)
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
		new org.junit.runner.JUnitCore().run(TankTest.class);
	}
}