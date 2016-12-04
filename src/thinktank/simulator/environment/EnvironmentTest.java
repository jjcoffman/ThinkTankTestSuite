package thinktank.simulator.environment;

import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.scene.Node;

/**
 * The class <code>EnvironmentTest</code> contains tests for the class <code>{@link Environment}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class EnvironmentTest {
	/**
	 * Run the Environment() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEnvironment_1()
		throws Exception {

		Environment result = new Environment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();
		Object obj = EnvironmentFactory.createEnvironment();

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();
		Object obj = EnvironmentFactory.createEnvironment();

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		assertTrue(result);
	}

	/**
	 * Run the Node getEnvirionmentNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetEnvirionmentNode_1()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();

		Node result = fixture.getEnvirionmentNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the long getID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetID_1()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();

		long result = fixture.getID();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		assertEquals(0L, result);
	}

	/**
	 * Run the Tank getTank() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetTank_1()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();

		Tank result = fixture.getTank();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the float getTempCelcius() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetTempCelcius_1()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();

		float result = fixture.getTempCelcius();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the float inchesToWorldUnits(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testInchesToWorldUnits_1()
		throws Exception {
		float inches = 1.0f;

		float result = Environment.inchesToWorldUnits(inches);

		// add additional test code here
		assertEquals(0.0254f, result, 0.1f);
	}

	/**
	 * Run the float inchesToWorldUnits(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testInchesToWorldUnits_2()
		throws Exception {
		float inches = -0.0f;

		float result = Environment.inchesToWorldUnits(inches);

		// add additional test code here
		assertEquals(-1.0f, result, 0.1f);
	}

	/**
	 * Run the void setTank(Tank) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetTank_1()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();
		Tank tank = TankFactory.createTank();

		fixture.setTank(tank);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
	}

	/**
	 * Run the void setTank(Tank) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetTank_2()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();
		Tank tank = TankFactory.createcreateTank();

		fixture.setTank(tank);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
	}

	/**
	 * Run the void setTank(Tank) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetTank_3()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();
		Tank tank = null;

		fixture.setTank(tank);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
	}

	/**
	 * Run the void setTank(Tank) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetTank_4()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();
		Tank tank = null;

		fixture.setTank(tank);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
	}

	/**
	 * Run the void setTempCelcius(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetTempCelcius_1()
		throws Exception {
		Environment fixture = EnvironmentFactory.createEnvironment();
		float temp = 1.0f;

		fixture.setTempCelcius(temp);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
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
		new org.junit.runner.JUnitCore().run(EnvironmentTest.class);
	}
}