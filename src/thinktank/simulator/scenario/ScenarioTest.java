package thinktank.simulator.scenario;

import java.util.Iterator;
import thinktank.simulator.entity.Entity;
import thinktank.simulator.environment.Environment;
import thinktank.simulator.entity.EnvironmentObjectFactory;
import org.junit.*;
import thinktank.simulator.entity.Fish;
import static org.junit.Assert.*;
import com.jme3.scene.Node;
import thinktank.simulator.entity.EntityFactory;
import thinktank.simulator.entity.EnvironmentObject;
import thinktank.simulator.environment.EnvironmentFactory;
import thinktank.simulator.entity.FishFactory;

/**
 * The class <code>ScenarioTest</code> contains tests for the class <code>{@link Scenario}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class ScenarioTest {
	/**
	 * Run the void addEnvironmentObject(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddEnvironmentObject_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario4();
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		fixture.addEnvironmentObject(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario4(ScenarioFactory.java:71)
	}

	/**
	 * Run the void addEnvironmentObject(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddEnvironmentObject_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createcreateScenario();
		EnvironmentObject obj = null;

		fixture.addEnvironmentObject(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:96)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:472)
		//       at thinktank.simulator.scenario.ScenarioFactory.createcreateScenario(ScenarioFactory.java:61)
	}

	/**
	 * Run the void addFish(Fish) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddFish_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario();
		Fish fish = FishFactory.createFish();

		fixture.addFish(fish);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
	}

	/**
	 * Run the void addFish(Fish) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testAddFish_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario2();
		Fish fish = null;

		fixture.addFish(fish);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario2(ScenarioFactory.java:41)
	}

	/**
	 * Run the Scenario createScenario() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreateScenario_1()
		throws Exception {

		Scenario result = Scenario.createScenario();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:96)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:472)
		assertNotNull(result);
	}

	/**
	 * Run the Scenario createScenario(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreateScenario_2()
		throws Exception {
		String name = "";

		Scenario result = Scenario.createScenario(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		assertNotNull(result);
	}

	/**
	 * Run the Scenario createScenario(DEFAULT_SCENARIO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreateScenario_3()
		throws Exception {
		DEFAULT_SCENARIO def = DEFAULT_SCENARIO.BIG_AND_BUSY;

		Scenario result = Scenario.createScenario(def);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		assertNotNull(result);
	}

	/**
	 * Run the Scenario createScenario(DEFAULT_SCENARIO) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreateScenario_4()
		throws Exception {
		DEFAULT_SCENARIO def = null;

		Scenario result = Scenario.createScenario(def);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Scenario createScenario(String,Environment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testCreateScenario_5()
		throws Exception {
		String name = "";
		Environment eviron = EnvironmentFactory.createEnvironment();

		Scenario result = Scenario.createScenario(name, eviron);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		assertNotNull(result);
	}

	/**
	 * Run the void deselectEntity(Entity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeselectEntity_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createcreateScenario();
		Entity entity = EntityFactory.createcreatePlant();

		fixture.deselectEntity(entity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:96)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:472)
		//       at thinktank.simulator.scenario.ScenarioFactory.createcreateScenario(ScenarioFactory.java:61)
	}

	/**
	 * Run the void deselectEntity(Entity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeselectEntity_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario();
		Entity entity = EntityFactory.createcreatePlayer();

		fixture.deselectEntity(entity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
	}

	/**
	 * Run the void deselectEntity(Entity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeselectEntity_3()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario2();
		Entity entity = EntityFactory.createcreatePot();

		fixture.deselectEntity(entity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario2(ScenarioFactory.java:41)
	}

	/**
	 * Run the void deselectEntity(Entity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testDeselectEntity_4()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario3();
		Entity entity = null;

		fixture.deselectEntity(entity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario4();
		Object obj = ScenarioFactory.createcreateScenario();

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario4(ScenarioFactory.java:71)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario();
		Object obj = ScenarioFactory.createScenario2();

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
		assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario3();
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
		assertTrue(result);
	}

	/**
	 * Run the Entity getEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetEntity_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario2();
		String geometryName = "";

		Entity result = fixture.getEntity(geometryName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario2(ScenarioFactory.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the Entity getEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetEntity_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario3();
		String geometryName = "";

		Entity result = fixture.getEntity(geometryName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the Entity getEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetEntity_3()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario4();
		String geometryName = "";

		Entity result = fixture.getEntity(geometryName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario4(ScenarioFactory.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the Entity getEntity(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetEntity_4()
		throws Exception {
		Scenario fixture = ScenarioFactory.createcreateScenario();
		String geometryName = "";

		Entity result = fixture.getEntity(geometryName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:96)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:472)
		//       at thinktank.simulator.scenario.ScenarioFactory.createcreateScenario(ScenarioFactory.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the Node getEntityNode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetEntityNode_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario();

		Node result = fixture.getEntityNode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the Environment getEnvironment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetEnvironment_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario3();

		Environment result = fixture.getEnvironment();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the Iterator<EnvironmentObject> getEnvironmentObjects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetEnvironmentObjects_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario4();

		Iterator<EnvironmentObject> result = fixture.getEnvironmentObjects();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario4(ScenarioFactory.java:71)
		assertNotNull(result);
	}

	/**
	 * Run the Iterator<Fish> getFish() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetFish_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createcreateScenario();

		Iterator<Fish> result = fixture.getFish();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:96)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:472)
		//       at thinktank.simulator.scenario.ScenarioFactory.createcreateScenario(ScenarioFactory.java:61)
		assertNotNull(result);
	}

	/**
	 * Run the long getID() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetID_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario();

		long result = fixture.getID();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
		assertEquals(0L, result);
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
		Scenario fixture = ScenarioFactory.createScenario2();

		String result = fixture.getName();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario2(ScenarioFactory.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the Entity getSelectedEntity() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testGetSelectedEntity_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario();

		Entity result = fixture.getSelectedEntity();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testHasPlayer_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario();

		boolean result = fixture.hasPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
		assertTrue(result);
	}

	/**
	 * Run the boolean hasPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testHasPlayer_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario2();

		boolean result = fixture.hasPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario2(ScenarioFactory.java:41)
		assertTrue(result);
	}

	/**
	 * Run the void init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario3();

		fixture.init();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
	}

	/**
	 * Run the boolean isEditingMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsEditingMode_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario4();

		boolean result = fixture.isEditingMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario4(ScenarioFactory.java:71)
		assertTrue(result);
	}

	/**
	 * Run the boolean isEditingMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsEditingMode_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createcreateScenario();

		boolean result = fixture.isEditingMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:96)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:472)
		//       at thinktank.simulator.scenario.ScenarioFactory.createcreateScenario(ScenarioFactory.java:61)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMovingMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsMovingMode_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario2();

		boolean result = fixture.isMovingMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario2(ScenarioFactory.java:41)
		assertTrue(result);
	}

	/**
	 * Run the boolean isMovingMode() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testIsMovingMode_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario3();

		boolean result = fixture.isMovingMode();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
		assertTrue(result);
	}

	/**
	 * Run the void removeEnvironmentObject(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveEnvironmentObject_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario3();
		int index = 1;

		fixture.removeEnvironmentObject(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
	}

	/**
	 * Run the void removeEnvironmentObject(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveEnvironmentObject_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario4();
		int index = -1;

		fixture.removeEnvironmentObject(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario4(ScenarioFactory.java:71)
	}

	/**
	 * Run the void removeEnvironmentObject(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveEnvironmentObject_3()
		throws Exception {
		Scenario fixture = ScenarioFactory.createcreateScenario();
		int index = 1;

		fixture.removeEnvironmentObject(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:96)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:472)
		//       at thinktank.simulator.scenario.ScenarioFactory.createcreateScenario(ScenarioFactory.java:61)
	}

	/**
	 * Run the void removeEnvironmentObject(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveEnvironmentObject_4()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario();
		EnvironmentObject obj = EnvironmentObjectFactory.createEnvironmentObject();

		fixture.removeEnvironmentObject(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
	}

	/**
	 * Run the void removeEnvironmentObject(EnvironmentObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveEnvironmentObject_5()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario2();
		EnvironmentObject obj = null;

		fixture.removeEnvironmentObject(obj);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario2(ScenarioFactory.java:41)
	}

	/**
	 * Run the void removeFish(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveFish_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createcreateScenario();
		int index = 1;

		fixture.removeFish(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:96)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:472)
		//       at thinktank.simulator.scenario.ScenarioFactory.createcreateScenario(ScenarioFactory.java:61)
	}

	/**
	 * Run the void removeFish(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveFish_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario();
		int index = -1;

		fixture.removeFish(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
	}

	/**
	 * Run the void removeFish(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveFish_3()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario2();
		int index = 1;

		fixture.removeFish(index);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario2(ScenarioFactory.java:41)
	}

	/**
	 * Run the void removeFish(Fish) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveFish_4()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario3();
		Fish fish = FishFactory.createFish();

		fixture.removeFish(fish);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
	}

	/**
	 * Run the void removeFish(Fish) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testRemoveFish_5()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario4();
		Fish fish = null;

		fixture.removeFish(fish);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario4(ScenarioFactory.java:71)
	}

	/**
	 * Run the void selectEntity(Entity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSelectEntity_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario2();
		Entity entity = EntityFactory.createcreateEnvironmentObject();

		fixture.selectEntity(entity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.environment.EnvironmentFactory.createEnvironment(EnvironmentFactory.java:29)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario2(ScenarioFactory.java:41)
	}

	/**
	 * Run the void selectEntity(Entity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSelectEntity_2()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario3();
		Entity entity = EntityFactory.createcreateFish();

		fixture.selectEntity(entity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
	}

	/**
	 * Run the void selectEntity(Entity) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSelectEntity_3()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario4();
		Entity entity = null;

		fixture.selectEntity(entity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario4(ScenarioFactory.java:71)
	}

	/**
	 * Run the void setEditingMode(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetEditingMode_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario();
		boolean editingMode = true;

		fixture.setEditingMode(editingMode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:481)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario(ScenarioFactory.java:31)
	}

	/**
	 * Run the void setEnvironment(Environment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetEnvironment_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createScenario4();
		Environment environment = EnvironmentFactory.createEnvironment();

		fixture.setEnvironment(environment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:105)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:502)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario4(ScenarioFactory.java:71)
	}

	/**
	 * Run the void setMovingMode(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	@Test
	public void testSetMovingMode_1()
		throws Exception {
		Scenario fixture = ScenarioFactory.createcreateScenario();
		boolean movingMode = true;

		fixture.setMovingMode(movingMode);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:96)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:472)
		//       at thinktank.simulator.scenario.ScenarioFactory.createcreateScenario(ScenarioFactory.java:61)
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
		Scenario fixture = ScenarioFactory.createScenario3();
		String name = "";

		fixture.setName(name);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at thinktank.simulator.environment.Tank.<init>(Tank.java:165)
		//       at thinktank.simulator.environment.Tank.createTank(Tank.java:428)
		//       at thinktank.simulator.environment.Environment.<init>(Environment.java:113)
		//       at thinktank.simulator.scenario.Scenario.setupEnvironment(Scenario.java:395)
		//       at thinktank.simulator.scenario.Scenario.init(Scenario.java:388)
		//       at thinktank.simulator.scenario.Scenario.<init>(Scenario.java:117)
		//       at thinktank.simulator.scenario.Scenario.createScenario(Scenario.java:491)
		//       at thinktank.simulator.scenario.ScenarioFactory.createScenario3(ScenarioFactory.java:51)
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
		new org.junit.runner.JUnitCore().run(ScenarioTest.class);
	}
}