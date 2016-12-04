package thinktank.simulator.actions;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 12/4/16 12:54 PM
 * @author DoubleJ
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	MoveEntityActionTest.class,
	MoveEntityRightActionTest.class,
	CTRLMaskActionTest.class,
	SelectEntityActionTest.class,
	MoveEntityUpActionTest.class,
	AddFishActionTest.class,
	RotateEntityRightActionTest.class,
	MoveEntityForwardActionTest.class,
	ScaleEntityUpActionTest.class,
	ToggleCamModeActionTest.class,
	DeleteScenarioActionTest.class,
	MoveEntityBackwardActionTest.class,
	RotateEntityLeftActionTest.class,
	ToggleMouselookActionTest.class,
	SaveScenarioActionTest.class,
	MoveEntityLeftActionTest.class,
	AddPotActionTest.class,
	DeleteEntityActionTest.class,
	ScaleEntityDownActionTest.class,
	MoveEntityDownActionTest.class,
	AddPlantActionTest.class,
})
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 12/4/16 12:54 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
