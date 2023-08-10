package ListenersPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class ActualListenerClass implements ITestListener{
	 public void onTestStart(ITestResult result) {
		 System.out.println("Test start ho gaya");
		    		  }

		  /**
		   * Invoked each time a test succeeds.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SUCCESS
		   */
		  public void onTestSuccess(ITestResult result) {
			  System.out.println("Test success ho gaya");
		  }

		  /**
		   * Invoked each time a test fails.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#FAILURE
		   */
		  public void onTestFailure(ITestResult result) {
			  System.out.println("Ohhhh..!!!! Fail ho gaya");
		  }

		  /**
		   * Invoked each time a test is skipped.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SKIP
		   */
		  public void onTestSkipped(ITestResult result) {
		    System.out.println("Ye wala test maine skip kr diya");
		  }

		  /**
		   * Invoked each time a method fails but has been annotated with successPercentage and this failure
		   * still keeps it within the success percentage requested.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
		   */
		  

		  /**
		   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
		   * and all their Configuration methods have been called.
		   */
		  public void onFinish(ITestContext context) {
			  System.out.println("Sab Khatam bc");		  
		  }
		  
		  public void onStart(ITestContext context)
		  {
			  System.out.println("To chaliye shuru krte hai");
		  }

	

}
