package thinktank.simulator.entity;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EntityFactoryTest</code> contains tests for the class <code>{@link EntityFactory}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class EntityFactoryTest {
	/**
	 * Run the Cichlid createCichlid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreateCichlid_1()
		throws Exception {

		Cichlid result = EntityFactory.createCichlid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:163)
		//       at thinktank.simulator.entity.EntityFactory.createCichlid(EntityFactory.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the Cichlid createCichlid(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreateCichlid_2()
		throws Exception {
		String name = "";

		Cichlid result = EntityFactory.createCichlid(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:163)
		//       at thinktank.simulator.entity.EntityFactory.createCichlid(EntityFactory.java:47)
		assertNotNull(result);
	}

	/**
	 * Run the Plant createPlant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreatePlant_1()
		throws Exception {

		Plant result = EntityFactory.createPlant();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Plant.init(Plant.java:85)
		//       at thinktank.simulator.entity.Plant.<init>(Plant.java:57)
		//       at thinktank.simulator.entity.EntityFactory.createPlant(EntityFactory.java:58)
		assertNotNull(result);
	}

	/**
	 * Run the Pot createPot() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreatePot_1()
		throws Exception {

		Pot result = EntityFactory.createPot();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Pot.init(Pot.java:84)
		//       at thinktank.simulator.entity.Pot.<init>(Pot.java:56)
		//       at thinktank.simulator.entity.EntityFactory.createPot(EntityFactory.java:70)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(EntityFactoryTest.class);
	}
}