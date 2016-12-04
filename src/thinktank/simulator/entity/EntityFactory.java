package thinktank.simulator.entity;



/**
 * The class <code>EntityFactory</code> implements static methods that return instances of the class <code>{@link Entity}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class EntityFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private EntityFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Entity}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Entity createcreateEnvironmentObject() {
		return EnvironmentObjectFactory.createEnvironmentObject();
	}


	/**
	 * Create an instance of the class <code>{@link Entity}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Entity createcreateFish() {
		return FishFactory.createFish();
	}


	/**
	 * Create an instance of the class <code>{@link Entity}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Entity createcreatePlant() {
		return PlantFactory.createPlant();
	}



	/**
	 * Create an instance of the class <code>{@link Entity}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Entity createcreatePot() {
		return PotFactory.createPot();
	}


	public static Cichlid createCichlid() {
		return CichlidFactory.createCichlid();
	}


	public static Cichlid createCichlid(String name) {
		return CichlidFactory.createCichlid(name);
	}


	public static Plant createPlant() {
		Plant plant = new Plant();
		return plant;
	}


	public static Pot createPot() {
		Pot pot = new Pot();
		return pot;
	}
}