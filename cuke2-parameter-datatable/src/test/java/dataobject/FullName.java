package dataobject;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FullName {
	
	private String firstName = "";
	
	private String title = "";

	private String middleName = "";

	public FullName() {	}
	
	//Uncomment to allow XStream to convert automatically
	/*public FullName(String inputName) {

		String[] names = inputName.split(" ");
		
		if(names.length >= 1)
			setTitle(names[names.length - 1]);
		if(names.length >= 2)
			setFirstName(names[0]);
		if(names.length > 2)
			setMiddleName(Arrays.stream(names, 1, names.length - 1).collect(Collectors.joining(" ")));
	}*/
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	@Override
	public String toString() {
		return "FullName [firstName=" + firstName + ", title=" + title + ", middleName=" + middleName + "]";
	}

}
