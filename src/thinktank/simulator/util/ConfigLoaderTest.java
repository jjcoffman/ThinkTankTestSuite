package thinktank.simulator.util;

import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.system.AppSettings;

/**
 * The class <code>ConfigLoaderTest</code> contains tests for the class <code>{@link ConfigLoader}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class ConfigLoaderTest {
	/**
	 * Run the AppSettings getSettings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSettings_1()
		throws Exception {

		AppSettings result = ConfigLoader.getSettings();

		// add additional test code here
		assertNotNull(result);
		assertEquals(19, result.size());
		assertEquals(new Integer(24), result.get("DepthBits"));
		assertEquals(Boolean.TRUE, result.get("UseInput"));
		assertEquals(new Integer(180), result.get("FrameRate"));
		assertEquals(new Integer(480), result.get("MinHeight"));
		assertEquals(Boolean.TRUE, result.get("DisableJoysticks"));
		assertEquals("Cichlid Simulator", result.get("Title"));
		assertEquals(Boolean.FALSE, result.get("Stereo3D"));
		assertEquals("LWJGL", result.get("AudioRenderer"));
		assertEquals(new Integer(640), result.get("MinWidth"));
		assertEquals(Boolean.FALSE, result.get("VSync"));
		assertEquals(new Integer(1), result.get("Samples"));
		assertEquals(new Integer(0), result.get("StencilBits"));
		assertEquals("/com/jme3/app/Monkey.png", result.get("SettingsDialogImage"));
		assertEquals("LWJGL-OpenGL2", result.get("Renderer"));
		assertEquals(new Integer(60), result.get("Frequency"));
		assertEquals(new Integer(480), result.get("Height"));
		assertEquals(Boolean.FALSE, result.get("Fullscreen"));
		assertEquals(new Integer(24), result.get("BitsPerPixel"));
		assertEquals(new Integer(640), result.get("Width"));
	}

	/**
	 * Run the AppSettings getSettings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSettings_2()
		throws Exception {

		AppSettings result = ConfigLoader.getSettings();

		// add additional test code here
		assertNotNull(result);
		assertEquals(19, result.size());
		assertEquals(new Integer(24), result.get("DepthBits"));
		assertEquals(Boolean.TRUE, result.get("UseInput"));
		assertEquals(new Integer(180), result.get("FrameRate"));
		assertEquals(new Integer(480), result.get("MinHeight"));
		assertEquals(Boolean.TRUE, result.get("DisableJoysticks"));
		assertEquals("Cichlid Simulator", result.get("Title"));
		assertEquals(Boolean.FALSE, result.get("Stereo3D"));
		assertEquals("LWJGL", result.get("AudioRenderer"));
		assertEquals(new Integer(640), result.get("MinWidth"));
		assertEquals(Boolean.FALSE, result.get("VSync"));
		assertEquals(new Integer(1), result.get("Samples"));
		assertEquals(new Integer(0), result.get("StencilBits"));
		assertEquals("/com/jme3/app/Monkey.png", result.get("SettingsDialogImage"));
		assertEquals("LWJGL-OpenGL2", result.get("Renderer"));
		assertEquals(new Integer(60), result.get("Frequency"));
		assertEquals(new Integer(480), result.get("Height"));
		assertEquals(Boolean.FALSE, result.get("Fullscreen"));
		assertEquals(new Integer(24), result.get("BitsPerPixel"));
		assertEquals(new Integer(640), result.get("Width"));
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
		new org.junit.runner.JUnitCore().run(ConfigLoaderTest.class);
	}
}