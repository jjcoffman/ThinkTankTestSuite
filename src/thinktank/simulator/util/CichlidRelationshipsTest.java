package thinktank.simulator.util;

import org.junit.*;
import thinktank.simulator.entity.EntityFactory;
import thinktank.simulator.entity.Entity;
import thinktank.simulator.entity.CichlidFactory;
import thinktank.simulator.entity.Cichlid;
import static org.junit.Assert.*;

/**
 * The class <code>CichlidRelationshipsTest</code> contains tests for the class <code>{@link CichlidRelationships}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class CichlidRelationshipsTest {
	/**
	 * Run the CichlidRelationships(Cichlid,Entity) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCichlidRelationships_1()
		throws Exception {
		Cichlid cichlid = CichlidFactory.createCichlid();
		Entity otherEntity = EntityFactory.createcreateEnvironmentObject();

		CichlidRelationships result = new CichlidRelationships(cichlid, otherEntity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:163)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid(CichlidFactory.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the Cichlid getCichlid() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetCichlid_1()
		throws Exception {
		CichlidRelationships fixture = CichlidRelationshipsFactory.createCichlidRelationships();

		Cichlid result = fixture.getCichlid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:163)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid(CichlidFactory.java:29)
		//       at thinktank.simulator.util.CichlidRelationshipsFactory.createCichlidRelationships(CichlidRelationshipsFactory.java:33)
		assertNotNull(result);
	}

	/**
	 * Run the Entity getOtherEntity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetOtherEntity_1()
		throws Exception {
		CichlidRelationships fixture = CichlidRelationshipsFactory.createCichlidRelationships2();

		Entity result = fixture.getOtherEntity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid2(CichlidFactory.java:39)
		//       at thinktank.simulator.util.CichlidRelationshipsFactory.createCichlidRelationships2(CichlidRelationshipsFactory.java:43)
		assertNotNull(result);
	}

	/**
	 * Run the double getRange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetRange_1()
		throws Exception {
		CichlidRelationships fixture = CichlidRelationshipsFactory.createCichlidRelationships();

		double result = fixture.getRange();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:163)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid(CichlidFactory.java:29)
		//       at thinktank.simulator.util.CichlidRelationshipsFactory.createCichlidRelationships(CichlidRelationshipsFactory.java:33)
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the int getVisibility() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetVisibility_1()
		throws Exception {
		CichlidRelationships fixture = CichlidRelationshipsFactory.createCichlidRelationships2();

		int result = fixture.getVisibility();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid2(CichlidFactory.java:39)
		//       at thinktank.simulator.util.CichlidRelationshipsFactory.createCichlidRelationships2(CichlidRelationshipsFactory.java:43)
		assertEquals(0, result);
	}

	/**
	 * Run the void setRange(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetRange_1()
		throws Exception {
		CichlidRelationships fixture = CichlidRelationshipsFactory.createCichlidRelationships();
		double range = 1.0;

		fixture.setRange(range);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:163)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid(CichlidFactory.java:29)
		//       at thinktank.simulator.util.CichlidRelationshipsFactory.createCichlidRelationships(CichlidRelationshipsFactory.java:33)
	}

	/**
	 * Run the void setVisibility(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetVisibility_1()
		throws Exception {
		CichlidRelationships fixture = CichlidRelationshipsFactory.createCichlidRelationships2();
		int visibility = 1;

		fixture.setVisibility(visibility);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid2(CichlidFactory.java:39)
		//       at thinktank.simulator.util.CichlidRelationshipsFactory.createCichlidRelationships2(CichlidRelationshipsFactory.java:43)
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
		new org.junit.runner.JUnitCore().run(CichlidRelationshipsTest.class);
	}
}