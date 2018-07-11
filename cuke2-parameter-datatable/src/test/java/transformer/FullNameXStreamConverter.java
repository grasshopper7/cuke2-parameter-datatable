package transformer;

import java.util.Arrays;
import java.util.stream.Collectors;

import cucumber.api.Transformer;
import cucumber.deps.com.thoughtworks.xstream.converters.Converter;
import cucumber.deps.com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import dataobject.FullName;

public class FullNameXStreamConverter extends AbstractSingleValueConverter {

	@Override
	public boolean canConvert(Class cls) {
		return FullName.class.isAssignableFrom(cls);
	}

	@Override
	public Object fromString(String inputName) {		
		String[] names = inputName.split(" ");
		FullName fullName = new FullName();		
		if(names.length >= 1) fullName.setTitle(names[names.length - 1]);
		if(names.length >= 2) fullName.setFirstName(names[0]);
		if(names.length > 2) fullName.setMiddleName(Arrays.stream(names, 1, names.length - 1).collect(Collectors.joining(" ")));		
		return fullName;
	}
}
