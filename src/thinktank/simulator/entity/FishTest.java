package thinktank.simulator.entity;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FishTest</code> contains tests for the class <code>{@link Fish}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class FishTest {
	/**
	 * Run the Fish() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testFish_1()
		throws Exception {

		Fish result = new Fish();

		// add additional test code here
		assertNotNull(result);
		assertEquals("unnamed", result.getName());
		assertEquals(1.0f, result.getSize(), 1.0f);
		assertEquals("male", result.getSex());
		assertEquals(0.0, result.getTargetAggression(), 1.0);
		assertEquals(null, result.getTargetFish());
		assertEquals(0, result.getTimeControl());
		assertEquals(-1.0f, result.getSpeed(), 1.0f);
		assertEquals(-1.0f, result.getBaseSpeed(), 1.0f);
		assertEquals(null, result.getObj());
		assertEquals(-6175024722291869357L, result.getID());
		assertEquals(0.0f, result.getWorldUnitWidth(), 1.0f);
		assertEquals(0.0f, result.getWorldUnitDepth(), 1.0f);
		assertEquals(0.0f, result.getWolrdUnitHeight(), 1.0f);
	}

	/**
	 * Run the float getBaseSpeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetBaseSpeed_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();

		float result = fixture.getBaseSpeed();

		// add additional test code here
		assertEquals(-1.0f, result, 0.1f);
	}

	/**
	 * Run the Fish.BEHAVIOR getBehavior() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetBehavior_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();

		Fish.BEHAVIOR result = fixture.getBehavior();

		// add additional test code here
		assertNotNull(result);
		assertEquals("LOITER", result.name());
		assertEquals("LOITER", result.toString());
		assertEquals(3, result.ordinal());
	}

	/**
	 * Run the Color getColor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetColor_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();

		Color result = fixture.getColor();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getTransparency());
		assertEquals("java.awt.Color[r=0,g=0,b=0]", result.toString());
		assertEquals(0, result.getRed());
		assertEquals(0, result.getBlue());
		assertEquals(0, result.getGreen());
		assertEquals(-16777216, result.getRGB());
		assertEquals(255, result.getAlpha());
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
		Fish fixture = FishFactory.createFish();

		String result = fixture.getName();

		// add additional test code here
		assertEquals("unnamed", result);
	}

	/**
	 * Run the String getSex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSex_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();

		String result = fixture.getSex();

		// add additional test code here
		assertEquals("male", result);
	}

	/**
	 * Run the float getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSize_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();

		float result = fixture.getSize();

		// add additional test code here
		assertEquals(1.0f, result, 0.1f);
	}

	/**
	 * Run the float getSpeed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSpeed_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();

		float result = fixture.getSpeed();

		// add additional test code here
		assertEquals(-1.0f, result, 0.1f);
	}

	/**
	 * Run the double getTargetAggression() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetTargetAggression_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();

		double result = fixture.getTargetAggression();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the Fish getTargetFish() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetTargetFish_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();

		Fish result = fixture.getTargetFish();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getTimeControl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetTimeControl_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();

		int result = fixture.getTimeControl();

		// add additional test code here
		assertEquals(0, result);
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
		Fish fixture = FishFactory.createFish();
		float tpf = 1.0f;

		fixture.move(tpf);

		// add additional test code here
	}

	/**
	 * Run the void setBaseSpeed(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetBaseSpeed_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();
		float base = 1.0f;

		fixture.setBaseSpeed(base);

		// add additional test code here
	}

	/**
	 * Run the void setBehavior(BEHAVIOR) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetBehavior_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();
		Fish.BEHAVIOR behave = Fish.BEHAVIOR.ATTACK;

		fixture.setBehavior(behave);

		// add additional test code here
	}

	/**
	 * Run the void setColor(Color) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetColor_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();
		Color color = new Color(1);

		fixture.setColor(color);

		// add additional test code here
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
		Fish fixture = FishFactory.createFish();
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
		Fish fixture = FishFactory.createFish();
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
		Fish fixture = FishFactory.createFish();
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
		Fish fixture = FishFactory.createFish();
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
		Fish fixture = FishFactory.createFish();
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
		Fish fixture = FishFactory.createFish();
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
		Fish fixture = FishFactory.createFish();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setRun() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetRun_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();

		fixture.setRun();

		// add additional test code here
	}

	/**
	 * Run the void setSex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSex_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();
		String sex = "";

		fixture.setSex(sex);

		// add additional test code here
	}

	/**
	 * Run the void setSize(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSize_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();
		float size = 1.0f;

		fixture.setSize(size);

		// add additional test code here
	}

	/**
	 * Run the void setSpeed(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSpeed_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();
		float speed = -1;

		fixture.setSpeed(speed);

		// add additional test code here
	}

	/**
	 * Run the void setSpeed(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetSpeed_2()
		throws Exception {
		Fish fixture = FishFactory.createFish();
		float speed = 1.0f;

		fixture.setSpeed(speed);

		// add additional test code here
	}

	/**
	 * Run the void setTargetAggression(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetTargetAggression_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();
		double targetAggression = 1.0;

		fixture.setTargetAggression(targetAggression);

		// add additional test code here
	}

	/**
	 * Run the void setTargetFish(Fish) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetTargetFish_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();
		Fish nextFish = FishFactory.createFish();

		fixture.setTargetFish(nextFish);

		// add additional test code here
	}

	/**
	 * Run the void setTimeControl(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetTimeControl_1()
		throws Exception {
		Fish fixture = FishFactory.createFish();
		int time = 1;

		fixture.setTimeControl(time);

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
		new org.junit.runner.JUnitCore().run(FishTest.class);
	}
}