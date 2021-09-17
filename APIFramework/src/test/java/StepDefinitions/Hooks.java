package StepDefinitions;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@AddPlace")
	public void beforehk()
	{
// write required code heree.
//in case if we have delete placeID feature then we can write hook code to have a placeID ready to delete it

//IN MY OFFICE PROJECT : in case if i want to delete a merchant then a merchant should be first present in application 
//then we can delete it. in end to end test we create merchant then we update and then delete. but if i want to just only 
// run delete feature alone, then I have to write create merchant code in hooks so that we will have merchant id to delete



	}
}
