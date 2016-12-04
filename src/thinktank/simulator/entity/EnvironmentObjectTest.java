package thinktank.simulator.entity;

import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.math.Vector3f;

/**
 * The class <code>EnvironmentObjectTest</code> contains tests for the class <code>{@link EnvironmentObject}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class EnvironmentObjectTest {
	/**
	 * Run the EnvironmentObject() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEnvironmentObject_1()
		throws Exception {

		EnvironmentObject result = new EnvironmentObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals("unnamed", result.getName());
		assertEquals(null, result.getObj());
		assertEquals(1802677422302175638L, result.getID());
		assertEquals(0.0f, result.getWorldUnitWidth(), 1.0f);
		assertEquals(0.0f, result.getWorldUnitDepth(), 1.0f);
		assertEquals(0.0f, result.getWolrdUnitHeight(), 1.0f);
	}

	/**
	 * Run the Vector3f getLoc() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetLoc_1()
		throws Exception {
		EnvironmentObject fixture = EnvironmentObjectFactory.createEnvironmentObject();

		Vector3f result = fixture.getLoc();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.EnvironmentObject.getLoc(EnvironmentObject.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		EnvironmentObject fixture = EnvironmentObjectFactory.createEnvironmentObject();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("unnamed", result);
	}

	/**
	 * Run the void setGlow(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetGlow_1()
		throws Exception {
		EnvironmentObject fixture = EnvironmentObjectFactory.createEnvironmentObject();
		boolean glow = true;

		fixture.setGlow(glow);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		EnvironmentObject fixture = EnvironmentObjectFactory.createEnvironmentObject();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetName_2()
		throws Exception {
		EnvironmentObject fixture = EnvironmentObjectFactory.createEnvironmentObject();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetName_3()
		throws Exception {
		EnvironmentObject fixture = EnvironmentObjectFactory.createEnvironmentObject();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetName_4()
		throws Exception {
		EnvironmentObject fixture = EnvironmentObjectFactory.createEnvironmentObject();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetName_5()
		throws Exception {
		EnvironmentObject fixture = EnvironmentObjectFactory.createEnvironmentObject();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetName_6()
		throws Exception {
		EnvironmentObject fixture = EnvironmentObjectFactory.createEnvironmentObject();
		String name = "";

		fixture.setName(name);

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
		new org.junit.runner.JUnitCore().run(EnvironmentObjectTest.class);
	}
}