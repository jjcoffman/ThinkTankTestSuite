package thinktank.simulator.util;

import thinktank.simulator.entity.EntityFactory;
import thinktank.simulator.entity.Entity;
import thinktank.simulator.entity.CichlidFactory;
import thinktank.simulator.entity.Cichlid;


/**
 * The class <code>CichlidRelationshipsFactory</code> implements static methods that return instances of the class <code>{@link CichlidRelationships}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class CichlidRelationshipsFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private CichlidRelationshipsFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CichlidRelationships}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static CichlidRelationships createCichlidRelationships() {
		return new CichlidRelationships(CichlidFactory.createCichlid(), EntityFactory.createcreateEnvironmentObject());
	}


	/**
	 * Create an instance of the class <code>{@link CichlidRelationships}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static CichlidRelationships createCichlidRelationships2() {
		return new CichlidRelationships(CichlidFactory.createCichlid2(), EntityFactory.createcreateFish());
	}
}