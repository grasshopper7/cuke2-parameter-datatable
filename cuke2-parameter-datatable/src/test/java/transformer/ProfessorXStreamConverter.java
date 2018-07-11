package transformer;

import cucumber.deps.com.thoughtworks.xstream.converters.Converter;
import cucumber.deps.com.thoughtworks.xstream.converters.MarshallingContext;
import cucumber.deps.com.thoughtworks.xstream.converters.UnmarshallingContext;
import cucumber.deps.com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import cucumber.deps.com.thoughtworks.xstream.io.HierarchicalStreamReader;
import cucumber.deps.com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import dataobject.Professor;
import dataobject.Topic;

public class ProfessorXStreamConverter extends AbstractSingleValueConverter implements Converter {

	@Override
	public boolean canConvert(Class cls) {
		return Professor.class.isAssignableFrom(cls);
	}

	@Override
	public Object fromString(String inputName) {		
		return Professor.parseProfessor(inputName);
	}
	
	@Override
	public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {
		//Professor  prof = (Professor) value;
        writer.setValue(((Professor) value).toString());
    }

	@Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		return Professor.parseProfessor(reader.getValue());
    }
}
