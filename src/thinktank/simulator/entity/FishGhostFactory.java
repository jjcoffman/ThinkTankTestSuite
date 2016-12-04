package thinktank.simulator.entity;

import com.jme3.bullet.collision.shapes.BoxCollisionShape;
import com.jme3.bullet.collision.shapes.CollisionShape;
import com.jme3.math.Vector3f;


/**
 * The class <code>FishGhostFactory</code> implements static methods that return instances of the class <code>{@link FishGhost}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class FishGhostFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private FishGhostFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link FishGhost}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static FishGhost createFishGhost() {
		return new FishGhost();
	}


	/**
	 * Create an instance of the class <code>{@link FishGhost}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static FishGhost createFishGhost2() {
		return new FishGhost(new BoxCollisionShape(), FishFactory.createFish());
	}


	/**
	 * Create an instance of the class <code>{@link FishGhost}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static FishGhost createFishGhost3() {
		return new FishGhost(new BoxCollisionShape(Vector3f.NAN), (Fish) null);
	}
}