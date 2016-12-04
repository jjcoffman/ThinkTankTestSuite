package thinktank.simulator;

import org.junit.*;
import thinktank.simulator.main.Main;
import static org.junit.Assert.*;

/**
 * The class <code>StarterTest</code> contains tests for the class <code>{@link Starter}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class StarterTest {
	/**
	 * Run the Main getClient() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetClient_1()
		throws Exception {

		Main result = Starter.getClient();

		// add additional test code here
		//assertNotNull(result);
		assertEquals(null, result.getWorkingScenario());
		assertEquals(null, result.getActiveCam());
		assertEquals(true, result.isInMenus());
		assertEquals(true, result.isMouselookActive());
		assertEquals(false, result.isCTRLDown());
		assertEquals(false, result.isShowSettings());
		assertEquals(null, result.getFlyByCamera());
		assertEquals(null, result.getContext());
		assertEquals(null, result.getListener());
		assertEquals(true, result.isPauseOnLostFocus());
		assertEquals(null, result.getAssetManager());
		assertEquals(null, result.getInputManager());
		assertEquals(null, result.getRenderManager());
		assertEquals(null, result.getAudioRenderer());
		assertEquals(null, result.getCamera());
		assertEquals(null, result.getGuiViewPort());
		assertEquals(null, result.getViewPort());
		assertEquals(null, result.getRenderer());
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		Starter.main(args);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(File.java:791)
		//       at com.jme3.system.Natives.getExtractionDir(Natives.java:62)
		//       at com.jme3.system.Natives.extractNativeLibs(Natives.java:242)
		//       at com.jme3.system.JmeDesktopSystem.initialize(JmeDesktopSystem.java:312)
		//       at com.jme3.system.JmeDesktopSystem.newContext(JmeDesktopSystem.java:231)
		//       at com.jme3.system.JmeSystem.newContext(JmeSystem.java:138)
		//       at com.jme3.app.Application.start(Application.java:385)
		//       at com.jme3.app.Application.start(Application.java:366)
		//       at com.jme3.app.SimpleApplication.start(SimpleApplication.java:131)
		//       at thinktank.simulator.Starter.main(Starter.java:57)
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
		new org.junit.runner.JUnitCore().run(StarterTest.class);
	}
}