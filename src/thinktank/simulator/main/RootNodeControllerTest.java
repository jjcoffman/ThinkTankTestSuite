package thinktank.simulator.main;

import org.junit.*;
import static org.junit.Assert.*;
import com.jme3.app.Application;
import com.jme3.app.state.AppStateManager;
import com.jme3.scene.Node;
import thinktank.simulator.entity.PlayerFactory;
import thinktank.simulator.entity.Player;

/**
 * The class <code>RootNodeControllerTest</code> contains tests for the class <code>{@link RootNodeController}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class RootNodeControllerTest {
	/**
	 * Run the RootNodeController(Application) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRootNodeController_1()
		throws Exception {
		Application app = MainFactory.createMain();

		RootNodeController result = new RootNodeController(app);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isEnabled());
		assertEquals(false, result.isInitialized());
	}

	/**
	 * Run the RootNodeController(Application,Player) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRootNodeController_2()
		throws Exception {
		Application app = MainFactory.createMain();
		Player player = PlayerFactory.createPlayer();

		RootNodeController result = new RootNodeController(app, player);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.Player.<init>(Player.java:156)
		//       at thinktank.simulator.entity.Player.getPlayer(Player.java:870)
		//       at thinktank.simulator.entity.PlayerFactory.createPlayer(PlayerFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the Node getRootNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetRootNode_1()
		throws Exception {
		RootNodeController fixture = RootNodeControllerFactory.createRootNodeController();

		Node result = fixture.getRootNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: com.jme3.app.Application cannot be cast to thinktank.simulator.main.Main
		//       at thinktank.simulator.main.RootNodeController.<init>(RootNodeController.java:44)
		//       at thinktank.simulator.main.RootNodeControllerFactory.createRootNodeController(RootNodeControllerFactory.java:32)
		assertNotNull(result);
	}

	/**
	 * Run the void initialize(AppStateManager,Application) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		RootNodeController fixture = RootNodeControllerFactory.createRootNodeController2();
		AppStateManager stateManager = new AppStateManager(new Application());
		Application app = new Application();

		fixture.initialize(stateManager, app);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.Player.<init>(Player.java:156)
		//       at thinktank.simulator.entity.Player.getPlayer(Player.java:870)
		//       at thinktank.simulator.entity.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at thinktank.simulator.main.RootNodeControllerFactory.createRootNodeController2(RootNodeControllerFactory.java:42)
	}

	/**
	 * Run the void update(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		RootNodeController fixture = RootNodeControllerFactory.createRootNodeController2();
		float tpf = 1.0f;

		fixture.update(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.Player.<init>(Player.java:156)
		//       at thinktank.simulator.entity.Player.getPlayer(Player.java:870)
		//       at thinktank.simulator.entity.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at thinktank.simulator.main.RootNodeControllerFactory.createRootNodeController2(RootNodeControllerFactory.java:42)
	}

	/**
	 * Run the void update(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		RootNodeController fixture = RootNodeControllerFactory.createRootNodeController3();
		float tpf = 1.0f;

		fixture.update(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.RootNodeController.update(RootNodeController.java:76)
	}

	/**
	 * Run the void update(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_3()
		throws Exception {
		RootNodeController fixture = RootNodeControllerFactory.createRootNodeController();
		float tpf = 1.0f;

		fixture.update(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: com.jme3.app.Application cannot be cast to thinktank.simulator.main.Main
		//       at thinktank.simulator.main.RootNodeController.<init>(RootNodeController.java:44)
		//       at thinktank.simulator.main.RootNodeControllerFactory.createRootNodeController(RootNodeControllerFactory.java:32)
	}

	/**
	 * Run the void update(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_4()
		throws Exception {
		RootNodeController fixture = RootNodeControllerFactory.createRootNodeController2();
		float tpf = 1.0f;

		fixture.update(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.entity.Cichlid.init(Cichlid.java:273)
		//       at thinktank.simulator.entity.Cichlid.<init>(Cichlid.java:178)
		//       at thinktank.simulator.entity.Player.<init>(Player.java:156)
		//       at thinktank.simulator.entity.Player.getPlayer(Player.java:870)
		//       at thinktank.simulator.entity.PlayerFactory.createPlayer(PlayerFactory.java:31)
		//       at thinktank.simulator.main.RootNodeControllerFactory.createRootNodeController2(RootNodeControllerFactory.java:42)
	}

	/**
	 * Run the void update(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_5()
		throws Exception {
		RootNodeController fixture = RootNodeControllerFactory.createRootNodeController3();
		float tpf = 1.0f;

		fixture.update(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.main.RootNodeController.update(RootNodeController.java:76)
	}

	/**
	 * Run the void update(float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testUpdate_6()
		throws Exception {
		RootNodeController fixture = RootNodeControllerFactory.createRootNodeController();
		float tpf = 1.0f;

		fixture.update(tpf);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: com.jme3.app.Application cannot be cast to thinktank.simulator.main.Main
		//       at thinktank.simulator.main.RootNodeController.<init>(RootNodeController.java:44)
		//       at thinktank.simulator.main.RootNodeControllerFactory.createRootNodeController(RootNodeControllerFactory.java:32)
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
		new org.junit.runner.JUnitCore().run(RootNodeControllerTest.class);
	}
}