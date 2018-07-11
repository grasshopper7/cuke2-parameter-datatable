package transformer;

import java.util.Arrays;
import java.util.stream.Collectors;

import cucumber.api.Transformer;
import dataobject.FullName;

public class FullNameTransformer extends Transformer<FullName> {
	@Override
	public FullName transform(String inputName) {
		String[] names = inputName.split(" ");
		FullName fullName = new FullName();		
		if(names.length >= 1) fullName.setTitle(names[names.length - 1]);
		if(names.length >= 2) fullName.setFirstName(names[0]);
		if(names.length > 2)  fullName.setMiddleName(Arrays.stream(names, 1, names.length - 1).collect(Collectors.joining(" ")));		
		return fullName;
	}
}
