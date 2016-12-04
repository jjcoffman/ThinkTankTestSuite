package thinktank.simulator.main;

import com.jme3.app.Application;
import thinktank.simulator.entity.Player;


/**
 * The class <code>RootNodeControllerFactory</code> implements static methods that return instances of the class <code>{@link RootNodeController}</code>.
 *
 * @generatedBy CodePro at 12/4/16 12:53 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
public class RootNodeControllerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	private RootNodeControllerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link RootNodeController}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static RootNodeController createRootNodeController() {
		return new RootNodeController(new Application());
	}


	/**
	 * Create an instance of the class <code>{@link RootNodeController}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static RootNodeController createRootNodeController2() {
		return new RootNodeController(new Application());
	}


	/**
	 * Create an instance of the class <code>{@link RootNodeController}</code>.
	 *
	 * @generatedBy CodePro at 12/4/16 12:53 PM
	 */
	public static RootNodeController createRootNodeController3() {
		return new RootNodeController((Application) null, (Player) null);
	}
}