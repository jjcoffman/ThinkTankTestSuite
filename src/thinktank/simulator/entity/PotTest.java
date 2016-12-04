package thinktank.simulator.entity;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PotTest</code> contains tests for the class <code>{@link Pot}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class PotTest {
	/**
	 * Run the Pot() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testPot_1()
		throws Exception {

		Pot result = new Pot();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Pot.init(Pot.java:84)
		//       at thinktank.simulator.entity.Pot.<init>(Pot.java:56)
		assertNotNull(result);
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
		Pot fixture = PotFactory.createPot();
		boolean glow = false;

		fixture.setGlow(glow);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Pot.init(Pot.java:84)
		//       at thinktank.simulator.entity.Pot.<init>(Pot.java:56)
		//       at thinktank.simulator.entity.PotFactory.createPot(PotFactory.java:29)
	}

	/**
	 * Run the void setGlow(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetGlow_2()
		throws Exception {
		Pot fixture = PotFactory.createPot();
		boolean glow = false;

		fixture.setGlow(glow);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Pot.init(Pot.java:84)
		//       at thinktank.simulator.entity.Pot.<init>(Pot.java:56)
		//       at thinktank.simulator.entity.PotFactory.createPot(PotFactory.java:29)
	}

	/**
	 * Run the void setGlow(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetGlow_3()
		throws Exception {
		Pot fixture = PotFactory.createPot();
		boolean glow = true;

		fixture.setGlow(glow);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Pot.init(Pot.java:84)
		//       at thinktank.simulator.entity.Pot.<init>(Pot.java:56)
		//       at thinktank.simulator.entity.PotFactory.createPot(PotFactory.java:29)
	}

	/**
	 * Run the void setGlow(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetGlow_4()
		throws Exception {
		Pot fixture = PotFactory.createPot();
		boolean glow = true;

		fixture.setGlow(glow);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Pot.init(Pot.java:84)
		//       at thinktank.simulator.entity.Pot.<init>(Pot.java:56)
		//       at thinktank.simulator.entity.PotFactory.createPot(PotFactory.java:29)
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
		new org.junit.runner.JUnitCore().run(PotTest.class);
	}
}