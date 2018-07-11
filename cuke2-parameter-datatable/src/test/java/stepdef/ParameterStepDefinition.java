package stepdef;

import java.util.Date;
import java.util.List;

import cucumber.api.Delimiter;
import cucumber.api.Format;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import dataobject.FullName;
import dataobject.Money;
import dataobject.ProfLevels;
import dataobject.Professor;
import dataobject.User;
import transformer.FullNameTransformer;
import transformer.MoneyTransformer;

public class ParameterStepDefinition {
	
	@Given("^the user names are (.*?)$")
	public void theUserNamesAre(@Delimiter(",") List<String> names) {
		System.out.println("");
		System.out.println(names);
	}
	
	@Given("^the users are (.*?)$")
	public void theUsersAre(@Delimiter(",") List<User> users) {
		System.out.println("");
		System.out.println(users);
	}
	
	@Given("^the date is (\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2})$")
	public void the_date_is(@Format("yyyy-MM-dd'T'HH:mm:ss") Date date) {
		System.out.println("");
		System.out.println(date);
	}

	@Given("^the name is '(.*?)'$")
	public void theNameIs(@Transform(FullNameTransformer.class) FullName fullName) {
		System.out.println("");
		System.out.println(fullName);
	}
	
	@Given("^the amount is (.*?)$")
	public void theAmountIs(@Transform(MoneyTransformer.class) Money amount) {
		System.out.println("");
		System.out.println(amount);
	}
	
	@Given("^the user name is (.*?)$")
	public void theUserNameIs(User user) {
		System.out.println("");
		System.out.println(user);
	}
	
	@Given("^the professor is (.*?)$")
	public void theProfessorNameIs(Professor prof) {
		System.out.println("");
		System.out.println(prof);
	}
	
	@Given("^the professor level is (.*?)$")
	public void theProfessorLevelIs(ProfLevels level) {
		System.out.println("");
		System.out.println(level);
	}

}
