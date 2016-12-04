package thinktank.simulator.entity;



/**
 * The class <code>CichlidFactory</code> implements static methods that return instances of the class <code>{@link Cichlid}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class CichlidFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private CichlidFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Cichlid}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Cichlid createCichlid() {
		return new Cichlid();
	}


	/**
	 * Create an instance of the class <code>{@link Cichlid}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Cichlid createCichlid2() {
		return new Cichlid(Cichlid.POSSIBLE_SIZES.LARGE, -0.5f, (String) null, (String) null);
	}


	/**
	 * Create an instance of the class <code>{@link Cichlid}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Cichlid createCichlid3() {
		return new Cichlid(Cichlid.POSSIBLE_SIZES.LARGE, -1.0f, "");
	}


	/**
	 * Create an instance of the class <code>{@link Cichlid}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Cichlid createCichlid4() {
		return new Cichlid(Cichlid.POSSIBLE_SIZES.LARGE, -1.0f, "", "");
	}


	/**
	 * Create an instance of the class <code>{@link Cichlid}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Cichlid createCichlid5() {
		return new Cichlid(Cichlid.POSSIBLE_SIZES.MEDIUM, 0.0f, "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Cichlid}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Cichlid createCichlid6() {
		return new Cichlid(Cichlid.POSSIBLE_SIZES.MEDIUM, 0.0f, "0123456789", "0123456789");
	}


	/**
	 * Create an instance of the class <code>{@link Cichlid}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Cichlid createCichlid7() {
		return new Cichlid(Cichlid.POSSIBLE_SIZES.SMALL, 1.0f, "An��t-1.0.txt");
	}


	/**
	 * Create an instance of the class <code>{@link Cichlid}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static Cichlid createCichlid8() {
		return new Cichlid(Cichlid.POSSIBLE_SIZES.SMALL, 1.0f, "An��t-1.0.txt", "An��t-1.0.txt");
	}


	public static Cichlid createCichlid(String name) {
		return new Cichlid(Cichlid.POSSIBLE_SIZES.SMALL, 1, "name");
	}
}