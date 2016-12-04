package thinktank.simulator.entity;

import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.bullet.collision.shapes.BoxCollisionShape;
import com.jme3.bullet.collision.shapes.CollisionShape;

/**
 * The class <code>FishGhostTest</code> contains tests for the class <code>{@link FishGhost}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class FishGhostTest {
	/**
	 * Run the FishGhost() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testFishGhost_1()
		throws Exception {

		FishGhost result = new FishGhost();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getOwner());
		assertEquals(null, result.getPhysicsSpace());
		assertEquals(false, result.isApplyPhysicsLocal());
		assertEquals(true, result.isEnabled());
		assertEquals(null, result.getObjectId());
		assertEquals(1, result.getCollisionGroup());
		assertEquals(1, result.getCollideWithGroups());
		assertEquals(null, result.getCollisionShape());
		assertEquals(null, result.getUserObject());
	}

	/**
	 * Run the FishGhost(CollisionShape,Fish) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testFishGhost_2()
		throws Exception {
		CollisionShape ghostShape = new BoxCollisionShape();
		Fish owner = FishFactory.createFish();

		FishGhost result = new FishGhost(ghostShape, owner);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getPhysicsSpace());
		assertEquals(false, result.isApplyPhysicsLocal());
		assertEquals(true, result.isEnabled());
		assertEquals(0.0f, result.getCcdSquareMotionThreshold(), 1.0f);
		assertEquals(0.0f, result.getCcdSweptSphereRadius(), 1.0f);
		assertEquals(0.0f, result.getCcdMotionThreshold(), 1.0f);
		assertEquals(0, result.getOverlappingCount());
		assertEquals(1, result.getCollisionGroup());
		assertEquals(1, result.getCollideWithGroups());
		assertEquals(null, result.getUserObject());
	}

	/**
	 * Run the Fish getOwner() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetOwner_1()
		throws Exception {
		FishGhost fixture = FishGhostFactory.createFishGhost();

		Fish result = fixture.getOwner();

		// add additional test code here
		assertEquals(null, result);
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
		new org.junit.runner.JUnitCore().run(FishGhostTest.class);
	}
}