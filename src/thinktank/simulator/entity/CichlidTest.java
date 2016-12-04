package thinktank.simulator.entity;

import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.animation.AnimChannel;
import com.jme3.animation.AnimControl;
import com.jme3.math.ColorRGBA;
import thinktank.simulator.util.CichlidRelationships;

/**
 * The class <code>CichlidTest</code> contains tests for the class <code>{@link Cichlid}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class CichlidTest {
	/**
	 * Run the Cichlid() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCichlid_1()
		throws Exception {

		Cichlid result = new Cichlid();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:163)
		assertNotNull(result);
	}

	/**
	 * Run the Cichlid(POSSIBLE_SIZES,float,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCichlid_2()
		throws Exception {
		Cichlid.POSSIBLE_SIZES size = Cichlid.POSSIBLE_SIZES.LARGE;
		float speed = 1.0f;
		String sex = "";

		Cichlid result = new Cichlid(size, speed, sex);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		assertNotNull(result);
	}

	/**
	 * Run the Cichlid(POSSIBLE_SIZES,float,String,String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCichlid_3()
		throws Exception {
		Cichlid.POSSIBLE_SIZES size = Cichlid.POSSIBLE_SIZES.LARGE;
		float speed = 1.0f;
		String sex = "";
		String name = "";

		Cichlid result = new Cichlid(size, speed, sex, name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		assertNotNull(result);
	}

	/**
	 * Run the CichlidRelationships calculateRelationships(Entity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCalculateRelationships_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid8();
		Entity entity = EntityFactory.createcreateEnvironmentObject();

		CichlidRelationships result = fixture.calculateRelationships(entity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid8(CichlidFactory.java:99)
		assertNotNull(result);
	}

	/**
	 * Run the CichlidRelationships calculateRelationships(Entity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCalculateRelationships_2()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid();
		Entity entity = EntityFactory.createcreateFish();

		CichlidRelationships result = fixture.calculateRelationships(entity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:163)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid(CichlidFactory.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the void clearRelationships() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testClearRelationships_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid3();

		fixture.clearRelationships();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid3(CichlidFactory.java:49)
	}

	/**
	 * Run the FishGhost getGhost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetGhost_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid();

		FishGhost result = fixture.getGhost();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:163)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid(CichlidFactory.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the Cichlid.POSSIBLE_COLORS getPColor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetPColor_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid3();

		Cichlid.POSSIBLE_COLORS result = fixture.getPColor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid3(CichlidFactory.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the Cichlid.POSSIBLE_SIZES getPSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetPSize_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid2();

		Cichlid.POSSIBLE_SIZES result = fixture.getPSize();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid2(CichlidFactory.java:39)
		assertNotNull(result);
	}

	/**
	 * Run the void move(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testMove_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid3();
		float tpf = 1.0f;

		fixture.move(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid3(CichlidFactory.java:49)
	}

	/**
	 * Run the void move(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testMove_2()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid4();
		float tpf = 1.0f;

		fixture.move(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid4(CichlidFactory.java:59)
	}

	/**
	 * Run the void move(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testMove_3()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid5();
		float tpf = 1.0f;

		fixture.move(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid5(CichlidFactory.java:69)
	}

	/**
	 * Run the void move(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testMove_4()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid6();
		float tpf = 1.0f;

		fixture.move(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid6(CichlidFactory.java:79)
	}

	/**
	 * Run the void move(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testMove_5()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid7();
		float tpf = 1.0f;

		fixture.move(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid7(CichlidFactory.java:89)
	}

	/**
	 * Run the void onAnimChange(AnimControl,AnimChannel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAnimChange_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid4();
		AnimControl arg0 = new AnimControl();
		AnimChannel arg1 = null;
		String arg2 = "";

		fixture.onAnimChange(arg0, arg1, arg2);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid4(CichlidFactory.java:59)
	}

	/**
	 * Run the void onAnimCycleDone(AnimControl,AnimChannel,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testOnAnimCycleDone_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid5();
		AnimControl control = new AnimControl();
		AnimChannel channel = null;
		String anim = "";

		fixture.onAnimCycleDone(control, channel, anim);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid5(CichlidFactory.java:69)
	}

	/**
	 * Run the void removeGhost() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveGhost_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid2();

		fixture.removeGhost();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid2(CichlidFactory.java:39)
	}

	/**
	 * Run the void setColor(POSSIBLE_COLORS) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetColor_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid6();
		Cichlid.POSSIBLE_COLORS color = Cichlid.POSSIBLE_COLORS.BLACK;

		fixture.setColor(color);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid6(CichlidFactory.java:79)
	}

	/**
	 * Run the void setColor(POSSIBLE_COLORS) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetColor_2()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid7();
		Cichlid.POSSIBLE_COLORS color = null;

		fixture.setColor(color);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid7(CichlidFactory.java:89)
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
		Cichlid fixture = CichlidFactory.createCichlid8();
		boolean glow = false;

		fixture.setGlow(glow);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid8(CichlidFactory.java:99)
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
		Cichlid fixture = CichlidFactory.createCichlid();
		boolean glow = true;

		fixture.setGlow(glow);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:163)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid(CichlidFactory.java:29)
	}

	/**
	 * Run the void setGlowColor(ColorRGBA) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetGlowColor_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid2();
		ColorRGBA color = new ColorRGBA();

		fixture.setGlowColor(color);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid2(CichlidFactory.java:39)
	}

	/**
	 * Run the void setSize(POSSIBLE_SIZES) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSize_1()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid4();
		Cichlid.POSSIBLE_SIZES size = Cichlid.POSSIBLE_SIZES.LARGE;

		fixture.setSize(size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:196)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid4(CichlidFactory.java:59)
	}

	/**
	 * Run the void setSize(POSSIBLE_SIZES) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSize_2()
		throws Exception {
		Cichlid fixture = CichlidFactory.createCichlid5();
		Cichlid.POSSIBLE_SIZES size = null;

		fixture.setSize(size);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.CichlidFactory.createCichlid5(CichlidFactory.java:69)
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
		new org.junit.runner.JUnitCore().run(CichlidTest.class);
	}
}